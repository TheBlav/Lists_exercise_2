package IO;

import Interfaces.Printer;

import java.util.ArrayList;
import java.util.Scanner;

public class InOut implements Printer {
    Scanner scanner = new Scanner(System.in);
    public int getInt(){
        return scanner.nextInt();
    }

    public void listOperations(ArrayList<Integer> list){
        int sum = 0;
        print("Number of correct data: " + list.size());
        for (Integer integer : list) {
            sum += integer;
        }
        print("Sum of the elements: " + sum);
        double avg = (double) sum / (double) list.size();
        print("Average: " + avg);
    }
}
