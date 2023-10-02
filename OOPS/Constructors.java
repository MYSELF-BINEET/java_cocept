

public class Constructors {
public static void main(String[] args) {
    info introduction =new info("bineet");
    System.out.println(introduction.name);
}
    
}

class info{

    String name;
    int age;
    int roll;

    info(){
        System.out.println("YAHOO YOU ARE ENTER THE GAME ..........");                //  in class java creates constructors itself  
    }

    info(String nam){
        this.name=nam;
    }

    info(String nam, int ages){
        this.name=nam;
        this.age=ages;
    }
}