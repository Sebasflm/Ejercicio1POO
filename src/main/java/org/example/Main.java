package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehiculo> listavehiculos = new ArrayList<>();
        boolean verificar = true;
        do{
        try {
            System.out.println("\n ------------------------------------------------------" );
            System.out.println("Ingrese el numero de autos con el que desea trabajar: ");
            int num = scanner.nextInt();
            for (int i = 0; i < num; i++) {
                System.out.println("Ingrese la marca del vehiculo: ");
                String marca = scanner.next();
                System.out.println("Ingrese el modelo del vehiculo: ");
                String modelo = scanner.next();
                System.out.println("Ingrese el precio del vehiculo: ");
                double precio = scanner.nextDouble();
                Vehiculo vehiculo = new Vehiculo(marca, modelo, precio);
                listavehiculos.add(vehiculo);
                verificar=false;
            }
        }catch (Exception e){
            System.out.println("Ingrese un numero valido (Empiece de nuevo) " );
            scanner.nextLine();
        }
        }while (verificar);
        Vehiculo vehiculoMenorPrecio = listavehiculos.get(0);
        for(int j=1;j<listavehiculos.size();j++){
            if(listavehiculos.get(j).getPrecio()< vehiculoMenorPrecio.getPrecio()){
                vehiculoMenorPrecio=listavehiculos.get(j);
            }
    }
        System.out.println("--------------------------------------");
        System.out.println("La marca del vehiculo con menor precio es:"+vehiculoMenorPrecio.getMarca());
        System.out.println("El modelo del vehiculo con menor precio es:"+vehiculoMenorPrecio.getModelo());
        System.out.println("El precio del vehiculo con menor precio es:"+vehiculoMenorPrecio.getPrecio());
    }
}
