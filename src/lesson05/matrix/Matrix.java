package lesson05.matrix;

public class Matrix {

    private int [][] matrix;

    public Matrix (int n, int m) {
        if (n <= 1 || m <= 1) {
            throw new IllegalArgumentException("Не верный размер матрицы");
        } else {
            this.matrix = new int[n][m];
        }
    }

    public int getVerticalSize() {
        return this.matrix.length;
    }

    public int getHorizontalSize() {
        return this.matrix[0].length;
    }

    public int getElement (int i, int j) {
        if (checkRange(i,j)) {
            return this.matrix[i][j];
        }else {
            throw new IllegalArgumentException("Выход за пределы массива");
        }
    }

    public void setElement (int i, int j, int value) {
        if (checkRange(i,j)) {
            this.matrix[i][j] = value;
        }else {
            throw new IllegalArgumentException("Выход за пределы массива");
        }
    }

    private boolean checkRange(int i, int j) {
        if (i>=0 && i<this.matrix.length && j>=0 && j<this.matrix[0].length) {
            return true;
        } else {
            return false;
        }
    }

    public String toString () {

        StringBuilder sb = new StringBuilder().append("Matrix ")
                .append(this.matrix.length)
                .append("x")
                .append(this.matrix[0].length)
                .append("\n");

        for (int[] ints : this.matrix) {
            for (int anInt: ints) {
                sb.append(anInt).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
