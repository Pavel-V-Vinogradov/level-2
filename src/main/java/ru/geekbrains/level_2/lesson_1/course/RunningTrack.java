package ru.geekbrains.level_2.lesson_1.course;

import lombok.AllArgsConstructor;
import ru.geekbrains.level_2.lesson_1.team.Player;

/**
 * беговая дорожка (как препятствие)
 */
@AllArgsConstructor
public class RunningTrack implements Obstacle {
    private final int distance;

    @Override
    public void overCome(Player player) {
        player.run(distance);
    }
}
