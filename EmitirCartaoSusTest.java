package org.ifpe.beatriz;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.Month;

import org.ifpe.beatriz.exceptions.CPFInvalidException;
import org.junit.jupiter.api.Test;

public class EmitirCartaoSusTest {
	@Test
	public void pacienteValidarSucesso() throws Exception {
	    Paciente paciente = new Paciente();
	    paciente.setNomeCompleto("João Silva");
	    paciente.setCpf("12345678910");
	    paciente.setRg("123456789");
	    paciente.setDataNascimento("20/05/2000");
	    paciente.setOrgaoExpedidor("SSP");
	    paciente.setCep("12345678");
	    paciente.setBairro("Bairro X");
	    paciente.setLogradouro("Rua Y");
	    paciente.setNumeroResidencia("123");
	    paciente.setNumeroTelefone("12345678910");
	    paciente.setEmail("joao.silva@email.com");
	    
	    boolean result = paciente.validar();
	    
	    assertTrue(result);
	}
	
	@Test
	public void testPacienteCPFInvalido() {
	    Paciente paciente = new Paciente();
	    paciente.setNomeCompleto("João da Silva");
	    paciente.setCpf("123456789000");
	    paciente.setRg("123456789");
	    paciente.setDataNascimento("01/01/2000");
	    paciente.setOrgaoExpedidor("SSP");
	    paciente.setCep("12345678");
	    paciente.setBairro("Bairro");
	    paciente.setLogradouro("Rua");
	    paciente.setNumeroResidencia("123");
	    paciente.setNumeroTelefone("1234567890");
	    paciente.setEmail("email@email.com");
	    assertThrows(CPFInvalidException.class , () -> paciente.validar());
	}
}
