public class facadCallbacks {
    private static void useSimplePlayer(SimplePlayer simplePlayer) {
        simplePlayer.play("The Servant's Stones.mp3");
    }

    public static void main(String[] args) {
   /*   */  SimplePlayer facade = (fileName)-> new ComplexPlayer().play(fileName, 50, 50, 0.5);
//        SimplePlayer facade = new ComplexPlayerFacade();
        useSimplePlayer(facade);
    }
}

interface SimplePlayer {
    void play(String fileName);
}

class ComplexPlayer {
    public void play(String fileName, double leftVolume, double rightVolume, double bass) {
        System.out.println(String.format(
                "Playing \"%s\" with left volume %.2f, right volume %.2f, and bass %.2f",
                fileName, leftVolume, rightVolume, bass));
    }
}
//class ComplexPlayerFacade implements SimplePlayer {
//    private ComplexPlayer player = new ComplexPlayer();
//    public void play(String fileName) {
//        player.play(fileName, 50, 50, 0.5);
//    }
//}