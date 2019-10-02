
package com.mycompany.aula5;

public class CalculoFolha {
    
    public double calculaINSS (double salario)
    {
        if (salario <= 1339.12) return (salario*0.08);
        if (salario <= 2331.88) return (salario*0.09);
        if (salario <= 4663.75) return (salario*0.11);
        return 513.01;
    }
    
    public double calculaFGTS (double salario)
    {
        return (salario*0.08);
    }
    
    public double calculaIRRF (double salario)
    {
        if (salario >= 1903.99 && salario <= 2826.65) return (salario*0.075);
        return 0;
    }
    
}
