package magasin;

/**
 *
 * @author franc
 */
public class Jeux extends Article{
 
    protected String nom;
    
    public Jeux(){
        super("",0);
        setNom("");
    }
    
    public Jeux(String codeBarre, double prix, String nom){
        super(codeBarre, prix);
        setNom(nom);
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }
    
    public String getNom(){
        return nom;
    }
    
}
