package magasin;

/**
 *
 * @author franc
 */
public class Tablette extends Electronique {
    
    public Tablette(){
        super("",0,"");
    }
    
    public Tablette(String codeBarre, double prix, String fabriquant){
        super(codeBarre, prix, fabriquant);
    }
    
    @Override
    public String toString(){
        return "*Electronique*= CODE : "+this.codeBarre+", PRIX : "+this.prix+", FABRIQUANT : "+this.fabriquant+" TYPE : Tablette";
    }
}
