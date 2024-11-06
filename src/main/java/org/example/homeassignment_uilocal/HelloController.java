package org.example.homeassignment_uilocal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ResourceBundle;

public class HelloController {
    @FXML
    public Button button1;
    @FXML
    public Button button2;
    @FXML
    public Button button3;
    @FXML
    public Label infoLabel;

    public void initialize() {
        // Load default language (English)
        setLocale(new Locale("en"));
    }

    private void setLocale(Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle("bundle", locale);
        button1.setText(bundle.getString("button1.text"));
        button2.setText(bundle.getString("button2.text"));
        button3.setText(bundle.getString("button3.text"));

        // Update the label with your name and current time
        updateInfoLabel(bundle, locale);
    }

    private void updateInfoLabel(ResourceBundle bundle, Locale locale) {
        String name = "Samu Pietilä";
        String currentTime = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        infoLabel.setText(name + " - " + currentTime);
    }

    @FXML
    public void setEN(ActionEvent actionEvent) {
        setLocale(new Locale("en"));
    }

    @FXML
    public void setIR(ActionEvent actionEvent) {
        setLocale(new Locale("fa"));
    }

    @FXML
    public void setJP(ActionEvent actionEvent) {
        setLocale(new Locale("ja"));
    }
}
