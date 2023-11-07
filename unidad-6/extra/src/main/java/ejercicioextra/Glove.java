package ejercicioextra;

public class Glove {
  int energy;
  boolean damaged;

  public Glove(int energy) {
    this.energy = energy;
    this.damaged = false;
  }

  public int getEnergy() {
    return energy;
  }

  public void setEnergy(int energy) {
    this.energy = energy;
  }

  public boolean isDamaged() {
    return damaged;
  }

  public void setDamaged(boolean damaged) {
    this.damaged = damaged;
  }

  @Override
  public String toString() {
    return "Glove{" +
        "energy=" + energy +
        ", damaged=" + damaged +
        '}';
  }
}
