import java.util.function.IntToDoubleFunction;

class introduction {

   
    String name;
    int age;

introduction(){
    System.out.println("YAHOOOO.....!!!!!!!!");                          // IS IS A CONTRUCTOR
}

    public void printname() {

        System.out.println(this.name);

    }

    public void printage() {
        System.out.println(this.age);
    }

    public static void write() {
        System.out.println("HELLO BUDDDY!!!.........WHAT`S UP");
    }

}

public class OOPS {
    public static void main(String[] args) {
        introduction person1 = new introduction();
        introduction person2 = new introduction();

        person1.name = "BINEET PRADHAN";
        person1.age = 19;

        person2.name = "SNAKE_EYES";
        person2.age = 19;

        // person1.write();

        person1.printname();

        person2.printname();

    }
}