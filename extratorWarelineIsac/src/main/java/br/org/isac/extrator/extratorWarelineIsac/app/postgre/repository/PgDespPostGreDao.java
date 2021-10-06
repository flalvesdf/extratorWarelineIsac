package br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.PgDespPostGre;

@Repository
public class PgDespPostGreDao {
	
	@PersistenceContext
    private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<PgDespPostGre> getPagamentosMesCompetencia(String mescomp) {
		
		List<PgDespPostGre> results = null;
		try {
			results = em.createQuery("SELECT a from PgDespPostGre a inner join PagtosPostGre b on (a.numpagto = b.numpagto) where b.mescomp = :mescomp").setParameter("mescomp", mescomp).getResultList();
		} catch (Exception e) {
			//e.printStackTrace();
		}
		
		return results;
	}
}