package magasin;

/**
 *
 * @author franc
 */
public class Vetement extends Article {
    
    protected String couleur;
    
    public Vetement(){
        super("",0);
        setCouleur("");
    }
    
    public Vetement(String codeBarre, double prix, String couleur){
        super(codeBarre, prix);
        setCouleur(couleur);
    }
    
    public void setCouleur(String couleur){
        this.couleur = couleur;
    }
    
    public String getCouleur(){
        return couleur;
    }
    
}
