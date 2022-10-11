// нахождение суммы чисел от 1 до n
public class Task7 {
    public static void main(String[] args) {
        System.out.println("Task7:");
        System.out.println(addUpTo(3));
        System.out.println(addUpTo(10));
        System.out.println(addUpTo(7));
        System.out.println();
    }
    // считает сумму от 1 до n
    public static int addUpTo(int n) {
        int sum = 0;
        for (int i = 1; i < n+1; i++) {
            sum += i;
        }
        return sum;
    }
}
