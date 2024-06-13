package org.example.section1.singleton._01_example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String[] args)
        throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        Settings instance = Settings.getInstance();
        Settings instance2 = Settings.getInstance();

        System.out.println(instance == instance2);

        // 싱글톤 패턴 깨보기 - 리플렉션 이용 -> 막을 방법이 없다. (Enum을 사용하면 막을 수 있다.)
        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings notSingletonInstance = constructor.newInstance();

        System.out.println("private 생성자 파과 " + (instance == notSingletonInstance));

        // 직렬화 & 역직렬화 이용하기 -> 객체를 파일로 저장했다가 다시 로딩할 수 있다.
        Settings serializeInstance = Settings.getInstance();
        Settings deserializeInstance = null;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(serializeInstance);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            deserializeInstance = (Settings) in.readObject(); // 역직렬화를 할땐 반드시 생성자를 써서 새로운 객체를 만들어준다.
        }

        System.out.println("=====" + (serializeInstance == deserializeInstance));

        SettingsEnum settings = SettingsEnum.INSTANCE;

        Constructor<SettingsEnum> enumConstructor = SettingsEnum.class.getDeclaredConstructor();
        enumConstructor.setAccessible(true);
        SettingsEnum reflectionSettings = enumConstructor.newInstance();

        System.out.println(settings == reflectionSettings);
    }
}
