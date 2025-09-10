package collection.utils;

import java.util.*;

public class EmptyListMain {
    public static void main(String[] args) {
        //빈 가변 리스트 생성
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        //빈 불변 리스트 생성
        List<Integer> list3 = Collections.emptyList(); //자바5
        List<Integer> list4 = List.of();

        System.out.println("list3.getClass() = " + list3.getClass());
        System.out.println("list4.getClass() = " + list4.getClass());

        List<Integer> list5 = Arrays.asList(1, 2, 3);
        List<Integer> list6 = List.of(1, 2, 3);

        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> arrList = Arrays.asList(arr);
        //arr[0] = 100;
        arrList.set(0, 100); //arrList 0번 인덱스 값을 100으로 바꾸면 arr의 값도 같이 바뀜
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("arrList = " + arrList);

        List<Integer> arr1 = List.of(arr); //Arrays.asList(arr)보다는 List.of(arr) 이렇게 쓰는걸 권장한다.
    }
}
