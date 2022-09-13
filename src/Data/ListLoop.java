package Data;

import IO.InOut;
import Interfaces.Printer;

import java.util.ArrayList;
import java.util.Scanner;

public class ListLoop implements Printer {
    ArrayList<Integer> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    InOut io = new InOut();
    public ArrayList<Integer> ListLoop(){
        boolean providedNumberFulfillsRequirement = true;
        while (providedNumberFulfillsRequirement) {
            print("Provde number that can be divided by 5 and is positive: ");
            int number = scanner.nextInt();
            if (number % 5 != 0 || number <= 0)
                providedNumberFulfillsRequirement = false;
            else
                list.add(number);
        }
        return list;


    }
}
