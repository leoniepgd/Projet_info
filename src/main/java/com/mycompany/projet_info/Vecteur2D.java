/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_info;

/**
 *
 * @author Elève
 */
public class Vecteur2D {
    //attributs
    double vx, vy;
        
    //constructeurs
    Vecteur2D (double vx, double vy){
        this.vx = vx;
        this.vy = vy;
    }
    
    //methodes get
    public double getVx(){
        return (this.vx);
    }
    public double getVy(){
        return (this.vy);
    }
    
    //methodes set
    public void setVx(double x){
        System.out.println("Entrez l'abscisse du vecteur");
        this.vx = Lire.d();
    }
    public void setVy(double y){
        System.out.println("Entrez l'ordonnee du vecteur");
        this.vy = Lire.d();
    }
    
    //methode to String
    @Override
    public String toString(){
        return("Vecteur v : vx = "+this.vx+"  vy = "+this.vy);
    }
    
    //methode pour rentrer un vecteur
    public void entreeVecteur(){
        System.out.println("Entrer l'abscisse du vecteur");
        vx = Lire.d();
        System.out.println("Entrez l'ordonnee du vecteur");
        vy = Lire.d();
    }
 
}//fin Vecteur2D
