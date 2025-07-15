import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.text.SimpleDateFormat;

class Project1{
    public static void main() throws ParseException{
        Scanner sc = new Scanner(System.in);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Employee[] emps = new Employee[7];
        emps[0] = new Employee(1001, "Ashish", sdf.parse("01/04/2009"), 'e', "R&D", 20000, 8000, 3000);
        emps[1] = new Employee(1002, "Sushma", sdf.parse("23/08/2012"), 'c', "PM", 30000, 12000, 9000);
        emps[2] = new Employee(1003, "Rahul", sdf.parse("12/11/2008"), 'k', "Acct", 10000, 8000, 1000);
        emps[3] = new Employee(1004, "Chahat", sdf.parse("29/01/2013"), 'r', "Front Desk", 12000, 6000, 2000);
        emps[4] = new Employee(1005, "Ranjan", sdf.parse("16/07/2005"), 'm', "Engg", 50000, 20000, 20000);
        emps[5] = new Employee(1006, "Suman", sdf.parse("01/01/2000"), 'e', "Manufacturing", 23000, 9000, 4400);
        emps[6] = new Employee(1007, "Tanmay", sdf.parse("12/06/2006"), 'c', "PM", 29000, 12000, 10000);

        System.out.println("Enter Employee ID :");
        int id = sc.nextInt();
        char code = ' ';
        boolean found = false;
        int i;
        for(i=0;i<7;i++){
            if(emps[i].empNo == id){
                code = emps[i].code;
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("There is no employee with empid : "+id);
            return;
        }

        String desig = "";
        int da=0;

        switch(code){
            case 'e':
                desig = "Engineer";
                da = 20000;
                break;
            case 'c':
                desig = "Consultant";
                da = 32000;
                break;
            case 'k':
                desig = "Clerk";
                da = 12000;
                break;
            case 'r':
                desig = "Receptionist";
                da = 15000;
                break;  
            case 'm':
                desig = "Manager";      
                da = 40000;
                break;
        }

        System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");
        System.out.println(id+"\t"+emps[i].empName+"\t\t"+emps[i].department+"\t\t"+desig+"\t\t"+salary(emps[i].basicSal, emps[i].hra, emps[i].it, da ));
        

    }

    public static int salary(int basicSal, int hra, int it, int da){
        return basicSal + hra + da - it;
    }
}