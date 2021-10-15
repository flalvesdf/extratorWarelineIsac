package br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.WarelineServers;

public interface WarelineServersRepository extends JpaRepository<WarelineServers, Integer> {
	
	@Query("select u from WarelineServers u where u.iphost = :ip and u.ativo = 'S' order by u.unidade asc")
	public List<WarelineServers> getServers(@Param("ip") String iphost);
	
	@Query("select u from WarelineServers u where u.unidade = :unidade and u.ativo = 'S' order by u.unidade asc")
	public WarelineServers getServerByUnidade(@Param("unidade") Integer unidade);
	
	/***
	 * select pws.schedule from pt_wl_servidores pws where pws.iphost = "10.100.8.14" and pws.ativo = 'S' LIMIT 1
	 */
	@Query(value ="select pws.schedule from pt_wl_servidores pws where pws.iphost = :ip and pws.ativo = 'S' LIMIT 1", nativeQuery = true)
	public String getServerScheduled(@Param("ip") String ip);
	
}
