/*
 * NAMA ADLI AL HADI
 * NIM 2501081004
 */
package Praktek040626;

/**
 *
 * @author USER
 */
public abstract class AlatMusik {
    protected String nama;
    protected String jenis;
    
    public AlatMusik (String nama, String jenis){
        this.nama=nama;
        this.jenis=jenis;
    }
    
    public void info(){
        System.out.println("Nama alat musik: "+nama+". jenis= "+jenis);
    }
    
    //contoh method polymorphism
    public abstract void mainkan ();
    public abstract void stem();
}
