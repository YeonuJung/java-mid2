package collection.compare;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain2 {
    // Arrays.sort() 는 비교자를 넘기지 않으면 기본적으로 오름차순 정렬을 함
    // 비교자를 넘기면 넘긴 비교자를 기준으로 비교
    // 비교자 인터페이스는 디폴트 메서드인 reversed() 메서드 제공(디폴트 메서드는 인터페이스에서도 상속처럼 기능 제공)
    public static void main(String[] args) {
        Integer[] array = {3, 2, 1};
        System.out.println(Arrays.toString(array));
        System.out.println("Comparator 비교");
        Arrays.sort(array, new AscComparator());
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));

        Arrays.sort(array, new DscComparator());
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
        Arrays.sort(array, new AscComparator().reversed()); // DescComparator와 같다
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));

    }

    static class AscComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1 = " + o1 + ", o2 = " + o2);
            return (o1 < o2 ) ? -1 : ((o1 == o2) ? 0 : 1);
        }
    }

    static class DscComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1 = " + o1 + ", o2 = " + o2);
            return (o1 < o2 ) ? -1 : ((o1 == o2) ? 0 : 1) * -1;
        }
    }
}
