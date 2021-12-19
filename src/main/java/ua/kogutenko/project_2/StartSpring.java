package ua.kogutenko.project_2;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.kogutenko.project_2.model.MusicPlayer;
import ua.kogutenko.project_2.model.intrfaces.Music;

public class StartSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "project_2/applicationContext.xml"
        );
//        Music music = context.getBean("musicCBean", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(
                context.getBean("musicCBean", Music.class)
        );
        musicPlayer.playMusic();
        context.close();
    }
}
