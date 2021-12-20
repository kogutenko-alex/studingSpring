package ua.kogutenko.project_6_task.config;

import org.springframework.context.annotation.*;
import ua.kogutenko.project_6_task.model.Computer;
import ua.kogutenko.project_6_task.model.MusicPlayer;
import ua.kogutenko.project_6_task.model.genres.ClassicalMusic;
import ua.kogutenko.project_6_task.model.genres.JazzMusic;
import ua.kogutenko.project_6_task.model.genres.RockMusic;
import ua.kogutenko.project_6_task.model.intrfaces.Music;

import java.util.ArrayList;
import java.util.List;

/**
 * Configuration class instead of applicationContext.xml
 *
 * @author Kogutenko Alex
 */
@Configuration
@ComponentScan("ua.kogutenko.project_6")
@PropertySource("classpath:project_6/musicPlayer.properties")
public class Configurations {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }
    @Bean
    public JazzMusic jazzMusic() {
        return new JazzMusic();
    }
    @Bean
    public List<Music> listGenres() {
        List<Music> listGenres = new ArrayList<>();
        listGenres.add(new ClassicalMusic());
        listGenres.add(new JazzMusic());
        listGenres.add(new RockMusic());
        return listGenres;
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(listGenres());
    }

    @Bean
    @Scope("prototype")
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
