package ua.kogutenko.project_6.model.genres;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ua.kogutenko.project_6.model.intrfaces.Music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
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
