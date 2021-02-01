package org.elle.gestioncompte;

import org.elle.gestioncompte.entitis.Client;
import org.elle.gestioncompte.entitis.Compte;
import org.elle.gestioncompte.repository.ClientRep;
import org.elle.gestioncompte.repository.ComptRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestioncompteApplication implements CommandLineRunner {
    @Autowired
    private ClientRep clientRep;
    @Autowired
    private ComptRep comptRep;
    public static void main(String[] args) {
        SpringApplication.run(GestioncompteApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Compte C1 = comptRep.save(new Compte(null,5000,null));
        Compte C2 = comptRep.save(new Compte(null,3000,null));
        Compte C3 = comptRep.save(new Compte(null,2000,null));

        clientRep.save(new Client(null,"BL12395","BERRADA","ILHAM",060000000,C1));
        clientRep.save(new Client(null,"VM15672","Med","SARA",060000000,C2));
        clientRep.save(new Client(null,"kh15489","ELASSAB","Youssef",060000000,C3));
    }
}
