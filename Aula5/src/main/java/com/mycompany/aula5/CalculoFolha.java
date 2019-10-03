
package com.mycompany.aula5;

public class CalculoFolha {
    
    private double calculaINSS (double salario)
    {
        if (salario <= 1339.12) return (salario*0.08);
        if (salario <= 2331.88) return (salario*0.09);
        if (salario <= 4663.75) return (salario*0.11);
        
        return 513.01;
    }
    
    private double calculaFGTS (double salario)
    {
        return (salario*0.08);
    }
    
    private double calculaIRRF (double salario)
    {
        if (salario >= 1903.99 && salario <= 2826.65) return (salario*0.075);
        if (salario >= 2826.66 && salario <= 3751.05) return (salario*0.15);
        if (salario >= 3751.06 && salario <= 4664.68) return (salario*0.225);
        if (salario >= 4664.69) return (salario*0.275);
        
        return 0;
    }
    
     public void salarioLiquido(double salario)
    {
        if (salario == 0)
        {
            System.out.println("Informe seu salario bruto primeiro");
        }
        System.out.println("Seu salario liquido é: R$ " + (salario - (calculaINSS(salario) + calculaFGTS(salario) + calculaIRRF(salario))));
    }
    
}
