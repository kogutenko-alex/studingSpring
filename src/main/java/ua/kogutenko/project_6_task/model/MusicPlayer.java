package ua.kogutenko.project_6_task.model;

import org.springframework.beans.factory.annotation.Value;
import ua.kogutenko.project_6_task.model.intrfaces.Music;

import java.util.List;
import java.util.Random;

/**
 * @see ua.kogutenko.project_6_task.model.MusicPlayer
 * Class implement music player as IoC.
 * Get musical genre from constructor and play from method
 *
 * @author Kogutenko Alex
 */
public class MusicPlayer {
    private List<Music> listMusic;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(List<Music> listMusic) {
        this.listMusic = listMusic;
    }

    public String playMusic() {
        return "Playing: " + listMusic.get(
                new Random().nextInt(
                        listMusic.size()
                )
        ).getSong();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
