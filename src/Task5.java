// нахождение операции выполняемой над двумя числами для получения третьего
public class Task5 {
    // выводит результаты работы operation
    public static void main(String[] args) {
        System.out.println(operation(24, 15, 9));
        System.out.println(operation(24, 26, 2));
        System.out.println(operation(15, 11, 11));
    }
    // проверяет какую операцию нужно выполнить над a и b чтобы получить n
    public static String operation(int n, int a, int b) {
        if (a + b == n) {
            return "added";
        } else if (a - b == n) {
            return "subtracted";
        } else if (a * b == n) {
            return "multiplied";
        } else if (a / b == n) {
            return "divided";
        } else {
            return "None";
        }
    }
}