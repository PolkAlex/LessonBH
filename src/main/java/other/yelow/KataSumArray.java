package other.yelow;

import java.util.*;

public class KataSumArray {

    public static int sum(int[] numbers) {

        int sum = 0;
        if(numbers == null || numbers.length == 1){
            return sum;
        }
        else{
            Arrays.sort(numbers);
            for(int i = 1; i < numbers.length-1; i++){
                sum += numbers[i];
            }
        }
        return sum;
    }
}