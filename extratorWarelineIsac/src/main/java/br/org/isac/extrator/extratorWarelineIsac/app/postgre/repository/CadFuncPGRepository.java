package br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.CadFuncPG;

@Repository
public interface CadFuncPGRepository extends JpaRepository<CadFuncPG, Integer> {

}
