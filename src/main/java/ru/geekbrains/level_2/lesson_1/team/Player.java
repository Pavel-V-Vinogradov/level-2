package ru.geekbrains.level_2.lesson_1.team;

import ru.geekbrains.level_2.lesson_1.course.Obstacle;

public interface Player extends Jumping, Running {
    default void doIt(Obstacle[] obstacle) {
        for (Obstacle o : obstacle) {
            o.overCome(this);
        }
    }
}
