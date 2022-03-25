package ru.geekbrains.level_2.lesson_1;

import ru.geekbrains.level_2.lesson_1.course.Obstacle;
import ru.geekbrains.level_2.lesson_1.course.RunningTrack;
import ru.geekbrains.level_2.lesson_1.course.Barrier;
import ru.geekbrains.level_2.lesson_1.team.Cat;
import ru.geekbrains.level_2.lesson_1.team.Human;
import ru.geekbrains.level_2.lesson_1.team.Player;
import ru.geekbrains.level_2.lesson_1.team.Robot;

/**
 * Java. Уровень 2
 * Урок 1. Объектно-ориентированное программирование Java
 */
public class Main {

    public static void main(String[] args) {

        // генератор игроков
        final Player[] players = getPlayers();

        // генератор препятствий
        final Obstacle[] obstacles = getObstacles();

        // прохождение полосы препятствий
        for (Player player : players) {
            player.doIt(obstacles);

        }
    }

    /**
     * генератор препятствий
     */
    private static Obstacle[] getObstacles() {
        return new Obstacle[]{
                new RunningTrack(10),
                new Barrier(1),
                new RunningTrack(10),
                new Barrier(2),
                new RunningTrack(90),
                new Barrier(10),
        };
    }

    /**
     * Генератор игроков
     */
    private static Player[] getPlayers() {
        return new Player[]{
                Human.builder()
                        .maxDistance(10)
                        .maxJump(2)
                        .build(),
                Human.builder()
                        .maxDistance(20)
                        .maxJump(1)
                        .build(),
                Cat.builder()
                        .name("Васька")
                        .maxDistance(5)
                        .maxJump(1)
                        .build(),
                Cat.builder()
                        .name("Мурка")
                        .maxDistance(4)
                        .maxJump(0)
                        .build(),
                Robot.builder()
                        .maxDistance(30)
                        .maxJump(3)
                        .vendor("КУКА Роботикс Рус")
                        .build(),
                Robot.builder()
                        .maxDistance(100)
                        .maxJump(10)
                        .vendor("Bosstown Dynamics")
                        .build()
        };
    }
}
