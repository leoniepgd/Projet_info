/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_info;

/**
 *
 * @author Elève
 */
public class Test {
    public static void main(String[] args){
        Vecteur2D v;
        double vx, vy, x, y ;
        
        System.out.println("Donner l'abscisse");
        vx = Lire.d();
        System.out.println("Donnez l'ordonnee");
        vy = Lire.d();
        v = new Vecteur2D (vx, vy);
        System.out.println(v.toString());
        
    }
    
}

    