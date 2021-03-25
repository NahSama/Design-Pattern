public class Main {
    public static void main(String[] args){
        //Initialize PLayer
        Player player = new Player();

        //Play it - Playing state
        player.clickPlay();
        player.clickNext();
        player.clickNext();

        //Lock -> Locked state
        player.clickLock();
        System.out.println(player.getState());

        //Unlock -> PLaying state
        player.clickLock();
        System.out.println(player.getState());

        //Stop -> Ready state
        player.clickPlay();
        System.out.println(player.getState());

        //Lock -> Locked state
        player.clickLock();
        System.out.println(player.getState());

        //Unlock -> Ready state
        player.clickLock();
        System.out.println(player.getState());
    }

}
