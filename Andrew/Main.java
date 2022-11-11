class Main 
{
    public static void main(String[]args)
    {
        createSongs();
    }

    public static void createSongs() 
    {
      Song song1= new Song("Do I Wanna Know?" ,"Artic Monkeys" ,"462");
      Song song2= new Song("Champagne Supernova" ,"Oasis" ,"678");
      Song song3= new Song("Song 2" ,"Blur" ,"580");
      Song song4= new Song("I Found Out" ,"The Pigeon Detectives" ,"793");
      Song song5= new Song("Mr Brightside" ,"The Killers" ,"295");
      Song song6= new Song("Fairwell To The Fairground" ,"White Lies" ,"890");
      Song song7= new Song("Henrietta" ,"The Fratellis" ,"876");
      Song song8= new Song("Its Not Over Yet" ,"Klaxons" ,"236");
      Song song9= new Song("Feel Good Inc" ,"Gorillaz" ,"691");
      Song song10= new Song("This Charming Man" ,"The Smiths" ,"831");
    




    String nameOfSong = InputReader.getString("Please enter Song Title: ");
    String theArtist = InputReader.getString("Please enter Artist: ");
    int plyCount = InputReader.getInt("Please enter Playcount: ");  
    Song song11 = new Song(nameOfSong,theArtist,plyCount);

      song1.printSong();
      song2.printSong();
      song3.printSong();
      song4.printSong();
      song5.printSong();
      song6.printSong();
      song7.printSong();
      song8.printSong();
      song9.printSong();
      song10.printSong();
      song11.printSong();

      Playlist PlaylistOne=new Playlist();
      PlaylistOne.addSong(song1);
      PlaylistOne.addSong(song2);
      PlaylistOne.addSong(song3);
      PlaylistOne.addSong(song4);
      PlaylistOne.addSong(song5);
      PlaylistOne.addSong(song6);
      PlaylistOne.addSong(song7);
      PlaylistOne.addSong(song8);
      PlaylistOne.addSong(song9);
      PlaylistOne.addSong(song10);
      PlaylistOne.addSong(song11);

      System.out.println(PlaylistOne.sizeOfplayList());
      
      PlaylistOne.printHeader();
      PlaylistOne.printAllSongs();

      PlaylistOne.deleteSong(1);
      PlaylistOne.printAllSongs();
      System.out.println("=============================");
      PlaylistOne.printSelectSongs(11);

    }
    
}
