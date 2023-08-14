package generic;

public class WildcardApp {

    public static void main(String[] args) {
        print(new MyData<String>("data"));
        print(new MyData<Integer>(100));
    }

    public static void print(MyData<?> data) {
        System.out.println(data.getData());
    }
}
