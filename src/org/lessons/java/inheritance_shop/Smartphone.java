package org.lessons.java.inheritance_shop;

import java.util.Random;

public class Smartphone extends Prodotto {

  long imei;
  int memoria; // misurabile in GB

  Smartphone(Prodotto prodotto) {
    setImei();
  }

  private void setImei() {
    Random rng = new Random();
    long lowerLimit = 0000000000000000L;
    long upperLimit = 9999999999999999L;
    this.imei = rng.nextLong(lowerLimit, upperLimit + 1);
  }

  public long getImei() {
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
    return String.format("Il prodotto %s, della marca %s,costa  €%s. \nIl suo IMEI è %d, è una capacità di %dGB",
        getNomeEsteso(), getMarca(), getPrezzoIvato(), getImei(), getMemoria());
  }

}
