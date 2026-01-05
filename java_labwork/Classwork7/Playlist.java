import java.util.ArrayList;

public class Playlist {
    private String name;
    private ArrayList<Song> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
        System.out.println(name + " created.");
    }

    public void info() {
        System.out.println(name + " has the following songs:");
        if (songs.isEmpty()) {
            System.out.println("No songs in " + name + ".");
            return;
        }

        for (int i = 0; i < songs.size(); i++) {
            Song s = songs.get(i);
            System.out.println("Song-" + (i + 1));
            System.out.println("  Title: " + s.getTitle());
            System.out.println("  Artist: " + s.getArtist());
            System.out.println("  Length: " + s.getLength() + " minutes");
        }
    }

    public void addSong(Song s) {
        songs.add(s);
        System.out.println(s.getTitle() + " added to " + name + ".");
    }

    public void addSong(Song s, int index) {
        if (index < 0 || index > songs.size()) {
            System.out.println("Cannot add song to Index " + index + ".");
            return;
        }
        songs.add(index, s);
        System.out.println(s.getTitle() + " added to " + name + ".");
    }

    public void deleteSong(String title) {
        boolean found = false;
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getTitle().equals(title)) {
                songs.remove(i);
                System.out.println(title + " deleted from " + name + ".");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(title + " not found in " + name + ".");
        }
    }
}
