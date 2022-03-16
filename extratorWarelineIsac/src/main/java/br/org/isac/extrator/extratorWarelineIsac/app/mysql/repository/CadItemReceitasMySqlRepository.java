package br.org.isac.extrator.extratorWarelineIsac.app.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.isac.extrator.extratorWarelineIsac.app.mysql.entity.CadItemReceitasMySql;

public interface CadItemReceitasMySqlRepository extends JpaRepository<CadItemReceitasMySql, Integer> {
	
}
