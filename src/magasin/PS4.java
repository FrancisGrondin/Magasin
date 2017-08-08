package magasin;

/**
 *
 * @author franc
 */
public class PS4 extends Jeux {
    
    public PS4(){
        super("",0,"");
    }
    
    public PS4(String codeBarre, double prix, String nom){
        super(codeBarre, prix, nom);
    }
    
    @Override
    public String toString(){
        return "*Jeux*= CODE : "+this.codeBarre+", PRIX : "+this.prix+", NOM : "+this.nom+" TYPE : PS4";
    }
    
}
