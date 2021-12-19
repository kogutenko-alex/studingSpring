package ua.kogutenko.project_2.model;

import ua.kogutenko.project_2.model.intrfaces.Music;

/**
 * Class implement music player as IoC.
 * Get musical genre from constructor and play from method
 *
 * @author Kogutenko Alex
 */
public class MusicPlayer {
   private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
