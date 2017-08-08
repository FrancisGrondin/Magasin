package magasin;

/**
 *
 * @author franc
 */
public class Televiseur extends Electronique {

    public Televiseur(){
        super("",0,"");
    }
    
    public Televiseur(String codeBarre, double prix, String fabriquant){
        super(codeBarre, prix, fabriquant);
    }
    
    @Override
    public String toString(){
        return "*Electronique*= CODE : "+this.codeBarre+", PRIX : "+this.prix+", FABRIQUANT : "+this.fabriquant+" TYPE : Televiseur";
    }
    
}
