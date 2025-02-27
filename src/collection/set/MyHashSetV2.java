package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV2 {
    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<Object>[] buckets;
    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV2() {
       initBuckets();
    }

    public MyHashSetV2(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    public boolean add(Object value){
        int hashIndex = hashIndex(value); // O(1)
        LinkedList<Object> bucket = buckets[hashIndex]; // O(1)
        if(bucket.contains(value)){ // 최악의 경우 O(n)이지만 사실상 거의 O(1)
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(Object searchValue){
        int hashIndex = hashIndex(searchValue); // O(1)
        LinkedList<Object> bucket = buckets[hashIndex]; // O(1)
        return bucket.contains(searchValue); // 최악의 경우 O(n)이지만 사실상 거의 O(1)
    }

    public boolean remove(Object value){
        int hashIndex = hashIndex(value); // O(1)
        LinkedList<Object> bucket = buckets[hashIndex]; // O(1)
        boolean result = bucket.remove(value); // 최악의 경우 O(n)이지만 사실상 거의 O(1)
        if(result){
            size--;
            return true;
        } else {
            return false;
        }
    }

    public int size(){
        return size;
    }

    private int hashIndex(Object value){
        // 해시코드는 음수도 나오기 때문에 절대값으로 변경해줌
        return Math.abs(value.hashCode() % capacity);
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    @Override
    public String toString() {
        return "MyHashSetV2{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
