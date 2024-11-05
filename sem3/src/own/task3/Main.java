package own.task3;

public class Main {
    public static void main(String[] args) {
        Pair<String,String> pair = new Pair<>("hello", "world");
        Pair<String,Integer> pair2 = new Pair<>("age", 18);

        System.out.println(pair.toString());
        System.out.println(pair2.toString());
    }
}
