package br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.CadPrestWareline;

public interface CadPrestMySqlRepository extends JpaRepository<CadPrestWareline, Integer> {

}
