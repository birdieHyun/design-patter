package org.example.section2.decorator._03_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DecoratorInJava {

    public static void main(String[] args) {
        // Collections가 제공하는 데코레이터 메서드
        ArrayList list = new ArrayList();
        list.add(new Book());

        // collections 에는 checked 로 시작하는 메서드들이 많은데, 타입 체크를 해줌
        List books = Collections.checkedList(list, Book.class); // book 만 받을 수 있도록 변경함

//        Collections.synchronized 류의 메서드
//        Collections.unmodifiable 불변하게 만들어주는 오퍼레이션도 있다.

        list.add(new Item());
        books.add(new Item()); // 타입 에러 발생

    }

    private static class Book{}
    private static class Item{}
}
