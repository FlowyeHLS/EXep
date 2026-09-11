package Tretee;

import java.util.Locale;
import java.util.Scanner;

class Employee
{
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary)
    {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName()
    {
        return name;
    }

    public double getBaseSalary()
    {
        return baseSalary;
    }

    public double calculatePay()
    {
        return baseSalary;
    }
}

class Manager extends Employee
{

    public Manager(String name, double baseSalary)
    {
        super(name, baseSalary);
    }

    @Override
    public double calculatePay()
    {
        return getBaseSalary() * 1.20;
    }
}

class Developer extends Employee
{

    public Developer(String name, double baseSalary)
    {
        super(name, baseSalary);
    }

    @Override
    public double calculatePay()
    {
        return getBaseSalary() + 15000;
    }
}

public class Main {
    public static void main()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Skok sotrydnikov xochesh: ");
        int n = scanner.nextInt();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++)
        {
            System.out.println("\nSotrudnik №" + (i + 1));

            System.out.print("Type name: ");
            String name = scanner.next();

            System.out.print("Start zp tipa kto tyt vork: ");
            double baseSalary = scanner.nextDouble();

            System.out.print("Type of sotrudnnik (M — manager, D — razrab): ");
            char type = scanner.next().toUpperCase(Locale.ROOT).charAt(0);

            switch (type)
            {
                case 'M':
                    employees[i] = new Manager(name, baseSalary);
                    break;

                case 'D':
                    employees[i] = new Developer(name, baseSalary);
                    break;

                default:
                    System.out.println("Stranie tip sdelan obisch.");
                    employees[i] = new Employee(name, baseSalary);
            }
        }

        double totalPay = 0;

        System.out.println("\n itog vedom");

        for (Employee employee : employees)
        {
            double pay = employee.calculatePay();

            System.out.printf(
                    "Sotrudnik: %s   ++++   Viplata: %.2f%n",
                    employee.getName(),
                    pay
            );

            totalPay += pay;
        }

        System.out.printf("%nObshaya summa viplat: %.2f%n", totalPay);

        scanner.close();
    }
}