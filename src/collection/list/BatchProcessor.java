package collection.list;

public class BatchProcessor {

    private final MyList<Integer> list;

    // 의존관계란 하나의 객체가 다른 객체의 기능이나 데이터를 필요로 하는 관계
    // 즉 사용하면 의존한다고 표현
    // 의존관계를 외부에서 전달해주는 것을 의존관계 주입이라고 말함
    // 사용할 객체를 내부에서 생성하는게 아니라 외부에서 주입받는 패턴(생성자, 메서드 인자 등등)
    public BatchProcessor(MyList<Integer> list){
        this.list = list;
    }

    public void logic(int size){
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < size; i++){
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

}
