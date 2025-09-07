class Student{
    String Name;
    int age;
    void output(){
        System.out.println("Name = " +Name);
        System.out.println("age = " + age);
    }
}
class Teacher extends Student{

}
public class Single {
    public static void main(String[] args) {
        Teacher T1 = new Teacher();
        T1.Name = "Mala";
        T1.age = 21;
        T1.output();
    }
    
}
