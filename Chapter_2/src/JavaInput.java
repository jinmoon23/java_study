import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInput {
    public static void main(String[] args) throws IOException {
        JavaInput javaInput = new JavaInput();
        javaInput.readAChar();
    }
    public void readAChar () throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        int asciiCode = is.read();
        System.out.println(asciiCode);
    }
}
