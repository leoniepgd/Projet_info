/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projet_info;

/**
 *
 * @author lpageard01
 */
public class Matrice {
    //attributs
    int nbrLig;
    int nbrCol;
    double[][] coeffs;
    
    //Constructeur
    Matrice(int nl, int nc){
        this.nbrLig=nl;
        this.nbrCol=nc;
        this.coeffs= new double[nl][nc];
        for (int i=0; i<nl; i++){
            for (int j =0; j<nc; j++){
                System.out.println("Donnez les coefficients");
                coeffs[i][j]=Lire.d();
            }
        }
    }
    
    //pour creer une matrice
    /*public static void main(String[] args){
        int i,j;
        int nc, nl;
        Matrice m;
        System.out.println("Nombre de ligne");
        nl = Lire.i();
        System.out.println("Nombre de colonne");
        nc = Lire.i();
        m = new Matrice(nl,nc);
        for (i=0; i<nl; i++){
            for (j =0; j<nc; j++){
                System.out.print(m.coeffs[i][j] + " | ");
            }
            System.out.println();
        }
    
    }
    */
}
