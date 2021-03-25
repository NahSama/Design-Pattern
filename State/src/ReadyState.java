public class ReadyState extends State{

    public ReadyState(Player player) {
        super(player);
        player.setPlaying(false);
    }

    @Override
    public void clickLock() {
        player.changeState(new LockedState(this.player));
    }

    @Override
    public void clickPlay() {
        this.player.setPlaying(true);
        player.changeState(new PlayingState(this.player));
    }

    @Override
    public void clickNext() {
        player.nextSong();
    }

    @Override
    public void clickPrevious() {
        player.previousSong();
    }
}
