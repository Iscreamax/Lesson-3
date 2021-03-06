public abstract class MobilePhone extends WirelessPhone {


    private Battery battery;
    private Memory memory;
    private Display display;
    private Cpu cpu;


    public MobilePhone(int model, String version, Memory memory, Battery battery, Display display, Cpu cpu, int price) {
        super(model, version, price);
        this.memory= memory;
        this.battery=battery;
        this.display=display;
        this.cpu=cpu;
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
    public void makeCall(Client firstClient, Client secondClient) {
        System.out.println(firstClient.getFirstName()+" called " + secondClient.getFirstName()+" by 5G.");
    }

    public  void sendMessage(Message message, Client firstClient, Client secondClient){
        System.out.println("Dear "+ secondClient.getFirstName()+secondClient.getSurname()+secondClient.getPatronymic()+", "+
                "It's "+ firstClient.getFirstName()+firstClient.getSurname()+firstClient.getPatronymic()+", "+message.getLetterField());
    };
    public abstract void internetConnection();
    public abstract void makePhoto();
    public abstract void makeVideo();
    public abstract void installingApplications();

}
