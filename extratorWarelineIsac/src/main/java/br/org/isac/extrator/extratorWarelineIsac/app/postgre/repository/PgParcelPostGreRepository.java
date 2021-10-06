package br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.PgParcelPostGre;

public interface PgParcelPostGreRepository extends JpaRepository<PgParcelPostGre, Integer> {
	
	@Query("select u from PgParcelPostGre u inner join PagtosPostGre ue on (u.numpagto = ue.numpagto) where u.mescomp = ?1")
	public List<PgParcelPostGre> obterPagamentosMesCompetencia(String mesComp);

}
