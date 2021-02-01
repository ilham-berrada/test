package org.elle.gestioncompte.repository;

import org.elle.gestioncompte.entitis.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComptRep extends JpaRepository<Compte,Long> {
}
