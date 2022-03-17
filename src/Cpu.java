public class Cpu {
    private String manufacture;
    private double frequency;

    public Cpu(){

    }

    public Cpu(String manufacture, double frequency) {
        this.manufacture = manufacture;
        this.frequency = frequency;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }
    public String cpuInfo(){
        return ("\n"+"Cpu:"+"\n"+"Manufacture - "+ getManufacture()+"\n"+"Frequency -  "+ getFrequency());

    }
}
