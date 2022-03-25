package ru.geekbrains.level_2.lesson_1.team;

import lombok.Builder;

/**
 * Реализация игрока робота
 */
@Builder
public class Robot implements Player {
    private final int maxDistance;
    private final int maxJump;
    private String vendor;

    @Override
    public void jump(int height) {
        if (height <= maxJump) {
            System.out.printf("Робот подпрыгнул на %d (%s)\n", height, vendor);
        } else {
            System.out.printf("Робот не смог подпрыгнуть на %d (%s)\n", height, vendor);
        }
    }

    @Override
    public void run(int length) {
        if (length <= maxDistance) {
            System.out.printf("Робот смог пробежать на %d (%s)\n", length, vendor);
        } else {
            System.out.printf("Робот не смог пробежать на %d (%s)\n", length, vendor);
        }
    }
}
