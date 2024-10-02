package org.lessons.java.inheritance_shop;

import java.util.Random;

public class Smartphone extends Prodotto {

  long imei;
  int memoria; // misurabile in GB

  Smartphone() {
    super();
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

}
