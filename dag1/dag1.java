import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

public class dag1 {
    public static void main(String[] args)throws Exception {
        File file = new File("C:\\Users\\eppi_\\git\\adventofcode\\dag1\\input.txt");
        Scanner sc = new Scanner(file);
        ArrayList<String> modules = new ArrayList<String>();
        

        while(sc.hasNextLine()){
            modules.add(sc.nextLine());
        }
        
        int sum = 0;
        for (String i : modules){
            Integer x = Integer.parseInt(i);
            x = x / 3 - 2;
            sum += x;
        }
        System.out.println(sum);
    }
}

