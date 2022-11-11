package task8_6_5;

public class l8_6_6 {
    public static void main(String[] args){
        Song[] Songs ={
                new Song("Author1", "Name1", (float) 2.23, "Rap"),
                new Song("Author2", "Name2", (float) 1.23, "Pop"),
                new Song("Author3", "Name3", (float) 4.23, "Rap"),
        };
        Playlist playlist = new Playlist(Songs);
        playlist.sort_by_style();

        System.out.println("All time Playlist : " + playlist.long_time());

    }
}
