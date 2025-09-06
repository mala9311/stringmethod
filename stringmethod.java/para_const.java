class chain{
    String name;
     int age;
   //   ### non parameterized constructor
     chain(){
        name = "Mala";
         age = 21;
     }
     void output(){
        System.out.println("name =" + name);
        System.out.println("age = " +age);
     }
     public class para_const{
        public static void main(String[] args){
            chain call1 = new chain();
            call1.output();
        }
     }
}