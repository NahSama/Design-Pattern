public class Player {
    private State state;
    private String currentSong;
    private boolean isPLaying;

    {
        isPLaying = false;
    }

    public Player(){
        this.state = new ReadyState(this);
    }

    public void changeState(State nextState){
        this.state = nextState;
    }

    public void clickLock(){
        state.clickLock();
    }

    public void clickPlay(){
        state.clickPlay();
    }

    public void clickNext(){
        state.clickNext();
    }

    public void clickPrevious(){
        state.clickPrevious();
    }

    public void stopPlayback(){
        this.isPLaying = !this.isPLaying;
        System.out.println("Stop Playback");
    }

    public void nextSong(){
        System.out.println("Next Song");
    }

    public void previousSong(){
        System.out.println("Prev Song");
    }

    public boolean isPlaying(){
        return this.isPLaying;
    }

    public State getState(){
        return state;
    }

    public void setPlaying(boolean playing) {
        this.isPLaying = playing;
    }
}
