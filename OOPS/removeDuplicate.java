public class removeDuplicate {

    public static void duplicate(String str,int idx,Str newStr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
         
        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){
            duplicate(str, idx+1, newStr, map);
        }else{
            map[currchar-'a']=true;
            duplicate(str, idx+1, newStr.append(currchar), map);
        }
    }
    public static void main(String[] args) {
        String str="apnnacollege";

        duplicate(str, 0, new StringBuilder(""), new boolean map[26]);
    }
}
