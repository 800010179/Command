package app;

public class PullUpCommand implements Command{

	private SilverScreen valkokangas;
	
	public PullUpCommand(SilverScreen valkokangas) {
		this.valkokangas = valkokangas;
	}
	
	@Override
	public void execute() {
		valkokangas.pullUp();
	}

}
