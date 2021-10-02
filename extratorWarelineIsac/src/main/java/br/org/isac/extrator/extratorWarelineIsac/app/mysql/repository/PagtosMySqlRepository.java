package br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.PagtosWareline;

public interface PagtosMySqlRepository extends JpaRepository<PagtosWareline, Integer> {

}
