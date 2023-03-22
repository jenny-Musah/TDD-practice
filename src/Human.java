public class Human {

    private String speech;



    public String talk() {
        return speech;
    }

    public void saySomething(String conversation) {
        speech = conversation;
    }
}
