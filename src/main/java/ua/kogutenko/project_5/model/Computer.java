package ua.kogutenko.project_5.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Class as computer that has music player.
 *
 * @author Kogutenko Alex
 */
@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = (int) (Math.random() / 100);
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", " + musicPlayer.playMusic() +
                '}';
    }
}
