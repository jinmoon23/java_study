import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTwoNumbers {
    public void plusTwoNumbers() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(br.readLine() + br.readLine());
    }
}
