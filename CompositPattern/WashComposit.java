import java.util.ArrayList;
import java.util.List;

public class WashComposit implements Washable {
    private List<Washable> washables;

    WashComposit() {
        this.washables = new ArrayList<>();
    }

    public void add(Washable w) {
        this.washables.add(w);
    }

    public void remove(Washable w) {
        this.washables.remove(w);
    }

	@Override
	public void wash() {
		this.washables.stream().forEach((w) -> {
            w.wash();
        });
	}
}