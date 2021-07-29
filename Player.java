public class Player {
  public int vida = 10;
  public int ataquePlayer = 1;
  public String nome = "Marcos";

// metódo p. perder vida.

public void perderVida(){
  vida -=1;
}


public void ganharVida(){
  vida +=1;
}

public void playerUsaPotion(){
  vida = 10;
}

}




