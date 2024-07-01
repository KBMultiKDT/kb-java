package _0703_pattern_basic.basic_q1_pattern;

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
