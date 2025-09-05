class person{
    String Name;
    int age;
    void input(String n, int a){
    Name = n;
    age =a;
}
void output(){
    System.out.println("Name =" + Name);
    System.out.println("Age =" + age);
}

}

public class Main { 
    public static void main(String[] args) {
        person person1 = new person();
        person1.input("mala",21);
        person1.output();
    }
    //String name;
    // int age;
    // public static void main(String[] args) {
    //     Main obj = new Main();
    //     obj.name ="Mala";
    //     obj.age =21;
    //     System.out.println("Name =" +obj.name);
    //     System.out.println("age =" + obj.age);
    // }

    
}
