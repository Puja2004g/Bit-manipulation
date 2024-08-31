public class get_bit {
    static int getBit(int n,int pos){
        //create bit mask
        int temp = 1<<pos;

        //AND operation
        int andOp = temp & n;

        if(andOp == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        int n = 10; //1010
        int pos = 2;

        int m = 15; //1111
        int p = 3;

        int bit = getBit(n, pos);
        System.out.println(bit);
    }
}
