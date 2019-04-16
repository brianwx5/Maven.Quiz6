package rocks.zipcode.io.objectorientation;

public class Television {
    TVChannel tvChannel;
    Boolean tvPower = false;

    public void turnOn() {
        this.tvPower = true;
    }

    public void setChannel(Integer channel) {
        if(!tvPower) {
            throw new IllegalStateException();
        }
        this.tvChannel = TVChannel.getByOrdinal(channel);
    }

    public TVChannel getChannel() {
        return tvChannel;
    }
}
