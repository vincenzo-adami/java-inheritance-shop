package org.lessons.java.inheritance_shop;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Prodotto[] carrello = null;
    String tempNome;
    String tempMarca;
    double tempPrezzo;
    double tempIva;
    Prodotto tempProdotto;

    Scanner scan = new Scanner(System.in);
    System.out.println("Quanti prodotti vuoi inserire nel carrello?");
    carrello = new Prodotto[scan.nextInt()];
    int scelta;
    System.out.println("\nInserisci ora i prodotti nel carrello");
    for (int i = 0; i < carrello.length; i++) {
      System.out.println("Scegli il prodotto da inserire:\n" +
          "- 1 Cuffie\n" +
          "- 2 Smartphone\n" +
          "- 3 Televisori");
      scelta = scan.nextInt();
      scan.nextLine();
      switch (scelta) {
        case 1:
          System.out.println("Inseirisci il nome del prodotto");
          tempNome = scan.nextLine();
          System.out.println("Inseirisci la marca del prodotto");
          tempMarca = scan.nextLine();
          System.out.println("Inseirisci il prezzo base del prodotto");
          tempPrezzo = scan.nextDouble();
          System.out.println("Inseirisci l'iva del prodotto (es.: 0,22)");
          tempIva = scan.nextDouble();
          scan.nextLine();
          System.out.println("Inseirisci il colore del prodotto");
          String colore = scan.nextLine();
          System.out
              .println("Inseirisci se il prodotto è o meno wireless (es. true se wireless, false se con il cavo)");
          boolean wireless = scan.nextBoolean();
          System.out.println("");
          tempProdotto = new Prodotto(tempNome, tempMarca, tempPrezzo, tempIva);
          carrello[i] = new Cuffie(tempProdotto, colore, wireless);

          break;

        case 2:
          System.out.println("Inseirisci il nome del prodotto");
          tempNome = scan.nextLine();
          System.out.println("Inseirisci la marca del prodotto");
          tempMarca = scan.nextLine();
          System.out.println("Inseirisci il prezzo base del prodotto");
          tempPrezzo = scan.nextDouble();
          System.out.println("Inseirisci l'iva del prodotto (es.: 0,22)");
          tempIva = scan.nextDouble();
          System.out.println("Inserisci la memoria del prodotto (es. 120 = 120GB)");
          int memoria = scan.nextInt();
          System.out.println("");
          tempProdotto = new Prodotto(tempNome, tempMarca, tempPrezzo, tempIva);
          carrello[i] = new Smartphone(tempProdotto, memoria);

          break;

        case 3:
          System.out.println("Inseirisci il nome del prodotto");
          tempNome = scan.nextLine();
          System.out.println("Inseirisci la marca del prodotto");
          tempMarca = scan.nextLine();
          System.out.println("Inseirisci il prezzo base del prodotto");
          tempPrezzo = scan.nextDouble();
          System.out.println("Inseirisci l'iva del prodotto (es.: 0,22)");
          tempIva = scan.nextDouble();
          scan.nextLine();
          System.out.println("Inseirisci la dimensioni in pollici prodotto");
          int dimensioni = scan.nextInt();
          System.out
              .println("Inseirisci se il prodotto è o meno smart (es. true se wireless, false se normale)");
          boolean smart = scan.nextBoolean();
          System.out.println("");
          tempProdotto = new Prodotto(tempNome, tempMarca, tempPrezzo, tempIva);
          carrello[i] = new Televisori(tempProdotto, dimensioni, smart);

          break;

        default:
          System.out.println("Selezionato prodotto non valido, valorizzato con prodotto generico");
          System.out.println("");
          carrello[i] = new Prodotto("nome_generico", "marca_generica", 1, 0.22);

      }

    }

    System.out.println("Ecco cosa contiene il tuo carrello");

    for (int i = 0; i < carrello.length; i++) {
      System.out.println(carrello[i]);
    }

  }
}