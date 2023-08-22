package com.example.multithreadmessages;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField txtCount1;

    @FXML
    private TextField txtCount2;

    @FXML
    protected void onStart1Btn() {
        ThreadGenerator.startThread(1, Integer.parseInt(txtCount1.getText()));
    }
    @FXML
    protected void onStart2Btn() {
        ThreadGenerator.startThread(2, Integer.parseInt(txtCount2.getText()));
    }
}