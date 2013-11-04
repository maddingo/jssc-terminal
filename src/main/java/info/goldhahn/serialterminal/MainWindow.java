package info.goldhahn.serialterminal;

import java.net.URL;

import lombok.Getter;
import lombok.Setter;

import org.apache.pivot.beans.BXML;
import org.apache.pivot.beans.Bindable;
import org.apache.pivot.collections.Map;
import org.apache.pivot.util.Resources;
import org.apache.pivot.wtk.Action;
import org.apache.pivot.wtk.Component;
import org.apache.pivot.wtk.Frame;
import org.apache.pivot.wtk.MenuBar;
import org.apache.pivot.wtk.MenuHandler;
import org.apache.pivot.wtk.TabPane;
import org.apache.pivot.wtk.TextInput;
import org.apache.pivot.wtk.TextInputContentListener;
import org.apache.pivot.wtk.TextInputSelectionListener;
import org.apache.pivot.wtk.Window;

public class MainWindow extends Frame implements Bindable {

//  @BXML
//  @Getter
//  private MenuBar menuBar;
//  
//  @Getter
//  @BXML
//  private TabPane tabPane;

//  private MenuHandler menuHandler = new MenuHandler.Adapter() {
//    TextInputContentListener textInputTextListener = new TextInputContentListener.Adapter() {
//      @Override
//      public void textChanged(TextInput textInput) {
//        updateActionState(textInput);
//      }
//    };
//
//    TextInputSelectionListener textInputSelectionListener = new TextInputSelectionListener() {
//      @Override
//      public void selectionChanged(TextInput textInput, int previousSelectionStart,
//          int previousSelectionLength) {
//        updateActionState(textInput);
//      }
//    };
//
//    @Override
//    public void configureMenuBar(Component component, MenuBar menuBar) {
//      if (component instanceof MainWindow) {
//      } else if (component instanceof TextInput) {
//        TextInput textInput = (TextInput) component;
//
//        updateActionState(textInput);
//        Action.getNamedActions().get("paste").setEnabled(true);
//
//        textInput.getTextInputContentListeners().add(textInputTextListener);
//        textInput.getTextInputSelectionListeners().add(textInputSelectionListener);
//      } else {
//        Action.getNamedActions().get("cut").setEnabled(false);
//        Action.getNamedActions().get("copy").setEnabled(false);
//        Action.getNamedActions().get("paste").setEnabled(false);
//      }
//    }
//
//    @Override
//    public void cleanupMenuBar(Component component, MenuBar menuBar) {
//      if (component instanceof TextInput) {
//        TextInput textInput = (TextInput) component;
//        textInput.getTextInputContentListeners().remove(textInputTextListener);
//        textInput.getTextInputSelectionListeners().remove(textInputSelectionListener);
//      }
//    }
//
//    private void updateActionState(TextInput textInput) {
//      Action.getNamedActions().get("cut").setEnabled(textInput.getSelectionLength() > 0);
//      Action.getNamedActions().get("copy").setEnabled(textInput.getSelectionLength() > 0);
//    }
//  };
//
  public MainWindow() {
    super("");
//    setMenuHandler(menuHandler);
    Action.getNamedActions().put("fileNew", new Action() {
      @Override
      public void perform(Component source) {
        /*
         * BXMLSerializer bxmlSerializer = new BXMLSerializer();
         * bxmlSerializer.getNamespace().put("menuHandler", menuHandler);
         * Component tab;
         * try {
         * tab = new Border((Component) bxmlSerializer.readObject(MenuBars.class, "document.bxml"));
         * } catch (IOException exception) {
         * throw new RuntimeException(exception);
         * } catch (SerializationException exception) {
         * throw new RuntimeException(exception);
         * }
         * tabPane.getTabs().add(tab);
         * TabPane.setTabData(tab, "Document " + tabPane.getTabs().getLength());
         * tabPane.setSelectedIndex(tabPane.getTabs().getLength() - 1);
         */
      }
    });
  }

  @Override
  public void initialize(Map<String, Object> namespace, URL location, Resources resources) {
    // TODO Auto-generated method stub

  }

//  public void setMenuBar(MenuBar menuBar) {
//    this.menuBar = menuBar;
//    add(menuBar);
//    menuBar.setVisible(true);
//    menuBar.setLocation(0, 0);
//    this.getMenuHandler().configureMenuBar(this, menuBar);
//  }
//
//  public void setTabPane(TabPane tabPane) {
//    this.tabPane = tabPane;
//  }
//
//  
}
