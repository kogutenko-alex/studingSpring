package ua.kogutenko.project_5.model;

import org.springframework.stereotype.Component;
import ua.kogutenko.project_5.model.intrfaces.Music;

/**
 * Implement music interface as classical music
 *
 * @author Kogutenko Alex
 */
@Component("classicalMusic")
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Classical music";
    }
}
