public class Main{
    public  static  void  main(String[] args){
PayrollSystem  payrollSystem= new PayrollSystem();
FullTimeEmployee  Gianna = new FullTimeEmployee("Gianna", 1, 1000000);
PartTimeEmployee Joanna= new PartTimeEmployee("Joanna", 2, 10, 40);

payrollSystem.addEmployee(Gianna);
payrollSystem.addEmployee(Joanna);
System.out.println("Initial Employee details:");
payrollSystem.displayEmployees();
System.out.println("Removing employees");
payrollSystem.removeEmployee(2);
System.out.println("Remaining employees");
payrollSystem.displayEmployees();

}
}