public class LogicOperationhomework3part3 {
    public static void main(String[] args) {
        //Имеется 3 переменные типа int x = 5, y = 10, и z = 15; Выполните и рассчитайте результат следующих операций для этих переменных:
        // x += y >> x++ * z;
        // z = ++x & y * 5;
        // y /= x + 5 | z;
        // z = x++ & y * 5;
        // x = y << x++ ^ z;
        int x = 5;
        int y = 10;
        int z = 15;
        System.out.println(x += y >> x++ * z);
        System.out.println(z = ++x & y * 5);
        System.out.println(y /= x + 5 | z);
        System.out.println(z = x++ & y * 5);
        System.out.println(x = y << x++ ^ z);
    }
}
