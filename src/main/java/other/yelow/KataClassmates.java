package other.yelow;

public class KataClassmates {

    public static int paperWork(int n, int m) {
        //Happy Coding! ^_^
        int paper;
        if (n <= 0 || m <= 0) {
            return paper = 0;
        } else {
            return paper = n * m;
        }
    }

    public static void main(String[] args) {
        System.out.println(paperWork(2, 5));
    }
}