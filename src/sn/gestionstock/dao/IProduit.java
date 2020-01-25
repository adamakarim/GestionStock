package sn.gestionstock.dao;

import sn.gestionstock.entities.Produit;

import java.util.List;

public interface IProduit {
    public  int add(Produit produit);
    public List<Produit>list();


}
