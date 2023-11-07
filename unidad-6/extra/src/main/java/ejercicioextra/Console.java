package ejercicioextra;

public class Console {
  int energy;
  boolean damaged;

  public Console(int energy) {
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
    return "Console{" +
        "energy=" + energy +
        ", damaged=" + damaged +
        '}';
  }
}
