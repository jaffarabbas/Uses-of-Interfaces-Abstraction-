import java.util.ArrayList;
import java.util.Scanner;
//This is Example NO 2

//Interface extends an Interface

//In this code  one interface is extended by another interface



//INTERFACE 1
interface Employ_info{//this is Single Interface Which only Show Imploy Information
    String name = "Jaffar Abbas";
    String Department = "BSSE";
    String address = "abc road karachi";
    int age = 20;
    float salary = 20000;
    int working_hours= 20;
    String arival = "8pm";


    void tax_month(float tax);//method for printing tax deails
    void Salary_bonus(int bonus);//method for printing Salary bonus Details
}

//INTERFACE 2
interface Yearly_Employ_Career_Report extends Employ_info{//this is Second Interface showing Employ Career Deitals only
    String Rating = "5stars";
    String Client_handling_behavier = "Good";
    String Arrival_To_Company = "first_place";
    String Behavier_over_all = "Exillent";


    String ToString();//this is method to print all instants and also for the extended interface
    void Employ_of_the_Month(String rating);//method to sort the employ of month gernely but know for only one employ because of example
    void Employ_of_the_Year(int Employ_of_the_month_award_count);//method to sort the employ of YEar gernely with respect to Employ of the month but know for only one employ because of example
    void Certification_Of_Employ();//method to sort the employ of Year/month gernely And give him Certification but know for only one employ because of example
}

//class 1
class Department_Database_Backend implements Yearly_Employ_Career_Report{//this is a class that implments Interface that extend another interface
    float tax_of_Employ;//instant fro the class speacial method
    int bonus_of_Employ;//instant fro the class speacial method
    int count_for_Employ_of_the_month_award;
    /********************************************************************************************/
    //this is toString method that print all Detials at one time
    public String ToString(){
        Scanner scanner_for_ToString = new Scanner(System.in);
        System.out.println("Enter I For Employ Identity\nEnter C for Career Details");//folllow this instrucrion
        char selecter = scanner_for_ToString.next().charAt(0);
        //This Statement use ternery operater to print your choice instance category I for Employ Identity and C for Career information 
        return (selecter == 'I')?("Name : "+name+"\n\nDepartment : "+Department+"\n\nAddress : "+address+"\n\nAge : "+age+"\n\nSalary : "+salary+"\n\nWorking Hours : "+working_hours+"\n\nArrivals At Company : "+arival):(selecter == 'C') ?"Rating : "+Rating+"\n\nBehavier With Clients : "+Client_handling_behavier+"\n\nStreaks Of Arivals At time : "+Arrival_To_Company+"Behavier with All : "+Behavier_over_all:"Wroung";
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
    //private method for constructer to identify the employ
    private void id(int id){
        Scanner scanner_for_id = new Scanner(System.in);
        System.out.println("Enter Id : ");
        id = scanner_for_id.nextInt();
        if(id == 1){//if it is correct then it will fetch the data and pass to instant
            Fetch_data_from_backend();
        }
        else{
            System.out.println("Id is Wroung!!!");
        }
    }
    /********************************************************************************************/
    //Employ of the month method to gives the monthly award to the employ of higher category
    public void Employ_of_the_Month(String rating){
        int counter = 0;
        if(rating.equals("5stars")){//statement to give the employ detiels in employ of mobth list
            System.out.println("Employ of the Month");
        }
        else{
            System.out.println("Not eligible for Employ");
        }

        String times_Employ_have_5stars_rating[] = new String[4];//String array containing count of Rating per weak employ of month

        for(int i = 0;i<times_Employ_have_5stars_rating.length;i++){
            times_Employ_have_5stars_rating[i] = Rating;
            counter++;
        }
        for(int i = 0;i<times_Employ_have_5stars_rating.length;i++){
            System.out.println("Employ of the Month "+i+" Times : Certificate");
        }

        if(counter > 3){//counter check that if the rating is abover 3 so it will make new employ of the month
            this.count_for_Employ_of_the_month_award = counter;
            System.out.println("Employ of The MOnth is "+this.name);
        }
        else{
            System.out.println("No one is Employ of the month");
        }

    }

    /********************************************************************************************/
    //Employ of the Year method to gives the Yearly award to the employ of higher category
    public void Employ_of_the_Year(int Employ_of_the_month_award_count){
        int counter = 0;
        if(Employ_of_the_month_award_count == this.count_for_Employ_of_the_month_award){//statement to give the employ detiels in employ of mobth list
            System.out.println("Employ of the YEar");
        }
        else{
            System.out.println("Not eligible for Employ");
        }

        int times_Employ_become_EMP[] = new int[4];//String array containing count of employ of month

        for(int i = 0;i<times_Employ_become_EMP.length;i++){
            times_Employ_become_EMP[i] = Employ_of_the_month_award_count;//count will go to the arry index one by one
            counter++;
        }
        for(int i = 0;i<times_Employ_become_EMP.length;i++){
            System.out.println("Employ of the Year "+i+" Times : Certificate");
        }

        if(counter > 3){//counter check that if the Employ of the month is abover 3 so it will make new employ of the Year
            System.out.println("Employ of The Year is "+this.name);
            Certification_Of_Employ();
        }
        else{
            System.out.println("No one is Employ of the Year");
        }

    }

    /********************************************************************************************/
    //Certificate method of the Employ of the YEar Award
    public void Certification_Of_Employ(){
        System.out.println("\n\n\t\t\t\t\t********CERTIFICATE********\n\n");
    }

    /*******************************************************************************************/
    //this method print all the data from the class
    public void Fetch_data_from_backend(){
        final float tax=0.1f;//final methods for tax
        final int bonus=5000;//final methods fro bonus
        System.out.println("Employ No : "+ToString());
        tax_month(tax);
        Salary_bonus(bonus);
        Employ_of_the_Month(Rating);
        Employ_of_the_Year(count_for_Employ_of_the_month_award);
    }

    //finally this is the contructer so that when a new intant is created it will call a private id method to check the id print the employ details with respect to id
    public Department_Database_Backend(int id){
        id(id);//private id method
    }
}
//class 2
public class interface_Example_2 {
    public static void main(String[] args) {
        Department_Database_Backend employ = new Department_Database_Backend(1);//new employ intance to give detials of employ and print to main main mthod
    }
}