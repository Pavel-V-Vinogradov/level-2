package ru.geekbrains.level_2.lesson_1.course;

import lombok.AllArgsConstructor;
import ru.geekbrains.level_2.lesson_1.team.Player;

/**
 * Барьер (как перпятствие типа "стена")
 */
@AllArgsConstructor
public class Barrier implements Obstacle {
    private final int height;

    @Override
    public void overCome(Player player) {
        player.jump(height);
    }
}
