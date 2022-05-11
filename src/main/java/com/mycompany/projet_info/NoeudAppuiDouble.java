/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_info;

/**
 *
 * @author Elève
 */
public class NoeudAppuiDouble extends NoeudAppui {
    //constructeurs
    NoeudAppuiDouble(int id, double px, double py, Vecteur2D force){
        super(id, px, py, force);
    }
    //methode to String
    @Override
    public String toString(){
        return("NoeudAppuiDouble "+id+" : x = "+this.px+" y = "+this.py);
    }
}
