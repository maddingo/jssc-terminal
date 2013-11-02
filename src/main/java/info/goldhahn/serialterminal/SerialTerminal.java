package info.goldhahn.serialterminal;

import org.apache.pivot.beans.BXMLSerializer;
import org.apache.pivot.collections.Map;
import org.apache.pivot.wtk.Application;
import org.apache.pivot.wtk.Display;
import org.apache.pivot.wtk.Window;

public class SerialTerminal implements Application {

	private Window window;

	@Override
	public void startup(Display display, Map<String, String> properties)
			throws Exception {
		BXMLSerializer bxmlSerializer = new BXMLSerializer();
		window = (Window) bxmlSerializer.readObject(SerialTerminal.class,
				"/terminal.xml");
		window.open(display);

	}

	@Override
	public boolean shutdown(boolean optional) throws Exception {
		if (window != null) {
			window.close();
		}

		return false;
	}

	@Override
	public void suspend() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() throws Exception {
		// TODO Auto-generated method stub

	}

}
