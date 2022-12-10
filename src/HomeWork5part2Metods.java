public class HomeWork5part2Metods {
    /*Напишите метод, который бы проверял, делится ли число на 2 без остатка или нет.
    static boolean Method1(int num){
        return num%2==0;
    }
    public static void main(String[] args) {
        System.out.println(Method1(11));
    } */

    /*Написать метод возведения числа в квадрат. И далее к результату прибавить число 2.
    static int Method2(int num){
        num = num*num;
        System.out.println(num);
        return num +2;
    }
    public static void main(String[] args) {
        System.out.println(Method2(3));
    } */

    /*Возвести число в куб используя Math. Используя методы
    static double MethodCube(double num){
        return Math.pow(num, 3);
    }
    public static void main(String[] args) {
        System.out.println(MethodCube(3));
    } */

    //Возвести в степень. Необходимо написать метод, который бы возводил число в степень. И далее два числа,
    /* возведенные в степень, должны быть просуммированы, а результат выведен в консоль.
    static int MethodPow(int num, int pow){
        int result = 1;
        for(int i = 1; i<=pow; i++){
           result = result*num;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(MethodPow(3,2));
        System.out.println(MethodPow(2,6));
        System.out.println(MethodPow(3,2)+MethodPow(2,6));
    } */
}
