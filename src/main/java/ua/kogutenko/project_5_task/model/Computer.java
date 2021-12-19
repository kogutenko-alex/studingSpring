package ua.kogutenko.project_5_task.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

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
        this.id = new Random().nextInt() % 100;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", " + musicPlayer.playMusic(MusicalGenres.randomGenre()) +
                '}';
    }
}
