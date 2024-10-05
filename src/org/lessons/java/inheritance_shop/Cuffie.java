package org.lessons.java.inheritance_shop;

public class Cuffie extends Prodotto {

  String colore;
  boolean wireless;

  Cuffie(Prodotto prodotto, String colore, boolean wireless) {
    super(prodotto.getNome(), prodotto.getMarca(), prodotto.getPrezzo(), prodotto.getIva());
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

  public boolean isWireless() {
    return wireless;
  }

  public String isWirlessDescription() {
    if (wireless) {
      return "sono wireless!";
    } else {
      return "sono con il cavo";
    }
  }

  @Override
  public String toString() {
    return super.toString() + String.format("\nÈ di colore %s e %s", getColore(), isWirlessDescription());
  }

}
