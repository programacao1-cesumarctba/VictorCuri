package com.github.dmmaycon.main;

import com.github.dmmaycon.classes.Curso;

public class MainCurso {
  public static void main(String[] args) {
    try {
      Curso curso = new Curso();
      curso.setNome("Victor C");
      curso.setProfessor("Maycon");
      curso.setTema("Programação #1");
      curso.setValor(999d);

      System.out.println(String.format("Aluno: %s \n" +
              "Curso: %s \n" +
              "Professor: %s \n" +
              "Valor: %f \n", curso.getNome(), curso.getTema(), curso.getProfessor(), curso.getValor()));

    }catch (Exception e) {
      e.printStackTrace();
    }
  }
}
