package ru.geekbrains.level_2.lesson_2;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {{"5", "7", "3", "17"}, {"7", "0", "1", "12"}, {"8", "1", "2", "3"}, {"2", "544", "6", "54"}};
        String[][] InvalidSizeArr = {{"5", "7", "3", "17"}, {"7", "0", "1", "12"}};
        String[][] withInvalidDataArray = {{"5", "aaa", "3", "17"}, {"7", "0", "1", "12"}, {"qwe", "1", "2", "3"}, {"2", "4", "6", "54"}};

        System.out.printf("Сумма всех элементов массива: %d%n", sumArrayElement(arr));

        try {
            System.out.println(sumArrayElement(InvalidSizeArr));
        } catch (MyArraySizeException ex) {
            System.out.println(ex);
        }

        try {
            System.out.println(sumArrayElement(withInvalidDataArray));
        } catch (MyArrayDataException ex) {
            System.out.println(ex);
        }
    }

    public static int sumArrayElement(String[][] array) {
        int sum = 0;
        if (array.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, e.getMessage());
                }
            }
        }
        return sum;
    }

}
