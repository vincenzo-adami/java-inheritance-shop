package org.lessons.java.inheritance_shop;

import java.util.Random;

public class Smartphone extends Prodotto {

  String imei;
  int memoria; // misurabile in GB

  Smartphone(Prodotto prodotto, int memoria) {
    super(prodotto.getNome(), prodotto.getMarca(), prodotto.getPrezzo(), prodotto.getIva());
    setImei();
    setMemoria(memoria);
  }

  private void setImei() {
    Random rng = new Random();
    long lowerLimit = 0000000000000000L;
    long upperLimit = 9999999999999999L;
    this.imei = Long.toString(rng.nextLong(lowerLimit, upperLimit + 1));
  }

  public String getImei() {
    return this.imei;
  }

  public void setMemoria(int memoria) {
    this.memoria = memoria;
  }

  public int getMemoria() {
    return memoria;
  }

  @Override
  public String toString() {
    return super.toString() + String.format("\nIl suo IMEI è %s, ed ha una capacità di %dGB", getImei(), getMemoria());
  }

}
