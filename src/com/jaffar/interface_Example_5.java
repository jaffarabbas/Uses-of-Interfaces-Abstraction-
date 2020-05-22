

//This is Example NO 5

//class Extends another class and implements interfaces

//In this code multiple interface is extended by another class and a class also extends another class give best example of multi inheritance



import java.util.Scanner;


interface Employ_info{//this is Single Interface Which only Show Imploy Information
    String name = "Jaffar Abbas";
    String Department = "Department : ";
    String address = "abc road karachi";
    int age = 20;
    float salary = 20000;
    int working_hours= 20;
    String arival = "8pm";

    String ToString();//this is method to print all instants
    void tax_month(float tax);//method for printing tax deails
    void Salary_bonus(int bonus);//method for printing Salary bonus Details
}

//INTERFACE 2
interface Yearly_Employ_Career_Report{//this is Second Interface showing Employ Career Deitals only
    String Rating = "5stars";
    String Client_handling_behavier = "Good";
    String Arrival_To_Company = "first_place";
    String Behavier_over_all = "Exillent";


    String ToString();//this is method to print all instants and also for the extended interface
    void Employ_of_the_Month(String rating);//method to sort the employ of month gernely but know for only one employ because of example
    void Employ_of_the_Year(int Employ_of_the_month_award_count);//method to sort the employ of YEar gernely with respect to Employ of the month but know for only one employ because of example
    void Certification_Of_Employ();//method to sort the employ of Year/month gernely And give him Certification but know for only one employ because of example
}

//Abstract class implements interface 1,2
//Class 1
//It will give Example of one interface extrends mutiple interface
class Speacial_Alounces_To_Top_Emploies {
    String Security_Avidence = "Secure By Nadra";
    String Property_Clearence = "Clear";
    String National_Certificate ="Present";
    String Pakistani_Residential = "Yes";

   //Security check my nested satement to grant permission
    public void Clearence_From_Authoritreze(){
        Scanner scanner_for_Clearence_From_Authoritrez = new Scanner(System.in);
        String check_for_clearence_1 = Security_Avidence;
        String check_for_clearence_2 = Property_Clearence;
        String check_for_clearence_3 = National_Certificate;
        String check_for_clearence_4 = Pakistani_Residential;
        char permission;
        if(Security_Avidence.equals(check_for_clearence_1)){
            if(Property_Clearence.equals(check_for_clearence_2)){
                if(National_Certificate.equals(check_for_clearence_3)){
                    if(Pakistani_Residential.equals(check_for_clearence_4)){
                        System.out.println("Every Thing Is Clear Please Check Y to Grant permission");
                        permission = scanner_for_Clearence_From_Authoritrez.next().charAt(0);
                        if(permission == 'Y'){
                            System.out.println("You Will have Allounce");
                            Certificate_of_alunce();
                        }
                    }
                }
            }
        }
        else{
            System.out.println("Your One or More Certification is not on our record So Sorry!!!");
        }
    }
    //Method Of Class1
    //Certificate of Alounce
    public void Certificate_of_alunce(){
        System.out.println("\n\n\t\t\t\t\t********CERTIFICATE OF ALOUNCE********\n\n");
    }
}

//this is a class that extends a class 1 and implements interface 1,2
//CLASS 2
class Department_Database_Backend extends Speacial_Alounces_To_Top_Emploies implements Yearly_Employ_Career_Report,Employ_info {//this is a class that implments Multiple Interface 
    float tax_of_Employ;//instant fro the class speacial method
    int bonus_of_Employ;//instant fro the class speacial method
    int count_for_Employ_of_the_month_award;
    /********************************************************************************************/
    //this is toString method that print all Detials at one time
    //Method Of Of interface 1,2,3 and class 
    public String ToString(){//this is method to print all instants and also for the extended interfaces
        Scanner scanner_for_ToString = new Scanner(System.in);
        System.out.println("Enter I For Employ Identity\nEnter C for Career Details\nEnter S for Security Aluonce");//folllow this instrucrion
        char selecter = scanner_for_ToString.next().charAt(0);
        //This Statement use ternery operater to print your choice instance category I for Employ Identity and C for Career information and S for Security Alounce
        return (selecter == 'I')?("Name : "+name+"\n\nDepartment : "+Department+"\n\nAddress : "+address+"\n\nAge : "+age+"\n\nSalary : "+salary+"\n\nWorking Hours : "+working_hours+"\n\nArrivals At Company : "+arival):(selecter == 'C') ?("Rating : "+Rating+"\n\nBehavier With Clients : "+Client_handling_behavier+"\n\nStreaks Of Arivals At time : "+Arrival_To_Company+"Behavier with All : "+Behavier_over_all):(selecter == 'S')?( "Security Clearence By Nadara : "+Security_Avidence+"\n\nProperty Clearence By Nadra : "+Property_Clearence+"\n\nNational Certificate Holder"+National_Certificate+"\n\nPakistani Residential : "+Pakistani_Residential):"Writer";
    }
    /*********************************************************************************************/
    //this is a method that show the detials of tax and calculate it all process by a parameter named : flaot tax
    //Method Of Of interface 1
    public void tax_month(float tax){
        System.out.println("\t\t\t********Tax Method********\n\n");
        this.tax_of_Employ = tax;
        float Ammount_For_tax_declaration = this.salary * this.tax_of_Employ;
        float calculate_tax = this.salary - Ammount_For_tax_declaration;
        System.out.println("Tax per Month : "+this.tax_of_Employ+"\nSalary After Tax Cutoff : "+calculate_tax);
    }
    /**********************************************************************************************/
    //this is a method that show the detials of Salry bonus and calculate it all process by a parameter  named : bonus
    //Method Of Of interface 1
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
    //Method Of Of interface 1
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
    //Method Of Of interface 2
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
    //Method Of Of interface 2
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
    //Method Of Of interface 2
    //Certificate method of the Employ of the Year Award
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
        Clearence_From_Authoritreze();
    }

    //finally this is the contructer so that when a new intant is created it will call a private id method to check the id print the employ details with respect to id
    public Department_Database_Backend(int id){
        id(id);//private id method
    }
}

public class interface_Example_5 {

    public static void main(String[] args) {
        
      //This is Example NO 5

      //class Extends another class and implements interfaces

       //In this code multiple interface is extended by another class and a class also extends another class give best example of multi inheritance

       System.out.println("This is Example NO 5\n\nclass Extends another class and implements interfaces\n\nIn this code multiple interface is extended by another class and a class also extends another class give best example of multi inheritance");
       Department_Database_Backend employ = new Department_Database_Backend(1);
    }
}
