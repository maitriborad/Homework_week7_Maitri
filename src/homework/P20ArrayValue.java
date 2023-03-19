package homework;

/**
 * Write a Java program to test if an array contains a specific value.
 */
public class P20ArrayValue {
    public static void main(String[] args) {
        P20ArrayValue obj = new P20ArrayValue();
        obj.test();
    }
    public static boolean cont(int[] a, int item) {
        for (int n : a) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }
    public void test(){
        int[] my_array1 = {96, 44, 1023, 369, 58, 985,
                     65,100, 105, 602, 98, 56, 79,658};
        System.out.println(cont(my_array1, 369));
        System.out.println(cont(my_array1, 22));
    }
}

