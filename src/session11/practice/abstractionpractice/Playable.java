package session11.practice.abstractionpractice;

public interface Playable {

    void play();
    void stop();
}

class Music implements Playable {
    @Override
    public void play() {
        System.out.println("Music is playing");
    }

    @Override
    public void stop() {
        System.out.println("Music is stopped");
    }
}

class Video implements Playable {
    @Override
    public void play() {
        System.out.println("Video is playing");
    }

    @Override
    public void stop() {
        System.out.println("Video is stopped");
    }
}