// Inimigo2 herda tudo do inimigo 1
public class Inimigo2 extends Inimigo1{
  // herdando o metodo construtor da classe pai (Inimigo1) na classe filha
  public Inimigo2(int vida){
    super(vida);
    // após criado o construtor no filho devo ir na classe Main.java onde instanciei Inimigo2 elfo = new Inimigo2(10) e passar 10 como valor de vida;
  }
}