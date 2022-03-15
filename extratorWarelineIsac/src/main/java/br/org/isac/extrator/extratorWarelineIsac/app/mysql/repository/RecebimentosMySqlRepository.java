package br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.RecebimentosMySql;

@Transactional
public interface RecebimentosMySqlRepository extends JpaRepository<RecebimentosMySql, Integer> {
	
	@Modifying
	@Query("delete from RecebimentosMySql u where u.mescompetencia = ?1 and u.anocompetencia = ?2 and u.unidade = ?3")
	public void deleteRecebimentosMesCompetencia(Integer mes, Integer ano, Integer unidade);
	
	@Modifying
	@Query("delete from RecebimentosMySql u where u.unidade = ?1")
	public void deleteRecebimentosTodosUnidade(Integer unidade);

}
