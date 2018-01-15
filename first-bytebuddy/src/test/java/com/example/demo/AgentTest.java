package com.example.demo;

public class AgentTest {
    private void fun1() throws Exception {
        System.out.println("this is fun 1.");
        Thread.sleep(500);
    }

    private void fun2() throws Exception {
        System.out.println("this is fun 2.");
        Thread.sleep(500);
    }

    // add VM options: -javaagent:./first-bytebuddy/target/my-agent.jar
    public static void main(String[] args) throws Exception {
        System.out.println(System.getProperty("user.dir"));
        AgentTest test = new AgentTest();
        test.fun1();
        test.fun2();

    }
}
