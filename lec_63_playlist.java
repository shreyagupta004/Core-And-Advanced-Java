import java.util.*;


public class lec_63_playlist {
    public static void main(String[] args) {
        Album album1 = new Album("Album 1");
        album1.addSong("Song 1", 3.5);
        album1.addSong("Song 2", 4.0);
        album1.addSong("Song 3", 2.5);

        Album album2 = new Album("Album 2");
        album2.addSong("Song 4", 3.0);
        album2.addSong("Song 5", 5.5);

        Playlist playlist = new Playlist();
        playlist.addSongToPlaylist(album1.getSongs().get(0));
        playlist.addSongToPlaylist(album2.getSongs().get(1));
        playlist.addSongToPlaylist(album1.getSongs().get(2));
        playlist.addSongToPlaylist(album2.getSongs().get(0));

        playlist.play();
    }

    }
     class Song{
        private String title;
        private double duration;

        public Song(String title , double duration){
            this.title = title;
            this.duration = duration;
        }
        public String getTitle(){
            return title;
        }
        public double duration(){
            return duration;
        }
        @Override
        public String toString() {
            return title + " (" + duration + " minutes)";
        }
    }
     class Album{
        private String name;
        private ArrayList<Song> songs;
        public  Album(String name ){
            this.name = name;
            this.songs = new ArrayList<>();
        }
        
    
    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
        songs.add(new Song(title, duration));
        return true;
        }
        return false;
        }
        private Song findSong(String title) {
            for (Song song : songs) {
            if (song.getTitle().equals(title)) {
            return song;
            }
            }
            return null;
            }

        public ArrayList<Song> getSongs() {
            return songs;
        }
    }
        class Playlist {
            private LinkedList<Song> playlist;
            private ListIterator<Song> playlistIterator;

        public Playlist() {
            this.playlist = new LinkedList<>();
            this.playlistIterator = playlist.listIterator();
        }

        public boolean addSongToPlaylist(Song song) {
            return playlist.add(song);
        }

        public void play() {
            if (playlist.isEmpty()) {
                System.out.println("Playlist is empty.");
                return;
            }

        Scanner scanner = new Scanner(System.in);
        boolean forward = true;
        boolean quit = false;

        printMenu();

        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();

        switch (choice) {
            case 0:
                System.out.println("Playlist complete.");
                quit = true;
                break;
            case 1:
                if (!forward) {
                 if (playlistIterator.hasNext()) {
                    playlistIterator.next();
                 }
                    forward = true;
                }
                if (playlistIterator.hasNext()) {
                    System.out.println("Now playing " + playlistIterator.next());
                } else {
                    System.out.println("End of playlist.");
                    forward = false;
                }
                break;
case 2:
if (forward) {
if (playlistIterator.hasPrevious()) {
playlistIterator.previous();
}
forward = false;
}
if (playlistIterator.hasPrevious()) {
System.out.println("Now playing " + playlistIterator.previous());
} else {
System.out.println("Start of playlist.");
forward = true;
}
break;
case 3:
if (forward) {
if (playlistIterator.hasPrevious()) {
System.out.println("Replaying " + playlistIterator.previous());
forward = false;
} else {
System.out.println("Start of playlist.");
}
} else {
if (playlistIterator.hasNext()) {
System.out.println("Replaying " + playlistIterator.next());
forward = true;
} else {
System.out.println("End of playlist.");
}
}
break;
case 4:
printPlaylist();
break;
case 5:
printMenu();
break;
}
}
}

private void printMenu() {
System.out.println("Available actions:\npress");
System.out.println("0 - to quit\n" +
"1 - to play next song\n" +
"2 - to play previous song\n" +
"3 - to replay the current song\n" +
"4 - to list songs in the playlist\n" +
"5 - to print available actions");
}

private void printPlaylist() {
System.out.println("Playlist:");
for (Song song : playlist) {
System.out.println(song);
}
}
}



