
class Info {

    String name;
    int age;


   
    Info(String name , int age) {                                                           // THIS IS AN PARAMETERRIZED  CONSTRUCTOR


        this.name = name;              // this.name is a object and name is a parameter                            // THIS IS A CONSTRUCTOR
        this.age = age;

        System.out.println(name);
        System.out.println(age);
    }

    public void printinfo() {//
                                                                                                                       // THESE ARE AN OBEJECT
        System.out.println(this.name);
        System.out.println(this.age);

    }



    Info ( Info name2){                                     
        this.name = name2.name;                     // THS IS A COPY CONSTRUCTOER
        this.age = name2.age;

    }

    Info(){

    }

}

public class CONSTRUCTER {
    public static void main(String[] args) {
        Info name1 = new Info();
        
        name1.name = "BINEET PRADHAN";
        name1.age= 19;
        name1.printinfo();


        Info name2 = new Info(name1);

        name2.printinfo();
    }

}
