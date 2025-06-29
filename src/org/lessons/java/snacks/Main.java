package org.lessons.java.snacks;

public class Main {
  public static void main(String[] args) {
    Studente mario = new Studente("Mario", "Idraulici", 23);
    Studente luigi = new Studente("Luigi", "Idraulici", 21);
    Studente pesca = new Studente("Pesca", "Reali", 22);
    Studente margherita = new Studente("Margherita", "Reali", 20);

    System.out.println(mario.getStudenteInfos());
    System.out.println(luigi.getStudenteInfos());
    System.out.println(pesca.getStudenteInfos());
    System.out.println(margherita.getStudenteInfos());
  }
}
