import java.util.Scanner;

public class ParityHomework3part2 {
    public static void main(String[] args) {
        //Известно, что у четных чисел младший бит имеет значение 0 Используя IntelliJ IDEA, создайте класс Parity.
        // Напишите программу, которая будет выполнять проверку чисел на четность.
        /*Предложите два варианта решения поставленной задачи.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = scan.nextInt();
        if(num%2 == 0){
            System.out.println("Your number is even");
        }else{
            System.out.println("Your number is odd");
        }  */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = scan.nextInt();
        if ((num & 2) == 0) {
            System.out.println("Your number is even");
        }else{
            System.out.println("Your number is odd");
        }
}}

