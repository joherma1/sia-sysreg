package org.sysreg.sia.model;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.sysreg.sia.model.dao.UsuarioDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/applicationContext.xml")
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public class UsuarioTest {
	@Autowired
	private UsuarioDao usuarioDao;

	@Test
	public void testInsertSelect(){
		Usuario user = new Usuario();
		user.setNombre("UsuarioT");
		user.setApellidos("Apellido1T Apellido2T");
		user.setDireccion("DireccionT CodigoPostalT LocalidadT ProvinciaT PaisT");
		user.setTelefono("987654321T");
		user.setDni("12345678T");
		user.setUsuario("usuarioT");
		user.setPassword("passwordT");
		usuarioDao.persist(user);
		Usuario user2 = new Usuario();
		user2.setNombre("UsuarioT2");
		user2.setApellidos("Apellido1T2 Apellido2T");
		user2.setDireccion("DireccionT2 CodigoPostalT2 LocalidadT2 ProvinciaT2 PaisT2");
		user2.setTelefono("987654321T2");
		user2.setDni("12345678T2");
		user2.setUsuario("usuarioT2");
		user2.setPassword("passwordT2");
		usuarioDao.persist(user2);
		
		Usuario result = usuarioDao.findByUsuario("usuarioT");
		Usuario result2 = usuarioDao.findByUsuario("usuarioT2");
		assertSame(user, result);
		assertNotSame(user, result2);
	}

}
