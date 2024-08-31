public class set_bit {
    static int setBit(int n, int pos){
        //create bit mask
        //left shift 1 by position given
        int temp = 1<<pos;

        //perform OR operation
        int orOp = temp | n;

        return orOp;
    }
    public static void main(String[] args) {
        int n=5;
        int pos = 1;

        int bit = setBit(n, pos);
        System.out.println(bit);
    }
}
