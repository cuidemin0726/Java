package generic;

import cls.Person;
import org.w3c.dom.ls.LSOutput;

import javax.lang.model.element.NestingKind;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Stream;

public class GenericTest {
    public static void main(String[] args) {
        // Collection: List(ArrayList, LinkedList). Set(HashSet, TreeSet). Map(HashMap, TreeMap)
//         String [] arr = new String[10];
//            arr[0] = "string 1";

        // stream:
        // String: 문자열 > String 도 일종의 stream 이다

        // 리스트
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("Sting 1");
        arr1.add("Sting 2");
        arr1.add("Sting 3");
        arr1.add(1,"Sting 1.5");

        for(String str: arr1){
            System.out.println(str);
        }


        System.out.println(arr1.get(2));

        arr1.remove("String 1"); // String 1 을 찾아서 삭제
        arr1.remove(1); // 인덱스 1번에 해당 하는 데이터를 삭제
        System.out.println(arr1.get(1));
        System.out.println("\n -----foreach-----");
        arr1.forEach(System.out::println);

//        for(String str: arr1){
//            System.out.println(str);
//        }
        arr1.forEach(System.out::println);

        Stream<String> strStream = arr1.stream().map((s)->{
            return s.toUpperCase();
        });
        strStream.forEach(System.out::println);

        System.out.println("\n-----forEach After map------");
//        arr1.stream().map((s)->{
//            return s.toUpperCase();     // map은 입력값(매개변수)s를 [어던한 처리를 거친후] return value로 변경한
//        });
        //===========================================
        arr1.stream().map((s)->{
            return s.toUpperCase();     // map은 입력값(매개변수)s를 [어던한 처리를 거친후] return value로 변경한
        }).forEach(System.out::println);


        arr1.forEach(System.out::println);

        LinkedList<Integer> intArr = new LinkedList<>(); // 정수(Integer) 저장할수 있는 링크드 리스트

        System.out.println("\n-------SET-------");

        //Set: 중복 데이터를 허용하지 않음, 순서가 없음(인덱싱 미지원)
        HashSet<String> strSet = new HashSet<>();
        strSet.add("이순신");
        strSet.add("이순신");
        strSet.add("차순신");
        strSet.add("홍순신");
        strSet.add("황순신");
        for(String str: strSet){
            System.out.println(str);
        }

        System.out.println("\n-------forEach-----");

//        strSet.forEach((s)->{
//            System.out.println(s);
//        } );
        // 상하 코드 동일 내용임
        strSet.forEach(System.out::println);

        // Map: hashmap, TreeMap
        // 데이터들을 키(key) 와 벨류(Value) 의 쌍(Couple) 의 형태로 관리하는 자료 구조
        // 키는 중복 될수 없으며, 벨류는 중복 가능함
        TreeMap<Integer, String> mapStr = new TreeMap<>();
        mapStr.put(1, "홍길동");
        mapStr.put(10, "이순신");
        mapStr.put(150, "세종대황");

        System.out.println(mapStr.get(150));

        mapStr.forEach((k, v)-> System.out.println(k+":"+v));
        
        //JSON: 데이터 포멧 구조, Client <----> Server 간 데이터 통신
        /*
        {
            키 : 벨류,
            키1 : 벨류1,
            키2 : 벨류2,
            키3 : 벨류3
        }
        **/
        

    }
}
