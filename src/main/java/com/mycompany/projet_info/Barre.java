/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_info;

/**
 *
 * @author Elève
 */
public class Barre {
    //attributs
    int identificateur;
    Noeud noeudDepart, noeudArrivee;
    double tractionMaximale, compressionMaximale, cout;
    
    //constructeurs
    Barre(int identificateur, Noeud noeudDepart, Noeud noeudArrivee, double tractionMaximale, double compressionMaximale, double cout){
        this.identificateur=identificateur;
        this.noeudDepart=noeudDepart;
        this.noeudArrivee=noeudArrivee;
        this.tractionMaximale=tractionMaximale;
        this.compressionMaximale=compressionMaximale;
        this.cout=cout;
        
    }
    //methode set
    public void setIdentificateur(int identificateur) {
        this.identificateur = identificateur;
    }

    public void setNoeudDepart(Noeud noeudDepart) {
        this.noeudDepart = noeudDepart;
    }

    public void setNoeudArrivee(Noeud noeudArrivee) {
        this.noeudArrivee = noeudArrivee;
    }

    public void setTractionMaximale(double tractionMaximale) {
        this.tractionMaximale = tractionMaximale;
    }

    public void setCompressionMaximale(double compressionMaximale) {
        this.compressionMaximale = compressionMaximale;
    }

    public void setCout(double cout) {
        this.cout = cout;
    }
    
    //methode get
    public int getIdentificateur() {
        return identificateur;
    }

    public Noeud getNoeudDepart() {
        return noeudDepart;
    }

    public Noeud getNoeudArrivee() {
        return noeudArrivee;
    }

    public double getTractionMaximale() {
        return tractionMaximale;
    }

    public double getCompressionMaximale() {
        return compressionMaximale;
    }

    public double getCout() {
        return cout;
    }
    
    //methode toString
    @Override
    public String toString(){
        return("Barre "+identificateur+" : noeud de depart = "+this.noeudDepart+" noeud d'arrivee = "+this.noeudArrivee+" traction maximale = "+this.tractionMaximale+" compression maximale = "+this.compressionMaximale+" cout = "+this.cout);
    }
    
    //methode noeudOppose
    
    //methode angle
}
