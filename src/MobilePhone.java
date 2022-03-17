public abstract class MobilePhone extends WirelessPhone {
    private int model;
    private String version;
    private int price;
    private Battery battery;
    private Memory memory;
    private Display display;
    private Cpu cpu;


    public MobilePhone(int model, String version, Memory memory, Battery battery, Display display, Cpu cpu, int price) {
        this.model = model;
        this.version = version;
        this.price = price;
        this.memory= memory;
        this.battery=battery;
        this.display=display;
        this.cpu=cpu;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    @Override
    public String makeCall(Client firstClient, Client secondClient) {
        return (firstClient.getFirstName()+" called " + secondClient.getFirstName()+" by 5G.");
    }

    public  String sendMessage(Message message, Client firstClient, Client secondClient){
        return ("Dear "+ secondClient.getFirstName()+secondClient.getSurname()+secondClient.getPatronymic()+", "+
                "It's "+ firstClient.getFirstName()+firstClient.getSurname()+firstClient.getPatronymic()+", "+message.getLetterField());
    };
    public abstract String internetConnection();
    public abstract String makePhoto();
    public abstract String makeVideo();
    public abstract String installingApplications();

}
