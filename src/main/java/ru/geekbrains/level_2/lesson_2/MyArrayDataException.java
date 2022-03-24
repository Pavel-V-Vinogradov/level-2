package ru.geekbrains.level_2.lesson_2;

public class MyArrayDataException extends RuntimeException {
    int i;
    int j;

    public MyArrayDataException(int i, int j, String message) {
        super(String.format("В ячейке [ %d,%d] лежат неверные данные. %s", i, j, message));
        this.i = i;
        this.j = j;
    }
}
