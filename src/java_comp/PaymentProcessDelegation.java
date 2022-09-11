package java_comp;

class PaymentProcessDelegation {
    public static void main(String[] args) {
        new PaymentProcess(new CashPayment()).paymentMode();
        System.out.println(new PaymentProcess(new CashPayment()).paymentProcess());
        PaymentProcess.isUPIDown = true;
        System.out.println(new PaymentProcess(new UPIPayment("Tez")).paymentProcess());
        PaymentProcess.isUPIDown = false;
        System.out.println(new PaymentProcess(new UPIPayment("Paytm")).paymentProcess());
        PaymentProcess.isCardDown = true;
        System.out.println(new PaymentProcess(new CardPayment("HDFC", "CC")).paymentProcess());
        PaymentProcess.isCardDown = false;
        System.out.println(new PaymentProcess(new CardPayment("Citi", "DC")).paymentProcess());
    }
}

interface IPayment {
    String paymentMode();
}

final class CashPayment implements IPayment {
    @Override
    public String paymentMode() {
        return "Cash";
    }
}

final class UPIPayment implements IPayment {
    String upiName;

    public UPIPayment(String upiName) {
        this.upiName = upiName;
    }

    @Override
    public String paymentMode() {
        return "UPI - " + upiName;
    }
}

final class CardPayment implements IPayment {
    String providerName, cardType;

    CardPayment(String providerName, String cardType) {
        this.providerName = providerName;
        this.cardType = cardType;
    }

    @Override
    public String paymentMode() {
        return "Card - " + providerName + "-" + cardType;
    }
}

class PaymentProcess implements IPayment {
    public static final String PROCESSING_ERROR_MSG = "Sorry we can't process it for now with ";
    public static final String ERROR_MSG = "Payment Option is Unavailable";
    public static final String PROCESSING_MSG = "Process Initiated for ";
    public static Boolean isCardDown = false;
    public static Boolean isUPIDown = false;
    private final IPayment payment;

    PaymentProcess(IPayment iPayment) {
        payment = iPayment;
    }

    String paymentProcess() {
        if (payment != null) {
            String paymentMode = paymentMode();
            if (!(payment instanceof CashPayment) && (isUPIDown || isCardDown)) {
                return PROCESSING_ERROR_MSG + paymentMode;
            } else {
                return PROCESSING_MSG + paymentMode;
            }
        }
        return ERROR_MSG;
    }

    @Override
    public String paymentMode() {
        return payment.paymentMode();
    }
}
