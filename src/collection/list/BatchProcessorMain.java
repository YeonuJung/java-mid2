package collection.list;

public class BatchProcessorMain {

    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();

        BatchProcessor arrayBatchProcessor = new BatchProcessor(arrayList);
        BatchProcessor linkedBatchProcessor = new BatchProcessor(linkedList);
        // 앞에 추가하는 로직이 많을 때
        // 배열리스트와 연결리스트의 성능차이
        arrayBatchProcessor.logic(100_000);
        linkedBatchProcessor.logic(100_000);

    }
    }
