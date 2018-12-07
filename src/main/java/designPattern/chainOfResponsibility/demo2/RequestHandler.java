package designPattern.chainOfResponsibility.demo2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-07-30 08:55
 * Description:
 */
public abstract class RequestHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(RequestHandler.class);

    private RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handlerRequest(Request request) {
        if (next != null) {
            next.handlerRequest(request);
        }
    }

    public void printHandling(Request request) {
        LOGGER.info("{} handling request \"{}\"", this, request);
    }

    @Override
    public abstract String toString();
}
