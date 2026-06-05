/*
 * NAMA ADLI AL HADI
 * NIM 2501081004
 */
package Praktek040626;

/**
 *
 * @author USER
 */
public class Keyboard extends AlatMusik implements BisaDinyalakan{
    
    private boolean dayaTersambung;

    public Keyboard(boolean dayaTersambung,String nama, String jenis) {
        super(nama, jenis);
        this.dayaTersambung=dayaTersambung;
    }
    
    @Override
    public void mainkan(){
       System.out.println(nama+"dimainkan dengan menekan tuas."); 
    }

    @Override
    public void stem() {
        System.out.println("keyboard"+nama+"distem digital dengan aplikasi."); 
        
    }

    @Override
    public void nyalakan() {
        if(cekListrik()){
            System.out.println(nama+ "dinyalakan.");
            
        }
        else{
            System.out.println(nama+"tidak bisa dinyalakan karena tidak ada daya.");
        }
        
    }

    @Override
    public void matikan() {
        System.out.println(nama+" dimatikan.");
    }

    @Override
    public boolean cekListrik() {
       return dayaTersambung;
       
    }

   
    
}
