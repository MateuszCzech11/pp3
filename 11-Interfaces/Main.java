public class Main {
    public static void main(String[] args) {
        TV t = new TV();
        System.out.println(t.status());
        t.on();
        System.out.println(t.status());
        t.setChannel(3);
        t.setChannel(142);
        System.out.println(t.status());
        t.setChannel(99);
        System.out.println(t.status());
        t.channelUp();
        System.out.println(t.status());
    }
}
