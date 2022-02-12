import java.util.*;
import java.util.function.Consumer;

public class FeaturesJava8 implements TestInterface1, TestInterface2 {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();

        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));

        productsList.stream().filter(price -> price.getPrice() > 30000).
                map(Product::getName).forEach(System.out::println);

        //Optional Java8
        String name = "Chintan";
        System.out.println(Optional.ofNullable(name).orElse("Value is not present"));

        List<String> nameList = new ArrayList<>();
        nameList.add("Chintan");
        nameList.add("Darshan");
        nameList.add("chirag");
        nameList.add("cHan");
        nameList.add("headache");

        nameList.stream().map(String::toLowerCase).filter(n -> n.contains("ch")).
                forEach(System.out::println);

        productsList.stream().sorted((p1, p2) -> p2.price.compareTo(p1.price)).
                map(p1 -> p1.name).forEach(System.out::println);

        FeaturesJava8 featuresJava8 = new FeaturesJava8();
        featuresJava8.show();

        ThreadSafeSingletonEnum.SINGLETON_ENUM.display();

        String s = "He is a very very good boy, isn't he?";
        String regex = "[ !,?._'@]+";
        String[] splitString = s.split(regex);
        System.out.print(splitString.length);
        for (String str : splitString) {
            System.out.println(str);
        }

        Consumer c = (t) -> {
            System.out.println(t);
        };
        c.accept("Hello Chintan...!!!");
        Map<String, String> m = new HashMap<>();
        for (Map.Entry<String,String> n: m.entrySet()) {
            System.out.println(n.getKey()+n.getValue());
        }
    }

    @Override
    public void show() {
        TestInterface1.super.show();
        TestInterface2.super.show();
    }
}
