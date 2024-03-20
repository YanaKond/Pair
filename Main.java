public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(50, "World, ");
        System.out.println("First element: " + pair.getFirst());
        System.out.println("Second element: " + pair.getSecond());

        pair.setFirst(1);
        pair.setSecond("Hello");
        System.out.println("Updated first element: " + pair.getFirst());
        System.out.println("Updated second element: " + pair.getSecond());
    }
}
