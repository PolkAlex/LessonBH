package lesson07;

public class Run {

    public static void main(String[] args) {

        CustomList<String> customList = new CustomList<>();

        customList.add("first");
        customList.add("second");

        customList.get(3);

        System.out.println(customList.toString());
    }
}