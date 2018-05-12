/*
 * dumme Frage -> dumme Antwort: weil Zeile 2 und 4 nicht identisch sind *facepalm*
 * 
 */
public class Stereoanlage {
	public void play(Playable p) {
		p.song();
	}
	
	public static void main(String[] args) {
		Stereoanlage s=new Stereoanlage();
		Playable pl=new CD();
		s.play(pl);
		pl=new Kassette();
		s.play(pl);
	}
}
