package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {

    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};
        List<Integer> studentsList = new ArrayList<>();
        for (int student : students) {
            studentsList.add(student);
        }

        int total = 0;
        for (int i = 0; i < studentsList.size(); i++) {
            total += studentsList.get(i);
        }

        double average = (double) total / studentsList.size();
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
