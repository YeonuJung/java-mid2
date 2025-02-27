package collection.set;

import collection.set.member.Member;

public class MyHashSetV2Main2 {
    // 직접 만든 객체의 경우 해시함수를 오버라이드 해주기!
    // Object의 해시함수, 즉 기본 해시함수는 객체의 참조값을 기준으로 해시코드 생성
    // 오버라이딩을 하면 객체의 값을 기준으로 해시코드 생성 가능하기 때문에

    // 해시 자료 구조를 사용할 때는 반드시 해시함수랑 equals() 메서드 오버라이딩 하기!!
    // equals는 내부 비교 로직에서 사용되기 때문에 오버라이딩 해두어야 정확한 비교 가능
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        Member hi = new Member("hi");
        Member jpa = new Member("JPA");
        Member java = new Member("java");
        Member spring = new Member("spring");

        System.out.println("hi.hashCode() = " + hi.hashCode());
        System.out.println("jpa.hashCode() = " + jpa.hashCode());
        System.out.println("java.hashCode() = " + java.hashCode());
        System.out.println("spring.hashCode() = " + spring.hashCode());

        // 저장
        set.add(hi);
        set.add(jpa);
        set.add(java);
        set.add(spring);
        System.out.println(set);

        // 검색
        Member searchValue = new Member("JPA");
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue +  ") = " + result);
    }
}
