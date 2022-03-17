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
    public String internetConnection() {
        return ("5G works here");
    }


    @Override
    public String makePhoto() {
        return ("Took a high-resolution photo .");
    }

    @Override
    public String makeVideo() {
        return ("Shot a video in 4K");
    }

    @Override
    public String installingApplications() {
        return ("Install application via App store");
    }
}