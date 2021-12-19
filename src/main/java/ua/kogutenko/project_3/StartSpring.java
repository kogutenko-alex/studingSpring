package ua.kogutenko.project_3;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.kogutenko.project_3.model.MusicPlayer;
import ua.kogutenko.project_3.model.intrfaces.Music;

public class StartSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "project_3/applicationContext.xml"
        );
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        context.close();
    }
}
