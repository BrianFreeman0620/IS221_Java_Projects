/*
 -------------------------------------------------------------------------------
 * Name:    BrianFreeman_IS221_Ch4_PP4_3.java
 * Lang:    Java
 * Date:    2021-02-24
 * Author:  Brian Freeman
 * Purpose: This code will use the Sphere class to return surface area and
            volume
--------------------------------------------------------------------------------
 * ChangeLog:
 * Who:     Brian Freeman           Date:       2021-02-24
 * Desc:    The Sphere class can be used to find surface area and volume
            and return the values
 */
package brianfreeman_is221_ch4_pp4;

import java.util.Scanner;

public class BrianFreeman_IS221_Ch4_PP4_3 {

    public static void main(String[] args) {
        // the Sphere class from Sphere.java is used to create 3 Spheres
        Sphere sphere1 = new Sphere();
        Sphere sphere2 = new Sphere();
        Sphere sphere3 = new Sphere();
        Scanner scanDiameter = new Scanner(System.in);
        
        // the scanner gets the diameters of the three Spheres as integers
        System.out.println("Give a diameter for a sphere as an integer: ");
        int inputDiameter1 = scanDiameter.nextInt();
        
        System.out.println("Give a diameter for a second sphere as an integer: ");
        int inputDiameter2 = scanDiameter.nextInt();
        
        System.out.println("Give a diameter for a third sphere as an integer: ");
        int inputDiameter3 = scanDiameter.nextInt();
        
        // the diameter is set and can be used in the sphere class
        // Volume() and SurfaceArea() are run to get the values for the print
        // statement
        sphere1.setDiameter(inputDiameter1);
        System.out.println();
        System.out.println("Sphere 1: Diameter is " + sphere1.getDiameter());
        sphere1.Volume();
        sphere1.SurfaceArea();
        System.out.print(sphere1);
        
        sphere2.setDiameter(inputDiameter2);
        System.out.println();
        System.out.println("Sphere 2: Diameter is " + sphere2.getDiameter());
        sphere2.Volume();
        sphere2.SurfaceArea();
        System.out.print(sphere2);
        
        sphere3.setDiameter(inputDiameter3);
        System.out.println();
        System.out.println("Sphere 3: Diameter is " + sphere3.getDiameter());
        sphere3.Volume();
        sphere3.SurfaceArea();
        System.out.print(sphere3);
    }
    
}
