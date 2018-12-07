package designPattern.chainOfResponsibility.demo2;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-07-30 08:53
 * Description:
 */
public class OrcKing {
    private RequestHandler chain;

    public OrcKing() {
        this.chain = new OrcCommander(new OrcOfficer(new OrcSoldier(null)));
    }

    public void makeRequest(Request request) {
        chain.handlerRequest(request);
    }
}
