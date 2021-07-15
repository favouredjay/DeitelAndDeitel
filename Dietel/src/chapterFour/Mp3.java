//package africa.semicolon.mp3;
//
//import java.util.ArrayList;
//
//import static africa.semicolon.mp3.MusicState.*;
//
//public class Mp3 {
//    private boolean isOn;
//    private ArrayList<Music> musicList = new ArrayList<>();
//    private Music currentPlayingMusic;
//    private MusicState currentMusicState;
//    private int volume;
//
//    public boolean isOn() {
//        return isOn;
//    }
//
//    public void flipPowerButton() {
//        if (isOn) isOn = false;
//        else {
//            isOn = true;
//        }
//    }
//
//    public void download(Music music) {
//        if (isOn)
//            if (!musicList.contains(music))
//                musicList.add(music);
//    }
//
//    public int getTotalNumberOfMusic() {
//        return musicList.size();
//    }
//
//    public void delete(Music music) {
//        if (isOn)
//
//            musicList.remove(music);
//    }
//
//    public void play(Music music) {
//        currentPlayingMusic = music;
//        currentMusicState = PLAYING;
//
//    }
//
//    public MusicState getMusicState() {
//        return currentMusicState;
//    }
//
//    public Music getCurrentlyPlayingMusic() {
//        return currentPlayingMusic;
//    }
//
//    public void pauseMusic() {
////        currentlyPlayingMusic = music;
//        currentMusicState = PAUSED;
//    }
//
//    public void stop() {
//        currentMusicState = STOPPED;
//    }
//
//    public void increaseVolume() {
//        if(isOn)
//        if (currentMusicState == PLAYING) {
//            volume ++;
//        }
//    }
//
//    public void decreaseVolume() {
//        if(isOn)
//        if (currentMusicState == PLAYING) {
//            volume--;
//        }
//    }
//
//    public int getVolume() {
//        return volume;
//    }
//
//    public void repeatSong() {
//        if(isOn)
//        currentMusicState = REPEAT;
//    }
//
//
//    public void skipSong() {
//        if(isOn)
//        for (int musicCounter = 0; musicCounter < musicList.size(); musicCounter++) {
//            if (musicList.get(musicCounter) == currentPlayingMusic) {
//                currentPlayingMusic = musicList.get(musicCounter + 1);
//                break;
//            }
//
//        }
//    }
//
//    public void playPreviousSong() {
//        if(isOn)
//        for (int musicCounter = 0; musicCounter < musicList.size(); musicCounter++) {
//            if (musicList.get(musicCounter) == currentPlayingMusic) {
//                currentPlayingMusic = musicList.get(musicCounter - 1);
//                break;
//
//            }
//        }
//
//    }
//}
