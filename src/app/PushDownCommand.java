package app;

public class PushDownCommand implements Command{
	private SilverScreen valkokangas;
	
	public PushDownCommand(SilverScreen valkokangas) {
		this.valkokangas = valkokangas;
	}
	
	@Override
	public void execute() {
		valkokangas.pushDown();
	}
}
