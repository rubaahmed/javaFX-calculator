/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author reham
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    double r;
    int operation;
   
    @FXML
    private void zero() {
        label.setText(label.getText() + "0");
    }

    @FXML
    private void one() {
        label.setText(label.getText() + "1");
    }

    @FXML
    private void two() {
        label.setText(label.getText() + "2");
    }

    @FXML
    private void three() {
        label.setText(label.getText() + "3");
    }

    @FXML
    private void four() {
        label.setText(label.getText() + "4");
    }

    @FXML
    private void five() {
        label.setText(label.getText() + "5");
    }

    @FXML
    private void six() {
        label.setText(label.getText() + "6");
    }

    @FXML
    private void seven() {
        label.setText(label.getText() + "7");
    }

    @FXML
    private void eight() {
        label.setText(label.getText() + "8");
    }

    @FXML
    private void nine() {
        label.setText(label.getText() + "9");
    }

    @FXML
    private void dot() {
        label.setText(label.getText() + ".");
    }

    @FXML
    private void clear() {
        label.setText("");
    }

    @FXML
    private void positivenegative() {
        operation = 6;

    }

    @FXML
    private void percent() {
        operation = 5;

    }

    @FXML
    private void divide() {
        operation = 4;
        r = Double.parseDouble(label.getText());
        label.setText("");
    }

    @FXML
    private void multiply() {
        operation = 3;
        r = Double.parseDouble(label.getText());
        label.setText("");
    }

    @FXML
    private void subtract() {
        operation = 2;
        r = Double.parseDouble(label.getText());
        label.setText("");
    }

    @FXML
    private void add() {
        operation = 1;
        r = Double.parseDouble(label.getText());
        label.setText("");

    }

    @FXML
    private void sqroot() {
        operation = 7;

    }

    @FXML
    private void power() {
        operation = 8;

    }

    @FXML
    private void PI() {
        operation = 9;
    }

    @FXML
    private void INVERSE() {
        operation = 10;

    }

    @FXML
    private void power2() {
        operation = 11;
        r = Double.parseDouble(label.getText());
        label.setText("");
    }

    @FXML
    private void equal() {
        switch (operation) {
            case 1:
                label.setText(r + Double.parseDouble(label.getText()) + "");
                break;
            case 2:
                label.setText(r - Double.parseDouble(label.getText()) + "");
                break;
            case 3:
                label.setText(r * Double.parseDouble(label.getText()) + "");
                break;
            case 4:
                if (Double.parseDouble(label.getText()) != 0) {
                    label.setText(r / Double.parseDouble(label.getText()) + "");
                    break;
                } else {
                    System.out.println("MATH ERROR");
                    label.setText("MATH ERROR ");
                    break;
                }
            case 5:
                label.setText(Double.parseDouble(label.getText()) / 100.0 + "%");
                break;
            case 6:
                label.setText(Double.parseDouble(label.getText()) * (-1) + "");
                break;
            case 7:
                if (Double.parseDouble(label.getText()) >= 0) {
                    label.setText(Math.sqrt(Double.parseDouble(label.getText())) + "");
                } else {
                    label.setText("MATH ERROR ");
                }
                break;
            case 8:
                label.setText(Math.pow(Double.parseDouble(label.getText()), 2) + "");
                break;
            case 9:
                label.setText(Math.PI + "");
                break;
            case 10:
                label.setText((1 / Double.parseDouble(label.getText())) + "");
                break;
            case 11:
                label.setText(Math.pow(r, Double.parseDouble(label.getText())) + "");
                break;

        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
