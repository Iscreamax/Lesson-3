public class Main {
    public static void main(String[] args) {

        Memory memory = new Memory("Profit",256);
        Battery battery = new Battery("Apple",3300);
        Display display = new Display("Samsung","Oled",6.1);
        Cpu cpu = new Cpu("Bionic",2.7);
        Client firstClient = new Client("Jack ","Vorobey ","Aleksandrovich");
        Client secondClient= new Client("Valet ","Kozirny ","Albertovich");
        Message message = new Message("I'm going to be late for work, I'm sorry!");
        Iphone iphone = new Iphone(13,"Pro",memory,battery,display,cpu,1350,true);
        Phone phone = new Phone();
        System.out.println(iphone.toString());
        System.out.println(memory.toString());
        System.out.println(battery.toString());
        System.out.println(display.toString());
        System.out.println(cpu.toString());
        System.out.println("");
        System.out.println("Sending a message:");
        System.out.println(iphone.sendMessage(message,firstClient,secondClient));
        System.out.println("Making a call:");
        System.out.println(iphone.makeCall(firstClient,secondClient));
        System.out.println("We change names and make a call:");
        firstClient.setFirstName("Max ");
        secondClient.setFirstName("Oleg ");
        System.out.println(iphone.makeCall(firstClient,secondClient));
        //Делаем звонок с домашнего телефона
        System.out.println(phone.makeCall(firstClient,secondClient));
        //Устанавливаем соединение Iphone  со спутник
        System.out.println(iphone.satelliteConnection());
        //Устанавливаем интернет соединение Iphone
        System.out.println(iphone.internetConnection());
        //Делаем фото на Iphone
        System.out.println(iphone.makePhoto());
        //Снимаем видео на Iphone
        System.out.println(iphone.makeVideo());
        //Звонок с службу 911 с Iphone
        System.out.println(iphone.alarmCall());
        //Установка приложение в App store
        System.out.println(iphone.installingApplications());

    }
}
