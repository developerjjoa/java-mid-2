package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        //MyArrayList<Integer> list = new MyArrayList<>(); //1.5초 O(n^2)
        MyLinkedList<Integer> list = new MyLinkedList<>(); //0.002초 O(n)

        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(50_000);
    }
}
