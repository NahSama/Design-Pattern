public class PlayingState extends State{

    public PlayingState(Player player){
        super(player);
    }

    @Override
    void clickLock() {
        this.player.changeState(new LockedState(this.player));
    }

    @Override
    void clickPlay() {
        this.player.stopPlayback();
        this.player.changeState(new ReadyState(this.player));
    }

    @Override
    void clickNext() {
        this.player.nextSong();
    }

    @Override
    void clickPrevious() {
        this.player.previousSong();
    }
}
