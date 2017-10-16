package com.Krystiano;

public class Main {

    public static void main(String[] args) {
        Album album1 = new Album("Taki tam album");
        Album album2 =new Album("LeszczAlbum");

        Song hello = new Song("Hello",new Duration(4,30));
        Song letItGo = new Song("Let it go", new Duration(2,20));
        Song something = new Song("Something just like this", new Duration(4,8));
        Song hallelujah = new Song ("Hallelujah" , new Duration(6,20));
        Song everyBreath = new Song ("Every breath you take" , new Duration(3,56));

        album1.addSong(hello);
        album1.addSong(letItGo);

        album2.addSong(something);
        album2.addSong(hallelujah);
        album2.addSong(everyBreath);

	    App app=new App();
	    app.addAlbum(album1);
	    app.addAlbum(album2);
	    app.start();
    }
}
