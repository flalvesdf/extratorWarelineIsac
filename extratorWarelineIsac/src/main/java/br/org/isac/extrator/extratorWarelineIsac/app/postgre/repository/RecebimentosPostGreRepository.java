package br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.RecebimentosPostGre;

public interface RecebimentosPostGreRepository extends JpaRepository<RecebimentosPostGre, Integer> {
	
	@Query("SELECT a from RecebimentosPostGre a where a.mesiniprov =?1 and a.codfilial = ?2")
	public List<RecebimentosPostGre> obterRecebimentosWarelinePorMesCompetencia(String mesComp, String codfilial);

}
