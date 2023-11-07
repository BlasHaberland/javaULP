package ejercicioextra;

public class Synth {
  int energy;
  boolean damaged;

  public Synth(int energy) {
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
    return "Synth{" +
        "energy=" + energy +
        ", damaged=" + damaged +
        '}';
  }
}
