package br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.PgParcelPG;

public interface PgParcelPostGreRepository extends JpaRepository<PgParcelPG, Integer> {
	
	@Query("select u from PgParcelPostGre u inner join PagtosPostGre ue on (u.numpagto = ue.numpagto) where ue.mescomp = ?1")
	public List<PgParcelPG> obterPagamentosMesCompetencia(String mesComp);

}
