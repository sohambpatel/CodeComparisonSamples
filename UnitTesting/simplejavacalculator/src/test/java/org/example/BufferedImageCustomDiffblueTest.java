package org.example;

import java.io.IOException;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class BufferedImageCustomDiffblueTest {
    /**
     * Method under test: {@link BufferedImageCustom#imageReturn()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testImageReturn() throws IOException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: input == null!
        //       at java.desktop/javax.imageio.ImageIO.read(ImageIO.java:1356)
        //       at org.example.BufferedImageCustom.imageReturn(BufferedImageCustom.java:18)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new BufferedImageCustom()).imageReturn();
    }
}
