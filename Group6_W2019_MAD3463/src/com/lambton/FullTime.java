package com.lambton;

public class FullTime extends Person {
    private float salary;
    private float bonus;
    public FullTime(int id, String firstName, String lastName, String gender, String city, float salary, float bonus) {
        super(id, firstName, lastName, gender, city);
        this.salary=salary;
        this.bonus=bonus;}
        public float calcEarnings(){
            float totalEarnings;
            totalEarnings=this.salary+this.bonus;
            return totalEarnings;
        }


    }
