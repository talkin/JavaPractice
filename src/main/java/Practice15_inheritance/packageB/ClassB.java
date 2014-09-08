package Practice15_inheritance.packageB;

import Practice15_inheritance.packageA.ClassA;

public class ClassB extends ClassA{

    public static void main(String[] args) {
        ClassB b = new ClassB();

        b.protectedMethod();
    }
}
