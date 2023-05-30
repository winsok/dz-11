import com.tyshchenko.genders.Man;
import com.tyshchenko.genders.Women;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetsetTests {

    Man man = new Man("Igor","Antonenko", 68,true);
    Women women = new Women("Bogdana","Vakulenko", 61, true, "Vakulenko");

    // Getters Tests for Man and Women
    @Test
    public void getFirstNameManTest() {
        Assert.assertEquals(man.getFirstName(),"Igor");
    }
    @Test
    public void getLastNameManTest() {
        Assert.assertEquals(man.getLastName(),"Antonenko");
    }

    @Test
    public void getAgeManTest() {
        Assert.assertEquals(man.getAge(),68);
    }
    @Test
    public void getPartnerManTest() {
        Assert.assertEquals(man.getPartner(),true);
    }

    @Test
    public void getFirstNameWomenTest() {
        Assert.assertEquals(women.getFirstName(),"Bogdana");
    }
    @Test
    public void getLastNameWomenTest() {
        Assert.assertEquals(women.getLastName(),"Vakulenko");
    }

    @Test
    public void getAgeWomenTest() {
        Assert.assertEquals(women.getAge(),61);
    }
    @Test
    public void getPartnerWomenTest() {
        Assert.assertEquals(women.getPartner(),true);
    }

    @Test
    public void getPreviousLastnameWomenTest() {
        Assert.assertEquals(women.getPreviousLastname(),"Vakulenko");
    }

// Setters Tests for Man and Women

    @Test
    public void setFirstNameWomenTest() {
        women.setFirstName("Anna");
        Assert.assertEquals(women.getFirstName(),"Anna");
    }
    @Test
    public void setLastNameWomenTest() {
        women.setLastName("Ivanova");
        Assert.assertEquals(women.getLastName(),"Ivanova");
    }

    @Test
    public void setAgeWomenTest() {
        women.setAge(50);
        Assert.assertEquals(women.getAge(),50);
    }

    @Test
    public void setPartnerWomenTest() {
        women.setPartner(false);
        Assert.assertEquals(women.getPartner(),false);
    }

    @Test
    public void setPreviousLastNameWomenTest() {
        women.setPreviousLastname("Krabova");
        Assert.assertEquals(women.getPreviousLastname(),"Krabova");
    }


    @Test
    public void setFirstNameManTest() {
        man.setFirstName("Denis");
        Assert.assertEquals(man.getFirstName(),"Denis");
    }
    @Test
    public void setLastNameManTest() {
        man.setLastName("Ivanov");
        Assert.assertEquals(man.getLastName(),"Ivanov");
    }

    @Test
    public void setAgeManTest() {
        man.setAge(50);
        Assert.assertEquals(man.getAge(),50);
    }

    @Test
    public void setPartnerManTest() {
        man.setPartner(false);
        Assert.assertEquals(man.getPartner(),false);
    }





}
