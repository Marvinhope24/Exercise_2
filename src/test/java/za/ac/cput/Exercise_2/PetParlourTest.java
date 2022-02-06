package za.ac.cput.Exercise_2;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

public class PetParlourTest extends TestCase {

    private PetParlour petIn;
    private PetParlour petOut;
    private PetParlour Balance;

    @BeforeEach
    public void setUp() {
        petIn = new PetParlour();
        petOut = petIn;
        Balance = new PetParlour();
    }

    @Test // Marvin
    public void testIdentity() {
        assertSame(petIn,petOut);
    }

    @Test //Rhegan
    @Timeout(2)
    public void testEquality(){
        assertEquals(petIn, petOut);
    }

    @Test // Mariam
    public void testFail(){
        assertSame(petIn, petOut);
        fail("This will fail");
    }

    @Test
    @Disabled // Chanté
    public void testDisabled(){
        assertEquals(petIn,petOut);
    }
}