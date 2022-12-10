public class ClassWork5 {
    public static void main(String[] args) {
        int[]arr = {1,2,3};
        int[]arr1 = {2,3,5};
        int[]result = new int [3];
        for(int i = 0; i<arr1.length; i++){
                result[i] = arr[i]+arr1[i];
            System.out.println(result[i]);

        }
}}
