/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalinfoapp;

import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIcon;
import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIconView;
//import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

/**
 *
 * @author wojciechkuczer
 */
public class PersonalInfoAppController implements Initializable {
    
    
    
    
    @FXML
    private Label label;
    
    @FXML
    private MaterialDesignIconView btnClose;
    
    
    @FXML
    private void lblCloseMouseEntered(MouseEvent event) {
        btnClose.setFill(Color.RED);   
    }
    
    @FXML
    private void lblCloseMouseExited(MouseEvent event) {
        btnClose.setFill(Color.BLACK);   
    }
    
    @FXML
    private void lblCloseMouseClicked(MouseEvent event) {
        System.exit(0);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
