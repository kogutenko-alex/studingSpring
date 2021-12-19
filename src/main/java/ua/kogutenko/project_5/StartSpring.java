package ua.kogutenko.project_5;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.kogutenko.project_5.model.Computer;
import ua.kogutenko.project_5.model.MusicPlayer;
import ua.kogutenko.project_5.model.RockMusic;
import ua.kogutenko.project_5.model.intrfaces.Music;

public class StartSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "project_5_task/applicationContext.xml"
        );
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
        context.close();
    }
}
