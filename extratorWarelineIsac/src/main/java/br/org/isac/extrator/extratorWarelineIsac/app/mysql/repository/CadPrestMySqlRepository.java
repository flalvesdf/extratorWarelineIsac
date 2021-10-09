package br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.CadPrestWareline;

@Transactional
public interface CadPrestMySqlRepository extends JpaRepository<CadPrestWareline, Integer> {

	@Modifying
	@Query("delete from CadPrestWareline u where u.unidade = ?1")
	public void deleteCadastroPrestadoresUnidade(Integer unidade); 
}
