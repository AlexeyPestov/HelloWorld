import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class T8 {
    public static void main(String[] args) {
        int[] arrayInt = new int[]{1, -10, 5 ,6, 45, 23, -45, -34, 0, 32, 56, -1 , 2, -2};
        System.out.println("Максимальное значение " + maxValue(arrayInt));
        System.out.println("Сумма положительных элементов " + sumPosEl(arrayInt));
        System.out.println("Сумма чётных отрицательных элементов " + sumEvNeg(arrayInt));
        System.out.println("Количество положительных элементов " + countPosEl(arrayInt));
        System.out.println("Среднее арифметическое отрицательных элементов " + averageNeg(arrayInt));
    }
    private static int maxValue(int[] arrayInt)  {
        int max = arrayInt[0];
        for (int el : arrayInt) {
            if (el <= max)  {
                continue;
            }
            max = el;
        }
        return max;
    }

    private static int sumEvNeg (int[] arrayInt)    {
        int sum = 0;
        for (int el : arrayInt) {
            if (el % 2 == 0 && el < 0) {
                sum += el;
            }
        }
        return sum;
    }

    private static int sumPosEl (int[] arrayInt)    {
        int sum = 0;
        for (int el : arrayInt) {
            if (el > 0) {
                sum += el;
            }
        }
        return sum;
    }

    private static int countPosEl (int[] arrayInt)  {
        int count = 0;
        for (int el : arrayInt) {
            if (el > 0) {
                count ++;
            }
        }
        return count;

    }

    private static double averageNeg (int[] arrayInt)    {
        int sum = 0;
        int count = 0;
        for (int el : arrayInt) {
            if (el < 0) {
                sum += el;
                count++;
            }
        }
        return sum/count;
    }
}
