package ua.kogutenko.project_5_task.model;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Musical enumerations
 *
 * @author Kogutenko Alex
 */
public enum MusicalGenres {
    CLASSICAL("ClassicalMusic"), ROCK("RockMusic");

    private final String name;

    private static final List<MusicalGenres> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static MusicalGenres randomGenre()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

    MusicalGenres(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
