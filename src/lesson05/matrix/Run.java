package lesson05.matrix;

public class Run {

    public static void main(String[] args) {

        Matrix matrix = new Matrix(5,10);
        MatrixCreator.createMatrix(matrix, 3, 50);

        System.out.println(matrix);
    }
}
