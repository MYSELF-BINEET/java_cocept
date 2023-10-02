// package JAVA CONCEPTS.OOPS;

class pen{
    String color;
    int tip;

    void setcolor(String newcolor){
    color=newcolor;
    }


    void settip(int newtip){
        tip=newtip;
    }
}


class info{
    String name;
    int roll;
    // int marks[];


    public void printinfo(){

        System.out.println(this.name);
        System.out.println(this.roll);
        // System.out.println(this.marks[0]);
        // System.out.println(this.marks[1]);
        // System.out.println(this.marks[2]);


    }
}
public class classAndobjects {
    

    public static void main(String[] args) {
        info pradhan=new info();
        pen p1=new pen();

        pradhan.name="Bineet";
        pradhan.roll=109;
        // pradhan.marks[0]=90;
        // pradhan.marks[1]=100;
        // pradhan.marks[2]=100;


        pradhan.printinfo();




        
        p1.setcolor("Blue");
        p1.settip(10);


        System.out.println(p1.color);
        System.out.println(p1.tip);
    }
}
