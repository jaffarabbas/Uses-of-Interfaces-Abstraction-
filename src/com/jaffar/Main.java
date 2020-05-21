//package com.jaffar;


import java.util.Scanner;

interface one{
    public static final String Name="Name";
    public static final String Id="Fa19-bsse-";
    public static final int Salary=0;

    void yearly_Salary();
}

interface two{
     String ToString();
}

abstract class show_data{
    String name;
    String id;
    int salary;
}

class test extends show_data implements one , two{

    test(String name,String id,int salary){
         this.name = name;
         this.id = id;
         this.salary = salary;

        System.out.println(ToString());
        yearly_Salary();
    }

    public String ToString(){
        return one.Name+"  : "+this.name+"\n"+this.Id+""+this.id+"\n"+"Salary : "+this.salary+this.Salary;
    }

    @Override
    public void yearly_Salary() {
        int y = 12;

        int result = this.salary*12;

        System.out.println("Yearly Salary : "+result);
    }
}


public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name,id;
        int salary;
        System.out.println("Name : ");
        name = scn.next();
        System.out.println("Id : ");
        id = scn.next();
        System.out.println("Salary : ");
        salary = scn.nextInt();
	    test obj = new test(name,id,salary);
    }
}
