package br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.PgDespMySql;

public interface PgDespMySqlRepository extends JpaRepository<PgDespMySql, Integer> {
	
	@Query("delete from PgDespMySql u where u.anocompetencia = ?1 and u.mescompetencia = ?2")
	public void deltePagamentosMesCompetencia(@Param("ano") Integer ano, @Param("mes") Integer mes);

}
