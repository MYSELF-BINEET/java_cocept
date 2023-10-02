import java.util.Stack;
import java.util.*;



public class balancedParanthesis {

    public static boolean isMatching(char a , char b){
        if((a=='(' && b==')') || (a=='{' && b=='}') || (a=='[' && b==']')){
            return true;
        }else{
            return false;
        }
    }

    public static  boolean isValidate(String str){
        Stack <Character> s = new Stack<>();

        for( int i =0 ; i<str.length();i++){
            char ch = str.charAt(i);

            if(ch=='(' ||ch== '{' || ch=='['){
                s.push(ch);
            }else{
                if(s.isEmpty()==true){
                    return false;
                }else if(isMatching(s.peek(), ch)==false){
                    return false;
                }else{
                    s.pop();
                }
            }
        }

        if(s.isEmpty()==true ){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        String str="[{()}]}";
        System.out.println(isValidate(str));

    }
}
