package fileio;

import java.io.*;

public class FileTest {
    public static void writeFile(String fileName, String contents){
        try (FileOutputStream fos = new FileOutputStream(fileName))
        {
            byte [] buffer = contents.getBytes();
            fos.write(buffer);
            //fos.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void readFile(String fileName) throws IOException{
        File file = new File(fileName);// file 의 정보를 구하기 위한 클래스의 인스턴스를 생성
        long size = file.length();      // 파일의 사이즈(크기) 를 바이트 단위로 구함

        try(FileInputStream fis = new FileInputStream(fileName))
        {
           byte [] buffer = new byte[(int)size]; // 파일 단위로 파일 그키만큼 배열을 할당함
           int ret = fis.read(buffer);          // 버퍼의 크기만큼 파일로 부터 데어터를 읽어 들임
           String str = new String((buffer));
            System.out.println(str);
        }
    }



    public static void main(String[] args) {
//        String str = "Hello Java\n안녕하세요\nJava를 이용해 저장한 파일입니다~!";
//        writeFile("test.txt", str);

        try {
            readFile("test.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
