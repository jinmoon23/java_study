import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx {
    public void readALine() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // InputStreamReader isr = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(isr);



        System.out.println(br.readLine());
        System.out.println(br.readLine());
    }
}
