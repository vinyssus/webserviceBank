package com.projet.microserviceBank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.microserviceBank.entity.Compte;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long>{

}
