public class HomeWork6 {
    /*static int methodBank(int PaymentAmount, int LoanAmount) {
        int balance = LoanAmount - PaymentAmount;
        if (balance > 0){
            System.out.println("Payment credited, credit balance: " + balance);
        } else if (balance == 0){
            System.out.println("The payment has been credited, there is no debt");
        } else if (balance < 0) {
            System.out.println("The payment has been credited, the overpayment is: " + balance);
        }
        return balance;
        //створіть клас . Уявіть, що ви реалізуєте програму для банку, яка допомагає
        // визначити, погасив клієнт кредит чи ні. Припустимо, щомісячна сума платежу має становити 100 грн.
        // Клієнт має виконати 7 платежів, але може платити рідше великими сумами. Тобто може двома платежами
        // по 300 і 400 грн закрити весь борг.
        //Створіть метод, який як аргумент прийматиме суму платежу, введену економістом банку.
        // Метод виводить на екран інформацію про стан кредиту (сума заборгованості, сума переплат,
        // повідомлення про відсутність боргу)
    }
    public static void main(String[] args) {
        int loan = 700;
        loan = methodBank(100, loan);
        loan = methodBank(200, loan);
        loan = methodBank(400, loan);
        loan = methodBank(200, loan);
    }}
     */
    /*static long Factorial(int N){
        if(N>=1){
            return N*Factorial(N-1);
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        int N = 20;
        long rout = Factorial(N);
        System.out.println("Number of routs for " + N + " clients = " + rout );
    } */
    /*Створіть три перевантажені методи для пошуку середнього арифметичного числа з 3, 4, 5 змінних,
    створіть метод для пошуку мінімального, максимального та середнього значень серед цих трьох методів.
     */
    static int AverageMethod(int a, int b, int c) {
        return (a + b + c) / 3;
    }
    static int AverageMethod(int a, int b, long c, int d) {
        return (int) ((a + b + c + d) / 4);
    }
    static int AverageMethod(int a, int b, int c, int d, double e) {
        return (int) ((a + b + c + d + e) / 5);
    }
    static void Method(int A, int B, int C) {
        if(A>B && A<C) {
            System.out.println("avarage: " + A);
        }
        else if(B>A && B<C) {
            System.out.println("avarage: " + B);
        }
        else {
            System.out.println("avarage: " + C);
        }
        System.out.println("Min: " + Math.min(A, Math.min(B, C)));
        System.out.println("Max: " + Math.max(A, Math.max(B, C)));
        }
    public static void main(String[] args) {
        Method(
        AverageMethod(10, 20, 30),
        AverageMethod(10, 20, 30, 40),
        AverageMethod(10, 20, 30, 40, 50));
    }
}
