/*
 * NAMA ADLI AL HADI
 * NIM 2501081004
 */
package praktek210526;

/**
 *
 * @author USER
 */
public class PembayaranKredit extends Pembayaran implements CetakStruk{
    private String noKartu;
    private String namaKartu;

    public PembayaranKredit(String noKartu, String namaKartu, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.noKartu = noKartu;
        this.namaKartu = namaKartu;
    }

    public String getNoKartu() {
        return noKartu;
    }

    public void setNoKartu(String noKartu) {
        this.noKartu = noKartu;
    }

    public String getNamaKartu() {
        return namaKartu;
    }

    public void setNamaKartu(String namaKartu) {
        this.namaKartu = namaKartu;
    }

    @Override
    public void prosesPembayaran(){
    System.out.println("proses pembayaran melalui kartu kredit");
    System.out.println("Nama kartu: "+namaKartu);
    System.out.println("No Kartu: "+noKartu);
    System.out.println("Id Transaksi: "+idTransaksi);
    System.out.println("Jumlah Bayar:Rp. "+jumlahBayar);
}    

    @Override
    public void cetak() {
    System.out.println("proses pembayaran melalui kartu kredit");
    System.out.println("Nama kartu: "+namaKartu);
    System.out.println("No Kartu: "+noKartu);
    System.out.println("Id Transaksi: "+idTransaksi);
    System.out.println("Jumlah Bayar:Rp. "+jumlahBayar);
        
    }
    

  
    
    
}
