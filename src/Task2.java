// нахождение площади треугольника по высоте и основанию
public class Task2 {
    // выводит результат работы triArea
    public static void main(String[] args) {
        System.out.println(triArea(3, 2));
        System.out.println(triArea(7, 4));
        System.out.println(triArea(10, 10));
    }
    // возвращает площадь треугольника в зависимости от параметров
    public static int triArea(int height, int base){
        return (height*base/2);
    }
}
