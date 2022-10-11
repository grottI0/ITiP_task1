public class Task10 {
    // выводит результаты работы abcMatch
    public static void main(String[] args) {
        System.out.println("Task10:");
        System.out.println(abcMatch(42, 5, 10));
        System.out.println(abcMatch(5, 2, 1));
        System.out.println(abcMatch(1, 2, 3));
        System.out.println();
    }
    // суммирует a с самим собой b раз и проверяет делится ли сумма на c
    public static boolean abcMatch(int a, int b, int c) {
        for (int i = 1; i < b+1; i++) {
            a += a;
        }
        return a % c == 0;
    }
}
