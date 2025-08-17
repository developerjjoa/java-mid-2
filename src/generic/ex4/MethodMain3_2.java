package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain3_2 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 50);

        ComplexBox2<Dog> hospital = new ComplexBox2<>();
        hospital.set(dog);
        Cat result = hospital.printAndReturn(cat);
        System.out.println("result = " + result);
    }
}
