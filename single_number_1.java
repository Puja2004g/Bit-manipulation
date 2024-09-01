import java.util.ArrayList;
import java.util.Arrays;

public class single_number_1 {
    static int getSingleNumber(ArrayList<Integer> arr){
        int xor=0;
        for(int i=0;i<arr.size();i++){
            xor ^= arr.get(i);
        }
        return xor;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4,1,2,1,2));
        int num = getSingleNumber(arr);
        System.out.println(num);
    }
}
