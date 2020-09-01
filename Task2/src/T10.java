import java.util.Arrays;

public class T10 {
    public static void main(String[] args) {
        Integer[] arrayNum = new Integer[] {5, 10, 0 , -6, 5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        Integer[] a1 =  Arrays.stream(arrayNum).filter(el -> el != 0).toArray(Integer[]::new);
        Integer[] a2 =  Arrays.stream(arrayNum).filter(el -> el == 0).toArray(Integer[]::new);
        int i = 0;
        while (i < a1.length) {
            arrayNum[i] = a1[i];
            i++;
        }
        for (int j = 0; j < a2.length; j++) {
            arrayNum[i] = a2[j];
            i++;
        }
        for (Integer el : arrayNum) {
            System.out.println(el);
        }
    }
}
