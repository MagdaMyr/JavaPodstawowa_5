/*
Zad. 1 (prosta klasa)
Napisz klasę Account, korzystając z diagramu UML. W klasie Runner utwórz 2 instancje tej klasy i wykonaj operacje:
credit, debit oraz transferTo, wskazując drugie konto. Każdorazowo sprawdź stan konta, korzystając z
metody toString i standardowego wyjścia.
 */

public class Account {

    //pola
    private String id, name;
    private int balance;

    //konstruktory
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    //metody
    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    public int debit(int amount) {
        if(balance >= amount) {
            balance -= amount;
        }
        else {
            System.out.printf("Amount %d exceeded balance %d\n", amount, balance);
        }

        return balance;
    }

    public int transferTo(Account account, int amount) {
        if(balance >= amount) {
            account.credit(amount);
            balance -= amount;
        }
        else {
            System.out.printf("Cannot transfer. Amount %d exceeded balance %d\n", amount, balance);
        }

        return balance;
    }

    @Override
    public String toString() {
        return "Account[" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ']';
    }

    //getters & setters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
}

