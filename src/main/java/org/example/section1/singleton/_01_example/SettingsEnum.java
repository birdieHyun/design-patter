package org.example.section1.singleton._01_example;

public enum SettingsEnum {

    // 생성자는 기본으로 private 이다. + 리플렉션으로도 안전한 코드가 된다.
    INSTANCE;
}

// 단점은 지연로딩을 사용할 수 없다.
// 직렬화 역직렬화에서도 안전하다.