public  class Phone extends TelephoneExchange {
    public String alarmCall(){
    return ("Hello this is 911");
}
    public String makeCall(Client firstClient, Client secondClient){
    return (firstClient.getFirstName()+" called " + secondClient.getFirstName()+" on the analog line.");


}


}
