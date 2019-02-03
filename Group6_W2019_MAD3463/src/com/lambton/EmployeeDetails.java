package com.lambton;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDetails {
    public void Details()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Employees:");
        sc.nextInt();
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("John");
        stringArrayList.add("Mathew");
        stringArrayList.add("Cindy");
        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println("Name :" + stringArrayList.get(i));
        }
        ArrayList<Integer> alist = new ArrayList<Integer>();
        alist.add(28);
        alist.add(64);
        alist.add(45);
        for (int i = 0; i < alist.size(); i++) {
            System.out.println("Age:" + alist.get(i));

        }

    }
        public void calBirthYear(){
        Scanner sc=new Scanner(System.in);
            System.out.print("Age:");
            int Age=sc.nextInt();
            int By=2019-Age;
            System.out.print("BirthYear:"+By);
        }
    }


