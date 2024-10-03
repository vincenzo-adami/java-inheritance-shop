package org.lessons.java.inheritance_shop;

public class Televisori extends Prodotto {

  int dimensioni; // da valorizzare con i pollici
  boolean smart;

  Televisori(Prodotto prodotto, int dimensioni, boolean smart) {
    super(prodotto.getNome(), prodotto.getMarca(), prodotto.getPrezzo(), prodotto.getIva());
    this.dimensioni = dimensioni;
    this.smart = smart;
  }

  public void setDimensioni(byte dimensioni) {
    this.dimensioni = dimensioni;
  }

  public int getDimensioni() {
    return this.dimensioni;
  }

  public void setSmart(boolean smart) {
    this.smart = smart;
  }

  public boolean isSmart() {
    return smart;
  }

  public String getSmartDescrizione() {
    if (smart) {
      return "è smart!";
    } else {
      return "non è smart";
    }
  }

  @Override
  public String toString() {
    return String.format("Il prodotto %s, della marca %s, costa €%s. \nÈ grande %d\", %s",
        getNomeEsteso(), getMarca(), getPrezzoIvato(), getDimensioni(), getSmartDescrizione());
  }

}
