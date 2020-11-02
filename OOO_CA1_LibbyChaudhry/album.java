package assetment;
import javax.swing.*;
public class album {
    private String song;
    private String trackname;
    private String producer;
    private int releaseyear;

}
    public album{(int releaseyear, String trackname,String description, String song ){
        setTrackname(trackname);setProducer(producer);
        setSong(song);
        setReleaseyear(releaseyear);


    }
    public String getSong(){
        return song;
        }

    public void setSong(String Song){
        this.song = song
        }

     public String gettrackname(){
        return trackname;
        }

      public void settrackname(String trackname) {
        this.trackname;

}
      public String getProducer(){
        return Producer;
        }

       public void setProducer(String Producer){
        this.Producer;
        }

        public int getReleaseyear(){
            return releaseyear;
        }

        public void setReleaseyear(int Releaseyear){
            this.releaseyear;
        }

    public static void setProducer(artist){
        trackname.song = producer;
        }

        public toString(){
        return "song:" + getSong() + "producer:" + getProducer () +
        "release year: " + getReleaseyear()  + "track name:" + gettrackname();
        }

        public int getSong(){

        int noOfSongs = 5
         songs[] songs;

        for(int i=0; i< song.length; i++) {
            if (song[i] ! = null){
                producer = song[i].trackname();

                for (int j =0 j<trackname; j++){
                    if(trackname[j] ! = null)
                        noOfSongs++;
                }
            }
        }
            return noOfsongs;
        }

    }
