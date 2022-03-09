package com.game.roguelikeccgsim;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class MainMenu {
    @FXML
    Button buttonThing;

    public void happens() {
        buttonThing.setFont(new Font(40));
    }
}