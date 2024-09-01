public class power_of_two {
    static boolean checkPower(int n){
        int res = n&(n-1);
        if(res == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int a=4;
        int b=6;
        int c=9;

        boolean resa = checkPower(a);
        boolean resb = checkPower(b);
        boolean resc = checkPower(c);

        System.out.println(resa);
        System.out.println(resb);
        System.out.println(resc);
    }
}
