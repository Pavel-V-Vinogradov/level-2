package ru.geekbrains.level_2.lesson_1.team;

import lombok.Builder;

/**
 * Реализация игрока кота
 */
@Builder
public class Cat implements Player {
    private final int maxDistance;
    private final int maxJump;
    private final String name;

    @Override
    public void jump(int height) {
        if (height <= maxJump) {
            System.out.printf("Кот \"%s\" подпрыгнул на %d\n", name, height);
        } else {
            System.out.printf("Кот \"%s\" не смог подпрыгнуть на %d\n", name, height);
        }
    }

    @Override
    public void run(int length) {
        if (length <= maxDistance) {
            System.out.printf("Кот \"%s\" пробежал на %d\n", name, length);
        } else {
            System.out.printf("Кот \"%s\" не смог пробежать на %d\n", name, length);
        }
    }

}
