package ua.kogutenko.project_6.model.genres;

import ua.kogutenko.project_6.model.intrfaces.Music;

public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "Jazz music";
    }
}
