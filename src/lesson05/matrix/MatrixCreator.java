package lesson05.matrix;

public class MatrixCreator {

    public static void createMatrix (Matrix matrix, int start, int end) {
        int verticalSize = matrix.getVerticalSize();
        int horizontalSize = matrix.getHorizontalSize();

        for (int i = 0; i < verticalSize; i++) {
            for (int j = 0; j < horizontalSize; j++) {
                int value = (int) (Math.random()*end+start);
                matrix.setElement(i,j,value);
            }
        }
    }
}
