public class linear1 {
    static int linearSearch(int []arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int index=0; index < arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums = {12, 13, 34, 45, 56, 78, 89, 90};
        int target = 78;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
}
