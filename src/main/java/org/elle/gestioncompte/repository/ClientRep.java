package org.elle.gestioncompte.repository;

import org.elle.gestioncompte.entitis.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRep extends JpaRepository<Client,Long> {
    public List<Client> findByNomContains(String nom);
}
