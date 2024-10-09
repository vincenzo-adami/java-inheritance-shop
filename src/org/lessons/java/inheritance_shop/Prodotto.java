package org.lessons.java.inheritance_shop;

import java.util.Random;

public class Prodotto {

  private int codice;
  private String nome;
  private String marca;
  private double prezzo;
  private double iva;

  Prodotto(String nome, String marca, double prezzo, double iva) {
    Random numRandom = new Random();
    codice = numRandom.nextInt(Integer.MAX_VALUE);
    setIva(iva);
    setNome(nome);
    setMarca(marca);
    setPrezzo(prezzo);
  }

  public int getCodice() {
    return codice;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getMarca() {
    return marca;
  }

  public void setPrezzo(double prezzo) {
    this.prezzo = prezzo;
  }

  public double getPrezzo() {
    return prezzo;
  }

  public void setIva(double iva) {
    if (iva == 0.04 || iva == 0.05 || iva == 0.1 || iva == 0.22) {
      this.iva = iva;
    } else {
      System.out.println("Valore d'iva inesistente, inserirne un altro");
    }
  }

  public double getIva() {
    return iva;
  }

  public String getPrezzoIvato() {
    return String.format("%.2f", (prezzo + (prezzo * iva)));
  }

  public String getNomeEsteso() {
    return codice + "-" + nome;
  }

  @Override
  public String toString() {
    return String.format("Il prodotto %s, della marca %s, costa €%s", getNomeEsteso(), getMarca(), getPrezzoIvato());
  }

}
