import java.util.*;
import java.util.Stack;


public class duplicateParanthesis {
    public static boolean isDuplicate(String str){

        Stack <Character> s = new Stack<>();

        for(int i =0 ;i<str.length();i++){
            int count = 0;
            char ch = str.charAt(i);
            if(ch==')'){
                while(! ch =='('){
                    s.pop();
                    count++;
                }

                if(1>count){
                    return true;
                }else{
                    s.pop();
                }
            }else{
                s.push(i);
            }
        }


        return false;

    }
    public static void main(String[] args) {
        
    }
}
