package collection.list;

public class BatchProcessor {

    //private final MyArrayList<Integer> list = new MyArrayList<>(); //이 코드는 구체적인 MyArrayList, MyLinkedList에 의존하고 있는 코드다. 서로 다른걸 쓰고 싶을 때마다 코드 변경을 해줘야한다.
    private final MyList<Integer> list;

    //MyList = new MyArrayList
    //MyList = new MyLinkedList
    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i); //앞에 추가
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}
