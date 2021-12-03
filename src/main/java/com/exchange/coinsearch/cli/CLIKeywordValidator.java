package com.exchange.coinsearch.cli;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;

public class CLIKeywordValidator implements IParameterValidator {

    @Override
    public void validate(String name, String value) throws ParameterException {
           if(!value.matches("^[a-zA-Z]+[0-9]*$")){
               System.err.println("Caracter no permitido");
               throw new ParameterException("solo se aceptan letras y numeros");
           }
    }
}
