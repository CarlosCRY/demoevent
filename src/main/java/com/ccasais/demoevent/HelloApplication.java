package com.ccasais.demoevent;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

import java.util.Random;

public class HelloApplication extends Application {

    private static Scene scene;
    private static Insets STANDARED = new Insets (20, 0, 20, 0);
    private static Font MARKERFONT = new Font(16);
    private static Random random = new Random();
    @Override
    public void start(Stage stage) throws IOException {
        VBox root = new VBox();
        HBox markers = new HBox();
        HBox mContainer1 = new HBox();
        Label marker1 = new Label("Intentos: ");
        marker1.setFont(MARKERFONT);
        int nT = 0;
        Label tries = new Label();
        tries.setText(String.valueOf(nT));
        tries.setFont(MARKERFONT);
        mContainer1.getChildren().addAll(marker1, tries);
        HBox.setMargin(mContainer1, new Insets(5, 5, 5, 5));
        HBox mContainer2 = new HBox();
        Label marker2 = new Label("Aciertos: ");
        marker2.setFont(MARKERFONT);
        int nS = 0;
        Label success = new Label();
        success.setText(String.valueOf(nS));
        success.setFont(MARKERFONT);
        mContainer2.getChildren().addAll(marker2, success);
        HBox.setMargin(mContainer2, new Insets(5, 5, 5, 5));
        markers.getChildren().addAll(mContainer1, mContainer2);
        markers.setAlignment(Pos.CENTER_RIGHT);
        VBox firstText = new VBox();
        Label title = new Label("Adivina el número");
        title.setFont(new Font(20));
        Label instruction = new Label("Introduce un número del 0 al 9");
        firstText.getChildren().addAll(title, instruction);
        VBox.setMargin(firstText, STANDARED);
        firstText.setAlignment(Pos.CENTER);
        int n = random.nextInt(0,10);
        VBox output = new VBox();
        Label yap = new Label("El último número que has indroducido es:");
        yap.setFont(MARKERFONT);
        Label theNumber = new Label();
        theNumber.setFont(new Font(24));
        Label result = new Label();
        result.setFont(MARKERFONT);
        output.getChildren().addAll(yap, theNumber, result);
        output.setAlignment(Pos.CENTER);
        VBox.setMargin(output, STANDARED);
        TextField input = new TextField();
        input.setMaxWidth(40);
        VBox.setMargin(input, STANDARED);
        HBox buttons = new HBox();
        Button toInput = new Button("Introducir");
        Button toReset = new Button("Reiniciar");

        root.getChildren().addAll(markers, firstText, output, input);
        root.setAlignment(Pos.CENTER);
        scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    private static void main (String[] args) {launch();}
}
