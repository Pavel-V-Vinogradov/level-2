package ru.geekbrains.level_2.lesson_2;

public class MyArraySizeException extends RuntimeException {

    public MyArraySizeException() {
        super("Ожидается массив размерностью 4x4 ");
    }
}
