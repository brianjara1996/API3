package com.API3.Veterinario.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.API3.Veterinario.Dao.Consultomascota;
import com.API3.Veterinario.Dao.Consultopersona;
import com.API3.Veterinario.Models.mascota;
import com.API3.Veterinario.Models.persona;

@RestController
public class veterinarioController {
	
	
	@Autowired
	private Consultopersona VeteDao;
	
	@Autowired
	private Consultomascota consuM;
	
	
	
	
	@RequestMapping(value = "api/consulto-persona" , method = RequestMethod.POST)
    public Object consultaP(@RequestBody persona pp){

    	String token =  VeteDao.obtengotoken(pp);
    	
      if(!(token.isEmpty())) {
    	  
    	  return VeteDao.consultoP(pp.getDni() , token);
      }
      
      return null;
    
    }
	
	@RequestMapping(value = "api/consulto-mascota" , method = RequestMethod.POST)
    public Object consultaM(@RequestBody mascota mm){
   	
		String token = consuM.obtengoToken(mm);
		
		if(!(token.isEmpty())) {
			
			return consuM.consultoM(mm.getId(), token);
		}
		
		return null;
    
    }

}
