import java.util.HashMap;
import java.util.Set;

/**
 * Hashmatique
 */
public class Hashmatique {
    public void trackList() {
        // declare and initialize the hashmap
        HashMap<String, String> setList = new HashMap<String, String>();
        
        // add elements (pair: key, value) to the hashmap
        setList.put("Title for song number 1", "Aliquam magna justo, lacinia ut nibh et, tempor pretium justo. Vestibulum odio massa, interdum sagittis tellus eu, eleifend venenatis mauris. Fusce consectetur dictum justo non aliquet. Maecenas in risus ipsum.");
        setList.put("Title for song number 2", "Sed ac vestibulum purus. Curabitur ullamcorper lorem et arcu convallis aliquet. Phasellus ultrices fringilla tortor, eget vehicula massa dictum laoreet.");
        setList.put("Title for song number 3", "Nam accumsan libero aliquet, ultrices augue euismod, molestie sapien. Fusce quis congue ipsum. Donec tellus odio, ultrices a arcu posuere, auctor consequat lectus.");
        setList.put("Title for song number 4", "Integer convallis risus enim, porta maximus ante fermentum quis. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam aliquam molestie felis, id sodales mi feugiat eu.");
        
        // get a song by its title
        String song = setList.get ("Title for song number 3");
        System.out.println("The song is: " + song + "\n");

        // print all tracks and lyrics
        Set<String> titles = setList.keySet();
        for(String title : titles) {
            // get the lyrics using the titles
            System.out.println(title + ": " + setList.get(title) + "\n");
        }
    }
}