package br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.RecebimentosPostGre;

public interface RecebimentosPostGreRepository extends JpaRepository<RecebimentosPostGre, Integer> {
	
	
	/*
	 * 
	 * SELECT numrecebto, tipodoc, numnffat, numreciboa, numrecibov, numdoc, 
       codfilial, codconv, nomecli, nomeresp, portador, observa, datemissao, 
       datdigita, codope, dataultatu, codopeatu, codcondpg, parcelas, 
       valortot, codmoeda, tipocobr, posicao, contabinc, codeveninc, 
       contabbai, codevenbai, fluxo, provisiona, mesiniprov, mesfimprov, 
       valoradian, dataadian, valorglosa, dataglosas, valororig, valirrf, 
       valiss, valinss, valcofins, valpis, valcsll, valcpc, valicms, 
       numrecibo, cpfresp, qtd1, codpac, codbansuge, formasuge, numsolver, 
       traspaso, numprojeto, classidoc, numatend, codorcaf, mesorcaf, 
       matriz, idcontapac
  FROM "PACIENTE".recebtos where extract(year from datemissao) = 2022 and extract(month from datemissao) = 1
	 */
	
	@Query(value = "SELECT a.* from recebtos a where extract(year from a.datemissao) = ?1 and extract(month from a.datemissao) = ?2 and a.codfilial = ?3", nativeQuery = true)
	public List<RecebimentosPostGre> obterRecebimentosWarelinePorMesCompetencia(Integer ano, Integer mes, String codfilial);
	
	@Query(value = "SELECT a.* from recebtos a where a.codfilial = ?1", nativeQuery = true)
	public List<RecebimentosPostGre> obterRecebimentosWarelineTodos(String codfilial);

}
