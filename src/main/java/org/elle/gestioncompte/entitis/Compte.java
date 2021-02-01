package org.elle.gestioncompte.entitis;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Compte {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long NumCompte;
    private int Solde;
    @ManyToOne
    private Client clients;
    public void afficher() {
        System.out.println(" numero: " +NumCompte+ ", solde: " +Solde);
    }
}
