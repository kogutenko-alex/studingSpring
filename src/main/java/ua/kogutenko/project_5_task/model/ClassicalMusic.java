package ua.kogutenko.project_5_task.model;

import org.springframework.stereotype.Component;
import ua.kogutenko.project_5_task.model.intrfaces.Music;

import java.util.Random;

/**
 * Implement music interface as classical music
 *
 * @author Kogutenko Alex
 */
@Component
public class ClassicalMusic implements Music {
    private final String[] songs = {"Classical 1", "Classical 2", "Classical 3"};

    @Override
    public String getSong() {
        return songs[new Random().nextInt(songs.length)];
    }
}
