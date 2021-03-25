public class Radio implements Device{

    private boolean isEnabled;
    private int channel;
    private int volume;

    {
        isEnabled = false;
        channel = 10;
        volume = 50;
    }

    @Override
    public boolean isEnabled() {
        return this.isEnabled;
    }

    @Override
    public void enable() {
        this.isEnabled = true;
    }

    @Override
    public void disable() {
        this.isEnabled = false;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(int percent) {
        this.volume = percent;
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }
}
