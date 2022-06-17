package Test53;
import java.io.FileWriter;
import java.io.IOException;

public class Test53 {
    public static void main(String[] args) {
        
        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red \nviolets are blue \nbooty \nhuhu");
            writer.append("\n(A poem by Shahir)");
            writer.close();
        } 
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
