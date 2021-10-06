package br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.PgDespPostGre;

public interface PgDespPostGreRepository extends JpaRepository<PgDespPostGre, Integer> {
	
	@Query("select u from PgDespPostGre u inner join PagtosPostGre ue on (u.numpagto = ue.numpagto) where u.mescomp = ?1")
	public List<PgDespPostGre> obterPagamentosMesCompetencia(String mesComp);

}
