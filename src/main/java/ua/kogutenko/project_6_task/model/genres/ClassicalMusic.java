package ua.kogutenko.project_6_task.model.genres;

import ua.kogutenko.project_6_task.model.intrfaces.Music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @see ua.kogutenko.project_6_task.model.genres.ClassicalMusic
 * Implement music interface as classical music
 *
 * @author Kogutenko Alex
 */
public class ClassicalMusic implements Music {
    @PostConstruct
    private void init() {
        System.out.println("INIT classical");
    }
    @PreDestroy
    private void destruction() {
        System.out.println("DESTROY classical");
    }

    @Override
    public String getSong() {
        return "Classical music";
    }
}
