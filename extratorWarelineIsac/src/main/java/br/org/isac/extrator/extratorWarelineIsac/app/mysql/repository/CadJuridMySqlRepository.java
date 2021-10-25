package br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.CadJuridWareline;

@Transactional
public interface CadJuridMySqlRepository extends JpaRepository<CadJuridWareline, Integer> {
	@Modifying
	@Query("delete from CadJuridWareline u where u.unidade = ?1")
	public void deleteCadastroJuridicoUnidade(Integer unidade); 
}
