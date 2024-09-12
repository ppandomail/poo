package encapsulamiento;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JPuntoTest {

  @Test
  public void testGetters() {
    JPunto p = new JPunto(3, 4);
    assertEquals(p.getX(), 3.0);
    assertEquals(p.getY(), 4);
  }

}
