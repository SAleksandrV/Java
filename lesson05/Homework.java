package lesson05;

import java.text.MessageFormat;
import java.util.Scanner;

public class Homework {
    import java.util.Scanner;
    // Создаём класс сотрудников
    class Employee {
        String Name;
        String Profession;
        String Email;
        long Telephone;
        long Salary;
        int Age;
        // Добавляем сведенья о сотрудниках
        void GetData() {
            Scanner sc = new Scanner(System.in);
            Name = sc.nextLine();
            System.out.print("\n\tEnter Employee Name : ");
            Name = sc.nextLine();
            System.out.print("\n\tEnter Employee Profession : ");
            Profession = sc.nextLine();
            System.out.print("\n\tEnter Employee Email : ");
            Email = sc.nextLine();
            System.out.print("\n\tEnter Employee Telephone : ");
            Telephone = Long.parseLong(sc.nextLine());
            System.out.print("\n\tEnter Employee Salary : ");
            Salary = Long.parseLong(sc.nextLine());
            System.out.print("\n\tEnter Employee Age : ");
            Age = Integer.parseInt(sc.nextLine());
        }
        void PutData() {
            System.out.print("\n\tEmployee Name : " + Name);
            System.out.print("\n\tEmployee Profession : " + Profession);
            System.out.print("\n\tEmployee Email : " + Email);
            System.out.print("\n\tEmployee Telephone : " + Telephone);
            System.out.print("\n\tEmployee Salary : " + Salary);
            System.out.print("\n\tEmployee Age : " + Age);
        }
    }
    public Employee(String Name, String Profession, String Email, String Telephone, String Salary, String Age) {
    }
}




// Второй вариант
import java.text.MessageFormat;
