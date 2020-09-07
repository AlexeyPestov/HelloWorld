public class T9 {
    public static void main(String[] args) {
        int[] arrayInt = new int[]{15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        for (int i = 0; i <= (arrayInt.length-1)/2; i++)    {
            int temp = arrayInt[i];
            int arrayEnd = arrayInt.length - 1 - i;
            arrayInt[i] = arrayInt[arrayEnd];
            arrayInt[arrayEnd] = temp;
        }
        for (Integer el : arrayInt) {
            System.out.println(el);
        }
    }
}
