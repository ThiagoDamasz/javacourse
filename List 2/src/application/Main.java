package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Locale.setDefault(Locale.US);

            System.out.print("How many Employees will be registered? ");
            int n = sc.nextInt();

            List<Employee> list = new ArrayList<>();

            for (int i = 0; i < n; i++){
                System.out.println("Employess#" + (i+1) + ":");
                System.out.print("Id: ");
                int id = sc.nextInt();
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Salary: ");
                double salary = sc.nextDouble();

                Employee emp = new Employee(id,name, salary);
                list.add(emp);
            }

            System.out.print("Enter the employee id that will have the salary increase: ");
            int id = sc.nextInt();

            sc.close();
    }

    public Integer hasId(List<Employee> list, int id){
        for(int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
}