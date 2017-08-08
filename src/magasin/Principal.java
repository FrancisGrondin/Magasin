package magasin;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Principal {

    public static ArrayList<Article> getInventaire() {
        ArrayList<Article> inventaire = new ArrayList<>(Arrays.asList(new Veste("V01", 130, "Gris"), new Robe("V02", 85, "Rouge"),
                new Pantalon("V03", 55, "Noir"), new Chemise("V04", 67, "Bleu"), new Jupe("V05", 43, "Bleu"), new Tablette("E01A", 500, "Samsung"),
                new Tablette("E01B", 900, "Apple"), new Ordinateur("E02A", 1600, "Apple"), new Ordinateur("E02B", 950, "Asus"),
                new Telephone("E03A", 1000, "Apple"), new Telephone("E03B", 660, "Sony"), new Telephone("E03C", 350, "Nokia"),
                new Televiseur("E04", 3500, "Samsung"), new PS4("J01", 99, "FIFA16"), new PC("J02", 88, "FIFA16"), new PS4("J03", 79, "AssassinsCreed"),
                new PS4("J04", 75, "Call-Duty"), new nintendo3DS("J05", 67, "Mario"), new xboxOne("J06", 85, "Call-Duty")));

        return inventaire;
    }

    public static double getDouble(String msgErr) {
        double value = 0;
        boolean doubleValid = false;

        while (!doubleValid) {
            String input = sc.next();
            try {
                value = Double.parseDouble(input);
                doubleValid = true;
            } catch (NumberFormatException e) {
                System.out.print(msgErr);
            }
        }

        return value;
    }

    public static void afficherMenu(double budget) {
        System.out.print("\n   *** MENU ***     (budget = "+budget+")\n"
                + "1- Visualiser la liste des articles en stock\n"
                + "2- Visualiser les articles dans votre panier\n"
                + "3- Ajouter un article au panier\n"
                + "4- Supprimer un article du panier\n"
                + "5- Effectuer le paiement\n"
                + "0- Quitter\n"
                + "   [0..5] Option: ");
    }

    public static int getInt(String msgErr) {
        int value = 0;
        boolean intValid = false;

        while (!intValid) {
            String input = sc.next();
            try {
                value = Integer.parseInt(input);
                intValid = true;
            } catch (NumberFormatException e) {
                System.out.print(msgErr);
            }
        }

        return value;
    }

    public static boolean fin() {
        System.out.println("Bye Bye ! nous esperons vous revoir bientot :)");
        return true;
    }

    public static boolean afficherContainer(ArrayList<Article> container) {
        boolean estVide = false;
        if (!container.isEmpty()) {
            for (Article n : container) {
                System.out.println(n);
            }
        } else {
            estVide = true;
        }
        return estVide;
    }

    public static boolean estChaineVide(String chaine) {
        boolean estVide = false;
        if (chaine == null || chaine.compareTo("") == 0) {
            estVide = true;
            System.out.println("La chaine de charactere entre est vide ou null.");
        }

        return estVide;
    }

    public static boolean estChaineAlphaNum(String codeBarre) {
        boolean isFormat = true;
        for (int i = 0; i < codeBarre.length(); i++) {
            if (!isDigit(codeBarre.charAt(i)) && !isLetter(codeBarre.charAt(i))) {
                isFormat = false;
            }
        }

        if (!isFormat) {
            System.out.println("La chaine entre doit etre compose de chiffre ou de lettre.");
        }

        return isFormat;
    }

    public static Article getArticle(ArrayList<Article> inventaire, String codeBarre) {
        Article a = null;
        for (int i = 0; i < inventaire.size(); i++) {
            if (codeBarre.compareToIgnoreCase(inventaire.get(i).getCodeBarre()) == 0) {
                a = inventaire.get(i);
            }
        }
        return a;
    }

    public static String getCodeBarre(String msgRequest) {
        boolean codeBarreValid = false;
        String codeBarre = null;

        while (!codeBarreValid) {
            System.out.println(msgRequest);
            codeBarre = sc.next();
            codeBarreValid = true;
            if (estChaineVide(codeBarre) || !estChaineAlphaNum(codeBarre)) {
                codeBarreValid = false;
            }
        }
        return codeBarre;
    }

    public static void ajouterArticle(Article a, ArrayList<Article> panier) {
        if (a != null) {
            panier.add(a);
            System.out.println("\n"+a + "\nArticle ajoute a votre panier !");
        } else {
            System.out.println("\nCet article n’existe pas en magasin.");
        }
    }

    public static void retirerArticle(Article a, ArrayList<Article> panier) {
        if (a != null) {
            panier.remove(a);
            System.out.println("\n"+a + "\nArticle retire de votre panier !");
        } else {
            System.out.println("\nCet article ne se trouve pas dans votre panier.");
        }
    }

    public static double getCout(ArrayList<Article> panier) {
        double cout = 0;
        for (int i = 0; i < panier.size(); i++) {
            cout = cout + panier.get(i).getPrix();
        }
        return cout;
    }

    public static double paiement(double cout, double budget, ArrayList<Article> panier) {
        if (cout > budget) {
            System.out.println("Vous devez retirer des articles car le cout total de votre panier est de " + cout + ", alors que vous n'avez que " + budget);
        } else {
            System.out.println("Vos articles vous ont coute " + cout + ", vous repartez avec " + (budget - cout) + " ainsi que vos articles");
            for (Article i : panier) {
                System.out.println(i);
            }
            budget = budget - cout;
        }
        return budget;
    }

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Article> panier = new ArrayList<>();
        ArrayList<Article> inventaire = getInventaire();

        System.out.println("**********Bienvenue au centre d'achat NTAA**********");
        System.out.print("Avant de commencer vos achats, inscrivez le montant d'argent que vous voulez depenser chez nous.\n    ($00)($00,00)Montant: $");
        double budget = getDouble("Le montant d'argent a depenser doit etre un entier positif.\n    ($00)($00,00)Montant: $");
        System.out.println("Nous vous souhaitons un agreable magasinage !");

        boolean stop = false;
        while (!stop) {
            afficherMenu(budget);
            int option = getInt("Le choix d'entre du menu doit etre un entier positif.\n   Option: ");
            System.out.println();
            String codeBarre = null;
            Article a = null;

            switch (option) {
                case 0:
                    stop = fin();
                    break;
                case 1:
                    if (afficherContainer(inventaire)) {
                        System.out.println("L'inventaire est vide !");
                    }
                    break;
                case 2:
                    if (afficherContainer(panier)) {
                        System.out.println("Votre panier est vide !");
                    }
                    break;
                case 3:
                    codeBarre = getCodeBarre("Code barre de l'article a ajouter au panier: ");
                    a = getArticle(inventaire, codeBarre);
                    ajouterArticle(a, panier);
                    break;
                case 4:
                    codeBarre = getCodeBarre("Code barre de l'article a retirer du panier: ");
                    a = getArticle(inventaire, codeBarre);
                    retirerArticle(a, panier);
                    break;
                case 5:
                    double cout = getCout(panier);
                    budget = paiement(cout, budget, panier);
                    panier.clear();
                    break;
                default:
                    System.out.println("Erreur : l'option " + option + " n'est pas valide !");
            }
        }
    }
}
