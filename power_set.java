//finding the subsets using bitwise operators then the subset is called a power set

import java.util.ArrayList;
import java.util.Arrays;

public class power_set {
    static ArrayList<ArrayList<Integer>> getPowerSet(ArrayList<Integer> arr){
        int subset = 1<<arr.size(); //2^n
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0;i<subset-1;i++){
            ArrayList<Integer> set = new ArrayList<>();
            for(int j=0;j<arr.size();j++){
                if((i & (1<<j))!=0){
                    set.add(arr.get(j));
                }
            }
            ans.add(set);
        }

        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ans = getPowerSet(num);
        System.out.println(ans);
    }
}
