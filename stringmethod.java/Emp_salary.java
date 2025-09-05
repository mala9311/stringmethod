class identity{
    int ID;
    String Name;
    int Salary;
    void input(int a, String n, int b){
        ID =a;
        Name = n;
        Salary = b;
    }
    void output(){
        System.out.println("ID =" + ID);
        System.out.println("Name =" + Name);
        System.out.println("Salary =" + Salary);
    }

}
public class Emp_salary {
    public static void main(String[] args) {
    identity emp = new identity();
    emp.input(101,"Mala",50000);
    emp.output();
    
}
}