package ua.kogutenko.project_5.model;

import org.springframework.stereotype.Component;
import ua.kogutenko.project_5.model.intrfaces.Music;

/**
 * Implement music interface as rock music
 *
 * @author Kogutenko Alex
 */
@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Rock music";
    }
}