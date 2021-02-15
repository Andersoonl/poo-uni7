

class Carro{
  String marca;
  String nome;
  int ano;
  int preco;
  int tanque;

  void andar() {
    

    if (tanque > 100)
      System.out.println("O carro " + nome + " andou 20 quadras...");
      else
        System.out.println("O carro " + nome + " andou 5 quadras...");
  }

}