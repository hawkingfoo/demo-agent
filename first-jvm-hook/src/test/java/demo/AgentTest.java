package demo;

import java.util.ArrayList;
import java.util.List;

public class AgentTest {

    // add VM options: -javaagent:./first-jvm-hook/target/my-agent.jar
    public static void main(String[] args) throws Exception {
        boolean is = true;
        while (is) {
            List<Object> list = new ArrayList<Object>();
            list.add("hello world");
        }
    }
}
