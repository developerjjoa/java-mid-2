package generic.ex3;

import generic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkUp() {
        // T의 타입을 메서드를 정의하는 시점에는 알 수 없어서 Object의 기능만 사용했는데
        // T extends Animal로 제한을 두면서 Animal 메서드 사용이 가능함.

        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public T bigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
