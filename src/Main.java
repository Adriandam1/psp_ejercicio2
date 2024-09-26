//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
Crea un programa en Java que usando línea de comandos permita al usuario editar un archivo
existente o crearlo utilizando un editor de texto sencillo
 (gnome-text-editor, gedit, notepad...). El usuario introducirá la ruta o el nombre del nuevo
 archivo y la extensión.
 */

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    try {


        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre del archivo de texto plano: ");
        String archivo = sc.nextLine();
        //ruta absoluta: home/dam/IdeaProjects/psp_ejercicio2
        //ruta escritorio: home/dam/Desktop/

        ProcessBuilder pBlock = new ProcessBuilder("kwrite", "" +archivo+".txt");
        pBlock.start();

        //Process p = pBlock.start();
        //System.out.println(p);

    } catch (IOException e) {
        throw new RuntimeException(e);
    }

    }
}