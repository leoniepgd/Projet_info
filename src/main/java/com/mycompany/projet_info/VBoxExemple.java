/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_info;

import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

/**
 *
 * @author Elève
 */
public class VBoxExemple extends VBox{
    public VBoxExemple() {
        for(Button b : Composition.desBoutons()) {
        this.getChildren().add(b);
        }
    }
}

