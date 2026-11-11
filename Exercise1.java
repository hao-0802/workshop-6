public class Exercise1 {
    public static void main(String[] args) {
        // 歌曲数组 10首
        String[] songs = {
                "Song1", "Song2", "Song3", "Song4", "Song5",
                "Song6", "Song7", "Song8", "Song9", "Song10"
        };
        // 对应歌手
        String[] artists = {
                "ArtistA", "ArtistB", "ArtistC", "ArtistD", "ArtistE",
                "ArtistF", "ArtistG", "ArtistH", "ArtistI", "ArtistJ"
        };

        //循环输出
        System.out.println("Song ---- Artist");
        for(int i = 0; i < songs.length; i++){
            System.out.println(songs[i] + "  |  " + artists[i]);
        }
    }
}
