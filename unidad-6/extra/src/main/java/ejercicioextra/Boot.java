package ejercicioextra;

public class Boot  {
  int energy;
  int energyConsume;
  boolean damaged;

  public Boot(int energy) {
    this.energy = energy;
    this.energyConsume = 1;
    this.damaged = false;
  }

  public int getEnergyConsume() {
    return energyConsume;
  }

  public int getEnergy() {
    return energy;
  }

  public void setEnergy(int energy) {
    this.energy = energy;
  }

  public void setEnergyConsume(int energyConsume) {
    this.energy = energyConsume;
  }

  public boolean isDamaged() {
    return damaged;
  }

  public void setDamaged(boolean damaged) {
    this.damaged = damaged;
  }

  @Override
  public String toString() {
    return "Boot{" +
        "energy=" + energy +
        ", energyConsume=" + energyConsume +
        ", damaged=" + damaged +
        '}';
  }
}
