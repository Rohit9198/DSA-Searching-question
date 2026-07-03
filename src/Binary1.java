public class Binary1 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,4};
        int target = 2;

        int ans = Binary1(arr, target);
        System.out.println(ans);
    }

    static int Binary1(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                start = mid+1;
            }
        }

        return ans;
    }
}