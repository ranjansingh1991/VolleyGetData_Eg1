package in.semicolonindia.volleygetdata_eg1;

/**
 * Created by RANJAN SINGH on 9/11/2017.
 */

@SuppressWarnings("ALL")
public class Hero{
    String name, imageUrl;

    public Hero(String name, String imageUrl) {
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
