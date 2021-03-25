public class LockedState extends State{

    public LockedState(Player player){
        super(player);
    }

    @Override
    void clickLock() {
        if(this.player.isPlaying()){
            this.player.changeState(new PlayingState(this.player));
        }else{
            this.player.changeState(new ReadyState(this.player));
        }
    }

    @Override
    void clickPlay() {

    }

    @Override
    void clickNext() {

    }

    @Override
    void clickPrevious() {

    }
}
