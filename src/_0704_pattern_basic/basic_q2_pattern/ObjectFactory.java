package _0704_pattern_basic.basic_q2_pattern;

public class ObjectFactory {
    public Object createObject(String objectType) {
        if (objectType.equalsIgnoreCase("Apple")) {
            return new AppleClass();
        } else if (objectType.equalsIgnoreCase("Banana")) {
            return new BananaClass();
        } else if (objectType.equalsIgnoreCase("Ice")) {
            return new IceClass();
        } else {
            return null;
        }
    }
}
