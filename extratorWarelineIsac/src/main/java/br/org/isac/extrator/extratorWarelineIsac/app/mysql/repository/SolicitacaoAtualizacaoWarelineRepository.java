package br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.SolicitacaoAtualizacaoWareline;

public interface SolicitacaoAtualizacaoWarelineRepository extends JpaRepository<SolicitacaoAtualizacaoWareline, Integer> {

	@Query("select u from SolicitacaoAtualizacaoWareline u where u.status = : status order by u.datahorapedido desc")
	public List<SolicitacaoAtualizacaoWareline> obterSolicitacoesPorStatus(@Param("status") String status);
	
	@Query("select u from SolicitacaoAtualizacaoWareline u where u.status = 'P' and u.unidade = :unidade order by u.datahorapedido desc")
	public List<SolicitacaoAtualizacaoWareline> obterSolicitacoesPorStatus(@Param("unidade") Integer unidade);
}
