package ru.geekbrains.level_2.lesson_1.team;

import lombok.Builder;

/**
 * Реализация игрока человека
 */
@Builder
public class Human implements Player {
    private final int maxDistance;
    private final int maxJump;

    @Override
    public void jump(int height) {
        if (height <= maxJump) {
            System.out.printf("Смог подпрыгнуть на %d\n", height);
        } else {
            System.out.printf("Не смог подпрыгнуть на %d\n", height);
        }
    }

    @Override
    public void run(int length) {
        if (length <= maxDistance) {
            System.out.printf("Смог пробежать на %d\n", length);
        } else {
            System.out.printf("Не смог пробежать на %d\n", length);
        }
    }

}
