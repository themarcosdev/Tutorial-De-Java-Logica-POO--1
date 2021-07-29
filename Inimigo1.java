public class Inimigo1 {
  public int vida = 20;
  public String tipo = "Tipo Elf";
  public int ataque = 2;

  // método para retorno da vida
  public int getvida(){
    return vida;
  }

// obs como estou definindo dentro do metodo vida --; devo usar public void, caso use public int resultará em erro, se atentem nisso;
  public void inimigoPerderVida(){
    vida--;
  }


   // caso seja preciso trocar alguns valores do inimigo criamos esses construtor, e como resultará em erro, pois essa classe é a pai de outra, precisamos adcionar esse construtor na classe filha, Inimigo2;
  public Inimigo1( int vida){
    this.vida = vida;
  }






}