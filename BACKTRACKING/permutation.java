// package JAVA CONCEPTS.BACKTRACKING;

public class permutation {

    public static void findpermutataion(String str,String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        //recursion
        for(int i=0;i<str.length();i++){
            char currchar=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);
            findpermutataion(newstr, ans+currchar);
        }

    }
    public static void main(String[] args) {
        String str="abc";
        findpermutataion(str, "");
    }
}
