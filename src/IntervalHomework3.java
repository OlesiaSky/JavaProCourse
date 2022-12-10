import java.util.Scanner;

public class IntervalHomework3 {
    public static void main(String[] args) {
        //Задача 1Используя IntelliJ IDEA, создайте класс Interval.
        // Напишите программу определения, попадает ли указанное пользователем число от 0 до 100 в числовой промежуток
        // [0 - 14] [15 - 35] [36 - 50][50 - 100]. Если да, то укажите, в какой именно промежуток. Если пользователь указывает число,
        // не входящее ни в один из имеющихся числовых промежутков, то выводится соответствующее сообщение.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number from 0 to 100: ");
        int num = scan.nextInt();
        if (num >= 0 && num <= 14) {
            System.out.println("Your number is in range 0 and 14 ");
        } else if (num >= 15 && num <= 35) {
            System.out.println("Your number is in range 15 and 35 ");
        } else if (num >= 36 && num <= 50) {
            System.out.println("Your number is in range 36 and 50 ");
        } else if (num >= 50 && num <= 100) {
            System.out.println("Your number is in range 50 and 100 ");
        } else{
            System.out.println("Your number less than 0 or greater than 100 ");
    }
        if(num==50){
            System.out.println("Your number is in range 50 and 100 ");
        }

    }
}
