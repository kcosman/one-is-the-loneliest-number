import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        System.out.println(find_numbers(3, 5, 23));
        System.out.println(find_numbers(3, 5, 330));
        System.out.println(find_numbers(0, 5, 23));
        System.out.println(find_numbers(0, 5, 2));
    }

    static String find_numbers(int digit, int start, int end) {
        StringBuilder numbersFound = new StringBuilder(" ");
        IntStream.rangeClosed(start, end)
                .boxed()
                .filter(i -> {
                    int j;
                    while (i > 0) {
                        j = i%10;
                        if (j == digit) return true;
                        i = i/10;
                    }
                    return false;
                })
                .collect(Collectors.toList())
                .forEach(i -> numbersFound.append(i + " "));
        return numbersFound.toString().trim();
    }
}
