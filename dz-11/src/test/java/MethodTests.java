import com.tyshchenko.genders.Man;
import com.tyshchenko.genders.Women;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MethodTests {

    Man man = new Man("Igor","Antonenko", 68,true);
    Women women = new Women("Bogdana","Vakulenko", 61, true, "Vakulenko");
    @Test
    public void testIfManRetired() {
        Assert.assertEquals(man.isRetired(),true, "this Man is retired");
    }

    @Test
    public void testIfWomenRetired() {
        Assert.assertEquals(women.isRetired(), true, "this Women is retired");
    }

    @Test
    public void testRegisterPartnership() {
        women.registerPartnership(man);
        Assert.assertEquals(women.lastName, "Antonenko", "lastname was changed");
    }

    @Test
    public void testDeregisterPartnership() {
        women.registerPartnership(man);
        women.deregisterPartnership(man);
        Assert.assertEquals(women.lastName, "Vakulenko");
    }


}
