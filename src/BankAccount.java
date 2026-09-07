import java.util.Scanner;

public class BankAccount
{
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance)
    {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount)
    {
        if(amount > 0)
        {
            balance += amount;
        }
    }

    public void withdraw(double amount)
    {
        if(amount > 0 && amount <= balance)
        {
            balance -= amount;
        }
        else
        {
            System.out.println("Nedostatochno monet");
        }
    }
    public void printInfo()
    {
        System.out.println("Vladelec: " + owner);
        System.out.println("Balance: " + balance);
    }

    public static void main()
    {
        Scanner console = new Scanner(System.in);

        System.out.println("Type name vladelca: ");
        String owner = console.nextLine();

        System.out.print("Type balance: ");
        double balance = console.nextDouble();

        BankAccount account = new BankAccount(owner, balance);

        System.out.println("\nThe nchal sostoyanie:");
        account.printInfo();

        double depositAmount;
        while (true)
        {
            System.out.print("\nType sum for popolnen bolshe 0: ");
            depositAmount = console.nextDouble();
            if (depositAmount > 0)
            {
                break;
            }
            System.out.println("Try again ");
        }
        account.deposit(depositAmount);
        System.out.println("Popolnenie na " + depositAmount + ":");
        account.printInfo();

        double withdrawAmount;
        while (true)
        {
            System.out.print("\nType sum dlya snyatya bolshe 0 : ");
            withdrawAmount = console.nextDouble();

            if (withdrawAmount <= 0)
            {
                System.out.println("Try again");
                continue;
            }

            if (withdrawAmount > account.balance)
            {
                System.out.println("Try again.");
                continue;
            }

            break;
        }

        account.withdraw(withdrawAmount);
        System.out.println("Sbyatie " + withdrawAmount + ":");
        account.printInfo();

        console.close();
    }
}
