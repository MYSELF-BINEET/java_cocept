import java.util.ArrayList;

public class containWaterpractice {

    public static int maxwatet2(Arraylist<Integet>list){
        int max =0;
        int lp = 0;
        int rp = list.size()-1;

        for(int i= 0; i<list.size;i++){
            for(int j=i+1;j<list.size;j++){
                int height = Math.min(list.get(lp),list.get(rp));
                int width = j-i;

                int water= height*width;

                max= Math.max(max,water);
            }
        }

        return max;
    }

    public static int maxWater(ArrayList<Integer>list){
        int max= 0;
        int lp =0;
        int rp =list.size()-1;

        while(lp<rp){
            int height = Math.min(list.get(rp),list.get(lp));
            int width = rp- lp;

            int water = height * width;

            max = Math.max(max, water);

            if(list.get(lp)<list.get(rp)){
                lp++;

            }else{
                rp--;
            }
        }

        return max;
    }
    public static void main(String[] args) {
        
    }
}
