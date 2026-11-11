public class Exercise2 {
    public static void main(String[] args) {
        String[] songs = {
                "Zebra Song", "Apple Song", "Moon Song", "Sun Song", "Rain Song",
                "Bird Song", "Cat Song", "Dog Song", "Egg Song", "Fish Song"
        };
        String[] artists = {
                "A1", "A2", "A3", "A4", "A5",
                "A6", "A7", "A8", "A9", "A10"
        };

        // ========== 冒泡排序 ==========
        int n = songs.length;
        for(int i = 0; i < n -1; i++){
            for(int j = 0; j < n - 1 - i; j++){
                // compareTo：字符串比较字母顺序
                // songs[j] > songs[j+1] 就交换
                if(songs[j].compareTo(songs[j+1]) > 0){
                    //交换歌曲
                    String tempSong = songs[j];
                    songs[j] = songs[j+1];
                    songs[j+1] = tempSong;

                    //【必须同步交换歌手！】
                    String tempArtist = artists[j];
                    artists[j] = artists[j+1];
                    artists[j+1] = tempArtist;
                }
            }
        }

        //输出排序后
        System.out.println("=== Sorted Songs (A‑Z) ===");
        for(int i=0; i<songs.length;i++){
            System.out.println(songs[i] + " | " + artists[i]);
        }
    }
}
