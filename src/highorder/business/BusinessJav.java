package highorder.business;

public class BusinessJav {
    public static void main(String[] args) {
        Accounts accounts = new Accounts();
        System.out.println(accounts.getBusinessStatus(10.90, 20.78, (exp, income) -> income - exp));

        Guru guru = new Guru();
        guru.getBusinessPartnerTrace("Ragavan", "Aaradhana", guru);
        guru.getBusinessPartnerTrace("Super &", "Co", guru);

        guru.getEVal(4, z -> {
            if (z % 2 == 0)
                System.out.println("Even Number");
        });

        guru.getEVal(2, new BTrace() {
            @Override
            public void bTraceEven(int x) {
                if (x % 2 == 0)
                    System.out.println("Even Number");

            }
        });

        guru.getMultiplyValue(20, 30, z -> {
            System.out.println("Mul: " + z);
        });

        guru.getLogTrace("Err", "vLogger", trace -> {
            System.out.println("MyDTrace: " + trace);
        });

        //Above as same
        //guru.getLogTrace("Err", "Logger", System.out::println);
    }
}
