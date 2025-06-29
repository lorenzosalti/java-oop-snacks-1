package org.lessons.java.snacks;

import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {

    // STUDENTE
    Studente mario = new Studente("Mario", "Idraulici", 23);
    Studente luigi = new Studente("Luigi", "Idraulici", 21);
    Studente pesca = new Studente("Pesca", "Reali", 22);
    Studente margherita = new Studente("Margherita", "Reali", 20);

    System.out.println(mario.getStudenteInfos());
    System.out.println(luigi.getStudenteInfos());
    System.out.println(pesca.getStudenteInfos());
    System.out.println(margherita.getStudenteInfos());

    // CONTO BANCARIO
    ContoBancario conto1 = new ContoBancario(12345);
    ContoBancario conto2 = new ContoBancario(54321);

    conto1.deposit(new BigDecimal(2000000));
    conto2.deposit(new BigDecimal(15.76));

    System.out.println(conto1.getBalance());
    System.out.println(conto2.getBalance());

    conto1.withdraw(new BigDecimal(5000));
    conto2.withdraw(new BigDecimal(5));

    System.out.println(conto1.getBalance());
    System.out.println(conto2.getBalance());
  }
}
