public class ProdCode {
    public static void main(String[] args) {
        mainTask();
    }

    public static void mainTask() {
        System.out.println(
            Decorator.decorateString(Shouter.shoutString("This is Good Prod Code"), "!!"));
    }
}
