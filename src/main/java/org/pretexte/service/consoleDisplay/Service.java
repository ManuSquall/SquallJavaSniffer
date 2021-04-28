package org.pretexte.service.consoleDisplay;

import org.pretexte.service.IService;
import org.pretexte.entities.Pretexte;
import org.pretexte.repository.*;

public class Service implements IService{
    public final IPretexteRepository PretexteRepository;

    public Service(IPretexteRepository PretexteRepository){
        this.PretexteRepository=PretexteRepository;
    }

    public void displayTotalConfirme(){
        Pretexte pretexte =PretexteRepository.getPretexte();
        System.out.println("Le total des confirmés est: ");
        System.out.println(pretexte.getTotalConfirmé());
    }

    public void displayTotalSousTraitement(){
        Pretexte pretexte =PretexteRepository.getPretexte();
        System.out.println("Le total des sous traitement est: ");
        System.out.println(pretexte.getTotalSousTraitement());
    }

    public void displayTotalGueris(){
        Pretexte pretexte =PretexteRepository.getPretexte();
        System.out.println("Le total des guéris est: ");
        System.out.println(pretexte.getTotalGueris());
    }

    public void displayDistrictsTouches(){
        Pretexte pretexte =PretexteRepository.getPretexte();
        System.out.println("Le total des districts touchés est: ");
        System.out.println(pretexte.getDistrictsTouches());
    }

    public void displayTotalDeces(){
        Pretexte pretexte =PretexteRepository.getPretexte();
        System.out.println("Le total des décés est: ");
        System.out.println(pretexte.getTotalDeces());
    }

    public void displayTotalEvacues(){
        Pretexte pretexte =PretexteRepository.getPretexte();
        System.out.println("Le total des évacués est: ");
        System.out.println(pretexte.getTotalEvacues());
    }

    public void displayTotalMonde(){
        Pretexte pretexte =PretexteRepository.getPretexte();
        System.out.println("Le total des infectés dans le monde dont le nombre de décès est: ");
        System.out.println(pretexte.getTotalMonde());
    }

    public void displayTotalAfrique(){
        Pretexte pretexte =PretexteRepository.getPretexte();
        System.out.println("Le total des infectés en Afrique dont le nombre de décès est: ");
        System.out.println(pretexte.getTotalAfrique());
    }
}
