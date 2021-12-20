package ua.kogutenko.project_6_task.model.genres;

import ua.kogutenko.project_6_task.model.intrfaces.Music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @see ua.kogutenko.project_6_task.model.genres.RockMusic
 * Implement music interface as rock music
 *
 * @author Kogutenko Alex
 */
public class RockMusic implements Music {
    @PostConstruct
    private void init() {
        System.out.println("INIT rock");
    }
    @PreDestroy
    private void destruction() {
        System.out.println("DESTROY rock");
    }
    @Override
    public String getSong() {
        return "Rock music";
    }
}