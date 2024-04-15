class Data {
  private int dia;
  private int mes;
  private int ano;

  // Construtor
  public Data(int dia, int mes, int ano) {
      this.dia = dia;
      this.mes = mes;
      this.ano = ano;
  }

  // Métodos get
  public int getDia() {
      return dia;
  }

  public int getMes() {
      return mes;
  }

  public int getAno() {
      return ano;
  }

  // Métodos set
  public void setDia(int dia) {
      this.dia = dia;
  }

  public void setMes(int mes) {
      this.mes = mes;
  }

  public void setAno(int ano) {
      this.ano = ano;
  }

  public String formatado() {
      return this.dia + "/" + this.mes + "/" + this.ano;
  }
}
