/*
 -------------------------------------------------------------------------------
 * Name:    Sphere.java
 * Lang:    Java
 * Date:    2021-02-24
 * Author:  Brian Freeman
 * Purpose: This code has the Sphere class for the main function
--------------------------------------------------------------------------------
 * ChangeLog:
 * Who:     Brian Freeman           Date:       2021-02-24
 * Desc:    The Sphere class has been created
 */
package brianfreeman_is221_ch4_pp4;

public class Sphere 
{
    // integers sphereDiameter and sphereSurface and float sphereVolume have
    // been created for reference in the class
    private int sphereDiameter, sphereSurfaceArea;
    private float sphereVolume;
    
    public Sphere()
    {
        // sphereDiameter is set to 0 to prevent crashing of the program
        sphereDiameter = 0;
        
    }
    
    public int setDiameter(int sphereInputDiameter)
    {
        // sphereDiameter can be inputted to be used in the class
        sphereDiameter = sphereInputDiameter;
        return sphereDiameter;
        
    }
    
    public int getDiameter()
    {
        // returns the value of sphereDiameter
        return sphereDiameter;
        
    }
    
    public float Volume()
    {
        // the volume can be calculated and returned as a float
        // the pi value is seperate to make the answer look cleaner
        sphereVolume = (float) (4/3 *  Math.pow(((float)sphereDiameter/2) , 3));
        return sphereVolume;
        
    }
    
    public int SurfaceArea()
    {        
        // the surface area can be calculated and returned as a float
        // the pi value is seperate to make the answer look cleaner
        sphereSurfaceArea = (int) Math.pow(sphereDiameter, 2);
        return sphereSurfaceArea;
        
    }
    public String toString()
    {
        // the string shows volume and surface area, with pi added on at the
        // end of each
        String sphereString = "The volume is: " + sphereVolume + 
                " Pi\nThe surface area is: " + sphereSurfaceArea + " Pi";
        return sphereString;
        
    }
}
    
