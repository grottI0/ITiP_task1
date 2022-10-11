public class Task8 {
    // выводит резудьтаты работы nextEdge
    public static void main(String[] args) {
        System.out.println("Task8:");
        System.out.println(nextEdge(8, 10));
        System.out.println(nextEdge(5, 7));
        System.out.println(nextEdge(9, 2));
        System.out.println();
    }
    // находит наибольшую возможную сторону треугольника при данных двух
    public static int nextEdge(int first, int second) {
        return first+second-1;
    }
}
