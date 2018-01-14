package agent;

public class AgentTest {

    // add VM options: -javaagent:./first-agent/target/my-agent.jar=first
    public static void main(String[] args) {
        System.out.println("this is main");

        //user.dir指定了当前的路径
        System.out.println(System.getProperty("user.dir"));
    }
}
