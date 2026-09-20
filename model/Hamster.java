package model;

public class Hamster extends Hewan {

    private String jenisHamster;

    public Hamster(int idHewan, String namaHewan, String jenisHamster) {
        super(idHewan, namaHewan);
        this.jenisHamster = jenisHamster;
    }

    public String getJenisHamster() {
        return jenisHamster;
    }

    public void setJenisHamster(String jenisHamster) {
        this.jenisHamster = jenisHamster;
    }

    @Override
    public String getInfo() {
        return "Hamster - " + getNamaHewan();
    }
}
