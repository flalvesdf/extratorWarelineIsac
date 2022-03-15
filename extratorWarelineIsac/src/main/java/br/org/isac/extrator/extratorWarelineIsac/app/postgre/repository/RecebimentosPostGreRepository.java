package br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.RecebimentosPostGre;

public interface RecebimentosPostGreRepository extends JpaRepository<RecebimentosPostGre, Integer> {
	
	@Query("SELECT a from RecebimentosPostGre a where year(a.datemissao) = ?1 and mounth(a.datemissao) = ?2 and a.codfilial = ?3")
	public List<RecebimentosPostGre> obterRecebimentosWarelinePorMesCompetencia(Integer ano, Integer mes, String codfilial);

}
