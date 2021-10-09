package br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.PgDespMySql;

@Transactional
public interface PgDespMySqlRepository extends JpaRepository<PgDespMySql, Integer> {
	
	@Modifying
	@Query("delete from PgDespMySql u where u.anocompetencia = ?1 and u.mescompetencia = ?2")
	public void deletePagamentosMesCompetencia(@Param("ano") Integer ano, @Param("mes") Integer mes);
	
	@Modifying
	@Query("delete from PgDespMySql u where u.anocompetencia = ?1 and u.mescompetencia = ?2 and u.unidade = ?3")
	public void deletePagamentosUnidadeMesCompetencia( Integer ano, Integer mes, Integer unidade);

}
