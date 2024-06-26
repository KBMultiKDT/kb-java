package _0701_collection_basic;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.ArrayList;

public class basic_q3_casting {
   public static void main(String[] args) {
       ArrayList list = new ArrayList(); // ArrayList 객체 생성
       list.add("자바"); // "자바" 문자열 추가 (자동형변환: Object <- String)

       list.add(new 사람()); // 사람 객체 추가 (자동형변환: Object <- 사람)
       list.add(new ArrayList()); // ArrayList 객체 추가 (자동형변환: Object <- ArrayList)

       String s = (String)list.get(0); // "자바" 문자열을 꺼내서 String 타입으로 강제형변환

       list.add(100); // 정수 100 추가 (자동형변환: Object <- Integer <- (박싱) <- int)

       int i = (Integer)list.get(3); // 정수 100을 꺼내서 Integer 타입으로 강제형변환 후 언박싱
   }
}
/*

    ArrayList list = new ArrayList();: ArrayList 객체를 생성합니다.
    list.add("자바");: String 타입의 문자열 "자바"를 list에 추가합니다. ArrayList는 Object 타입의 요소를 저장할 수 있으므로 자동형변환이 발생합니다. (Object <- String)
    list.add(new 사람());: 사람 객체를 list에 추가합니다. 이 역시 자동형변환이 발생합니다. (Object <- 사람)
    list.add(new ArrayList());: 또 다른 ArrayList 객체를 list에 추가합니다. 이 역시 자동형변환이 발생합니다. (Object <- ArrayList)
    String s = (String)list.get(0);: list의 첫 번째 요소인 "자바"를 가져와 String 타입으로 강제형변환합니다. (String <- Object)
    list.add(100);: 정수 100을 list에 추가합니다. 기본형인 int가 객체인 Integer로 박싱되며, 다시 Object로 자동형변환됩니다. (Object <- Integer <- (박싱) <- int)
    int i = (Integer)list.get(3);: list의 네 번째 요소인 100을 가져와 Integer 타입으로 강제형변환 후 언박싱하여 int 타입의 변수에 저장합니다. (int <- (언박싱) <- Integer <- Object)

 */