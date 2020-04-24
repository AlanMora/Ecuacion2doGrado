package com.practica2.web.models.dao;

import org.springframework.stereotype.Repository;

@Repository
public class PojoDaoImpl implements ICalcularPojo {
	public Double CalcularPojo(Double a, Double b, Double c) {
		Double res = 0.0;
		Double resultado = ((b * b ) - (4 * a *c ));
		Double x1, x2;
		if(resultado > 0.0) {	
			return x1 = ((-b+Math.sqrt(resultado))/(2.0*a));		   
		}	
	return res;
		}
	
	public Double CalcularPojo2(Double a, Double b, Double c) {
		Double res = 0.0;
		Double resultado = ((b * b ) - (4 * a *c ));
		Double x1, x2;
		if(resultado > 0.0) {	
			return x1 = ((-b-Math.sqrt(resultado))/(2.0*a));		   
		}	
	return res;
		}
}
