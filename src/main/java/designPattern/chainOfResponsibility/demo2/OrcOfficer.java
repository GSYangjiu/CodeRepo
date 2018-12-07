package designPattern.chainOfResponsibility.demo2;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-07-30 09:08
 * Description:
 */
public class OrcOfficer extends RequestHandler {
    public OrcOfficer(RequestHandler next) {
        super(next);
    }

    @Override
    public void handlerRequest(Request request) {
        if (request.getRequestType().equals(RequestType.TORTURE_PRISONER)) {
            printHandling(request);
            request.makeHandled();
        } else {
            super.handlerRequest(request);
        }
    }

    @Override
    public String toString() {
        return "Orc officer";
    }
}
