import java.util.ArrayList;

public class Playlist{
public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("Closer");
    desertIslandPlaylist.add("Blinding light");
    desertIslandPlaylist.add("Paris");
    desertIslandPlaylist.add("Sunflower");
    desertIslandPlaylist.add("Alone");
    desertIslandPlaylist.add("Faded");
    System.out.println(desertIslandPlaylist);
    desertIslandPlaylist.remove("Alone");
    System.out.println(desertIslandPlaylist.size());
    System.out.println(desertIslandPlaylist);

    int indexA  = desertIslandPlaylist.indexOf("Paris");
    System.out.println(indexA);
    int indexB = desertIslandPlaylist.indexOf("Faded");
    System.out.println(indexB);
  }
  
}