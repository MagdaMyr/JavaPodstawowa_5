public class AccountsRunner {
    public static void main(String[] args) {
        Account a1 = new Account("001", "first");
        System.out.println(a1);

        Account a2 = new Account("007", "agent 007", 2500000);
        System.out.println(a2);

        Account a3 = new Account("123", "janusz", 500);
        System.out.println(a3);

        a3.debit(500);
        System.out.println(a3);
        a3.debit(50);
        System.out.println(a3);

        a2.transferTo(a3, 10000);
        System.out.println(a2);
        System.out.println(a3);

        a1.credit(200);
        System.out.println(a1);

    }

}
