package com.nooobcoder;

import com.nooobcoder.annotations.ImportantString;
import com.nooobcoder.annotations.RunImmediately;
import com.nooobcoder.annotations.VeryImportant;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * JavaDoc
 *
 * @author noobcoder
 * @version 1.0
 * @see java.lang.Object
 * @see java.lang.annotation.Annotation
 * @see java.lang.annotation.Retention
 * @see java.lang.annotation.RetentionPolicy
 * @see java.lang.annotation.Target
 * @see java.lang.annotation.ElementType
 * @since 1.0
 */
public class CustomAnnotation {
    public static void main(String[] args) {
        Cat myCat = new Cat("Stadia");
        Dog myDog = new Dog("Barky");

        if (myCat.getClass().isAnnotationPresent(VeryImportant.class)) {
            System.out.println("This thing is very important");
        } else {
            System.out.println("This thing is not very important");
        }

        // Loop through all methods in the cat class
        for (Method method : myCat.getClass().getMethods()) {
            if (method.isAnnotationPresent(RunImmediately.class)) {
                System.out.println("Running " + method.getName() + "()");

                RunImmediately anno = method.getAnnotation(RunImmediately.class);
                int times = anno.times();
                for (int i = 0; i < times; i++) {
                    try {
                        if (method.invoke(myCat) != null) {
                            System.out.println(method.invoke(myCat));
                            continue;
                        }
                        method.invoke(myCat);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        e.getStackTrace();
                    }
                }
            }
        }

        for (Field field : myCat.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(ImportantString.class)) {
                try {
                    // GET PRIVATE FIELD
                    field.setAccessible(true);
                    Object objectValue = field.get(myCat);
                    System.out.println(objectValue.toString());
                    if (objectValue instanceof String)
                        System.out.println("The value of the field is: " + ((String) objectValue).toUpperCase());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
