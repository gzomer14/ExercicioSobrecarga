    
package com.mycompany.aula5;

import java.util.Scanner;

public class Main {
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Qual setor você trabalha? \n1 - Gerencia\n2 - Desenvolvimento\n3 - Administrativo\nOpção desejada: ");
        Opcoes(s.nextInt());
    }
    
    public static void Opcoes(int op)
    {
        Scanner s = new Scanner(System.in);
        Gerencia gerente = new Gerencia();
        Desenvolvimento desenvolvimento = new Desenvolvimento();
        Administrativo administrativo = new Administrativo();
        
        switch (op)
        {
            case 1: gerente.salSetor(); break;
            case 2: desenvolvimento.salSetor(); break;
            case 3: administrativo.salSetor(); break;
        }
    }
}
