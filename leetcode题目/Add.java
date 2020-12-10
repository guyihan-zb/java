import java.util.Arrays;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2020-12-10
 * @time: 19:38
 */
public class Add {
    public static int[] twoSum(int[] nums, int target) {
        int [] ret=new int [2];
        int len=nums.length;
        for(int i=0;i<len;i++){
            for(int j=len-1;j>i;j--){
                if(nums[i]+nums[j]==target){
                    ret[0]=i;
                    ret[1]=j;
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int [] n=twoSum(nums,9);
        System.out.println(Arrays.toString(n));
    }
}
