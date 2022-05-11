/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_info;

/**
 *
 * @author Elève
 */
public class Noeud {
    //attributs
    public int id;
    public double px;
    public double py;
    Vecteur2D force; 
    
    //constructeurs
    Noeud(int id, double px, double py, Vecteur2D force){
        this.id = id;
        this.px = px;
        this.py = py;
        this.force = force;
    }
    
    Noeud(double px, double py, Vecteur2D force){
        this.px = px;
        this.py = py;
        this.force = force;
        id = -1;
    }
    
    Noeud(double px, double py){
        this.px = px;
        this.py = py;
        id = -1;
        force = new Vecteur2D(0,0);
    }
    
    //methode get et set
    public Vecteur2D getForce(){
        return(this.force);
    }
    public double getPx(){
        return (this.px);
    }
    public double getPy(){
        return (this.py);
    }
    public void setForce(Vecteur2D force){
        System.out.println("Entrez fx");
        double fx = Lire.d();
        System.out.println("Entrez fy");
        double fy = Lire.d();
        this.force = new Vecteur2D(fx, fy);
    }
    public void setId(int id){
        System.out.println("Entrez l'identifiant du noeud");
        this.id = Lire.i();
    }
    public void setPx(double x){
        System.out.println("Entrez la valeur de x");
        this.px = Lire.d();
    }
    public void setPy(double y){
        System.out.println("Entrez la valeur de y");
        this.py = Lire.d();
    }
    
    //methode to String
    @Override
    public String toString(){
        return("Noeud "+id+" : x = "+this.px+" y = "+this.py);
    }
   
    //methode pour entrer un noeud
    //methode a modifier pour permettre à l’utilisateur d’indiquer le type du nœud qu’il souhaite créer, puis ses caractéristiques, et crée un objet du type correspondant
    public double entreeNoeud(){
        System.out.println("Indiquer le type de noeud");
        System.out.println("Entrer l'identifiant du noeud");
        id = Lire.i();
        System.out.println("Entrez l'abscisse du noeud");
        px = Lire.d();
        System.out.println("Entrez l'ordonnee du noeud");
        py = Lire.d();
        return 0;
    }
}
