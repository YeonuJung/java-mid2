package collection.array;

public class MyArrayListV3BadMain {
    // Object를 사용했기에 타입안정성이 떨어짐, 다운캐스팅도 귀찮음
    // 일반적으로 자료구조는 하나의 데이터타입만을 담음
    public static void main(String[] args) {
        MyArrayListV3 numberList = new MyArrayListV3();
       
        // 숫자만 입력하기를 기대
        numberList.add(1);
        numberList.add(2);
        numberList.add("문자3"); // 문자를 입력
        System.out.println("numberList = " + numberList);

        // Object를 반환하므로 다운 캐스팅 필요
        Integer num1 = (Integer) numberList.get(0);
        System.out.println(num1);
    }
}
