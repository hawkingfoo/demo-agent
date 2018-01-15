package instrument;

public class InstrumentTest {
    private void fun1() {
        System.out.println("this is fun 1.");
    }

    private void fun2() {
        System.out.println("this is fun 2.");
    }

    // add VM options: -javaagent:./first-instrument/target/my-agent.jar=first
    public static void main(String[] args) {
        InstrumentTest test = new InstrumentTest();
        test.fun1();
        test.fun2();

        AnotherTest test1 = new AnotherTest();
        test1.fun3();
        test1.fun4();
    }
}
