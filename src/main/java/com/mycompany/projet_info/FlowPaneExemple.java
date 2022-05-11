/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_info;

import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;

/**
 *
 * @author Elève
 */
public class FlowPaneExemple extends FlowPane{
    public FlowPaneExemple() {
        this.setPrefWrapLength(230);
        for(Button b : Composition.desBoutons()) {
            this.getChildren().add(b);
        }
    }
}