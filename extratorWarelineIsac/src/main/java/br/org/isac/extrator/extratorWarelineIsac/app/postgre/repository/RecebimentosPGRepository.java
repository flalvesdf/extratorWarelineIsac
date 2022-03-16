package br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.RecebimentosPG;

public interface RecebimentosPGRepository extends JpaRepository<RecebimentosPG, Integer> {
	
	
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
	public List<RecebimentosPG> obterRecebimentosWarelinePorMesCompetencia(Integer ano, Integer mes, String codfilial);
	
	@Query(value = "SELECT a.* from recebtos a where a.codfilial = ?1", nativeQuery = true)
	public List<RecebimentosPG> obterRecebimentosWarelineTodos(String codfilial);
	
	
	/**
	 * select 
		R1.numrecebto, 
		R1.numrecibo,
		R1.tipodoc, 
		R1.numdoc,
		R1.codfilial,
		R1.codconv,
		R1.nomecli, 
		R1.nomeresp,
		R1.observa, 
		R1.codope, 
		R1.datemissao, 
		R1.datdigita, 
		R1.dataadian,
		R3.datavencto, 
		R3.dataprev,
		R3.datrecebto, 
		R1.dataglosas,
		R1.mesiniprov, 
		R1.mesfimprov, 
		extract(year from R3.datrecebto) as anorecebimento,
		extract(month from R3.datrecebto) as mesrecebimento,
		extract(day from R3.datrecebto) as diarecebimento,
		R1.valoradian, 
		R1.valorglosa, 
		R1.valororig, 
		R1.valortot,
		R2.valor, 
		R3.valorvenc,
		R3.vlrecebido,
		R4.codgrurc,
		R5.descgrurc,
		R2.codrece, 
		R4.descrirece 
		
		
		from recebtos R1 
		inner join rcrece R2 on (R1.numrecebto = R2.numrecebto)
		inner join rcparcel R3 on (R1.numrecebto = R3.numrecebto) 
		inner join cadrece R4 on (R2.codrece = R4.codrece)
		inner join cadgrurc R5 on (R4.codgrurc = R5.codgrurc)
		
		where
		
		extract(year from R1.datemissao)  = 2021 and
		extract(month from R1.datemissao)  = 1 and 
		R1.codfilial = '01' and R1.tipodoc = '20'
		
		order by R3.datrecebto desc
	 */
	@Query(value="select "
			+ "		R1.numrecebto, "
			+ "		R1.numrecibo,"
			+ "		R1.tipodoc, "
			+ "		R1.numdoc,"
			+ "		R1.codfilial,"
			+ "		R1.codconv,"
			+ "		R1.nomecli, "
			+ "		R1.nomeresp,"
			+ "		R1.observa, "
			+ "		R1.codope, "
			+ "		R1.datemissao, "
			+ "		R1.datdigita, "
			+ "		R1.dataadian,"
			+ "		R3.datavencto, "
			+ "		R3.dataprev,"
			+ "		R3.datrecebto, "
			+ "		R1.dataglosas,"
			+ "		R1.mesiniprov, "
			+ "		R1.mesfimprov, "
			+ "		extract(year from R3.datrecebto) as anorecebimento,"
			+ "		extract(month from R3.datrecebto) as mesrecebimento,"
			+ "		extract(day from R3.datrecebto) as diarecebimento,"
			+ "		R1.valoradian, "
			+ "		R1.valorglosa, "
			+ "		R1.valororig, "
			+ "		R1.valortot,"
			+ "		R2.valor, "
			+ "		R3.valorvenc,"
			+ "		R3.vlrecebido,"
			+ "		R4.codgrurc,"
			+ "		R5.descgrurc,"
			+ "		R2.codrece, "
			+ "		R4.descrirece "
			+ "		from recebtos R1 "
			+ "		inner join rcrece R2 on (R1.numrecebto = R2.numrecebto) "
			+ "		inner join rcparcel R3 on (R1.numrecebto = R3.numrecebto) "
			+ "		inner join cadrece R4 on (R2.codrece = R4.codrece)"
			+ "		inner join cadgrurc R5 on (R4.codgrurc = R5.codgrurc)"
			+ "		where"
			+ "		extract(year from R1.datemissao)  = ?1 and "
			+ "		extract(month from R1.datemissao)  = ?2 and "
			+ "		R1.codfilial = ?3 and R1.tipodoc = '20' "
			+ "		order by R3.datrecebto desc ", nativeQuery = true)
	public List<Object[]> getRecebimentosPorMesAno(Integer ano, Integer mes, String codFilial);
	
	@Query(value="select "
			+ "		R1.numrecebto, "
			+ "		R1.numrecibo,"
			+ "		R1.tipodoc, "
			+ "		R1.numdoc,"
			+ "		R1.codfilial,"
			+ "		R1.codconv,"
			+ "		R1.nomecli, "
			+ "		R1.nomeresp,"
			+ "		R1.observa, "
			+ "		R1.codope, "
			+ "		R1.datemissao, "
			+ "		R1.datdigita, "
			+ "		R1.dataadian,"
			+ "		R3.datavencto, "
			+ "		R3.dataprev,"
			+ "		R3.datrecebto, "
			+ "		R1.dataglosas,"
			+ "		R1.mesiniprov, "
			+ "		R1.mesfimprov, "
			+ "		extract(year from R3.datrecebto) as anorecebimento,"
			+ "		extract(month from R3.datrecebto) as mesrecebimento,"
			+ "		extract(day from R3.datrecebto) as diarecebimento,"
			+ "		R1.valoradian, "
			+ "		R1.valorglosa, "
			+ "		R1.valororig, "
			+ "		R1.valortot,"
			+ "		R2.valor, "
			+ "		R3.valorvenc,"
			+ "		R3.vlrecebido,"
			+ "		R4.codgrurc,"
			+ "		R5.descgrurc,"
			+ "		R2.codrece, "
			+ "		R4.descrirece "
			+ "		from recebtos R1 "
			+ "		inner join rcrece R2 on (R1.numrecebto = R2.numrecebto) "
			+ "		inner join rcparcel R3 on (R1.numrecebto = R3.numrecebto) "
			+ "		inner join cadrece R4 on (R2.codrece = R4.codrece)"
			+ "		inner join cadgrurc R5 on (R4.codgrurc = R5.codgrurc)"
			+ "		where"
			+ "		extract(year from R1.datemissao)  = ?1 and "
			+ "		R1.codfilial = ?2 and R1.tipodoc = '20' "
			+ "		order by R3.datrecebto desc ", nativeQuery = true)
	public List<Object[]> getRecebimentosPorAno(Integer ano, String codFilial);
	
}
