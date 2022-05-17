import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class CoffeeMachineTest {
    CoffeeMachine cm;
    @BeforeEach
    public void init(){
        cm = new CoffeeMachine();
    }
    @Test
    public void make3Coffee(){
        cm.makeCoffeeStub(3);
        assertEquals(0,cm.credit);
        assertEquals(3, cm.coffee);
    }
    @Test
    public void make100Coffee(){
        cm.makeCoffeeStub(100);
        assertEquals(0,cm.credit);
        assertEquals(100, cm.coffee);
    }
    @AfterEach
    public void clear(){
        cm = null;
    }

}