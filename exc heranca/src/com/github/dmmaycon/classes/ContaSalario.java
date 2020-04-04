package com.github.dmmaycon.classes;

public class ContaSalario extends Conta {
  private String empresa;
  private int qtdDep = 0;

  public String getEmpresa() {
    return empresa;
  }

  public void setEmpresa(String empresa) {
    this.empresa = empresa;
  }

  public int getQtdDep() {
    return qtdDep;
  }

  public void setQtdDep(int qtdDep) {
    this.qtdDep = qtdDep;
  }

  public void emprestar() {
    System.out.println("Emprestimo não autorizado para este tipo de conta!");
  }

  public void depositar(int vlrDep){
    if (this.getQtdDep() <= 2){
      setQtdDep(qtdDep ++);
    } else {
      System.out.println("* * * Limite de deposito atingido * * *");
    }
  }








}
