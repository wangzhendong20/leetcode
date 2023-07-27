public class simple941 {
    public boolean validMountainArray(int[] arr) {

        int left = 0;
        int right = arr.length-1;

        while (left + 1 < arr.length && arr[left] < arr[left+1]){
            left++;
        }

        while (right > 0 && arr[right] < arr[right-1]){
            right--;
        }

        if (left == right && left != 0 && right != arr.length-1){
            return true;
        }

        return false;
    }
}
