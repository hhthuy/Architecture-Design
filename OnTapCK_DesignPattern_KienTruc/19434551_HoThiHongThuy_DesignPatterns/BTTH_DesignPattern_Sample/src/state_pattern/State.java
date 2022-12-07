package state_pattern;

import javax.naming.Context;

public interface State {
	public void doAction(Context context);

	void doAction(state_pattern.Context context);
}
