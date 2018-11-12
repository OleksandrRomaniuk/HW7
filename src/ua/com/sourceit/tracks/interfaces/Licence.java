package ua.com.sourceit.tracks.interfaces;

import java.util.Calendar;

import ua.com.sourceit.tracks.Modern;
import ua.com.sourceit.tracks.Track;
import ua.com.sourceit.tracks.types.Genres;

public interface Licence
{
    default boolean checkLicence(Track track)
    {
        if (!checkIfLicenceNeeded(track))
        {
            return true;
        } else
        {
            return checkIfLicenced(track);
        }
    }

    @SuppressWarnings("deprecation")
    default boolean checkIfLicenced(Track track)
    {
        if (((Modern) track).getPublisher() == null
                || ((Modern) track).getLicence() < Calendar.getInstance().get(Calendar.YEAR))
        {
            return false;
        } else
        {
            return true;
        }
    }

    default boolean checkIfLicenceNeeded(Track track)
    {
        if (track.getGenre().equals(Genres.CASSICAL))
            return false;
        else
            return true;
    }
}
