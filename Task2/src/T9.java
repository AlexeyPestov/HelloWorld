public class T9 {
    public static void main(String[] args) {
        Integer[] arrayInt = new Integer[]{15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        for (int i = arrayInt.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrayInt[j] < arrayInt[j + 1]) {
                    int tmp = arrayInt[j];
                    arrayInt[j] = arrayInt[j + 1];
                    arrayInt[j + 1] = tmp;
                }
            }
        }
        for (Integer el : arrayInt) {
            System.out.println(el);
        }
    }
}
