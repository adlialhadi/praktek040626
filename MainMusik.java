/*
 * NAMA ADLI AL HADI
 * NIM 2501081004
 */
package Praktek040626;

/**
 *
 * @author USER
 */
public class MainMusik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gitar gitar = new Gitar(6,"Gitar Klasik", "petik");
        Keyboard keyboard=new Keyboard(true,"Yamaha PSR", "Elektronik");
        
        System.out.println("\n--------Info Gitar--------");
        gitar.info();
        gitar.mainkan();
        gitar.stem();
        
           
        System.out.println("\n--------Info Keyboard--------");
        keyboard.info();
        keyboard.nyalakan();
        keyboard.mainkan();
        keyboard.stem();
        keyboard.matikan();       
        
        
        
    }
    
}
