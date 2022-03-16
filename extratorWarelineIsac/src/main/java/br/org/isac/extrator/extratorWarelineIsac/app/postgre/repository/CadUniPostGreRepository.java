package br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.CadUniPG;

public interface CadUniPostGreRepository extends JpaRepository<CadUniPG, String> {

}
