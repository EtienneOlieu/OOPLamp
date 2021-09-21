public class Room {
    public static void main(String[] args) {

        Lamp diningRoomLamp = new Lamp(false);

        Lamp loveLamp = new Lamp(false);

        Lamp powerWattDeathLamp = new Lamp(false);

        System.out.println("Lampen er: " + loveLamp);

        diningRoomLamp.flipTheSwitch();

        loveLamp.flipTheSwitch();

        powerWattDeathLamp.flipTheSwitch();
        System.out.println("Lampen er: " + powerWattDeathLamp);
        powerWattDeathLamp.flipTheSwitch();
        System.out.println("Lampen er: " + powerWattDeathLamp);

    }
}
