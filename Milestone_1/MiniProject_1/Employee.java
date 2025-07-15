import java.util.Date;

class Employee{
    public int empNo;
    public String empName;
    public Date joinDate;
    public char code;
    public String department;
    public int basicSal;
    public int hra;
    public int it;

    Employee(int empNo,String empName, Date joinDate, char code, String department, int basicSal, int hra, int it){
        this.empNo = empNo;
        this.empName = empName;
        this.joinDate = joinDate;
        this.code = code;
        this.department = department;
        this.basicSal = basicSal;
        this.hra = hra;
        this.it = it;   
    }
    
}