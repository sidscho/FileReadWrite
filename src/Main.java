import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) throws Exception{

        Main a = new Main();

        BufferedReader bf = new BufferedReader(new FileReader("t1"));
        String line;
        while((line = bf.readLine())!=null) {
            System.out.println(line);
        }
        FileWriter f1 = new FileWriter("t1", true);
        f1.write("\nOkay bye");
        f1.flush();

    }
}