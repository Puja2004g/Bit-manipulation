import java.util.ArrayList;
import java.util.Collections;

public class minimum_bit_flips {
    static void d2b(int n){
        ArrayList<Integer> bin = new ArrayList<>();
        while(n!=0){
            int rem = n%2;
            bin.add(rem);
            n/=2;
        }

        Collections.reverse(bin);

        System.out.println(bin);
    }

    static int countSetBits(int n){
        int cnt=0;
        while(n!=0){
            n = n&(n-1);
            cnt++;
        }
        return cnt;
    }

    static int minBitFlips(int s, int g){
        int flip = s^g;
        int count = 0;
        for(int i=0;i<31;i++){
            if((flip & (1<<i))!=0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int start = 23; //1010
        int goal = 24; //0111

        d2b(start);
        d2b(goal);

        System.out.println(minBitFlips(start, goal));
    }
}
