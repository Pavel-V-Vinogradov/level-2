module ru.geekbrains.level_2.chat {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.geekbrains.level_2.lesson_4 to javafx.fxml;
    exports ru.geekbrains.level_2.lesson_4;
}