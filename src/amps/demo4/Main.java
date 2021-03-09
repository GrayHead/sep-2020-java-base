package amps.demo4;

import amps.demo3.Person;
import amps.demo3.User;
import amps.demo3.Xxx;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("vasya");

        Class<? extends Person> perzon = person.getClass();


//        Field[] declaredFields = perzon.getDeclaredFields();
//        for (Field declaredField : declaredFields) {
//            System.out.println(declaredField);
//        }
//
//        Constructor<?>[] declaredConstructors = perzon.getDeclaredConstructors();
//        for (Constructor<?> constructor : declaredConstructors) {
//            System.out.println(constructor);
//        }
//
//
//        Method[] declaredMethods = perzon.getDeclaredMethods();
//        for (Method method : declaredMethods) {
//            System.out.println(method);
//        }
//
//
//        Class<Person> personClass = Person.class;


        Field[] declaredFields = perzon.getDeclaredFields();
        for (Field field : declaredFields) {
            boolean present = field.isAnnotationPresent(Xxx.class);
            if (present) {
                Xxx xxx = field.getAnnotation(Xxx.class);
                System.out.println(xxx.msg());
            }
        }

    }
}
