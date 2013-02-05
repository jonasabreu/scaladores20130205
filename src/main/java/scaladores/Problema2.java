package scaladores;

import java.util.ArrayList;
import java.util.List;

import scala.actors.threadpool.Arrays;

public class Problema2 {

  public static void main(String[] args) {

    List<String> list = Arrays.asList(new String[] { "java", "é", "muito", "muito", "muito", "muito", "chato" });

    List<String> muitos = new ArrayList<String>();
    for (String string : list) {
      if (string.equals("muito")) {
        muitos.add(string);
      }
    }

    List<String> nada = new ArrayList<String>();
    for (String muito : muitos) {
      if (muito.equals("chato")) {
        nada.add(muito);
      }
    }
  }

}
