package ejercicioextra;

import java.util.Arrays;

public class Armor {
  Boot[] boots;
  Glove[] gloves;
  Helmet helmet;

  public Armor(Boot[] boots, Glove[] gloves, Helmet helmet) {
    this.boots = boots;
    this.gloves = gloves;
    this.helmet = helmet;
  }


  public void walk(int steps) throws DamageException {
    int izq = 0;
    int der = 0;

    Boot boot1 = this.boots[0];
    Boot boot2 = this.boots[1];

      if (isDamaged()){
        System.out.println("Vamos a chequear la bota 1");
        damagePart(boot1);
      }

      if (isDamaged()){
        System.out.println("Vamos a chequear la bota 2");
        damagePart(boot2);
      }


    for (int i = 1; i <= steps ; i +=2) {
      if (boot1.getEnergy() >= boot1.getEnergyConsume()){
        boot1.setEnergy(boot1.getEnergy() - boot1.getEnergyConsume());
        izq++;
      }else {
        // log
        System.out.println("Se quedó sin energía la bota 1");
        continue;
      }

      if (izq + der < steps){
        if (boot2.getEnergy() >= boot2.getEnergyConsume()){
          boot2.setEnergy(boot2.getEnergy() - boot2.getEnergyConsume());
          der++;
        }else {
          // log
          System.out.println("Se quedó sin energía la bota 2");
          break;
        }
      }
    }
    // log
    System.out.println("IZQ: " + izq);
    System.out.println("DER: " + der);
  }

  public void run(int steps) throws DamageException {
    int izq = 0;
    int der = 0;
    int factor = 2;

    Boot boot1 = this.boots[0];
    Boot boot2 = this.boots[1];

    if (isDamaged()){
      System.out.println("Vamos a chequear la bota 1");
      damagePart(boot1);
    }

    if (isDamaged()){
      System.out.println("Vamos a chequear la bota 2");
      damagePart(boot2);
    }


    for (int i = 1; i <= steps ; i +=2) {
      if (boot1.getEnergy() >= boot1.getEnergyConsume() * factor){
        boot1.setEnergy(boot1.getEnergy() - boot1.getEnergyConsume() * factor);
        izq++;
      }else {
        // log
        System.out.println("Se quedó sin energía la bota 1");
        continue;
      }

      if (izq + der < steps){
        if (boot2.getEnergy() >= boot2.getEnergyConsume() * factor){
          boot2.setEnergy(boot2.getEnergy() - boot2.getEnergyConsume() * factor);
          der++;
        }else {
          // log
          System.out.println("Se quedó sin energía la bota 2");
          break;
        }
      }
    }
    // log
    System.out.println("IZQ: " + izq);
    System.out.println("DER: " + der);
  }

  public void propel(int steps) throws  DamageException {
    int izq = 0;
    int der = 0;
    int factor = 3;

    Boot boot1 = this.boots[0];
    Boot boot2 = this.boots[1];

    if (isDamaged()){
      System.out.println("Vamos a chequear la bota 1");
      damagePart(boot1);
    }

    if (isDamaged()){
      System.out.println("Vamos a chequear la bota 2");
      damagePart(boot2);
    }


    for (int i = 1; i <= steps ; i +=2) {
      if (boot1.getEnergy() >= boot1.getEnergyConsume() * factor){
        boot1.setEnergy(boot1.getEnergy() - boot1.getEnergyConsume() * factor);
        izq++;
      }else {
        // log
        System.out.println("Se quedó sin energía la bota 1");
        continue;
      }

      if (izq + der < steps){
        if (boot2.getEnergy() >= boot2.getEnergyConsume() * factor){
          boot2.setEnergy(boot2.getEnergy() - boot2.getEnergyConsume() * factor);
          der++;
        }else {
          // log
          System.out.println("Se quedó sin energía la bota 2");
          break;
        }
      }
    }
    // log
    System.out.println("IZQ: " + izq);
    System.out.println("DER: " + der);
  }

  private <T> void damagePart(T part) throws DamageException {
    try{
    if(part instanceof Boot){
      ((Boot) part).setDamaged(true);
      throw new DamageException("Se dañó una Botita");
    }

    if(part instanceof Glove){
      ((Glove) part).setDamaged(true);
      throw new DamageException("Se dañó un Guante");
    }

    } catch (DamageException e) {
      throw e;
    }
  }

  private boolean isDamaged(){
    double damageValue = 0.3;
    double random = Math.random();

    return random <= damageValue;
  }


  public Boot[] getBoots() {
    return boots;
  }

  public void setBoots(Boot[] boots) {
    this.boots = boots;
  }

  public Glove[] getGloves() {
    return gloves;
  }

  public void setGloves(Glove[] gloves) {
    this.gloves = gloves;
  }

  public Helmet getHelmet() {
    return helmet;
  }

  public void setHelmet(Helmet helmet) {
    this.helmet = helmet;
  }

  @Override
  public String toString() {
    return "Armor{" +
        "boots=" + Arrays.toString(boots) +
        ", gloves=" + Arrays.toString(gloves) +
        ", helmet=" + helmet +
        '}';
  }
}
