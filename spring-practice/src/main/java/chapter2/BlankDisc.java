package chapter2;

import java.util.List;

/**
 * 2022/3/14
 * desc
 */
public class BlankDisc implements CompactDisc{
    private String title;
    private String artist;
    private List<String> tracks;

//    public BlankDisc(String title,String artist){
//        this.title = title;
//        this.artist = artist;
//    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    @Override
    public void play() {
        System.out.println("playing" + title + " by " + artist);
        for (String track : tracks) {
            System.out.println("-Track: "+ track);
        }
    }
}
