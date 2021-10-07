package br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.Log;

@Repository
public interface LogRepository extends JpaRepository<Log, Integer> {

}