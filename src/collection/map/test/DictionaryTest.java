package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();

        System.out.println("==단어 입력 단계==");
        while (true) {
            System.out.print("영어 단어를 입력하세요 (종료는 'q'): ");
            String wordInput = scanner.next();
            if (wordInput.equals("q")) {
                break;
            }
            System.out.print("한글 뜻을 입력하세요: ");
            String wordMeaning = scanner.next();

            map.put(wordInput, wordMeaning);
        }

        System.out.println("==단어 검색 단계==");
        while (true) {
            System.out.println("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
            String wordFind = scanner.next();

            if (wordFind.equals("q")) {
                break;
            }

            if (map.get(wordFind) == null) {
                System.out.println(wordFind + "은(는) 사전에 없는 단어입니다.");
            } else {
                System.out.println(wordFind + "의 뜻: " + map.get(wordFind));
            }
        }
    }


}


