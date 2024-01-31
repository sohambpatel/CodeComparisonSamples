package org.example;

import java.awt.event.ActionEvent;
import java.io.IOException;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class UIDiffblueTest {
  /**
   * Method under test: {@link UI#init()}
   */
  @Test
  @Disabled("TODO: Complete this test")
  void testInit() throws IOException {
    // TODO: Complete this test.
    //   Reason: R013 No inputs found that don't throw a trivial exception.
    //   Diffblue Cover tried to run the arrange/act section, but the method under
    //   test threw
    //   java.awt.HeadlessException
    //       at java.desktop/java.awt.GraphicsEnvironment.checkHeadless(GraphicsEnvironment.java:166)
    //       at java.desktop/java.awt.Window.<init>(Window.java:553)
    //       at java.desktop/java.awt.Frame.<init>(Frame.java:428)
    //       at java.desktop/javax.swing.JFrame.<init>(JFrame.java:224)
    //       at org.example.UI.<init>(UI.java:68)
    //   See https://diff.blue/R013 to resolve this issue.

    // Arrange and Act
    (new UI()).init();
  }

  /**
   * Method under test: {@link UI#actionPerformed(ActionEvent)}
   */
  @Test
  @Disabled("TODO: Complete this test")
  void testActionPerformed() throws IOException {
    // TODO: Complete this test.
    //   Reason: R013 No inputs found that don't throw a trivial exception.
    //   Diffblue Cover tried to run the arrange/act section, but the method under
    //   test threw
    //   java.awt.HeadlessException
    //       at java.desktop/java.awt.GraphicsEnvironment.checkHeadless(GraphicsEnvironment.java:166)
    //       at java.desktop/java.awt.Window.<init>(Window.java:553)
    //       at java.desktop/java.awt.Frame.<init>(Frame.java:428)
    //       at java.desktop/javax.swing.JFrame.<init>(JFrame.java:224)
    //       at org.example.UI.<init>(UI.java:68)
    //   See https://diff.blue/R013 to resolve this issue.

    // Arrange
    UI ui = new UI();

    // Act
    ui.actionPerformed(new ActionEvent("42", 1, "foo"));
  }

  /**
   * Method under test: {@link UI#reader()}
   */
  @Test
  @Disabled("TODO: Complete this test")
  void testReader() throws IOException {
    // TODO: Complete this test.
    //   Reason: R013 No inputs found that don't throw a trivial exception.
    //   Diffblue Cover tried to run the arrange/act section, but the method under
    //   test threw
    //   java.awt.HeadlessException
    //       at java.desktop/java.awt.GraphicsEnvironment.checkHeadless(GraphicsEnvironment.java:166)
    //       at java.desktop/java.awt.Window.<init>(Window.java:553)
    //       at java.desktop/java.awt.Frame.<init>(Frame.java:428)
    //       at java.desktop/javax.swing.JFrame.<init>(JFrame.java:224)
    //       at org.example.UI.<init>(UI.java:68)
    //   See https://diff.blue/R013 to resolve this issue.

    // Arrange and Act
    (new UI()).reader();
  }

  /**
   * Method under test: {@link UI#writer(Double)}
   */
  @Test
  @Disabled("TODO: Complete this test")
  void testWriter() throws IOException {
    // TODO: Complete this test.
    //   Reason: R013 No inputs found that don't throw a trivial exception.
    //   Diffblue Cover tried to run the arrange/act section, but the method under
    //   test threw
    //   java.awt.HeadlessException
    //       at java.desktop/java.awt.GraphicsEnvironment.checkHeadless(GraphicsEnvironment.java:166)
    //       at java.desktop/java.awt.Window.<init>(Window.java:553)
    //       at java.desktop/java.awt.Frame.<init>(Frame.java:428)
    //       at java.desktop/javax.swing.JFrame.<init>(JFrame.java:224)
    //       at org.example.UI.<init>(UI.java:68)
    //   See https://diff.blue/R013 to resolve this issue.

    // Arrange and Act
    (new UI()).writer(10.0d);
  }

  /**
   * Method under test: default or parameterless constructor of {@link UI}
   */
  @Test
  @Disabled("TODO: Complete this test")
  void testNewUI() throws IOException {
    // TODO: Complete this test.
    //   Reason: R013 No inputs found that don't throw a trivial exception.
    //   Diffblue Cover tried to run the arrange/act section, but the method under
    //   test threw
    //   java.awt.HeadlessException
    //       at java.desktop/java.awt.GraphicsEnvironment.checkHeadless(GraphicsEnvironment.java:166)
    //       at java.desktop/java.awt.Window.<init>(Window.java:553)
    //       at java.desktop/java.awt.Frame.<init>(Frame.java:428)
    //       at java.desktop/javax.swing.JFrame.<init>(JFrame.java:224)
    //       at org.example.UI.<init>(UI.java:68)
    //   See https://diff.blue/R013 to resolve this issue.

    // Arrange and Act
    new UI();
  }
}
