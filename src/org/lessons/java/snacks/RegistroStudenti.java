package org.lessons.java.snacks;

import java.util.ArrayList;

public class RegistroStudenti {

  ArrayList<Studente> registro = null;

  protected RegistroStudenti() {
    this.registro = new ArrayList<Studente>();
  }

  public void addStudente(Studente studente) {
    this.registro.add(studente);
  }

  public String getStudenti() {
    String listaStudenti = "";
    for (int i = 0; i < registro.size(); i++) {
      Studente stud = registro.get(i);
      listaStudenti = listaStudenti + stud.getStudenteInfos() + ". ";
    }
    return listaStudenti;
  }
}
