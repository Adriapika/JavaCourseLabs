package task8_6_5;

import java.util.Arrays;

public class Playlist {

    public Song[] songs;

    Playlist() {}

    Playlist(Song[] songs){
        this.songs = songs;
    }

    void add_song(Song a){
        int n = this.songs.length;
        Song[] arr = Arrays.copyOf(this.songs, n);
        this.songs = new Song[n+1];
        System.arraycopy(arr, 0, songs, 0, n);
        songs[n] = a;
    }

    void sort_by_style(){
        Arrays.sort(this.songs);
    }

    float long_time(){
        float time = 0;
        for( Song a: this.songs){
            time += a.time_lenght;

        }
        return time;
    }

}
