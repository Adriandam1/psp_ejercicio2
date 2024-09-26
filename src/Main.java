//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {


            Scanner sc = new Scanner(System.in);

            System.out.println("Nombre del archivo en texto plano(sin la extensión): ");
            String archivo = sc.nextLine();
            // Variable para extensión archivo
            String extension = ".txt";
            //ruta absoluta: home/dam/IdeaProjects/psp_ejercicio2
            //ruta escritorio: home/dam/Desktop/

            //windows: "notepad.exe"
            //debian clase: "kwrite"
            ProcessBuilder pBlock = new ProcessBuilder("kwrite", archivo + extension);

            //Inicia el proceso
            System.out.println("Iniciando proceso...");
            Process p = pBlock.start();
            //Espera a que el proceso termine
            p.waitFor();

            System.out.println("El editor de texto se ha cerrado. Puedes revisar el archivo en: " + archivo + extension);

        } catch (IOException e) {
            System.err.println("Error al intentar abrir el editor de texto: " + e.getMessage());
            //Excepcion interrpción
        } catch (InterruptedException e) {
            System.err.println("El proceso fue interrumpido: " + e.getMessage());
        }
    }
}
