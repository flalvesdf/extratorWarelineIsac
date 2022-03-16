package br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.PagtosPG;

public interface PagtosPostGreRepository extends JpaRepository<PagtosPG, String> {
	
	
	/***
	 * SELECT a.numpagto, a.tipodoc, a.numentr, a.numdoc, a.codfilial, a.codprest, a.portador, 
       a.observa, a.datemissao, a.datentrada, a.datdigita, a.codope, a.dataultatu, 
       a.codopeatu, a.parcelas, a.valortot, a.nomefornec, a.mescomp, 
       b.tipoprest, b.categprest, b.nomeprest FROM "PACIENTE".pagtos a INNER JOIN "PACIENTE".cadprest b on (a.codprest = b.codprest) 

  where a.mescomp = '2021/09';
	 * @param idUnidade
	 * @return
	 */
	
	@Query("SELECT a from PagtosPG a where a.mescomp =?1 and a.codfilial = ?2")
	public List<PagtosPG> obterPagamentosWarelinePorMesCompetencia(String mesComp, String codfilial);

}
