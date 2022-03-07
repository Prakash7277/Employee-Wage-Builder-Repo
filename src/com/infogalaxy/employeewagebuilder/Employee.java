package com.infogalaxy.employeewagebuilder;

import java.util.Random;

public class Employee {
    public static void main(String[] args) {
        //Welcome Message for User
        System.out.println("Welcome To Employee Wage Builder Made By Prakash Patil");
        //UC-2 Calculate Daily Employee Wage or Hour
        final int WAGE_PER_HR = 20;
        final int FULL_DAY_HR = 8;
        int total_wage = 0;

        //UC-1 Checking for Employee Present or Absent
        //Create Random object and generate 0 or 1 using % Operator
        Random random=new Random();
        int empAttendance= random.nextInt()%2;
        if(empAttendance == 0){
            System.out.println("Employee is Absent");
        }else{
            System.out.println("Employee is Present");
            total_wage =WAGE_PER_HR*FULL_DAY_HR;
        }
        System.out.println("Employee Wage=" +total_wage );
    }
}
