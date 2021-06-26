/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxmvc;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author user
 */
public class FXMLMainController implements Initializable {

    @FXML
    private BorderPane bp;
    @FXML
    private AnchorPane ap;

    /**
     * Initializes the controller class.
     * @param url
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void home(MouseEvent event) {
        bp.setCenter(ap);
    }

    @FXML
    private void page1(MouseEvent event) {
        loadPage("page1.fxml");
    }

    @FXML
    private void page2(MouseEvent event) {
        loadPage("page2.fxml");
    }

    @FXML
    private void page3(MouseEvent event) {
        loadPage("page3.fxml");
    }

    @FXML
    private void page4(MouseEvent event) {
        loadPage("page4.fxml");
    }

    @FXML
    private void page5(MouseEvent event) {
        loadPage("page5.fxml");
    }

    @FXML
    private void page6(MouseEvent event) {
        loadPage("page6.fxml");
    }
    
    private void loadPage(String page){
        Parent root = null;
        
         
        try {
            root =javafx.fxml.FXMLLoader.load(getClass().getResource(page));
        } catch (IOException ex) {
            Logger.getLogger(FXMLMainController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        bp.setCenter(root);
    }
    
}
