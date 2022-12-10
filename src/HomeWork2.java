import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        /*Найти формулу герона. Примечание к заданию квадратный корень находится с помощью Math.sqrt(Переменная)
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a,b,c: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double p = (a+b+c)/2;
        double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println(S); */

        /*Найти площать и объем куба
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scan.nextDouble();
        double Volume = a*3;
        double Square = 6*a*2;
        System.out.println(Square);
        System.out.println(Volume); */

        /*Вывести в консоли в столбик своё фамилию имя отчество, язык программирования который понравился.
        Следующая строка ФИО полностью в строчку с пробелами. Следующая строка возраст, желаемую зп.
        Примечания все данные которые выводятся являются отдельными переменными.

        String LastName, FirstName, MiddleName, ProgrammingLanguage, Age, Salary;
        LastName = "Popovska";
        FirstName = "Olesia";
        MiddleName = "Vitaliivna";
        ProgrammingLanguage = "Java";
        Age = "30";
        Salary = "1000$";
        System.out.println(LastName + '\n' + FirstName + '\n' + MiddleName+ '\n' + ProgrammingLanguage);
        System.out.println(LastName + ' ' + FirstName + ' ' + MiddleName + '\n' + Age + ' ' + Salary);
         */

        /*Задача со звёздочкой, у вас есть одно целое пятизначное число, вам нужно сложить все числа этого числа т.е.
         вам нужно использовать математические операции с одной этой переменной которая содержит в себе 5-ти значное число. Пример 12345 = 15.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a five-digit number: ");
        int num = scan.nextInt();
        int sum =0;
        while(num>0){
            sum = sum + num%10;
            num = num/10;
        }
            System.out.println(sum);
            //-------2var
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a five-digit number: ");
        int num = scan.nextInt();
       int sum = 0;
       for(int i = num; i>0; i/=10) {
           sum += i % 10;
       }
        System.out.println(sum); */
       /* 1.Найти минимальное и максимальное число из двух переменных.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double firstNum = scan.nextDouble();
        System.out.println("Enter second number: ");
        double secondNum = scan.nextDouble();
        System.out.println("Min: "+ Math.min(firstNum, secondNum));
        System.out.println("Max: "+ Math.max(firstNum, secondNum)); */

        /*2.Найти минимальное, максимальное и среднее из трех чисел.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double firstNum = scan.nextDouble();
        System.out.println("Enter second number: ");
        double secondNum = scan.nextDouble();
        System.out.println("Enter third number: ");
        double thirdNum = scan.nextDouble();
        if(firstNum<secondNum && firstNum<thirdNum){
            System.out.println("Min number is: " + firstNum);
        }else if(secondNum<firstNum && secondNum<thirdNum){
            System.out.println("Min number is: " + secondNum);
        } else{
            System.out.println("Min number is: " + thirdNum);
        }
        if(firstNum>secondNum && firstNum>thirdNum){
            System.out.println("Max number is: " + firstNum);
        } else if (secondNum>firstNum && secondNum>thirdNum) {
            System.out.println("Max number is: " + secondNum);
        } else{
            System.out.println("Max number is: " + thirdNum);
        }
        if (secondNum<firstNum && firstNum<thirdNum || secondNum>firstNum && firstNum>thirdNum){
            System.out.println("Average number is: " + firstNum);
        }
        else if (firstNum<secondNum && secondNum<thirdNum || firstNum>secondNum && secondNum>thirdNum) {
            System.out.println("Average number is: " + secondNum);
        } else {
                System.out.println("Average number is: " + thirdNum);
            } */

      /*  3.Создать программу которая по вводимому числу: выводит доброе утро(1-12), добрый день(12-20),  доброй ночи(20-24).
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter time of day: ");
        int timeOfDay = scan.nextInt();
        switch (timeOfDay) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                System.out.println("Good morning! ");
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                System.out.println("Good day! ");
                break;
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                System.out.println("Good night! ");
                break;
            default:
                System.out.println("It's wrong time of the day");
                break;
                */

      /*  Задача со звёздочкой. Сделать программу калькулятор. Которая принимает на вход, переменную, знак математической операции, вторая переменная.
            char operator;
            Double num1, num2, result;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter first number: ");
            num1 = input.nextDouble();
            System.out.println("Enter operator: +, -, *, /");
            operator = input.next().charAt(0);
            System.out.println("Enter second number: ");
            num2 = input.nextDouble();

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + result);
                    break;
                case '/':
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                    break;
                default:
                    System.out.println("Wrong operator! ");
                    break;
            } */

        //Задача с двумя звездочками создать программу по вычислению дискриминанта.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scan.nextDouble();
        System.out.println("Enter b: ");
        double b = scan.nextDouble();
        System.out.println("Enter c: ");
        double c = scan.nextDouble();
        double discriminant = b*b-4*a*c;
        if (discriminant > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);}

        else if(discriminant==0) {
            double x1;
            x1 = (-b)/(2*a);
            System.out.println("x1="+x1);
            System.out.println("x2="+x1);}

        else if(discriminant<0) {
            System.out.println("The equation has no real roots");
        }
    }}
