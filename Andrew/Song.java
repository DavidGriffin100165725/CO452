public class Song
{
    
    String songName;
    String artistName;
    String playCount;

    public Song(String sName, String aName, String string){
        this.songName = sName;
        this.artistName = aName;
        this.playCount = string;
    }
    
    public Song(String nameOfSong, String theArtist, int plyCount) {
    }

    public String getSongName()    
    {
        return songName;
    }

    public String getArtistName()
    {
        return artistName;
    }

    public String getPlayCount()
    {
        return playCount;
    }

    public void setSongName(String sName)
    {
        this.songName = sName;
    }

    public void setArtistName(String aName)
    {
        this.artistName = aName;
    }

    public void setplayCount(String pCount)
    {
        this.playCount = pCount;
    }
    
    public void printSong()
    {
        System.out.println(songName + "," + artistName + "," + playCount);
    }

    public int getplayCount() {
        return 0;
    }

}