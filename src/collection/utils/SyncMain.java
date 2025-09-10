package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //쓰레드1
        list.add(1);
        list.add(2);
        list.add(3);

        //쓰레드2
        list.remove(1);
        //쓰레드 1은 추가를 하고 쓰레드 2는 삭제를 동시에 진행이 되면 데이터가 꼬일 수 있기 때문에 Collections.synchronizedList(list)를 사용하면 일반 리스트를 멀티스레드 상황에서 동기화 문제가 발생하지 않는 안전한 리스트로 만들 수 있다.

        System.out.println("list.getClass() = " + list.getClass());

        List<Integer> synchronizedList = Collections.synchronizedList(list);
        System.out.println("synchronizedList = " + synchronizedList.getClass());
    }
}
