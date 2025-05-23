import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInput2 {
    public static void main(String[] args) throws IOException {
        JavaInput2 javaInput2 = new JavaInput2();
        javaInput2.readTwoCharacters();
    }
    public void readTwoCharacters() throws IOException {
        InputStreamReader is;
        is = new InputStreamReader(System.in);
        System.out.println(is.read());
        System.out.println(is.read());
    }
}
