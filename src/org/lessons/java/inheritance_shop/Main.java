package org.lessons.java.inheritance_shop;

public class Main {

  public static void main(String[] args) {
    Prodotto prod1 = new Prodotto("prodotto_generico", "marca_generica", 30, 0.22);
    Prodotto prod2 = new Prodotto("cuffie", "Bose", 450, 0.22);
    Prodotto prod3 = new Prodotto("smarthphone", "Samsung", 850, 0.22);
    Prodotto prod4 = new Prodotto("televisore", "lg", 850, 0.22);

    Cuffie cuffie = new Cuffie(prod2, "rosso", false);
    Smartphone smartphone = new Smartphone(prod3, 16);
    Televisori televisori = new Televisori(prod4, 42, true);

    System.out.println(prod1);

    System.out.println("");
    System.out.println(cuffie);

    System.out.println("");
    System.out.println(smartphone);

    System.out.println("");
    System.out.println(televisori);
  }
}
