public class Main {

    public static void main(String[] args) {
        System.out.println("My super app!");
        System.out.println("App calculator");
        int a = 5;
        int b = 7;
        int c = add(a, b);
        System.out.println(c);
    }

    private static int add(int a, int b) {
        return a + b;
    }
}
