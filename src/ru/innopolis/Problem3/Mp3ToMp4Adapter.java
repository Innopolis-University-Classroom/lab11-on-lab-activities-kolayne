package Problem3;

public class Mp3ToMp4Adapter implements MediaPlayer {
  public Mp3ToMp4Adapter(AudioPlayer mp3_playable) {
    this.mp3_playable = mp3_playable;
  }

  public AudioPlayer mp3_playable;

  public void playMp4() {
    System.out.print("Just-in-time conversion of mp3 into mp4: ");
    mp3_playable.playMp3();
  }
}