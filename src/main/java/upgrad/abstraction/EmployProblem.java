package upgrad.abstraction;


class Employee {

    private int empId;
    private String empFirstName;
    private String empSecondName;
    private double empSalary;

    //Write your code here


    public Employee(int empId, String empFirstName, String empSecondName, double empSalary) {
        this.empId = empId;
        this.empFirstName = empFirstName;
        this.empSecondName = empSecondName;
        this.empSalary = empSalary;
    }

    public void displayDetail(){
        System.out.printf("employee full name %s %s\nemployee annual package %.2f\n",this.empFirstName,this.empSecondName,this.empSalary*12);
    }
}

public class EmployProblem {
    public static void main(String[] args) {
        //Write your code here
        Employee E1 = new Employee(101512031, "Sushil", "Kumar", 45000.58);
        Employee E2 = new Employee(101512032, "Tara", "Sharma", 51000.99);
        E1.displayDetail();
        E2.displayDetail();
    }
}

