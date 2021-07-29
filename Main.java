import java.util.ArrayList; // importando ArrayList para trabalharmos com 3 inimigos;
class Main {
  public static void main(String[] args) {

    //instanciando o obj player e o inimigo2
    Player player = new Player ();
    /* Inimigo2 elfo = new Inimigo2 (20);  esse valor está relacionado ao construtor no Inimigo1 e super Inimigo2 que se relaciona com o valor de vida do elfo;deixei comentados pq usaremos Arraylist nos inimigos*/

    //trabalhando com Arraylist de inimigos serão 3 inimigos;
    ArrayList<Inimigo1> inimigos = new ArrayList<Inimigo1>();
    inimigos.add(new Inimigo2(20));
    inimigos.add(new Inimigo2(20));
    inimigos.add(new Inimigo2(20));

    // usando o metodo ganhar vida da Classe Player
    
    player.ganharVida();

    System.out.println("O player ganhou um ponto de vida");
    System.out.println("O player entrou numa batalha com o inimigo elfo que lhe deu 5 ataques, seu dano base é 2 pontos");
    // usando laço de repetição for para simular um ataque ao player
    for(player.vida = player.vida ; player.vida >=1 ; player.vida -=2){
        System.out.println(player.vida);
        if (player.vida == 0) {
        System.out.println("O player morreu");
        }
    }

    // usando metodo da Classe Player para cura-lo;
    player.playerUsaPotion();
    System.out.println("O Player usou uma Poção e se curou sua vida é "+player.vida);

    // trabalhando o inimigo2 para que ele perca vida;
    System.out.println("O player ataca os inimigos elfos");
    /* 
    elfo.inimigoPerderVida();
    System.out.println("A vida do elfo é "+elfo.getvida());
     caso não estivesse usando arraylist e estivesse usando apenas um inimigo,usaria os 2 cód.acima, logo abaixo usaremos o arraylist para selecionar um inimigo e atacalo*/

    // atacando o inimigo de indice 0, o primeiro
    inimigos.get(0).inimigoPerderVida();
    System.out.println("O elfo ainda tem "+inimigos.get(0).vida+ " de vida");

    System.out.println("Os 3 elfos tem de vida :");

    //percorrendo o ArrayList
    for(int i = 0; i<inimigos.size(); i++){
      Inimigo1 inimigoLocal = inimigos.get(i);
      //fazendo inimigo um tomar dano
      if(i==1){
        inimigoLocal.inimigoPerderVida();
        System.out.println(inimigoLocal.vida);
      }else{
        inimigoLocal.inimigoPerderVida();
        System.out.println(inimigoLocal.vida);
      }

    }

    System.out.println("respectivamente");
    
  }
}