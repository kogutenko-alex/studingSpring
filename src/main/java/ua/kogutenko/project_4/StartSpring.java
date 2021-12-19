package ua.kogutenko.project_4;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.kogutenko.project_4.model.MusicPlayer;

public class StartSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "project_4/applicationContext.xml"
        );
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        MusicPlayer musicPlayer1 = context.getBean("musicPlayerContext", MusicPlayer.class);
        musicPlayer1.playMusic();
        context.close();
    }
}
