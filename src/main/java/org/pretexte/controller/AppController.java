package org.pretexte.controller;

import org.pretexte.repository.PretexteRepository;
import org.pretexte.service.IMenu;
import org.pretexte.service.IService;
import org.pretexte.service.consoleDisplay.Menu;
import java.util.Scanner;
import org.pretexte.repository.IPretexteRepository;
import org.pretexte.service.consoleDisplay.Service;


public class AppController {
    IPretexteRepository c = new PretexteRepository();
    IService services = new Service(c);
    Scanner a = new Scanner(System.in);
    Menu menu = new Menu(services,a );

    public void job(){
        menu.displayMenu();
    }
}
