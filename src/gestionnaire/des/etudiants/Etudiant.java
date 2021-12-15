/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionnaire.des.etudiants;

import java.io.Serializable;

/**
 *
 * @author aziz
 */
public class Etudiant implements Serializable{
    private String nom;
    private String prenom;
    private String email;
    private String adresse;
    private String num_portable;
    private String num_fix;
    private String niveau;
    private Classe classe;

    public Etudiant(String nom, String prenom, String email, String adresse, String num_portable, String num_fix, String niveau, Classe classe) {
        this.nom = nom.toLowerCase();
        this.prenom = prenom.toLowerCase();
        this.email = email;
        this.adresse = adresse;
        this.num_portable = num_portable;
        this.num_fix = num_fix;
        this.niveau = niveau;
        this.classe = classe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNum_portable() {
        return num_portable;
    }

    public void setNum_portable(String num_portable) {
        this.num_portable = num_portable;
    }

    public String getNum_fix() {
        return num_fix;
    }

    public void setNum_fix(String num_fix) {
        this.num_fix = num_fix;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }
    
    @Override
    public String toString() {
        return nom+" "+prenom ;
    }
}
