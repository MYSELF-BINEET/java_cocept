import java.lang.reflect.InaccessibleObjectException;

class Info {


    String  name ;
    int age;


   Info (){
        System.out.println("HEY BUDDY........... !!!! WHAT`S UP !!!!!");            // this is a constuctor
    }
    
    public void printinfo(String name){

        System.out.println(name);

    }
                                                                                                                                             // THIS IS AN FUCKING EXAMPLE OF POLYMORPHISM    
    public void printinfo(int age){
       System.out.println(age);
    }


    public void printinfo( String name, int age){

        System.out.println("HEY.....ARE YOY "+this.name+ "YOUR PASS IS "+ this.age);
    }



}




public class POLYMORPHISM {

    public static void main(String[] args) {
        Info name1 = new Info();
        name1.name = "BINEET PRADHAN";
        name1.age =18;

        name1.printinfo(name1.name, name1.age);
   }
    
}
