package session6.practice;

public class StringPractice {

    public static void main(String[] args) {
        String animal1 = "Lion";
        String animal2 = new String("Lion");
        String animal3 = "Lion";
        String name = "AdrianPuscuta";


        System.out.println(animal1 == animal2);
        System.out.println(animal1 == animal3);

        System.out.println("animal1 hashcode: " + Integer.toHexString(System.identityHashCode(animal1)));
        System.out.println("animal2 hashcode: " + Integer.toHexString(System.identityHashCode(animal2)));
        System.out.println("animal3 hashcode: " + Integer.toHexString(System.identityHashCode(animal3)));

        garbageCollectorExample();
        stringConcat();
        System.out.println(getStringLength(animal1));

        System.out.println(getStringChar(animal1, 1));

        System.out.println(animal1.indexOf("i"));

        System.out.println(animal1.substring(2));

        System.out.println(animal1.toLowerCase());
        System.out.println(animal1.toUpperCase());

        System.out.println(getStringStartsWith(name, "Adrian"));
        System.out.println(getStringEndsWith(name, "Puscuta"));

        String sentence = "   I like to eat apple pie.   ";
        System.out.println(sentence.contains("apple"));

        System.out.println(sentence.replace("a", "b"));

        System.out.println(sentence.trim());
    }

    public static void garbageCollectorExample() {
        String name = "Andrei";
        System.out.println(name);

        name = "Ion";
        System.out.println(name);

        User user = new User();
        user.setName("Ionut");

        user = new User();
    }

    public static void stringConcat() {
        String value1 = "Adrian";
        String value2 = "Puscuta";
        System.out.println(Integer.toHexString(System.identityHashCode(value1)));

        value1 = value1.concat(value2);
        System.out.println(Integer.toHexString(System.identityHashCode(value1)));
    }

    public static int getStringLength(String input) {
        return input.length();
    }

    public static char getStringChar(String input, int index) {
        return input.charAt(index);
    }

    public static boolean getStringStartsWith(String input, String startsWith) {
        return input.startsWith(startsWith);
    }

    public static boolean getStringEndsWith(String input, String endsWith) {
        return input.endsWith(endsWith);
    }


}