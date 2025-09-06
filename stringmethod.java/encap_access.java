class Person{
    private int age;
    Person(int age){
        this.age = age;
    }
    int getAge(){
        return age;
    }
}
public class encap_access {
    public static void main(String[] args) {
        Person obj = new Person(21);
       
       System.out.println(obj.getAge()); 
    }
}
