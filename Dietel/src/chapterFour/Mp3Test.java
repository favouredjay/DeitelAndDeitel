//package africa.semicolon.mp3;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static africa.semicolon.mp3.MusicState.*;
//import static org.junit.jupiter.api.Assertions.*;
//
//public class Mp3Test {
//
//
//    @Test
//    void mp3Player_canBeCreated() {
//        africa.semicolon.mp3.Mp3 myMp3 = new africa.semicolon.mp3.Mp3();
//
//        assertNotNull(myMp3);
//    }
//
//    @Test
//    void mp3Player_turnedOn_whenFlipPowerButtonIsPressed_onOffState() {
//        //given
//        Mp3 myMp3 = new Mp3();
//        boolean isOff = !myMp3.isOn();
//        assertTrue(isOff);
//        //when
//        myMp3.flipPowerButton();
//        //assert
//        assertTrue(myMp3.isOn());
//    }
//
//    @Test
//    void mp3Player_turnedOn_whenFlipPowerButtonIsPressed_onOnState() {
//        //given
//        Mp3 myMp3 = new Mp3();
//        myMp3.flipPowerButton();
//        boolean isOn = myMp3.isOn();
//        assertTrue(isOn);
//        //when
//        myMp3.flipPowerButton();
//        //assert
//        assertFalse(myMp3.isOn());
//    }
//
//    @Test
//    void mp3Player_canDownloadMusic() {
//        Mp3 myMp3 = new Mp3();
//        myMp3.flipPowerButton();
//        ;
//        assertTrue(myMp3.isOn());
//
//        Music music = new Music();
//        //when
//        myMp3.download(music);
//        assertEquals(1, myMp3.getTotalNumberOfMusic());
//        Music secondMusic = new Music();
//        myMp3.download(secondMusic);
//        assertEquals(2, myMp3.getTotalNumberOfMusic());
//
//    }
//
//    @Test
//    void mp3Player_cantDownloadMusic_whenPlayerIsOff() {
//        Mp3 myMp3 = new Mp3();
//        assertFalse(myMp3.isOn());
//
//        Music music = new Music();
//        assertNotNull(music);
//        //when
//        myMp3.download(music);
//        assertEquals(0, myMp3.getTotalNumberOfMusic());
//        Music secondMusic = new Music();
//        myMp3.download(secondMusic);
//        assertEquals(0, myMp3.getTotalNumberOfMusic());
//    }
//
//    @Test
//    void mp3Player_canDeleteDownLoadedMusic() {
//        Mp3 myMp3 = new Mp3();
//        myMp3.flipPowerButton();
//        assertTrue(myMp3.isOn());
//
//        Music music = new Music();
//        Music secondMusic = new Music();
//        myMp3.download(music);
//        myMp3.download(secondMusic);
//        myMp3.delete(music);
//        assertEquals(1, myMp3.getTotalNumberOfMusic());
//        //when
//        myMp3.delete(secondMusic);
//        assertEquals(0, myMp3.getTotalNumberOfMusic());
//    }
//
//    @Test
//    void mp3Player_cantDelete_whenMusicEmpty() {
//        Mp3 myMp3 = new Mp3();
//        myMp3.flipPowerButton();
//        assertTrue(myMp3.isOn());
//
//        Music music = new Music();
//        Music secondMusic = new Music();
//        myMp3.download(music);
//        myMp3.download(secondMusic);
//        assertEquals(2, myMp3.getTotalNumberOfMusic());
//        //when
//        myMp3.delete(music);
//        assertEquals(1, myMp3.getTotalNumberOfMusic());
//        myMp3.delete(secondMusic);
//        assertEquals(0, myMp3.getTotalNumberOfMusic());
//        myMp3.delete(music);
//        assertEquals(0, myMp3.getTotalNumberOfMusic());
//    }
//
//    @Test
//    void mp3Player_cantDelete_whenMusicIsOff() {
//        Mp3 myMp3 = new Mp3();
//        Music music = new Music();
//        myMp3.flipPowerButton();
//
//        myMp3.download(music);
//        myMp3.flipPowerButton();
//        assertFalse(myMp3.isOn());
//        assertEquals(1, myMp3.getTotalNumberOfMusic());
//        //when
//        myMp3.delete(music);
//        assertEquals(1, myMp3.getTotalNumberOfMusic());
//
//    }
//
//    @Test
//    void mp3Player_cannotDownloadSameSongTwice() {
//        Mp3 myMp3 = new Mp3();
//        myMp3.flipPowerButton();
//        Music music = new Music();
//        myMp3.download(music);
//        assertEquals(1, myMp3.getTotalNumberOfMusic());
//
//        //when
//        myMp3.download(music);
//        //assert
//        assertEquals(1, myMp3.getTotalNumberOfMusic());
//    }
//
//
//    @Test
//    void mp3Player_canPlayMusic() {
//        Mp3 myMp3 = new Mp3();
//        myMp3.flipPowerButton();
//        Music ajibole = new Music();
//        myMp3.download(ajibole);
//        assertEquals(1, myMp3.getTotalNumberOfMusic());
//
//        //when
//        myMp3.play(ajibole);
//        //assert
//        assertEquals(PLAYING, myMp3.getMusicState());
//        assertEquals(ajibole, myMp3.getCurrentlyPlayingMusic());
//
//        //when
//        myMp3.pauseMusic();
//        //assert
//        assertEquals(PAUSED, myMp3.getMusicState());
//        assertEquals(ajibole, myMp3.getCurrentlyPlayingMusic());
//
//    }
//
//    @Test
//    void mp3Player_canPauseMusic() {
//        Mp3 myMp3 = new Mp3();
//        myMp3.flipPowerButton();
//        Music ajibole = new Music();
//        myMp3.download(ajibole);
//        assertEquals(1, myMp3.getTotalNumberOfMusic());
//        myMp3.play(ajibole);
//        //when
//        myMp3.pauseMusic();
//        //assert
//        assertEquals(PAUSED, myMp3.getMusicState());
//        assertEquals(ajibole, myMp3.getCurrentlyPlayingMusic());
//    }
//
//    @Test
//    void mp3Player_canStopMusic(){
//        Mp3 myMp3 = new Mp3();
//        myMp3.flipPowerButton();
//        Music ajibole = new Music();
//        myMp3.download(ajibole);
//        assertEquals(1, myMp3.getTotalNumberOfMusic());
//
//        myMp3.stop();
//        assertEquals(STOPPED, myMp3.getMusicState());
//
//    }
//
//    @Test
//    void mp3_canIncreaseVolume(){
//        Mp3 myMp3 = new Mp3();
//        myMp3.flipPowerButton();
//        Music ajibole = new Music();
//        myMp3.download(ajibole);
//        myMp3.play(ajibole);
//
//        myMp3.increaseVolume();
//        myMp3.increaseVolume();
//        myMp3.increaseVolume();
//        myMp3.increaseVolume();
//        assertEquals(4, myMp3.getVolume());
//
//
//    }
//
//    @Test
//    void mp3_canDecreaseVolume(){
//        Mp3 myMp3 = new Mp3();
//        myMp3.flipPowerButton();
//        Music ajibole = new Music();
//        myMp3.download(ajibole);
//
//        myMp3.play(ajibole);
//        myMp3.increaseVolume();
//        myMp3.increaseVolume();
//        myMp3.increaseVolume();
//        myMp3.decreaseVolume();
////        myMp3.decreaseVolume();
//        assertEquals(2, myMp3.getVolume());
//    }
//    @Test
//    void mp3_canRepeatSongs(){
//        Mp3 myMp3 = new Mp3();
//        myMp3.flipPowerButton();
//        Music ajibole = new Music();
//        myMp3.download(ajibole);
//        assertEquals(1, myMp3.getTotalNumberOfMusic());
//
////        myMp3.stop();
////        assertEquals(STOPPED, myMp3.getMusicState());
//
//        myMp3.play(ajibole);
//        //assert
////        assertEquals(REPEAT, myMp3.getMusicState());
//       assertEquals(PLAYING, myMp3.getMusicState());
//
//        myMp3.stop();
//        assertEquals(STOPPED, myMp3.getMusicState());
//
//        myMp3.repeatSong();
//        assertEquals(REPEAT, myMp3.getMusicState());
//
//    }
//    @Test
//    void mp3_canSkipSongs(){
//        Mp3 myMp3 = new Mp3();
//        myMp3.flipPowerButton();
//        Music ajibole = new Music();
//        Music secondMusic = new Music();
//        myMp3.download(ajibole);
//        assertEquals(1, myMp3.getTotalNumberOfMusic());
//        myMp3.download(secondMusic);
//        assertEquals(2, myMp3.getTotalNumberOfMusic());
//
//        myMp3.play(ajibole);
//        assertEquals(PLAYING, myMp3.getMusicState());
//        assertEquals(ajibole, myMp3.getCurrentlyPlayingMusic());
//
//        myMp3.skipSong();
//        assertEquals(secondMusic, myMp3.getCurrentlyPlayingMusic());
//    }
//    @Test
//    void mp3_canPlayPreviousSongs(){
//        Mp3 myMp3 = new Mp3();
//        myMp3.flipPowerButton();
//        Music ajibole = new Music();
//        Music secondMusic = new Music();
//        myMp3.download(ajibole);
//        assertEquals(1, myMp3.getTotalNumberOfMusic());
//        myMp3.download(secondMusic);
//        assertEquals(2, myMp3.getTotalNumberOfMusic());
//
//
//        myMp3.play(ajibole);
//        assertEquals(PLAYING, myMp3.getMusicState());
//
//
//        myMp3.skipSong();
//        assertEquals(PLAYING, myMp3.getMusicState());
//        assertEquals(secondMusic, myMp3.getCurrentlyPlayingMusic());
//
//        myMp3.playPreviousSong();
//        assertEquals(ajibole, myMp3.getCurrentlyPlayingMusic());
//    }
//
//    @Test
//    void playlist_canBeCreated(){
//        Mp3 myMp3 = new Mp3();
//        myMp3.flipPowerButton();
//        Music ajibole = new Music();
//        Music secondMusic = new Music();
//        myMp3.download(ajibole);
//        assertEquals(1, myMp3.getTotalNumberOfMusic());
//        myMp3.download(secondMusic);
//        assertEquals(2, myMp3.getTotalNumberOfMusic());
//
//
//        myMp3.play(ajibole);
//        assertEquals(PLAYING, myMp3.getMusicState());
//
//
//        myMp3.skipSong();
//        assertEquals(PLAYING, myMp3.getMusicState());
//        assertEquals(secondMusic, myMp3.getCurrentlyPlayingMusic());
//
//        myMp3.playPreviousSong();
//        assertEquals(ajibole, myMp3.getCurrentlyPlayingMusic());
//    }
//}
