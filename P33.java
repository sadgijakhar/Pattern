import java.util.Scanner;
public class P33 {
    static int solve(int n, int[] nums, int target, int high , int low ){
            
            if(high > low){
                int mid = (low + (high - low)/2);
                // index = (n + 0)/2;
                if ( nums[mid] == target){
                    return mid;
                    // return index;
                }
                else if (nums[mid] > target){
                    return solve(n, nums, target, mid-1, low );
                }
                
                return solve(n, nums, target, high, mid+1);
            }
            else{
                return 0;
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums [] = new int[n];
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }
        int low = 0;
        int high = nums.length -1;
        int target = sc.nextInt();
        // int index  =0;
        System.out.println(solve(n, nums, target, high, low)); 
        sc.close();
    }
    
}
