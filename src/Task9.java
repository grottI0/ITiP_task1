// вычисление суммы кубов элементов массива
public class Task9 {
    // сосдание массивов и вывод суммы кубов их жлементов
    public static void main(String[] args) {
        System.out.println("Task9:");
        int[] array1 = {1, 5, 9};
        int[] array2 = {3, 4, 5};
        int[] array3 = {2};
        int[] array4 = {};
        System.out.println(sumOfCubes(array1));
        System.out.println(sumOfCubes(array2));
        System.out.println(sumOfCubes(array3));
        System.out.println(sumOfCubes(array4));
        System.out.println();
    }
    // вычисляет сумму кубов элементов массива
    public static int sumOfCubes(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i]*array[i]*array[i];
        }
        return sum;
    }
}
