package Test54;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test54 {
    
    public static void main(String[] args) {
        
        // FileReader = read the content of a file as a stream of characters. One by one
        //              read() returns an int value which contains the byte value
        //              when read() returns -1, there is no more data to be read

        try {
            FileReader reader = new FileReader("art.txt");
            int data = reader.read();
            while(data != -1) {
                System.out.print((char)data);
                data = reader.read();
            }

            reader.close();
            
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
}
