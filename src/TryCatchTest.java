import java.util.Scanner;

public class TryCatchTest {
    public static void main(String[] args) {
        //2. Обробіть декілька помилок задопомогою try
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any number: ");
            int anyNumber = sc.nextInt();

        } catch (Exception e){
            System.out.println("Something went wrong. You should enter number.");
        }
        
        try{
            int result;
            result = Integer.parseInt("ten");
        }catch (Exception e){
            System.out.println("Something went wrong. You should enter number.");
        }

        try{
            int i = 10;
            int result;
            result = i/0;
        }catch (Exception e){
            System.out.println("Divided by zero is not allowed.");
        }

    }
}
