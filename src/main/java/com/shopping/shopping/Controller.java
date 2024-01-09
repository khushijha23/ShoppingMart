package com.shopping.shopping;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class Controller {

    @FXML
    private Button side_btn_billing;

    @FXML
    private Button side_btn_inventory;

    @FXML
    private Button side_btn_save_exit;

    @FXML
    private AnchorPane billing_pane;

    @FXML
    private AnchorPane inventory_pane;

    @FXML
    private void initialize() {
        // Optional: You can perform initialization tasks here.
    }

    @FXML
    private void toggleVisibility(ActionEvent event) {
        if (event.getSource() == side_btn_billing) {
            if(inventory_pane.isVisible()){
                inventory_pane.setVisible(false);
            }
            billing_pane.setVisible(true);
        } else if (event.getSource() == side_btn_inventory) {
            if(billing_pane.isVisible()){
                billing_pane.setVisible(false);
            }
            inventory_pane.setVisible(true);
        }
    }

    @FXML
    private void saveAndExit(ActionEvent event)
    {
        System.exit(0);
    }

}
