package lexicon.exercises;

public class Main {

    static void main() {

        IO.println("Hello and welcome to OOP Exercises !!!!");
        //Exercise - 1
        BankAccount bankAccount1 = new BankAccount("Ragavi", 200000);
        BankAccount bankAccount2 = new BankAccount("Shanmu", 500000);
        BankAccount bankAccount3 = new BankAccount("Muthana", 1000000);
        BankAccount bankAccount4 = new BankAccount("Sikdar", 2000000);
        bankAccount1.deposit(2000);
        bankAccount2.deposit(300000);
        bankAccount3.deposit(4089);
        bankAccount4.deposit(100000);
        bankAccount1.withdraw(2456);
        bankAccount2.withdraw(6789);
        bankAccount3.withdraw(30000);
        bankAccount4.withdraw(10567);

        //Exercise - 2
        Customer customer1 = new Customer(1,"Ragavi", "ragavi@lexicon.com");
        Customer customer2 = new Customer(1,"Shanmu", "shanmu@lexicon.com");
        Customer customer3 = new Customer(1,"Muthana", "muthana@lexicon.com");
        Customer customer4 = new Customer(1,"Sikdar", "sikdar@lexicon.com");
        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
        System.out.println(customer3.toString());
        System.out.println(customer4.toString());
    }
}
