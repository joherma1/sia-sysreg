package org.sysreg.sia.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.sysreg.sia.model.Campo;
import org.sysreg.sia.model.Comarca;
import org.sysreg.sia.model.Municipio;
import org.sysreg.sia.model.Parcela;
import org.sysreg.sia.model.ParcelaId;
import org.sysreg.sia.model.Provincia;
import org.sysreg.sia.model.User;
import org.sysreg.sia.model.Uso;
import org.sysreg.sia.model.Usuario;
import org.sysreg.sia.model.dao.CampoDao;
import org.sysreg.sia.model.dao.ComarcaDao;
import org.sysreg.sia.model.dao.MunicipioDao;
import org.sysreg.sia.model.dao.ParcelaDao;
import org.sysreg.sia.model.dao.ProvinciaDao;
import org.sysreg.sia.model.dao.UserDao;
import org.sysreg.sia.model.dao.UsoDao;
import org.sysreg.sia.model.dao.UsuarioDao;

@Controller
public class UserController {

	@Autowired
	private UserDao userDao;

	@Autowired
	private UsoDao usoDao;

	@Autowired
	private ComarcaDao comarcaDao;

	@Autowired
	private ProvinciaDao provinciaDao;

	@Autowired
	private MunicipioDao municipioDao;

	@Autowired
	private UsuarioDao usuarioDao;

	@Autowired
	private ParcelaDao parcelaDao;

	@Autowired
	private CampoDao campoDao;

	@RequestMapping("/users.html")
	public String users(ModelMap models) {
		Provincia p = new Provincia();
		p.setCodigo(46);
		p.setNombre("Valencia");

		Comarca c = new Comarca();
		c.setNombre("L'Horta Sud");
		c.setProvincia(p);

		Municipio m = new Municipio();
		m.setCodigo(46290);
		m.setNombre("Alcasser");
		m.setComarca(c);

		Usuario u = new Usuario();
		u.setNombre("Jose Antonio");
		u.setApellidos("Hernández Martínez");
		u.setDireccion("Ricardo Hernandez 60");
		u.setMunicipio(m);

		Campo camp = new Campo();
		camp.setCodigo(1234);
		camp.setNombre("Campo 1");
		camp.setUsuario(u);

		Parcela parc = new Parcela();
		parc.setMunicipio(m);
		parc.setAgregado(0);
		parc.setZona(0);
		parc.setPoligono(0);
		parc.setParcela(1);
		parc.setSuperficie(2F);
		parc.setCampo(camp);

		// Uso uso = new Uso();
		// uso.setDescripcion("Uso de prueba");
		// usoDao.persist(uso);
		// User u = new User();
		// u.setEnabled(true);
		// u.setPassword("sdfas");
		// u.setUsername("asdf");
		// userDao.persist(u);

		provinciaDao.persist(p);
		comarcaDao.persist(c);
		municipioDao.persist(m);
		usuarioDao.persist(u);
		campoDao.persist(camp);
		System.out.println("Campo Insertado, paso a parcelas");
		parcelaDao.persist(parc);
		models.put("users", userDao.getAllUsers());
		return "users";
	}
}
