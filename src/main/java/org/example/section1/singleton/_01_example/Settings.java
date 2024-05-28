package org.example.section1.singleton._01_example;

import java.io.Serializable;

/**
 * 권장되는 싱글톤 패턴 구현 방법
 * 직렬화 & 역직렬화를 통해 싱글톤이 깨질 수 있다.
 */
public class Settings implements Serializable {

    private Settings(){}

    private static class SettingsHolder{
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }

    /**
     * Serializeable 에는 없지만 이 메서드를 오버라이딩 하면 역직렬화때 반드시 사용된다.
     * @return
     */
//    protected Object readResolve() {
//        return getInstance();
//    }
}
