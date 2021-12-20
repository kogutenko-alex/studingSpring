package ua.kogutenko.project_6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.kogutenko.project_6.config.Configurations;
import ua.kogutenko.project_6.model.genres.ClassicalMusic;
import ua.kogutenko.project_6.model.Computer;

public class StartSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Configurations.class);

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
        System.out.println();
        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());
        context.close();
    }
}
