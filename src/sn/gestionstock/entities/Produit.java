package sn.gestionstock.entities;

import javax.persistence.*;

@Entity
@Table(name = "Produit")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nom;
    @Column
    private double qtStock;

    public Produit() {
    }

    public int getId() {
        return id;
    }

    public  void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getQtStock() {
        return qtStock;
    }

    public void setQtStock(double qtStock) {
        this.qtStock = qtStock;
    }

    public Produit(String nom, double qtStock) {
        this.nom = nom;
        this.qtStock = qtStock;
    }

}
