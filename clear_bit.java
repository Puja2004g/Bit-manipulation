public class clear_bit {
    static int clearBit(int n,int pos){
        //create bitmask
        int bitmask = 1<<pos;

        //operation and with not
        int notbitmask = ~(bitmask);

        int num = notbitmask & n;

        return num;
    }
    public static void main(String[] args) {
        int n= 5;
        int pos =2;
        int bit = clearBit(n,pos);
        System.out.println(bit);
    }
}
