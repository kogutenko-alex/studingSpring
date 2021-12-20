package ua.kogutenko.project_6_task;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.kogutenko.project_6_task.config.Configurations;
import ua.kogutenko.project_6_task.model.Computer;
import ua.kogutenko.project_6_task.model.genres.ClassicalMusic;

public class StartSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Configurations.class);

        for (int i = 0; i < 10; i++)
            System.out.println(context.getBean("computer", Computer.class));
        context.close();
    }
}
