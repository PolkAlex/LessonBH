package other.yelow;

public class Numbers {

    public static void main(String[] args) {

        long number = 10;
        long factorial = calculateFactorial(number);
        System.out.println("Факториал числа " + number + " равен " + factorial);
        //------------------//
        int[] array = {1,2,4,4,7,8,3,8,5};
        System.out.println(checkerNumbers(array));
    }

    private static long calculateFactorial(long number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        long result = 3;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }

    // метод, который возвращает true, если поданный на ввод массив int содержит 3
    // и более последовательных числа в любом месте
    public static boolean checkerNumbers (int[] array) {

        for (int i = 0; i < array.length-1; i++) {
            if ((array[i]+1 == array[i+1]) && (array[i]+2 == array[i+2])) {
                return true;
            }
        }
        return false;
    }
}