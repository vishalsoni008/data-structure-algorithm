package genric;

public class ImplementCustomGenric {
    public static void main(String[] args) {
        CustomGenricClass<String> stringObj = new CustomGenricClass<>("genric test");

        CustomGenricClass<Integer> intObj = new CustomGenricClass<>(1);

        stringObj.show();
        intObj.show();

    }
}
