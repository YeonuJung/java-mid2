package collection.set;

import collection.set.member.Member;

public class JavaHashCodeMain {

    public static void main(String[] args) {
        // Object의 기본 hashCode는 객체의 참조값을 기반으로 생성
        //
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode());

        // 각 클래스마다 hashCode를 이미 오버라이딩 해두었다.
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";

        System.out.println("10.hashCode() = " + i.hashCode());
        System.out.println("strA.hashCode() = " + strA.hashCode());
        System.out.println("strAB.hashCode() = " + strAB.hashCode());

        // hashCode는 마이너스 값이 들어올 수 있다.
        System.out.println("Integer.valueOf(-1).hashCode() = " + Integer.valueOf(-1).hashCode());

        // 둘은 같을까?, 인스턴스는 다르지만, equals는 같다.
        // 만약 equals를 오버라이딩 하지 않았더라면? 참조값 비교로 ==과 다를게 없었을 것
        // 그럼 마찬가지로 hashCode() 메서드도 오버라이딩 전에는 참조값을 기준으로 해시코드를 생성하여
        // 서로 다른 해쉬코드 값이 나왔을 것이다.
        // 오버라이딩 후에는 객체의 값을 기준으로 해시코드를 생성하여 같은 값이면 동일한 해쉬코드를 가질 수 있도록 함
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");
        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());
    }
}
