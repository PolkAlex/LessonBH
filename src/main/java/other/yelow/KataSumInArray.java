package other.yelow;

public class KataSumInArray {

    public static int sum(int[] arr) {

        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                result = result + arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{-7, -1, 0, -4, -1}));
    }
}