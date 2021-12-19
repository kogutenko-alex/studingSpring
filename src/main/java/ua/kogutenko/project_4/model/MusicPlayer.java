package ua.kogutenko.project_4.model;

import ua.kogutenko.project_4.model.intrfaces.Music;

/**
 * Class implement music player as IoC.
 * Get musical genre from constructor and play from method
 *
 * @author Kogutenko Alex
 */
public class MusicPlayer {
   private Music music;
   private String name;
   private int volume;

   public MusicPlayer() {}

   public MusicPlayer(Music music) {
        this.music = music;
    }

   public void playMusic() {
        System.out.println(
                "Playing: " + music.getSong() + "\n" +
                "Volume: " + getVolume() + "\n" +
                "Name of player: " + getName()
        );
    }

   public void setMusic(Music music) {
       this.music = music;
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
