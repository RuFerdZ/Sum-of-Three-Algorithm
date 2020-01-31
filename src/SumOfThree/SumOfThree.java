package SumOfThree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


/*
 * @author Rusiru-PC
 */
public class SumOfThree {


    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Integer> b = new ArrayList<>();

        File file = new File("SumOfThree.txt");
        Scanner sc = new Scanner(file);


        while (sc.hasNext()){
            b.add(Integer.parseInt(sc.next()));
        }

        int count = 0;

        for (int i = 0; i < b.size(); i++) {
            for (int j = i + 1; j <b.size(); j++) {
                for (int k = j + 1; k < b.size(); k++) {
                    if (b.get(i) + b.get(j) + b.get(k) == 0) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
