package com.mycompany.desglosedinero;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {

    @FXML private TextField txtDinero;
    
    // Etiquetas para mostrar los resultados
    @FXML private Label lbl500;
    @FXML private Label lbl200;
    @FXML private Label lbl100;
    @FXML private Label lbl50;
    @FXML private Label lbl20;
    @FXML private Label lbl10;
    @FXML private Label lbl5;
    @FXML private Label lbl2;
    @FXML private Label lbl1;

    @FXML
    private void desglosarDinero(ActionEvent event) {
        // 1. Leemos el número que escribió el usuario
        int dinero = Integer.parseInt(txtDinero.getText());

        // 2. Calculamos cuántos billetes/monedas de cada denominación hay.
        // Usamos la división (/) para saber cuántos caben, y el módulo (%) para saber cuánto sobra.
        
        int b500 = dinero / 500;
        dinero = dinero % 500;

        int b200 = dinero / 200;
        dinero = dinero % 200;

        int b100 = dinero / 100;
        dinero = dinero % 100;

        int b50 = dinero / 50;
        dinero = dinero % 50;

        int b20 = dinero / 20;
        dinero = dinero % 20;

        int m10 = dinero / 10;
        dinero = dinero % 10;

        int m5 = dinero / 5;
        dinero = dinero % 5;

        int m2 = dinero / 2;
        dinero = dinero % 2;

        int m1 = dinero / 1;
        dinero = dinero % 1; 

        // 3. Mostramos los resultados en las etiquetas
        lbl500.setText(String.valueOf(b500));
        lbl200.setText(String.valueOf(b200));
        lbl100.setText(String.valueOf(b100));
        lbl50.setText(String.valueOf(b50));
        lbl20.setText(String.valueOf(b20));
        lbl10.setText(String.valueOf(m10));
        lbl5.setText(String.valueOf(m5));
        lbl2.setText(String.valueOf(m2));
        lbl1.setText(String.valueOf(m1));
    }

    @FXML
    private void limpiarCampos(ActionEvent event) {
        // Limpia la caja de texto y pone todo en 0
        txtDinero.clear();
        lbl500.setText("0"); lbl200.setText("0"); lbl100.setText("0");
        lbl50.setText("0");  lbl20.setText("0");  lbl10.setText("0");
        lbl5.setText("0");   lbl2.setText("0");   lbl1.setText("0");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // No hace falta inicializar nada aquí
    }
}