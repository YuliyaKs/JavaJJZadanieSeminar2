/*
Задача 1:
Создайте абстрактный класс "Animal" с полями "name" и "age".
Реализуйте два класса-наследника от "Animal" (например, "Dog" и "Cat") с уникальными полями и методами.
Создайте массив объектов типа "Animal" и с использованием Reflection API выполните следующие действия:
Выведите на экран информацию о каждом объекте.
Вызовите метод "makeSound()" у каждого объекта, если такой метод присутствует.
 */
package homework1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Program {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InstantiationException {

        // Создаем объекты дочернего класса Dog класса Animal
        Class<?> dogClass = Class.forName("homework1.Dog");
        Constructor[] constructors1 = dogClass.getConstructors();
        Animal dog1 = (Animal) constructors1[0].newInstance("Dingo", 4, 8, true);
        Animal dog2 = (Animal) constructors1[0].newInstance("Jerry", 3, 6, false);

        // Создаем объекты дочернего класса Cat класса Animal
        Class<?> catClass = Class.forName("homework1.Cat");
        Constructor[] constructors2 = catClass.getConstructors();
        Animal cat1 = (Animal) constructors2[0].newInstance("Dolly", 3, 15, true);
        Animal cat2 = (Animal) constructors2[0].newInstance("Loki", 2, 7, false);

        // Создаем массив объектов Animal
        Animal[] animals = getAnimalsArray(dog1, dog2, cat1, cat2);

        getInfo(animals); // Выводим на экран информацию по каждому животному
        getSounds(animals); // Выводим на экран звуки, которые производят животные

    }

    // Метод для создания массива объектов класса Animal
    public static Animal[] getAnimalsArray(Animal... pet){
        Animal[] animals = new Animal[pet.length];
        for(int i = 0; i < pet.length; i++){
            animals[i] = pet[i];
        }
        return animals;
    }

    // Метод для вывода информации о каждом объекте с использованием Reflection API
    public static void getInfo(Animal[] animals) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        for (Animal pet : animals) {
            Method petSounds = pet.getClass().getMethod("toString");
            System.out.println(petSounds.invoke(pet));
        }
    }

    // Метод для вызова метода makeSound по каждому объекту с использованием Reflection API
    public static void getSounds(Animal[] animals) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        for (Animal pet : animals) {
            Method petSounds = pet.getClass().getMethod("makeSound");
            petSounds.invoke(pet);
        }
    }

}