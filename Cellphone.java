public class Cellphone {
    void ring() {
        System.out.println("ringing...");
    }

    void vibrate() {
        System.out.println("vibrating...");
    }

    void callFriend() {
        System.out.println("calling friend...");
    }

    void sendMessage() {
        System.out.println("sending message...");
    }

    public static void main(String[] args) {
        Cellphone phone = new Cellphone();
        phone.ring();
        phone.vibrate();
        phone.callFriend();
        phone.sendMessage();
    }
}
