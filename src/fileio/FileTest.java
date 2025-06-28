package fileio;

import cls.Person;
import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;

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

    public static void saveObject(String fileName, Person person)
    {
        // try with resource
        try(FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos))
        {
            oos.writeObject(person); // Serialize: 인스턴스에서 데이터 요소만 분리하여 메모리 스트링으로 만들어 줌
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
    // 홍길동20남자

    public static Person readPerson(String fileName){
        try(FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis))
        {
           Person person =(Person) ois.readObject();// Serialize: 인스턴스에서 데이터 요소만 분리하여 메모리 스트링으로 만들어 줌
            return person;
        }catch (IOException e){
            System.out.println(e.getMessage());
        }catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }
        return null;
    }


    public static void savePersonToJson(String fileName, Person person){
        Gson gson = new Gson();

        try(FileWriter writer = new FileWriter(fileName)){
            gson.toJson(person, writer);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static Person readPersonFromJson(String fileName){
        Gson gson = new Gson();

        try(FileReader reader = new FileReader(fileName)){
            Person person = gson.fromJson(reader, Person.class);
            return person;
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        return null;
    }

    public static void savePersonToJson(String fileName, ArrayList<Person> list){
        Gson gson = new Gson();

        try(FileWriter writer = new FileWriter(fileName)){
            gson.toJson(list, writer);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        String str = "Hello Java\n안녕하세요\nJava를 이용해 저장한 파일입니다~!";
        writeFile("test.txt", str);

        try {
            readFile("test.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Person p1 = new Person("홍길동", 20);
        Person p2 = new Person("이순신", 30);
        p1.setGender("남자");
        p2.setGender("남자");


        saveObject("hong.obj", p1);
        Person p3 = readPerson("hong.obj");
        if(p3 != null)
            System.out.println("hong.obj 로부터 생성한 인스턴스: " + p3);
        else
            System.out.println("Person Object를 불러올 수 없습니다.");

        savePersonToJson("lee.json", p2);

        Person p4 = readPersonFromJson("lee.json");
        if(p4 != null)
            System.out.println("lee.json 로부터 생성한 인스턴스: " + p4);
        else
            System.out.println("Person Object를 불러올 수 없습니다.");



        //Collection
        ArrayList<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);

        savePersonToJson("people.json", list);



//        System.out.println(p1);
//        System.out.println(p2);

    }
}
