package com.lambton;

import java.util.ArrayList;
import java.util.Scanner;
public class Employee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name : ");
        String userName = scanner.nextLine();
        System.out.println(userName);
        Intern in1 = new Intern(1, "A", "a", "M", 45, "Toronto", "MADT", "Lambton College", 1000);
        FullTime f1 = new FullTime(1, "B", "b", "F", 87, "Hamilton", 5000f, 500);
        CommissionBasedPartTime c1 = new CommissionBasedPartTime(1, "C", "c", "F", 96, "London", 14, 10);

        IPrintable[] employees = new IPrintable[100];
        employees[0] = in1;
        employees[1] = f1;
        employees[2] = c1;
        for (IPrintable p : employees) {
            //Display all details
            p.printMyData();

            //p.print();

            //System.out.println(p.toString());
            if (p instanceof Intern) {
                Intern in = (Intern) p;
                System.out.printf("\nID: %d \nFirstName: %-15s \nLastName: %-5s \nGender: %-8s \nAge: %d \n",
                        in.getId(),
                        in.getFirstName(),
                        in.getLastName(),
                        in.getGender(),
                        in.getAge());
                in.calBirthYear();
                System.out.printf("\nCity: %-10s \nCourseName: %-10s \nSchoolName: %-10s \nEarnings: %-10d\n",
                        in.getCity(),
                        in.getCourseName(),
                        in.getSchoolName(),
                in.getEarnings());


            } else if (p instanceof FullTime) {
                FullTime f = (FullTime) p;
                System.out.printf("\nID: %d \nFirstName: %-15s \nLastName: %-5s \nGender: %-8s \nAge: %d \n",
                        f.getId(),
                        f.getFirstName(),
                        f.getLastName(),
                        f.getGender(),
                        f.getAge());
                f.calBirthYear();
                System.out.printf("\nCity: %-10s \nSalary: %f \nBonus: %f \n",
                        f.getCity(),
                        f.getSalary(),
                        f.getBonus());
                f.calcEarnings();
            } else if (p instanceof CommissionBasedPartTime) {
                CommissionBasedPartTime c = (CommissionBasedPartTime) p;
                System.out.printf("\nID: %d \nFirstName: %-15s \nLastName: %-5s \nGender: %-8s \nAge: %d \n",
                        c.getId(),
                        c.getFirstName(),
                        c.getLastName(),
                        c.getGender(),
                        c.getAge());
                c.calBirthYear();
                System.out.printf("\nCity: %-10s \nRate: %d \nhoursWorked: %d \n",
                        c.getCity(),
                        c.getRate(),
                        c.getHoursWorked());
                c.calcEarnings();
            }

        }
    }
}