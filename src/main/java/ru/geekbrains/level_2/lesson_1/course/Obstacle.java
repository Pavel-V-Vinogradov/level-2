package ru.geekbrains.level_2.lesson_1.course;

import ru.geekbrains.level_2.lesson_1.team.Player;

/**
 * препятствие полосы
 */
@FunctionalInterface
public interface Obstacle {
    /**
     * Преодолжение препятствия игроком
     *
     * @param player игрок
     */
    void overCome(Player player);
}
