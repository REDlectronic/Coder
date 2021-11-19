package com.coder.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    public TextField InputEnc;
    public TextField OutputEnc;
    public String TOutputEnc;
    public String TInputEnc;
    public TextField InputDec;
    public TextField OutputDec;
    public String TOutputDec;
    public String TInputDec;
    @FXML
    public void ok_enc() {
        if (InputEnc != null && !InputEnc.getText().isEmpty()) {
            TInputEnc=InputEnc.getText();
        }
        if (OutputEnc != null && !OutputEnc.getText().isEmpty()) {
            TOutputEnc=OutputEnc.getText();
        }
    }

    @FXML
    public void ok_dec() {
        if (InputDec != null && !InputDec.getText().isEmpty()) {
            TInputDec=InputDec.getText();
        }
        if (OutputDec != null && !OutputDec.getText().isEmpty()) {
            TOutputDec=OutputDec.getText();
        }
    }

}
