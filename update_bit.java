public class update_bit {
    static int updateBit(int n, int bit, int pos) {
        // for updating bit 1 to 0
        // clear operation
        int bitmask = 1 << pos;
        if (bit == 0) {
            int notbitmask = ~(bitmask);

            int newNum = notbitmask & n;

            return newNum;
        }

        // for updating 0 t0 1
        // set operation
        else{
            int newNum = bitmask | n;

            return newNum;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int pos = 1;

        // update 1
        int one = updateBit(n, 1, pos);
        System.out.println(one);

        // update 0
        int zero = updateBit(n, 0, pos);
        System.out.println(zero);
    }
}
