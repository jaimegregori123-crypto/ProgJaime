package controller;

import java.io.*;

public class GestorFicheros {

    public void crearFichero(String path){
        File file = new File(path);
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Error en la cracion de un fichero");
            e.getMessage();
        }
    }

    public void crearCarpeta(String path){
        File file = new File(path);
        file.mkdir();
        file.list();
    }

    public void lectorFichero(String path){
        File file = new File(path);
        FileReader reader = null;

        try {
            reader = new FileReader(file);

            int codigo = reader.read();
            while ((codigo=reader.read())!= -1){
                System.out.print( (char) codigo);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error, el fichero no existe");
            lectorFichero("nueva ruta");
        } catch (IOException e) {
            System.out.println("Error en la lectura del fichero");
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println("Error en el cerrado");            }
        }
    }

    public void lectorLineas(String path){
        File file = new File(path);
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String linea = bufferedReader.readLine();
        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe");
        } catch (IOException e) {
            System.out.println("Error en la lectura");
         }
    }
}
