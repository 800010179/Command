package app;

public class Main {

	public static void main(String[] args) {
		SilverScreen valkokangas = new SilverScreen();
		Command nosta = new PullUpCommand(valkokangas);
		Command laske = new PushDownCommand(valkokangas);
		WallButton nappi1 = new WallButton(nosta);
		WallButton nappi2 = new WallButton(laske);
		
		nappi1.push();
		nappi2.push();
	}

}
