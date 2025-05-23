import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderEx {
    public static void main(String[] args) throws IOException {
        BufferReaderEx bufferReaderEx = new BufferReaderEx();
        bufferReaderEx.readALine();
    }
    public void readALine() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        System.out.println(line);
    }
}
