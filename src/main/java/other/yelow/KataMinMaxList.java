package other.yelow;

import java.util.Arrays;

public class KataMinMaxList {

    public static void main(String[] args) {

        System.out.println(min(new int[]{4, 6, 2, 1, 9, 63, -134, 566}));
        System.out.println(max(new int[]{4, 6, 2, 1, 9, 63, -134, 566}));
    }

    public static int min(int[] list) {

        Arrays.sort(list);
        return list[0];
    }

    public static int max(int[] list) {

        Arrays.sort(list);
        return list[list.length -1];
    }
}