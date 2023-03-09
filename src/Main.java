import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int sum = Stream.of(5, 6 , 8, 10).mapToInt(x -> x).sum();
        System.out.println(sum);
    }
}