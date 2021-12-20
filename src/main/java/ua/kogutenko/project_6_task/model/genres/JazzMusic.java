package ua.kogutenko.project_6_task.model.genres;

import ua.kogutenko.project_6_task.model.intrfaces.Music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @see ua.kogutenko.project_6_task.model.genres.JazzMusic
 * Implement music interface as jazz music
 *
 * @author Kogutenko Alex
 */
public class JazzMusic implements Music {
    @PostConstruct
    private void init() {
        System.out.println("INIT jazz");
    }
    @PreDestroy
    private void destruction() {
        System.out.println("DESTROY jazz");
    }

    @Override
    public String getSong() {
        return "Jazz music";
    }
}
