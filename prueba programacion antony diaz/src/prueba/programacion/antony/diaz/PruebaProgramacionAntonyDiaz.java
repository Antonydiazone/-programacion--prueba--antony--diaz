/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba.programacion.antony.diaz;

import java.util.Scanner;

/**
 *
 * @author antob
 */
public class PruebaProgramacionAntonyDiaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //este es mi codigo
        int vmenut=0;
        Scanner pedir= new Scanner(System.in);
        boolean control=true; 
        while(control){
            //inicio del menu
            System.out.println("bienvenido a mi primera practica en java estas son las opciones:");
            System.out.println("1.repetir mi nombre");
            System.out.println("2.submenu de mensajes");
            System.out.println("3.salir");
            System.out.println("ingrese el numero del a opcion deseada:");
            int gmenu=pedir.nextInt();
            vmenut=vmenut+1;
            switch(gmenu){
                case 1:
                    System.out.println("ponga su nombre:");
                    pedir.nextLine();
                    String nomu=pedir.nextLine();
                    System.out.println("cantidad de veces que se va repetir el texto:");
                    int rep=pedir.nextInt();
                    for (int i = 0; i < rep; i++) {
                        System.out.println("hola mi nombre es "+nomu+" y miren mi prueba");   
                    }
                    control=true;
                    break;
                case 2:
                    boolean controlito=true;
                    while(controlito){
                        //inicio del submenu
                        System.out.println("bienvenido al submenu de mesajes,tiene las siguentes opciones:");
                        System.out.println("1.bienvenida");
                        System.out.println("2.despedida");
                        System.out.println("3.salir");
                        System.out.println("ingrese el numero del a opcion deseada:");
                        int submenu=pedir.nextInt();
                        if (submenu==1) {
                            System.out.println("ingrese el mensaje que usted quiera:");
                            pedir.nextLine();
                            String messu=pedir.nextLine();
                            System.out.println("su mensaje es "+messu);
                            System.out.println();
                            controlito=true;
                        }else if(submenu==2){
                            System.out.println("hasta luego gracias por usar mi prorgrama");
                            System.out.println();
                            controlito=true;
                        }else if(submenu==3){
                            System.out.println("saliendo del submenu,porfavor espere");
                            controlito=false;
                            control=true;
                        }else{
                            System.out.println("opcion invalida");
                            System.out.println("regrsando al submenu");
                            controlito=true;
                        }
                    }
                    break;
                case 3:
                    System.out.println("adios esta fue la prueba");
                    System.out.println("se entro "+vmenut+" veces al menu principal");
                    control=false;
                    break;
                default:
                    System.out.println("opcion invalida");
                    System.out.println("volveremos al menu inicial");
                    control=true;
                    break;
                // fin del codigo
                    
                            
            }
        }
    }
    
}
