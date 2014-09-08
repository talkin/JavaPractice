package Practice15_inheritance;

public class Practice_Interface {


    public static void main(String[] args) {
        ClassTest one = new ClassTest();
        System.out.println(one.say());
        System.out.println(one.say(12));

        System.out.println(one instanceof ClassA);
        System.out.println(one instanceof ClassB);
        System.out.println(one instanceof ClassC);

    }

    interface ClassA {
        public String say();
    }

    interface ClassB {
        public String say();
    }

    interface ClassC {
        public int say(int i);
    }

    static class ClassTest implements ClassA, ClassB, ClassC{
        @Override
        public String say() {
            return "hello";
        }

        @Override
        public int say(int i) {
            return i;
        }
    }



}
