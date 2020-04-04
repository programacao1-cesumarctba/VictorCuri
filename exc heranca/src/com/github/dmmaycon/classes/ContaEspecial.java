package com.github.dmmaycon.classes;

public class ContaEspecial extends Conta {

  private double juros;

  public double getJuros() {
    return juros;
  }

  public void setJuros(double juros) {
    this.juros = juros;
  }

  public void emprestar(double vlrEmprestimo) {

      vlrEmprestimo = vlrEmprestimo * getJuros();

      super.setSaldo(super.getSaldo() + vlrEmprestimo);
  }


}
