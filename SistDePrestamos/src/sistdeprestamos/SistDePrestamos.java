/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistdeprestamos;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author symq9485
 */

class Solicitante
{
    int cedula;
    String nombre; 
    String apellido1;
    String apellido2;
    int telf;
    int movil;
    
    
    void registrar() throws IOException 
    {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        try
        {            
        System.out.print("Ingrese la cedula del solicitante: ");
        cedula = Integer.parseInt(br.readLine());
        
        System.out.print("Ingrese el nombre del solicitante: ");
        nombre = br.readLine();
        
        System.out.print("Ingrese el primer apellido del solicitante: ");
        apellido1 = br.readLine();
        
        System.out.print("Ingrese el segundo apellido del solicitante: ");
        apellido2 = br.readLine();
        
        
        System.out.print("Ingrese el numero de telefono de habitacion del solicitante: ");
        telf = Integer.parseInt(br.readLine());
        
        System.out.print("Ingrese numero de telefono movil del solicitante: ");
        movil = Integer.parseInt(br.readLine());
    
        }
        catch(IOException e)
        {
            System.err.println("Error: " + e.getMessage());
        }
    }
    @Override
    public String toString() 
    {
        return "Nombre: "+ nombre +" Apellidos: "+ apellido1 + " " + apellido2
                + "Cedula: "+cedula
                + "Telefono fijo: "+telf
                + "Movil: "+ movil;
    }
}    

class Prestamo
{
    int N_Prestamo;
    double Credito;
    double Valor_de_prestamo;
    String Fecha_autorizacion;
    String Fecha_entrega;
    String[] Fecha_pagos = new String[6];
    
    void registro() throws IOException
    {
        //Prestamo tendra que ser leido desde un archivo para seguir una secuencia
        
        Credito=1000000.00d;
        
        Calendar c1 = GregorianCalendar.getInstance();
        
        for(int i = 1; i <= 6; i++)
        {
            c1.add(Calendar.MONTH, (i));
            Fecha_pagos[i] =c1.toString();
            
        }
        
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        try
        {
        System.out.print("Ingrese el valor del prestamo a solicitar");
        Valor_de_prestamo = Double.parseDouble(br.readLine());
        
        }
        catch(IOException e)
        {
            System.err.println("Error: " + e.getMessage());
        }
    }
    
    
}

public class SistDePrestamos 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        //Solicitante sol = new Solicitante();
    }
    
}
