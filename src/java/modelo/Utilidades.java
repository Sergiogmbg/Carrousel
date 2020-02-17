/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.io.File;

/**
 *
 * @author Sergio
 */
public class Utilidades {

    public static ArrayList<String> getArchivos(String sDirectorio) throws IOException {
        ArrayList<String> archivos = new ArrayList<String>();
        
        File dir = new File(sDirectorio);
        String[] ficheros = dir.list();
        
        if (ficheros != null) {
            for (int i = 0; i < ficheros.length; i++) {
                if (ficheros[i].endsWith(".jpg") || ficheros[i].endsWith(".png") || ficheros[i].endsWith(".bmp")) {
                    archivos.add(ficheros[i]);
                }
            }
        }
        
        return archivos;
    }
}
