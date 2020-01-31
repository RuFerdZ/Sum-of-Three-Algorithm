package SumOfThree;

public class SumOfThree_v3 {
    public static void main(String[] args) {

        int[] a = {-40, -20, -10, 40, 0, 10, 5,30};
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                for (int k = j + 1; k < a.length; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
