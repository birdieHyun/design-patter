package org.example.section1.singleton.java_spring;

public class RuntimeExample {

    public static void main(String[] args) {
        // runtime 클래스는 어플리케이션이 실행되고 있는 Runtime에 대한 환경이라고 볼 수 있다.
        Runtime runtime = Runtime.getRuntime();
        Runtime runtime2 = Runtime.getRuntime();

        System.out.println(runtime == runtime2);
    }
}
