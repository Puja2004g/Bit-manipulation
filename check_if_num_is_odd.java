public class check_if_num_is_odd {
    static boolean oddCheck(int num){
        int temp = num&1;
        if(temp!=0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int a=2;
        int b=3;
        int c=4;
        int d=5;

        System.out.println(oddCheck(a));
        System.out.println(oddCheck(b));
        System.out.println(oddCheck(c));
        System.out.println(oddCheck(d));
    }
}
