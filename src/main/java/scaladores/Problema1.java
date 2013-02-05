package scaladores;

import java.util.ArrayList;
import java.util.List;

import scala.actors.threadpool.Arrays;

public class Problema1 {

  @SuppressWarnings("unchecked")
  public static void main(String[] args) {
    List<String> list = Arrays.asList(
        new String[] { "java", "é", "muito", "muito", "muito", "muito", "chato" });

    List<Integer> hashcodes = new ArrayList<Integer>();
    for (String string : list) {
      hashcodes.add(string.hashCode());
    }

    List<Integer> hashesOfhashes = new ArrayList<Integer>();
    for (Integer hash : hashcodes) {
      hashcodes.add(hash.hashCode());
    }
  }
}
