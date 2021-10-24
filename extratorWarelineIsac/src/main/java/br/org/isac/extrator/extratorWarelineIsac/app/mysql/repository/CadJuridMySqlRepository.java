package br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.CadJuridWareline;

public interface CadJuridMySqlRepository extends JpaRepository<CadJuridWareline, Integer> {
	@Modifying
	@Query("delete from CadJuridWareline u where u.unidade = ?1")
	public void deleteCadastroJuridicoUnidade(Integer unidade); 
}
