/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_info;

/**
 *
 * @author Elève
 */
public class NoeudSimple extends Noeud{
    //constructeurs
    NoeudSimple(int id, double px, double py, Vecteur2D force){
        super(id, px, py, force);
    }
    //methode toString
    @Override
    public String toString(){
        return("NoeudSimple "+id+" : x = "+this.px+" y = "+this.py);
    }
}
