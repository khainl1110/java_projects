import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main<T> {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        run();

        ArrayList<Wheel> wheels = new ArrayList<>();
        wheels.add(new Wheel(3, "whatever"));
        wheels.add(new Wheel(4, "whatever"));
        wheels.add(new Wheel(10, "whatever"));
        wheels.add(new Wheel(18, "whatever"));


        methodReferences1(wheels);
        // https://www.javatpoint.com/flatmap-method-in-java-8#:~:text=In%20Java%208%20Streams%2C%20the%20flatMap%20%28%29%20method,merges%20all%20streams%20into%20a%20single%20resultant%20stream.

        MultithreadedCalculation multithreadedCalculation = new MultithreadedCalculation();

        BigInteger result = multithreadedCalculation.calculateResult(BigInteger.valueOf(3), BigInteger.valueOf(2), BigInteger.valueOf(2), BigInteger.valueOf(4));
        Utils.print(result);
    }

    public static void run() {
        String name = "Charlie";

        Runnable greeter = () -> System.out.println("Hi " + name);

        greeter.run();

        stream();
    }

    public static void methodReferences() {
        List<Integer> intList = Arrays.asList(1,2,3);
        intList.forEach(System.out::println);
    }

    public static <T> void methodReferences1(ArrayList<T> arrayList) {
        arrayList.forEach(System.out::println);
    }

    public static void stream() {
        List cityList = Arrays.asList("delhi", "mumbai", "patna").stream().map(String::toUpperCase).collect(Collectors.toList());
        cityList.forEach(System.out::println);
    }
}