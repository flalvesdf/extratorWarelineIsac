package br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.PgDespPG;

public interface PgDespPostGreRepository extends JpaRepository<PgDespPG, Integer> {
	
	/***
	 * SELECT a.numpagto, a.coddesp, a.codcc, a.valor, a.valorperc, a.tipoentra
  FROM "PACIENTE".pgdesp a inner join "PACIENTE".pagtos b on (a.numpagto = b.numpagto) where b.mescomp = '2021/09';
	 * 
	 * @param mesComp
	 * @return
	 */
	
	@Query(value ="SELECT * FROM pgdesp a join pagtos b on (a.numpagto = b.numpagto) where b.mescomp =:mescomp", nativeQuery = true)
	//@Query("select u from PgDespPostGre u inner join PagtosPostGre ue on (u.numpagto = ue.numpagto) where ue.mescomp = ?1")
	public List<PgDespPG> obterPagamentosMesCompetencia(@Param("mescomp") String mesComp);

}
