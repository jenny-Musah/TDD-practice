import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HumanTest {

    Human vicky;

    @BeforeEach
    public void creatObject(){
        vicky = new Human();

    }


    @Test
    public void humanObjectCanBeCreated(){
        assertNotNull(vicky);
    }

    @Test
    public void humanCanTalk(){
        vicky.saySomething("fuck you");
     assertEquals("fuck you", vicky.talk());

    }

}
