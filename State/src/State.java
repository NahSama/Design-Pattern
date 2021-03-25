abstract class State {
    public Player player;
    public State(Player player){
        this.player = player;
    }
    abstract void clickLock();
    abstract void clickPlay();
    abstract void clickNext();
    abstract void clickPrevious();

}
