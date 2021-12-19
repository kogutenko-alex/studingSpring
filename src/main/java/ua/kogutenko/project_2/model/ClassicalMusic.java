package ua.kogutenko.project_2.model;

import ua.kogutenko.project_2.model.intrfaces.Music;

/**
 * Implement music interface as classical music
 *
 * @author Kogutenko Alex
 */
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Classical music";
    }
}
