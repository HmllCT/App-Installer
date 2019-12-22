package App;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Engine implements Serializable {
    private ArrayList<Program> plist;
    static Scanner kb = new Scanner(System.in);
    public Engine(){
        plist = new ArrayList<>();
    }

    public void addProgram(){
        System.out.println("Program name? -> ");
        String name = kb.nextLine();

    }

    private Type askType(){
        System.out.println("What is the program type");
    }
}
