package hackerrank_examples;

import java.io.IOException;
import java.io.OutputStream;
import javafx.scene.control.TextArea;

public class TextAreaOutputStream extends OutputStream {
  private TextArea textArea;

  public TextAreaOutputStream(TextArea ta) {
    textArea = ta;
  }

  @Override
  public void write(int b) throws IOException {
    textArea.appendText(String.valueOf((char) b));
  }
}
