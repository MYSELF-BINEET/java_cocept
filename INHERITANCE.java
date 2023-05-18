import java.lang.Math;

class shape{
    String color;
    int height;
    int base;

    
    int radius;

    public void area(){
        System.out.println("AREA IS ..........");
    }

}
class Triangular extends shape{


    public void area(int base , int height){
        System.out.println("AREA IS ................."+0.5*height*base);
    }

    // Triangular(){
    //     System.out.println("YEHHHHH ..... BUDDDY ...... YOU ARE NOW INTERMIDIATE   JAVA ...... !!!!!");
    // }

    // public void printcolor(String color){
    //     System.out.println("SO ...... THIS COLOR IS ...........!!!"+this.color);
    // }
    
}

class circle extends shape{
    public  void area( int radius){
          System.out.println("AREA IS ..............."+ 3.14*Math.pow(radius,2));
    }
}



public class INHERITANCE {
    public static void main(String[] args) {
        // Triangular shape1 = new Triangular();

        // shape1.color = "RED";

        // shape1.height = 10;

        // shape1.base = 10;

        // shape1.area(shape1.base, shape1.height);



        // shape1.printcolor(shape1.color);



        circle shape2 = new circle();

        shape2.radius = 10;


        shape2.area(shape2.radius);

        
    }
}
