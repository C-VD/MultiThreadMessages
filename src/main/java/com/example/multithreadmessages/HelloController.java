package com.example.multithreadmessages;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField txt1;

    @FXML
    private TextField txt2;

    @FXML
    protected void onStart1Btn() {
        ThreadGenerator.startThread(1, Integer.parseInt(txt1.getText()));
    }
    @FXML
    protected void onStart2Btn() {
        ThreadGenerator.startThread(2, Integer.parseInt(txt2.getText()));
    }
}