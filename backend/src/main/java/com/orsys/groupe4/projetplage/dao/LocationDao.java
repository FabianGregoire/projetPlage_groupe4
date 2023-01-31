package com.orsys.groupe4.projetplage.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.orsys.groupe4.projetplage.business.Location;

@RepositoryRestResource(exported = true)
public interface LocationDao extends JpaRepository<Location, Long> {
	
	@Query(nativeQuery = true, value="Select * from Location l where l.concessionnaire_id=:idCons")
	public List<Location> reservationByIdCons(@Param("idCons") Long idCons);
	
	@Query(nativeQuery = true, value="Select * from Location l where l.statut_id = (select id from statut where nom ='ATraiter') and l.concessionnaire_id=:idCons")
	public List<Location> reservationATraiterByIdCons(@Param("idCons") Long idCons);

}
