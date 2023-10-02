// package JAVA CONCEPTS.OOPS;



class passcode{
    private String password;

    public String getpass(){
       return this.password;
    }

    public void setpass(String pass){
       this.password=pass;
    }
}

public class GetterAndSetter {

    public static void main(String[] args) {
        passcode pass1=new passcode();

        pass1.setpass("ilovemyself");

        System.out.println(pass1.getpass());
    }
    
}
