package org.lessons.java.inheritance_shop;

public class Cuffie extends Prodotto {

  String colore;
  boolean wireless;

  Cuffie(Prodotto prodotto, String colore, boolean wireless) {
    this.colore = colore;
    this.wireless = wireless;
  }

  public void setColore(String colore) {
    this.colore = colore;
  }

  public String getColore() {
    return colore;
  }

  public void setWireless(boolean wireless) {
    this.wireless = wireless;
  }

  public String getWirless() {
    if (wireless) {
      return "sono wireless!";
    } else {
      return "sono con il cavo";
    }
  }

  @Override
  public String toString() {
    return String.format("Il prodotto %s, della marca %s,costa  €%s. \nÈ di colore %s\" e %s",
        getNomeEsteso(), getMarca(), getPrezzoIvato(), getColore(), getWirless());
  }

}
