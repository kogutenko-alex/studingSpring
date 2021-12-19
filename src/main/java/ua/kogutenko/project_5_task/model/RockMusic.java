package ua.kogutenko.project_5_task.model;

import org.springframework.stereotype.Component;
import ua.kogutenko.project_5_task.model.intrfaces.Music;

import java.util.Random;

/**
 * Implement music interface as rock music
 *
 * @author Kogutenko Alex
 */
@Component
public class RockMusic implements Music {
    private final String[] songs = {"Rock 1", "Rock 2", "Rock 3"};

    @Override
    public String getSong() {
        return songs[new Random().nextInt(songs.length)];
    }
}