import java.util.ArrayList;
import java.util.Collections;

public class remove_last_bit {
    static int removeLastBit(int n){
        return n&(n-1);
    }

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
    public static void main(String[] args) {
        int a = 5;
        int newNum = removeLastBit(a);
        System.out.println(newNum);
        d2b(newNum);
    }
}
