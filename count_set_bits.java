import java.util.ArrayList;
import java.util.Collections;

public class count_set_bits{
    static void d2b(int n){
        ArrayList<Integer> bin = new ArrayList<>();
        while(n!=0){
            int rem = n%2;
            bin.add(rem);
            n/=2;
        }

        Collections.reverse(bin);

        for(int i=0;i<bin.size();i++){
            System.out.print(bin.get(i)+" ");
        }
        System.out.println();
    }
    static int countSetBits(int n){
        int count =0;
        while(n!=0){
            n = n&(n-1);
            d2b(n);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n=5; //1010
        d2b(n);
        System.out.println();

        int countset = countSetBits(n);
        System.out.println(countset);
    }
}