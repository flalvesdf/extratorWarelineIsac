package br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.CadFuncWareline;

@Transactional
public interface CadFuncMySqlRepository extends JpaRepository<CadFuncWareline, Integer> {
	
	@Modifying
	@Query("delete from CadFuncWareline u where u.unidade = ?1")
	public void deleteCadastroFuncionariosUnidade(Integer unidade); 

}
