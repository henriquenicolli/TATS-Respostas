/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import teste.Calculadora;
import teste.Funcionario;

/**
 *
 * @author Henrique
 */
public class calculadoraTeste {
    
    public calculadoraTeste() {

    }
    
    @Test
    public void testaSalarioVazio(){
        Funcionario desenvolvedor = new Funcionario("func develop", "fun@email", 0, "DESENVOLVEDOR");
        Calculadora c = new Calculadora();
        
        assertEquals("salario e nulo", c.calculaDBA(desenvolvedor));
    }
    
    
}
