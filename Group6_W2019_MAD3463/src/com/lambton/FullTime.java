package com.lambton;

public class FullTime extends Person {
    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    private float salary;
    private float bonus;
    public FullTime(int id, String firstName, String lastName, String gender,int age, String city, float salary, float bonus) {
        super(id, firstName, lastName, gender, age,city);
        this.salary=salary;
        this.bonus=bonus;}
        public void calcEarnings(){
            float totalEarnings;
            totalEarnings=this.salary+this.bonus;
            System.out.println("Earnings:"+totalEarnings);
        }

public void printMyData(){
    System.out.println("Employee is a FullTime");
}
    }
