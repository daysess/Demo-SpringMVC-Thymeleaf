package br.com.daysesoares.curso.boot.web.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import br.com.daysesoares.curso.boot.domain.Funcionario;

public class FuncionarioValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Funcionario.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Funcionario func = (Funcionario) target;
		
		if(func.getDataSaida() != null) {
			if( func.getDataSaida().isBefore(func.getDataEntrada()) ){
				errors.rejectValue("dataSaida", "PosteriorDataEntrada.funcionario.dataSaida");
			}
		}
		
	}

}
