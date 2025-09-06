class camp{
    String Name;
    int age;
    //### Parametarise constructure######
        camp(String name,int age){
            this.Name = name;
            this.age = age; }
    void output(){
        System.out.println("Name = "+ Name);
        System.out.println("Age = "+ age);
    }
}
public class Const_call {
    public static void main(String[] args) {
         camp call1 = new camp("Mala", 21);
         call1.output();
}
}