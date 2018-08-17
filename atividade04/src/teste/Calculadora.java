/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author Aluno
 */
public class Calculadora {
    
    float salarioAjustado;
    
    public Calculadora(){
        
    }

    public Calculadora(Funcionario f) {
//        if(f.getCargo().equals("DESENVOLVEDOR")){
//            calculaDesenvolvedor(f);
//        } else if (f.getCargo().equals("DBA")){
//            calculaDBA(f);
//        } else if (f.getCargo().equals("TESTADOR")){
//            calculaTestador(f);
//        } else if (f.getCargo().equals("GERENTE")){
//            calculaGerente(f);
//        }
        
    }
    
    public String calculaDesenvolvedor(Funcionario f){
        if(f.getSalario() == 0 ){
            return "salario e nulo";
        }
        if(f.getSalario() >= 3.000f){
            salarioAjustado = f.getSalario() - 20;
            return "Salario: "+ salarioAjustado;
        } else {
            salarioAjustado = f.getSalario() - 10;
            return "Salario: "+ salarioAjustado;
        }
    }
    
    public String calculaDBA(Funcionario f){
        if(f.getSalario() == 0 ){
            return "salario e nulo";
        }
        if(f.getSalario() >= 2.000f){
            salarioAjustado = f.getSalario() - 25;
            return "Salario: "+ salarioAjustado;
        } else {
            salarioAjustado = f.getSalario() - 15;
            return "Salario: "+ salarioAjustado;
        }
    }
    
    public String calculaTestador(Funcionario f){
        if(f.getSalario() == 0 ){
            return "salario e nulo";
        }
        if(f.getSalario() >= 2.000f){
            salarioAjustado = f.getSalario() - 25;
            return "Salario: "+ salarioAjustado;
        } else {
            salarioAjustado = f.getSalario() - 15;
            return "Salario: "+ salarioAjustado;
        }
    }
    
    public String calculaGerente(Funcionario f){
        if(f.getSalario() == 0 ){
            return "salario e nulo";
        }
        if(f.getSalario() >= 5.000f){
            salarioAjustado = f.getSalario() - 30;
            return "Salario: "+ salarioAjustado;
        } else {
            salarioAjustado = f.getSalario() - 20;
            return "Salario: "+ salarioAjustado;
        }
    }
    
}
