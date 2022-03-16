package br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.RecebimentosWareline;

@Transactional
public interface RecebimentosWarelineRepository extends JpaRepository<RecebimentosWareline, Integer> {
	
	@Modifying
	@Query("delete from RecebimentosWareline u where u.mesrecebimento = ?1 and u.anorecebimento = ?2 and u.unidade = ?3")
	public void deleteRecebimentosMesCompetencia(Integer mes, Integer ano, Integer unidade);
	
	@Modifying
	@Query("delete from RecebimentosWareline u where u.unidade = ?1")
	public void deleteRecebimentosTodosUnidade(Integer unidade);
	
	@Modifying
	@Query("delete from RecebimentosWareline u where u.unidade = ?1 and u.anorecebimento = ?2")
	public void deleteRecebimentosAnoUnidade(Integer unidade, Integer ano);

}
