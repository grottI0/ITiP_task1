// нахождение остатка деления двух чисел
public class Task1 {
    // выводит результаты работы remainder
    public static void main(String[] args) {
        System.out.println(remainder(1, 3));
        System.out.println(remainder(-9, 45));
        System.out.println(remainder(5, 5));
    }
    // возвращает остаток деления первого числа на второе
    public static int remainder(int first, int second) {
        return first % second;
    }
}
