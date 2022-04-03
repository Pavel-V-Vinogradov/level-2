package ru.geekbrains.level_2.lesson_5;

public class Main {

    static final int size = 10000000;
    static final int h = size / 2;

    public static void main(String[] args) {

        float[] arr = new float[size];

        fillArray(arr);

        try {
            fillArrayUseTwoThread(arr);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private static void fillArrayUseTwoThread(float[] arr) throws InterruptedException {
        float[] a1 = new float[h];
        float[] a2 = new float[h];

        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        Thread thread1 = new Thread(() ->{fillArray(a1);});
        Thread thread2 = new Thread(() ->{fillArray(a2);});

        thread1.start(); thread1.join();
        thread2.start(); thread2.join();

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        System.out.println("замер с использованием 2-х потоков : "+(System.currentTimeMillis() - a));
    }

    private static void fillArray(float[] arr) {
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.printf("замер наполнения массива [%d]: %d\n", arr.length, (System.currentTimeMillis() - a));
    }
}
