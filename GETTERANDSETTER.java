class PASSWORD {
    private String passcode;

    public void setPasss(String n) {
        this.passcode = n;
    }

    public String getPass() {
        return this.passcode;
    }

}

public class GETTERANDSETTER {
    public static void main(String[] args) {

        PASSWORD account1 = new PASSWORD();

        // account1.passcode = "SNAKE_EYES";

        account1.setPasss("SNBAKE_EYES");

        System.out.println(account1.getPass());

    }

}
