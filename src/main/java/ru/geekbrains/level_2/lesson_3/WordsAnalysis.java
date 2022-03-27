package ru.geekbrains.level_2.lesson_3;

import org.apache.commons.lang3.StringUtils;

import java.util.*;

public class WordsAnalysis {

    static final String REGEX = "\\P{L}+";

    // примеры стихов с лексическим повтором
    static final String MARINA_ZVETAEVA = "В мире горы есть и долины есть,\n" +
            "В мире хоры есть и низины есть,\n" +
            "В мире море есть и лавины есть,\n" +
            "В мире боги есть и богини есть.\n";

    static final String BELA_AHMADULINA = "Весь сад в дожде! Весь дождь в саду!\n" +
            "Погибнут дождь и сад друг в друге,\n" +
            "Оставив мне решать судьбу\n" +
            "Зимы, явившейся на юге";

    public void doIt() {

        String[] words = MARINA_ZVETAEVA.split(REGEX);
        execute(words);

        words = BELA_AHMADULINA.split(REGEX);
        execute(words);
    }

    private void execute(String[] words) {
        final HashMap<String, Integer> wordsMap = frequencyAnalysisWords(words);
        Set<String> singletonWordsMap = NonRepeatingWordsList(wordsMap);
        resultView(words, wordsMap, singletonWordsMap);
    }

    /**
     * Преобразование массива в HashMap (ключь - слово, значение -  частота повторений)
     */
    private HashMap<String, Integer> frequencyAnalysisWords(String[] words) {
        final HashMap<String, Integer> targetMap = new HashMap<>();
        for (String s : words) {
            targetMap.computeIfPresent(s, (k, v) -> v + 1);
            targetMap.putIfAbsent(s, 1);
        }
        return targetMap;
    }

    /**
     * @param wordsMap HashMap (ключь - слово, значение -  частота повторений)
     * @return Set неповторяющихся в HashMap`е слов
     */
    private Set<String> NonRepeatingWordsList(HashMap<String, Integer> wordsMap) {
        final Set<String> singleUse = new HashSet<>();
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if (entry.getValue().equals(1)) {
                singleUse.add(entry.getKey());
            }
        }
        return singleUse;
    }

    /**
     * Отображение результатов
     */
    private void resultView(String[] words, HashMap<String, Integer> wordsMap, Set<String> singletonWordsMap) {
        System.out.println("\nИсходный массив слов: " + Arrays.toString(words));
        System.out.println("Неповторяющиеся слова: " + singletonWordsMap);

        System.out.println("Частотный анализ вхождения слов:");
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            System.out.printf("\"%s\" -> %d\n"
                    , StringUtils.rightPad(entry.getKey(), 15, ' ')
                    , entry.getValue());
        }
    }
}
