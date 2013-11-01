package org.sysreg.sia.model;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.sysreg.sia.model.dao.MunicipioDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/applicationContext.xml")
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public class MunicipioTest {
	@Autowired
	private MunicipioDao municipioDao;

	@Test
	public void testSelect() {
		Municipio municipio = municipioDao.findByNombre("Alcàsser");
		assertEquals(46015, municipio.getCodigo());
		assertEquals("L'Horta Sud", municipio.getComarca().getNombre());
		assertEquals("València", municipio.getComarca().getProvincia().getNombre());
		
		assertEquals(12002, municipioDao.findById(12002).getCodigo());
		
		assertEquals(542,municipioDao.findAll().size());
		
	}
}
