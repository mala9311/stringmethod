class call{
    String Name;
    int age;
    void output(){
        System.out.println("Name = "+ Name);
        System.out.println("Age = "+ age);
    }
}
public class Const_call {
    public static void main(String[] args) {
         call call1 = new call();
         call1.output();
}
}