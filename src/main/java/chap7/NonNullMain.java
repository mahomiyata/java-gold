package chap7;

public class NonNullMain {
    public static void main(String[] args) {
        NonNullList<String> list = new NonNullList<>();
        list.add("Hello");
        list.add(null);
        list.add("MOYOMOYO");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
