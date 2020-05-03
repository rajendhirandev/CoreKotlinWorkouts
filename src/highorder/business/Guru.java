package highorder.business;

public class Guru implements ATrace {
    public void getBusinessPartnerTrace(String aPartnerName, String bPartnerName, ATrace trace) {
        trace.aTraceCall(aPartnerName + " " + bPartnerName);
    }

    @Override
    public void aTraceCall(String fullName) {
        System.out.println("fullName = [" + fullName + "]");
    }

    void getEVal(int x, BTrace bTrace) {
        bTrace.bTraceEven(x);
    }

    void getMultiplyValue(int x, int y, CTrace cTrace) {
        cTrace.cTraceMul(x * y);
    }

    void getLogTrace(String logErr, String logVerbose, DTrace dTrace) {
        dTrace.TestTrace("Err: " + logErr + "\n\nLogs: " + logVerbose);
    }
}
