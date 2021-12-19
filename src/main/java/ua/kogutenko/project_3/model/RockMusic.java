package ua.kogutenko.project_3.model;

import ua.kogutenko.project_3.model.intrfaces.Music;
/**
 * Implement music interface as rock music
 *
 * @author Kogutenko Alex
 */
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Rock Music";
    }
}