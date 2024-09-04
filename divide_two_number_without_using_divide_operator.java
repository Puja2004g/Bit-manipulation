public class divide_two_number_without_using_divide_operator {
    static int divide(int dividend, int divisor){
        int quo=0;
        while(dividend>=divisor){
            int temp = divisor;
            int i=1;

            while((temp<<1) <= divisor){
                temp <<= 1;
                i <<= 1;
            }

            dividend -=temp;
            quo += i;
        }

        return quo;
    }
    public static void main(String[] args) {
        int dividend = 10, divisor = 2;
        System.out.println(divide(dividend, divisor));
    }
}
