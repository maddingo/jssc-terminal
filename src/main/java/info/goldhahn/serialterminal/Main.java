package info.goldhahn.serialterminal;

import org.apache.pivot.beans.BXMLSerializer;
import org.apache.pivot.collections.Map;
import org.apache.pivot.wtk.Application;
import org.apache.pivot.wtk.DesktopApplicationContext;
import org.apache.pivot.wtk.Display;
import org.apache.pivot.wtk.Window;

public class Main implements Application {

	public static void main(String[] args) {
	  DesktopApplicationContext.main(Main.class, args);
	}

  private Window window;

  @Override
  public void startup(Display display, Map<String, String> properties) throws Exception {
    BXMLSerializer bxmlSerializer = new BXMLSerializer();
    window = (Window) bxmlSerializer.readObject(MainWindow.class,
        "/terminal.xml");
    window.open(display, null);
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
