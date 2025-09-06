class student{
     private String name;
     private int marks;
    student(String name, int marks){          //  parameterized constructor
        this.name = name;
        this.marks = marks;
    }
    String getName(){
        return name;
    }
    int getmarks(){
        return marks;
    }
    void display(){                  // display method 
        System.out.println("Name = " + getName());
        System.out.println("Marks = " + getmarks());
    }
}
public class Practice_encap {
    public static void main(String[] args) {
        student s1 = new student("Mala",93);
        student s2 = new student("Roshani",84);
        student s3 = new student("Rajesh",99);
        student s4 = new student("Deepak",67);
        student s5 = new student("Archana",98);
        
            s1.display();
            s2.display();
            s3.display();
            s4.display();
            s5.display();

        

         
    }
    
}
