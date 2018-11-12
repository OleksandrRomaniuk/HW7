package ua.com.sourceit.tracks;

import ua.com.sourceit.tracks.types.Genres;

public class Classic extends Track
{

    public Classic(String artist, String title, double length)
    {
        super(artist, title, length);
        this.genre = Genres.CASSICAL;
    }

}
