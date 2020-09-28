package madeira.cs;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SuperLab {
    /*
        Susanna -
        This is great work! You made appropriate use of class methods
        and were succinct in your code. Only suggestions are:
        1. Add comments!
        2. Use the setRating() method once you scan user rating

        Regardless, you should be proud of this...proper programming!
    */
    public static void main(String[] args) {
        try {
            File myobject = new File("artistList.txt");
            Scanner myreader = new Scanner(myobject);
            int numberline = myreader.nextInt();
            String temp = myreader.nextLine();
            String [] artist = new String[numberline];
            int rating = 0;
            while (myreader.hasNextLine()) {
                artist[rating] = myreader.nextLine();
                rating ++;
            }
            myreader.close();

            Artist [] artist1 = new Artist[numberline];
            rating = 0;
            for (String line: artist) {

                artist1[rating] = new Artist();

                artist1[rating].setName(line.split(",")[0]);
                artist1[rating].setAlbum(line.split(",")[1]);
                artist1[rating].setTwitter(line.split(",")[2]);
                rating++; }



            Scanner a = new Scanner(System.in);
            for (Artist line: artist1) {
                System.out.println("What is your rating of " + line.getName() + "? Enter a rating 1-10");
                int yourrating = a.nextInt();
                System.out.println("This artist " + line.getName() + " released this album " + line.getAlbum() + "\n Their twitter is: " + line.getTwitter());
            }


        }

        catch (FileNotFoundException e) {
            System.out.println("Error occured");
            e.printStackTrace();
        } }
}

    class Artist {

        String name;
        String album;
        String twitter;
        int rating;

    public Artist () {
        name = "n/a";
        album = "n/a";
        twitter = "n/a";
        rating = 0;
        
    }

    public String getName () {return name;}
    public String getAlbum() {return album;}
    public String getTwitter() {return twitter;}
    public int getRating() {return rating;}
    public void setName(String newName) {name = newName;}
    public void setAlbum(String newAlbum) {album = newAlbum;}
    public void setTwitter(String newTwitter) {twitter = newTwitter;}
    public void setRating(int newRating) {rating = newRating;}

    }


