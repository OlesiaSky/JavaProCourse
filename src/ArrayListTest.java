import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> TestList = new ArrayList<>();
        TestList.add(10);
        TestList.add(100);
        TestList.add(50);
        TestList.add(28);
        TestList.add(123);
        TestList.add(128);
        TestList.add(12);
        System.out.println(TestList);
        int FirstLast = TestList.get(0)*TestList.get(6);
        TestList.set(0,FirstLast);
        System.out.println(TestList);
        Collections.sort(TestList);
        for (int i: TestList) {
            System.out.println(i);
        }
        }
    }

