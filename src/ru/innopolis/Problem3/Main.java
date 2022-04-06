package Problem3;

public class Main {
  public static void main(String[] args) {
    Media media = new Media();
    Audio audio = new Audio();
    Mp3ToMp4Adapter converter = new Mp3ToMp4Adapter(audio);
    PlayerDevice pd = new PlayerDevice();

    // Usual behavior:
    pd.playMp4(media);

    // Adapted behavior:
    pd.playMp4(converter);
  }
}