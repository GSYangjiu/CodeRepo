package designPattern.chainOfResponsibility.demo2;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-07-30 09:09
 * Description:
 */
public class OrcSoldier extends  RequestHandler {
    public OrcSoldier(RequestHandler next) {
        super(next);
    }

    @Override
    public void handlerRequest(Request request) {
        if (request.getRequestType().equals(RequestType.COLLECT_TAX)) {
            printHandling(request);
            request.makeHandled();
        }else {
            super.handlerRequest(request);
        }
    }

    @Override
    public String toString() {
        return "Orc soldier";
    }
}
