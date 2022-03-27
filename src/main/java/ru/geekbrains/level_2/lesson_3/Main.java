package ru.geekbrains.level_2.lesson_3;

import org.apache.commons.lang3.StringUtils;

/**
 * Java. Уровень 2
 * Урок 3. Коллекции
 */

public class Main {
    public static void main(String[] args) {

        System.out.println("-".repeat(50) + "задание № 1" + "-".repeat(50));
        new WordsAnalysis().doIt();

        System.out.println("-".repeat(50) + "задание № 2" + "-".repeat(50));
        new PhoneBook().doIt();
    }
}
