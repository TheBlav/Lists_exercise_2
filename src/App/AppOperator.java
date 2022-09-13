package App;

import Data.ListLoop;
import IO.InOut;
import Interfaces.Printer;

import java.util.ArrayList;

public class AppOperator implements Printer {
    ListLoop loop = new ListLoop();
    ArrayList<Integer> list = new ArrayList<>();
    InOut io = new InOut();
    public void AppOperator(){
        print("App will load, add and get average of them. \n" +
                " and will work untill You'll provide number not devidable by 5 or negative");
        list = loop.ListLoop();
        io.listOperations(list);

    }
}
