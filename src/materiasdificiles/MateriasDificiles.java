/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package materiasdificiles;

import java.util.Random;

/**
 *
 * @author utku28
 */
public class MateriasDificiles extends MetodosSteve{

    /**
     * @param args the command line arguments
     */
    //matematica lengua geografia historia
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand= new Random();
        int cantAlumnos=0;
        int [] [] matriz= new int [4] [4];
        int nota=rand.nextInt(10);
        imprimir("ingrese cantidad de alumnos");
        cantAlumnos=tomarInt();
        
        for (int i = 0; i < 4; i++) 
        {for (int j = 0; j < cantAlumnos; j++) 
            {
                matriz[i][j]=rand.nextInt(10);
            }
            
        }
        
//        for (int i = 0; i < 4; i++) 
//        {for (int j = 0; j < cantAlumnos; j++) 
//            {
//                imprimir (matriz[i][j]);
//            }
//            
//        }
        
        int matematica=0;
        int lengua=0;
        int geografia=0;
        int historia=0;
        
        for (int i = 0; i < 4; i++) 
        {for (int j = 0; j < cantAlumnos; j++) 
            if(i==0)
            {
                matematica=matematica+matriz[i][j];
            }
            else if(i==1)
                {
                lengua=lengua+matriz[i][j];
                }
                else if(i==2)
                {
                geografia=geografia+matriz[i][j];
                }
                
            
        }
        
    }
    
}
