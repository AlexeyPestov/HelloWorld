import java.util.Arrays;
import java.util.Collections;

public class T9 {
    public static void main(String[] args) {
        Integer[] arrayInt = new Integer[]{15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        Arrays.sort(arrayInt, Collections.reverseOrder());
        for (Integer el : arrayInt) {
            System.out.println(el);
        }
    }
}
