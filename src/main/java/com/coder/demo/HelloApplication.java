package com.coder.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.NoSuchAlgorithmException;

import java.io.IOException;

import static java.nio.file.Files.readAllBytes;

public class HelloApplication extends Application {
    public HelloApplication() throws IOException {
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 500);
        stage.setTitle("Main");
        stage.setScene(scene);
        stage.show();
    }

    private String TInputEnc;
    byte[] array;
    /* byte[] array= readAllBytes(Paths.get(TInputEnc)); Crushed */

    private SecretKey secretKey;

    public void Aes256Class() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(256);
            this.secretKey = keyGenerator.generateKey();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public byte[] makeAes(byte[] rawMessage, int cipherMode) {
        try {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(cipherMode, this.secretKey);
            byte[] output = cipher.doFinal(rawMessage);
            return output;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        launch();
    }
}