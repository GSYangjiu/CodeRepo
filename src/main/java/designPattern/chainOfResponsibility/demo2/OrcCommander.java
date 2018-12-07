package designPattern.chainOfResponsibility.demo2;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-07-30 09:07
 * Description:
 */
public class OrcCommander extends RequestHandler {

    public OrcCommander(RequestHandler next) {
        super(next);
    }

    @Override
    public void handlerRequest(Request request) {
        if (request.getRequestType().equals(RequestType.DEFEND_CASTLE)) {
            printHandling(request);
            request.makeHandled();
        } else {
            super.handlerRequest(request);
        }
    }

    @Override
    public String toString() {
        return "Orc commander";
    }
}
