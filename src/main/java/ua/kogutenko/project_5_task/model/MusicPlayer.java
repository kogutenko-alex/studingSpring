package ua.kogutenko.project_5_task.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ua.kogutenko.project_5_task.model.intrfaces.Music;

/**
 * Class implement music player as IoC.
 * Get musical genre from constructor and play from method
 *
 * @author Kogutenko Alex
 */
@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(
            @Qualifier("rockMusic") Music music1,
            @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(MusicalGenres genre) {
        if (music1.getClass().getSimpleName().equals(genre.getName())) {
            return music1.getSong();
        }
        if (music2.getClass().getSimpleName().equals(genre.getName())) {
            return music2.getSong();
        }
        return "Unexpected value: " + genre.getName();
    }
}
