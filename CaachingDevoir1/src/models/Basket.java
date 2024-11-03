package models;

public class Basket implements Comparable<Basket> {
    private String marque;
    private String nom;
    private double taille;
    private double prix;

    public Basket(String marque, String nom, double taille, double prix) {
        this.marque = marque;
        this.nom = nom;
        this.taille = taille;
        this.prix = prix;
    }

    public String getMarque() {
        return marque;
    }

    public String getNom() {
        return nom;
    }

    public double getTaille() {
        return taille;
    }

    public double getPrix() {
        return prix;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Marque: " + marque + ", Nom: " + nom + ", Taille: " + taille + ", Prix: " + prix;
    }

    @Override
    public int compareTo(Basket autre) {
        int resultat = Double.compare(this.taille, autre.taille);
        if (resultat == 0) {
            resultat = Double.compare(this.prix, autre.prix);
        }
        return resultat;
    }

}
