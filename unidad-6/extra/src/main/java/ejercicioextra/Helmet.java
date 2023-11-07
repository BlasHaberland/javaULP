package ejercicioextra;

public class Helmet {
  Synth synth;
  Console console;


  public Helmet(Synth synth, Console console) {
    this.synth = synth;
    this.console = console;

  }

  public Synth getSynth() {
    return synth;
  }

  public void setSynth(Synth synth) {
    this.synth = synth;
  }

  public Console getConsole() {
    return console;
  }

  public void setConsole(Console console) {
    this.console = console;
  }

  public boolean isDamaged() {
    return this.console.isDamaged() || this.synth.isDamaged();
  }

  public int getEnergy() {
    // if (console.getEnergy() == 0 || synth.getEnergy() == 0 ) return 0;

    return this.console.getEnergy() + this.synth.getEnergy();
  }

  @Override
  public String toString() {
    return "Helmet{" +
        "synth=" + synth +
        ", console=" + console +
        '}';
  }
}
