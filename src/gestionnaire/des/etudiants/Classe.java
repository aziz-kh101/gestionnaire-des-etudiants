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
public class Classe implements Serializable {
    private String name;

    public Classe(String name) {
        this.name = name.toLowerCase();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name ;
    }
    
    
}
