import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInput {
    public void readAChar() throws IOException {
        // 1. InputStreamReader 클래스로 타입으로 변수 선언
        InputStreamReader is;
        // 2. 인스턴스화와 함께 is 변수에 유저 입력값 할당
        is = new InputStreamReader(System.in);
        // 3. read() 메서드로 읽어온 값을 asciiCode 변수에 할당
        int asciiCode = is.read();

        System.out.println(asciiCode);
    }
}
