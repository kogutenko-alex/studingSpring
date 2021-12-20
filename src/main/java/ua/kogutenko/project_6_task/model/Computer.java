package ua.kogutenko.project_6_task.model;

import java.util.Random;

/**
 * @see ua.kogutenko.project_6_task.model.Computer
 * Class as computer that has music player.
 *
 * @author Kogutenko Alex
 */
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer) {
        this.id = new Random().nextInt(99);
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
