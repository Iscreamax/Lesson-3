public class Iphone extends MobilePhone {
    private boolean waterProof;

    public Iphone(int model, String version, Memory memory, Battery battery, Display display, Cpu cpu, int price,boolean waterProof) {
        super(model, version, memory, battery, display, cpu, price);
        this.waterProof = waterProof;
    }

    @Override
    public String toString() {
        return("Iphone "+ getModel() + "/" + getVersion()+"/"+getMemory().getCapacity()  + "Gb/"
                + getBattery().getCapacity()+ "mah/"+getDisplay().getInch()+"inh/"+getCpu().getFrequency()+
                "Ggz/price -"+getPrice() + "$"+" WaterProof - "+ waterProof);
    }






    @Override
    public void internetConnection() {
        System.out.println("5G works here");;
    }


    @Override
    public void makePhoto() {
        System.out.println("Took a high-resolution photo .");
    }

    @Override
    public void makeVideo() {
        System.out.println("Shot a video in 4K");
    }

    @Override
    public void installingApplications() {
        System.out.println("Install application via App store");
    }
}