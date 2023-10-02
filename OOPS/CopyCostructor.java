// package JAVA CONCEPTS.OOPS;

public class CopyCostructor {
    public static void main(String[] args) {
        student s1=new student();
        s1.name="bineet";
        s1.age=19;
        s1.roll=109;
        s1.marks[0]=90;
        s1.marks[1]=100;
        s1.marks[2]=80;


        student s2=new student(s1);
        s1.marks[1]=90;
                                                                            // this is a deep copy
        for(int i=0;i<3;i++){                                      // this is not copy all the values       this is stored the reference of the objects 
            System.out.println(s2.marks[i]);
        }

        
    }
    
}

class student{
    String name;
    int age;
    int roll;
    int marks[];
    student(){
        System.out.println("you are entered the game.......");
        marks=new int[3];
    }

    student(student s1){
        this.name=s1.name;
        this.age=s1.age;
        this.roll=s1.roll;

        marks= new int[3];

        this.marks=s1.marks;

    }
}


