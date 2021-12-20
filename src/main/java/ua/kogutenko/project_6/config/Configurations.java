package ua.kogutenko.project_6.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ua.kogutenko.project_6.model.Computer;
import ua.kogutenko.project_6.model.MusicPlayer;
import ua.kogutenko.project_6.model.genres.ClassicalMusic;
import ua.kogutenko.project_6.model.genres.RockMusic;

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
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(rockMusic(), classicalMusic());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
