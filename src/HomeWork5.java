import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        /*Создать массив одномерный, заполненный со всеми типами данных.
        String [] stringArray = {"Kyiv", "Lviv", "Poltava", "Odesa", "Kharkiv"};
        byte [] byteArray = {-128, 1, 2, 8, 127};
        short [] shortArray = {-32768, 28, 100, 32767};
        int [] intArray = {-2147483648, 128, 2147483647};
        long [] longArray = {-1000000000, 10000, 999999999};
        float [] floatArray = {-28.00f, 333.08f, 28.123f, 128.0999999f, };
        double [] doubleArray = {-12.23, 128.888, 123.0101, 88.000};
        char [] charArray = {'&', '*', '%', '^', '@'};
        boolean [] booleanArray = {true, false, true, false, true}; */

        //Сложить два массива, каждый элемент одного массива с каждым элементом другого массива, в первом массиве 4
        /* элемента во втором 5 элементов. Обратить внимание на индексы массивов и элементы, что это разные понятия.
        int [] array1 = {1, 2, 3, 4};
        int [] array2 = {1, 2, 3, 4, 5};
        int[] Result = array2;
        for (int i = 0; i < array1.length; ++i) {
            Result[i] = array1[i] + array2[i];
        }
        System.out.println(Arrays.toString(Result)); */

        //Сделать три цикла различных с предусловием, пост условием и параметром, в которые поместить в тело цикла,
        // арифметическую и геометрическую прогрессию, с 1 до 12.
        //цикл з передумовою while; цикл з постумовою do..while; цикл з параметром for;
        /* int a =1;
        int i = 1;
        int N =12;
        int result;
        System.out.println("Enter common difference: ");
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        while ( i <= N ) {
            result = a+d*(i-1);
            System.out.println(result);
            i++; }  */

      /*  int a = 1;
        int N = 12;
        int result;
        System.out.println("Enter common difference: ");
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        for(int i = 1; i<=N; i++){
            result = a+d*(i-1);
            System.out.println(result);
        } */

       /* int a =1;
        int i = 1;
        int N =12;
        int result;
        System.out.println("Enter common difference: ");
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        do {
            result = a+d*(i-1);
            System.out.println(result);
            i++;
        } while ( i<= N ); */

        //геометрична прогрессія
        /* int a =1;
		int i = 1;
		int N =12;
		int result;
		System.out.println("Enter common ratio: ");
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		while ( i <= N ) {
			result = a*(int)Math.pow(r, i);
			System.out.println(result);
			i++; } */

        /*int a =1;
        int N =12;
        int result;
        System.out.println("Enter common ratio: ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for (int i=1; i<=N; i++) {
            Result = a*(int)Math.pow(r, i);
            System.out.println(result); } */

		/*int a =1;
		int i = 1;
		int N =12;
		int result;
		System.out.println("Enter common ratio: ");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		do {
            result = a * (int) Math.pow(r, i);
            System.out.println(result);
            i++;
        }
        while(i <= N); */

        /*Задача со звездочкой. вывести последовательность фибоначи. до того числа которое введет пользователь.
        int num1 = 0;
        int num2 = 1;
        int sum = 1;
        int i = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int limit = scan.nextInt();
        do{
            System.out.print(sum +" ");
            sum = num1+num2;
            num1=num2;
            num2=sum;
            i++;
        }while(sum<=limit);
         */

        int num1 = 0;
        int num2 = 1;
        int sum = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int limit = scan.nextInt();
        for(int i = 1; i<=limit; i++){
            System.out.print(sum +" ");
            sum=num1+num2;
            num1=num2;
            num2=sum;
            if(sum>=limit){
                break;
            }
        }
        System.out.println();


        }
    }

