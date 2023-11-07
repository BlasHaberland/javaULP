package ejercicioextra;

public class Main {
  public static void main(String[] args) throws DamageException {

    try {
    Boot[] boots = {new Boot(100), new Boot(100)};

    Glove[] gloves = {new Glove(200), new Glove(200)};

    Synth synth = new Synth(75);
    Console console = new Console(75);

    Helmet helmet = new Helmet(synth, console);

    Armor armor = new Armor(boots, gloves, helmet);

    // System.out.println(armor);

    armor.walk(25);

    //System.out.println(armor);

    }catch (DamageException e) {
      System.out.println(e.getMessage());
    }
  }
}