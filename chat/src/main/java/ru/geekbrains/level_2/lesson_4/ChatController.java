package ru.geekbrains.level_2.lesson_4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ChatController {
    @FXML
    private TextArea messageArea;
    @FXML
    public TextField messageField;

    @FXML
    private void sendButtonClick(ActionEvent actionEvent) {
        String userMessage = messageField.getText();
        if (userMessage.isEmpty()) {
            return;
        }
        messageArea.appendText(userMessage+"\n");
        messageField.clear();
    }
}