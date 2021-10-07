package br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.PagtosWareline;

public interface PagtosMySqlRepository extends JpaRepository<PagtosWareline, Integer> {
	
	@Query("delete u from PagtosWareline u where u.mescomp = ?1")
	public void deletePagamentosMesCompetencia(@Param("mescomp") String mesComp);

}
