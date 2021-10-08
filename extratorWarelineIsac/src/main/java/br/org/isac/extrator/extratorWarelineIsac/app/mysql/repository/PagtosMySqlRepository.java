package br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.PagtosWareline;

@Transactional
public interface PagtosMySqlRepository extends JpaRepository<PagtosWareline, Integer> {
	
	@Modifying
	@Query("delete from PagtosWareline u where u.mescomp = ?1")
	public void deletePagamentosMesCompetencia(@Param("mescomp") String mesComp);

}
