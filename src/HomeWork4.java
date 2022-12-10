import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        /*задача 1. SumMin
        Дано два числа A и B (A<B) выведите суму всех чисел, расположенных между данными числами на экран.
        int A = 1;
        int B = 10;
        int sum = 0;
        for(int i = A; i<=B; i++){
            sum+=i;
        }
        System.out.println(sum); */

        /* Задача 1. частина 2  Дано два числа A и B (A<B) выведите все нечетные значения, расположенные между данными числами.
        int A = 1;
        int B = 10;
        for(int i = A; i<=B; i++){
            if(i%2!=0){
            System.out.println(i);
        }} */

       /* задача 2. Таблиця множення
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = scan.nextInt();
        int result = 0;
        for(int i = 1; i <= 10; i++){
            result = number*i;
            System.out.println(number + "*" + i + " = " + result);
        } */

        /*Задание 3.
Пользователь вводит любое целое число типа данных long. Используя циклы вывести поразрядно каждое число отдельно в строчку.
 (разряды - единицы, десятки, сотни, тысячи...)
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter long number: ");
        long num = scan.nextLong();
        while(num>0){
            //друкуємо залишок від ділення введеного числа на 10
            System.out.println(num%10);
            //змінюємо введене число на цілу частину результату ділення цього числа на 10
            num = num/10;
            // System.out.println(num);// додаю цей sout для того щоб було простіше зрозуміти як змінюється число
        } */

       /* Задание 4. Используя циклы вывести треугольник до заданного рамера, размер - пользователь вводит число рядков 
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = scan.nextInt();
        for(int row = 1; row<=num; row++){
            for(int stars = 1; stars<=row; stars++){
                System.out.print("*"); }
            System.out.println();
} */
    }
}
