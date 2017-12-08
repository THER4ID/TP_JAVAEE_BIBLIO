/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livres.model;

/**
 *
 * @author Virtual-nicolas
 */
public class User {
    protected String  courriel, motDePasse, nom;
    public String test = "testUtil";

    public User(){
    }

    public User(String mdp, String courriel, String nom) {
        this.motDePasse = mdp;
        this.courriel = courriel;
        this.nom = nom;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public String getCourriel() {
        return courriel;
    }

    public String getNom() {
        return nom;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
