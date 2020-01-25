package sn.gestionstock.test;

import sn.gestionstock.dao.IProduit;
import sn.gestionstock.dao.ProduitImpl;
import sn.gestionstock.entities.Produit;



public class Test {
    public static void main(String[]args)
    {

       IProduit produitdao = new ProduitImpl();

       Produit produit = new Produit();
       produit.setNom("MACBOOK");
       produit.setQtStock(125);

       int ok = produitdao.add(produit);
       System.out.println(ok);

    }
}
