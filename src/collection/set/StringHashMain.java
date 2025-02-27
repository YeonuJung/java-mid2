package collection.set;

public class StringHashMain {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        // char

        char charA = 'A';
        char charB = 'B';

        System.out.println("charA = " + (int)charA);
        System.out.println("charB = " + (int)charB);

        // 해시 함수 -> 해시 코드를 생성하는 함수
        // hashCode -> 데이터를 대표하는 정수값(컴퓨터는 이진수로 이루어져 있기 때문에)
        System.out.println();
        System.out.println("hashCode('A') = " + hashCode("A"));
        System.out.println("hashCode('B') = " + hashCode("B"));
        System.out.println("hashCode('AB') = " + hashCode("AB"));

        // hashIndex -> 해시 코드를 활용해서 만든 인덱스(데이터의 저장 위치)
        // 보통 배열의 크기로 해시 코드를 나누는 나머지 연산을 활용
        System.out.println();
        System.out.println("hashIndex(A) = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex(A) = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex(A) = " + hashIndex(hashCode("AB")));

    }
    // 실제로는 이렇게 단순하게 더하지만은 않음
    static int hashCode(String str){
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum = sum + (int) c;
        }
        return sum; 
    }

    static int hashIndex(int value){
        return value % CAPACITY;
    }
}
