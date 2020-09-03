public class T10 {
    public static void main(String[] args) {
        int[] arrayNum = new int[] {5, 10, 0 , -6, 5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        for (int i = arrayNum.length-1; i >= 0 ;i--)    {
            if (arrayNum[i] == 0)   {
                for (int j = i; j < arrayNum.length-1 && arrayNum[j+1] != 0; j++)  {
                    arrayNum[j] = arrayNum[j+1];
                    arrayNum[j+1] = 0;
                }
            }
        }
        for (Integer el : arrayNum) {
            System.out.println(el);
        }
    }
}
