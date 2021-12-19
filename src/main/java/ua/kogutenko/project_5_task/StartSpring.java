package ua.kogutenko.project_5_task;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.kogutenko.project_5_task.model.Computer;
import ua.kogutenko.project_5_task.model.MusicPlayer;

public class StartSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "project_5_task/applicationContext.xml"
        );
        for (int i = 0; i < 10; i++) {
            Computer computer = context.getBean("computer", Computer.class);
            System.out.println(computer);
        }
        context.close();
    }
}
