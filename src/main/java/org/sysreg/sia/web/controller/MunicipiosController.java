package org.sysreg.sia.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.sysreg.sia.model.dao.*;

@Controller
public class MunicipiosController {

    @Autowired
    MunicipioDao municipioDao;

	@RequestMapping("/municipios.html")
	public String municipios(ModelMap models) {
        models.put("municipios",municipioDao.findAll());
		return "municipios";
	}
}
