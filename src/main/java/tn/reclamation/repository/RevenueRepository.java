package tn.reclamation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.reclamation.entities.Revenus;

@Repository
public interface RevenueRepository extends JpaRepository<Revenus,Long>{

}
