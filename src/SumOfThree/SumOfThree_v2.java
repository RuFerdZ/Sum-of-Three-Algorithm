package SumOfThree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class SumOfThree_v2 {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Integer> b = new ArrayList<>();

        File file = new File("SumOfThree.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNext()){
            b.add(Integer.parseInt(sc.next()));
        }

        Object[] c =b.toArray();

        int count = 0;

        for (int i = 0; i < c.length; i++) {
            for (int j = i + 1; j < c.length; j++) {
                for (int k = j + 1; k < c.length; k++) {
                    if ((int)(c[i]) + (int)(c[j]) + (int)(c[k]) == 0) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
