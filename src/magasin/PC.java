package magasin;

/**
 *
 * @author franc
 */
public class PC extends Jeux{
    
    public PC(){
        super("",0,"");
    }
    
    public PC(String codeBarre, double prix, String nom){
        super(codeBarre, prix, nom);
    }
    
    @Override
    public String toString(){
        return "*Jeux*= CODE : "+this.codeBarre+", PRIX : "+this.prix+", NOM : "+this.nom+" TYPE : PC";
    }
    
}
