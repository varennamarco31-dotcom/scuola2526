public class Motore{

    private int cilindrata;
    private String carburante;
    private int cavalli;

    public Motore(int cilindrata, String carburante, int cavalli){
        this.cilindrata = cilindrata;
        this.carburante = carburante;
        this.cavalli = cavalli;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public String getCarburante() {
        return carburante;
    }

    public int getCavalli() {
        return cavalli;
    }

    public void accendi(){
        System.out.println("Motore accesso");
    }
    
    @Override
    public String toString(){
        return "Motore:\n" + 
                "cilindrata: " + cilindrata +
                "carburante: " + carburante + 
                "cavalli: " + cavalli ;
    }


}