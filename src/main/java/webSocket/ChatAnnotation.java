package webSocket;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 * Created by Yang on 2017/12/26 0026.
 */
@ServerEndpoint(value = "/chat")
public class ChatAnnotation {
    private static final String GUEST_PREFIX = "Guest";
    private static final AtomicInteger connectionIds = new AtomicInteger(0);
    private static final Set<ChatAnnotation> connections = new CopyOnWriteArraySet<ChatAnnotation>();
    private final String nickname;
    private Session session;

    public ChatAnnotation() {
        nickname = GUEST_PREFIX + connectionIds.getAndIncrement();
    }

    @OnOpen
    public void start(Session session) {
        this.session = session;
        connections.add(this);
        String message = String.format(" %s %s", nickname, "has join");
        boradcast(message);
    }

    @OnClose
    public void end() {
        connections.remove(this);
        String message = String.format(" %s %s", nickname, "has disconnected.");
        boradcast(message);
    }

    @OnMessage
    public void incoming(String message) {
        boradcast(message);
    }

    @OnError
    public void onError(Throwable t) throws Throwable {
        System.out.println("Chat Error: " + t.toString());
    }

    private static void boradcast(String msg) {
        for (ChatAnnotation client : connections) {
            try {
                synchronized (client) {
                    client.session.getBasicRemote().sendText(msg);
                }
            } catch (IOException e) {
                System.out.println("Char Error: Failed to send message to client");
                connections.remove(client);
                try {
                    client.session.close();
                } catch (IOException e1) {
                    //Ignore
                }
                String message = String.format(" %s %s", client.nickname, "has been disconnected.");
                boradcast(message);
            }
        }
    }
}
