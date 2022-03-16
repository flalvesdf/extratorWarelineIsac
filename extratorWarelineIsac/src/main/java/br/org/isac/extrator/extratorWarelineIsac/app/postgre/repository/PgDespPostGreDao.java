package br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.PgDespPG;

@Repository
public class PgDespPostGreDao {
	
	@PersistenceContext
    private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<PgDespPG> getPagamentosMesCompetencia(String mescomp, String codfilial) {
		
		List<PgDespPG> results = null;
		try {
			results = em.createQuery("SELECT a from PgDespPostGre a inner join PagtosPostGre b on (a.numpagto = b.numpagto) where b.mescomp = :mescomp and b.codfilial = :codfilial")
					.setParameter("mescomp", mescomp)
					.setParameter("codfilial", codfilial)
					.getResultList();
		} catch (Exception e) {
			//e.printStackTrace();
		}
		
		return results;
	}
}