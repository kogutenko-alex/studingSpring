package ua.kogutenko.project_5.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ua.kogutenko.project_5.model.intrfaces.Music;

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

    public String playMusic() {
        return "Playing: " + music1.getSong() + ", " + music2.getSong();
    }
}
