import javax.print.DocFlavor.STRING;
import java.util.Scanner;
//This is Example NO 1

//Class Implements an Interface

//In this code only one interface is made and it is implemented by a class only which is named as Department_Database_Backend class



interface Employ_info{//this is Single Interface Which only Show Imploy Information
     String name = "Jaffar Abbas";
     String Department = "Department : ";
     String address = "abc road karachi";
     int age = 20;
     float salary = 20000;
     int working_hours= 20;

     String ToString();//this is method to print all instants
     void tax_month(float tax);//method for printing tax deails
     void Salary_bonus(int bonus);//method for printing Salary bonus Details
}

//this class only implements a interface That show the logic of implementing single interface
class Department_Database_Backend implements Employ_info{//this is a class that implments Single Interface 
    float tax_of_Employ;//instant fro the class speacial method
    int bonus_of_Employ;//instant fro the class speacial method

    /********************************************************************************************/
    //this is toString method that print all Detials at one time
    public String ToString(){
        return "Name : "+name+"\n\nDepartment : "+Department+"\n\nAddress : "+address+"\n\nAge : "+age+"\n\nSalary : "+salary+"\n\nWorking Hours : "+working_hours;
    }
    /*********************************************************************************************/
    //this is a method that show the detials of tax and calculate it all process by a parameter named : flaot tax
    public void tax_month(float tax){
        System.out.println("\t\t\t********Tax Method********\n\n");
        this.tax_of_Employ = tax;
        float Ammount_For_tax_declaration = this.salary * this.tax_of_Employ; 
        float calculate_tax = this.salary - Ammount_For_tax_declaration;
        System.out.println("Tax per Month : "+this.tax_of_Employ+"\nSalary After Tax Cutoff : "+calculate_tax);
    }
    /**********************************************************************************************/
    //this is a method that show the detials of Salry bonus and calculate it all process by a parameter  named : bonus
    public void Salary_bonus(int bonus){
        System.out.println("\n\t\t\t********bonus Method********\n\n");
        this.bonus_of_Employ = bonus;
        
        if(this.working_hours > 10){//conditional statement for giving bonuses
            float Adding_bonus_to_Salary = this.salary+this.bonus_of_Employ;
            System.out.println("Bonus : "+this.bonus_of_Employ+"\nSalary With Bonus : "+Adding_bonus_to_Salary);
        }
        else{
            System.out.println("Your Work is not Mendetory for bonus\n\nYour Salary :"+this.salary);
        }
    }
     /*******************************************************************************************/
     //this method print all the data from the class
    public void Fetch_data_from_backend(){
           final float tax=0.1f;//final methods for tax
           final int bonus=5000;//final methods fro bonus
           System.out.println("Employ No : "+ToString());
           tax_month(tax);
           Salary_bonus(bonus);
    }

    private void id(int id){//private method for constructer to identify the employ
        Scanner scanner_for_id = new Scanner(System.in);
        System.out.print("Enter Id : ");
        id = scanner_for_id.nextInt();
        if(id == 1){//if it is correct then it will fetch the data and pass to instant
            Fetch_data_from_backend();
        }
        else{
            System.out.println("Id is Wroung!!!");
        }
    }
    /********************************************************************************************/

    //finally this is the contructer so that when a new intant is created it will call a private id method to check the id print the employ details with respect to id
    public Department_Database_Backend(int id){
         id(id);//private id method
    }
}

class Interface_Example_1 {
   public static void main(String[] args) {
       //This is Example NO 1

       //Class Implements an Interface

       //In this code only one interface is made and it is implemented by a class only which is named as Department_Database_Backend class

       System.out.println("This is Example NO 1\n\nClass Implements an Interface\n\nIn this code only one interface is made and it is implemented by a class only which is named as Department_Database_Backend class");
       Department_Database_Backend employ = new Department_Database_Backend(1);//new employ intance to give detials of employ and print to main main mthod
   }    
}