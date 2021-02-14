package Codewars;

public class Dubstep {

    public static String SongDecoder (String song)
    {
        return song.replaceAll("(WUB)+", " ").trim();
    }

    public static void main(String[] args) {
        String result = SongDecoder("RWUBWUBWUBLWUB");
        System.out.println(result);
    }
}
