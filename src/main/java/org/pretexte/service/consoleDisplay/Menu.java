package org.pretexte.service.consoleDisplay;

import org.pretexte.service.IMenu;
import org.pretexte.service.IService;
import java.util.Scanner;


public class Menu implements IMenu {
    private final IService service;
    private final Scanner scanner;

    public Menu(IService service, Scanner scanner){
        this.scanner=scanner;
        this.service=service;
    }

    @Override
    public void displayMenu() {
        System.out.println("1 - Afficher le total confirmé");
        System.out.println("2 - Afficher le total sous traitement");
        System.out.println("3 - Afficher le total guéris");
        System.out.println("4 - Afficher le total des districts touchés");
        System.out.println("5 - Afficher le total de décés");
        System.out.println("6 - Afficher le total des évacués");
        System.out.println("7 - Afficher le total des infectés dans le monde dont le nombre de décès");
        System.out.println("8 - Afficher le total des infectés en Afrique dont le nombre de décès");

        String choix = scanner.next();
        if ("1".equalsIgnoreCase(choix)) {
            service.displayTotalConfirme();
        } else if ("2".equalsIgnoreCase(choix)) {
            service.displayTotalSousTraitement();
        } else if ("3".equalsIgnoreCase(choix)) {
            service.displayTotalGueris();
        } else if ("4".equalsIgnoreCase(choix)) {
            service.displayDistrictsTouches();
        } else if ("5".equalsIgnoreCase(choix)) {
            service.displayTotalDeces();
        } else if ("6".equalsIgnoreCase(choix)) {
            service.displayTotalEvacues();
        } else if ("7".equalsIgnoreCase(choix)) {
            service.displayTotalMonde();
        } else if ("8".equalsIgnoreCase(choix)) {
            service.displayTotalAfrique();
        } else {
            System.out.println("Choix indisponible");
        }
    }
}
