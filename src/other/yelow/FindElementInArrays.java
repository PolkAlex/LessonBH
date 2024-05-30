package other.yelow;

public class FindElementInArrays {
    public static void main(String[] args) {

        // Даны три неубывающих массива чисел
        // Найти число, которое присутствует во всех трех массивах

        int[] array1 = new int[] {1,2,4,7};
        int[] array2 = new int[] {3,3,4,8};
        int[] array3 = new int[] {2,3,4};

        for (int i = 0; i < array3.length; i++) {
            if (array3[i] == array1[i] && array3[i] == array2[i]) {
                System.out.println("Элемент массива №" + i + " найден. Он равен " + array3[i]);
            } else System.out.println("Элемент массива №" + i + " не найден");
        }
    }
}