package br.org.isac.extrator.extratorWarelineIsac.app.postgre.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.org.isac.extrator.extratorWarelineIsac.app.postgre.entity.PgParcelPostGre;

@Repository
public class PgParcelPostGreDao {
	
	@PersistenceContext
    private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<PgParcelPostGre> getPagamentosMesCompetencia(String mescomp) {
		
		List<PgParcelPostGre> results = null;
		try {
			results = em.createQuery("SELECT a from PgParcelPostGre a inner join PagtosPostGre b on (a.numpagto = b.numpagto) where b.mescomp = :mescomp").setParameter("mescomp", mescomp).getResultList();
		} catch (Exception e) {
			//e.printStackTrace();
		}
		
		return results;
	}

}
