/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetjava;
import java.util.Scanner;
/**
 *
 * @author noura
 */
public class Menu {
    public static void afficherStock(Categorie[] tabCat, int nbCat, Type[] tabType, int nbTyp, int[] tabQte, Produit[][] stock) {
        System.out.println();
        System.out.println("* Etat du stock:                                             *");
        System.out.println("*                                                            *");
        System.out.println("* Categorie         Type      Qte     id-Pdt      date_exp   *");
        System.out.println("* ---------------------------------------------------------- *");

        for (int i = 0; i < nbCat; i++) {
            System.out.printf(" %-10s\t", tabCat[i].nomCat);
            for (int j = 0; j < nbTyp; j++) {
                if (tabType[j].cat.idCat == tabCat[i].idCat) {
                    System.out.printf("%-10s\t%2d\t", tabType[j].nomType, tabQte[j]);
                    for (int k = 0; k < tabQte[j]; k++) {
                        System.out.printf("%2d\t%2d/%2d/%4d\n", stock[k][j].getId(), stock[k][j].getDate_expiration().getJJ(), stock[k][j].getDate_expiration().getMM(), stock[k][j].getDate_expiration().getAA());
                        System.out.print("                                        ");
                    }
                    System.out.println("\n                ");
                }
            }
            System.out.println();
        }
        System.out.println("* ---------------------------------------------------------- *");
    }
         public static int displayGestionCategories(Scanner scanner) {
        int c;
        System.out.println("* Gestion du Stock/Gestion des categories                    *");
        System.out.println("*  1-Ajout d'une nouvelle categorie                          *");
        System.out.println("*  2-Suppression d'une categorie                             *");
        System.out.println("*  3-Retour menu Gestion du Stock                            *");
        System.out.println("*  4-Retour menu principal                                   *");
        do {
            System.out.print("* >> Tapez votre choix:                                      * ");
            c = scanner.nextInt();
        } while (c != 1 && c != 2 && c != 3 && c != 4 && c != 0);
        return c;
    }

    public static int displayGestionTypes(Scanner scanner) {
        int c;
        System.out.println("* Gestion du Stock/Gestion des types                         *");
        System.out.println("*  1-Ajout d'un nouveau type                                 *");
        System.out.println("*  2-Suppression d'un type                                   *");
        System.out.println("*  3-Retour menu Gestion du Stock                            *");
        System.out.println("*  4-Retour menu principal                                   *");
        do {
            System.out.print("* >> Tapez votre choix:                                      * ");
            c = scanner.nextInt();
        } while (c != 1 && c != 2 && c != 3 && c != 4 && c != 0);
        return c;
    }

    public static int displayGestionProduits(Scanner scanner) {
        int c;
        System.out.println("* Gestion du Stock/Gestion des Produits                      *");
        System.out.println("*  1-Ajout d'un nouveau produit                              *");
        System.out.println("*  2-Suppression d'un produit                                *");
        System.out.println("*  3-Retour menu Gestion du Stock                            *");
        System.out.println("*  4-Retour menu principal                                   *");
        do {
            System.out.print("* >> Tapez votre choix:                                      * ");
            c = scanner.nextInt();
        } while (c != 1 && c != 2 && c != 3 && c != 4 && c != 0);
        return c;
    }

    public static int displayMenuGestion(Scanner scanner) {
        int c;
        System.out.println("* Gestion du Stock                                           *");
        System.out.println("*  1- Gestion des categories                                 *");
        System.out.println("*  2- Gestion des types                                      *");
        System.out.println("*  3- Gestion des produits                                   *");
        System.out.println("*  4- Affichage du Stock                                     *");
        System.out.println("*  5- Retour au menu principal                               *");
        do {
            System.out.print("* >> Tapez votre choix:                                      * ");
            c = scanner.nextInt();
        } while (c != 1 && c != 2 && c != 3 && c != 4 && c != 5 && c != 0);
        return c;
    }

    public static int displayMenuVenteStat(Scanner scanner) {
        int c;
        System.out.println("* Vente et Statistiques                                      *");
        System.out.println("*  1-Vendre un produit                                       *");
        System.out.println("*  2-Statistiques mois                                       *");
        System.out.println("*  3-Statistiques annee                                      *");
        System.out.println("*  4-Retour au menu principal                                *");
        do {
            System.out.print("* >> Tapez votre choix:                                      * ");
            c = scanner.nextInt();
        } while (c != 1 && c != 2 && c != 3 && c != 4 && c != 0);
        return c;
    }

    public static int displayMenu(Scanner scanner) {
        int c;
        System.out.println("* Veuillez choisir une option:                               *");
        System.out.println("*  1- Gestion du Stock                                       *");
        System.out.println("*  2- Vente et Statistiques                                  *");
        do {
            System.out.print("* >> Tapez votre choix:                                      * ");
            c = scanner.nextInt();
        } while (c != 1 && c != 2 && c != 0);
        return c;
    }
}
