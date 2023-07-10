package LowerWithJavaIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;

        try {
            /**
             * 1. FileInputStream 을 만들고
             * 2. BufferedInputStream 과
             * 3. 새로 만든 LowerCaseInputStream 필터로 파일을 감싼다.
             * */
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("./ch3_DecoratorPattern/LowerWithJavaIO/test.txt")));

            while ((c = in.read()) >= 0) {
                System.out.print((char)c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}