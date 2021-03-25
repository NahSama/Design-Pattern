public class Main {

    public static void main(String[] args){
        //Initialize TVs and Radio
        Device firstTV = new TV();
        Device secondTV = new TV();
        Device firstRadio = new Radio();

        //Initialize TVs' remotes and Radio's remote
        Remote firstTiViRemote = new Remote(firstTV);
        AdvancedRemote secondTiViRemote = new AdvancedRemote(secondTV);
        Remote radioRemote = new Remote(firstRadio);

        //Test TV1_remote
        firstTiViRemote.togglePower();
        firstTiViRemote.volumeUp();
        firstTiViRemote.channelDown();
        System.out.println("TV_1 is on? " + firstTV.isEnabled());
        System.out.println("TV_1 volume is 60? " + firstTV.getVolume());
        System.out.println("TV_1 channel is 9? " + firstTV.getChannel());

        //Test Radio_remote
        radioRemote.togglePower();
        radioRemote.volumeUp();
        radioRemote.channelDown();
        System.out.println("Radio is on? " + firstRadio.isEnabled());
        System.out.println("Radio volume is 60? " + firstRadio.getVolume());
        System.out.println("Radio channel is 9? " + firstRadio.getChannel());

        //Test TV2_remote
        secondTiViRemote.togglePower();
        secondTiViRemote.mute();
        secondTiViRemote.channelDown();
        System.out.println("TV_2 is on? " + secondTV.isEnabled());
        System.out.println("TV_2 volume is 0? " + secondTV.getVolume());
        System.out.println("TV_2 channel is 9? " + secondTV.getChannel());

        secondTiViRemote.volumeUp();
        System.out.println("TV_2 volume is 10? " + secondTV.getVolume());
    }
}
