// package JAVA CONCEPTS.OOPS;


class modifiers{

    int age ;  //  it is a public class modifiers   //    its is automatically turn to public dont need to write exatarnly

    protected  int  list;    // this is not accessable  outside of the package

    // Default int roll ;   //  this is not acccesable outside the package and  subclass 

    private  String Password;    //this  is not accessable instead of this class



    public void access(){
     this.age=age;
     // this.list =list;
    //  this.roll=roll;
    //  this.password=password;
    }

}

public class Access_Modifiers {
     public static void main(String[] args) {
        modifiers prac= new modifiers();

        prac.age=19;
     //    prac.list= 13;
        // prac.roll=1007;
        // prrac.password="Ilovemyself";



   System.out.println(prac.age);
        // System.out.println(prac.password);
     }
}
