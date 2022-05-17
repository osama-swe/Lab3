import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class DigitalWatchTest {
    DigitalWatch w;
    @BeforeEach
    public void init(){
        w = new DigitalWatch();
    }
    @Test
    public void IncrementHour(){
        w.Increment();
        assertEquals(01, w.hour);
    }
    @Test
    public void IncrementMin(){
        w.changeState();
        w.Increment();
        w.Increment();
        assertEquals(02, w.min);
    }
    @Test
    public void IncrementYear(){
    w.changeState();
    w.changeState();
    w.Increment();
    w.Increment();
    assertEquals(2002, w.year);

    }
    @Test
    public void IncrementMonth(){
        w.changeState();
        w.changeState();
        w.changeState();
        w.Increment();
        w.Increment();
        w.Increment();
        assertEquals(04, w.month);
    }
    @Test
    public void IncrementDay(){
        w.changeState();
        w.changeState();
        w.changeState();
        w.changeState();
        w.Increment();
        assertEquals(02, w.day);
    }
    @AfterEach
    public void clear(){
        w = null;
    }
}