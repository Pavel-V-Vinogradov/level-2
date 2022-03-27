package ru.geekbrains.level_2.lesson_3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PhoneBook {
    private final HashMap<String, String> database = new HashMap<>();

    public void doIt() {
        //заполняем справочник
        add("Иванов", "10-001");
        add("Смирнов", "10-002");
        add("Попов", "10-003");
        add("Васильев", "10-004");
        add("Петров", "10-005");
        add("Соколов", "10-006");
        add("Михайлов", "10-007");

        add("Морозов", "10-008");
        add("Морозов", "10-009");
        add("Морозов", "10-010");

        add("Кузнецов", "10-011");
        add("Кузнецов", "10-012");

        add("Лебедев", "10-013");
        add("Лебедев", "10-014");

        //поиск уникальной фамилии
        System.out.println("Васильев: " + get("Васильев"));
        System.out.println("Смирнов: " + get("Смирнов"));

        //поиск НЕуникальной фамилии
        System.out.println("Морозов: " + get("Морозов"));
        System.out.println("Кузнецов: " + get("Кузнецов"));
        System.out.println("Лебедев: " + get("Лебедев"));
    }

    public void add(String family, String phone) {
        database.put(phone, family);
    }

    public List<String> get(String family) {
        return database.entrySet()
                .stream()
                .filter((e) -> e.getValue().equals(family))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
