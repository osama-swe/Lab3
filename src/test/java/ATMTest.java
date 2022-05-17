import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class ATMTest {
    ATM atm;

    @Nested
     class Test{
        @BeforeEach
        public void init(){
            atm = new ATM();
        }

        @org.junit.jupiter.api.Test
        public void withdraw1000WithNoCredit(){

            assertEquals(0, atm.withdraw(1000));
        }
        @org.junit.jupiter.api.Test
        public void withdraw1000WithStub(){

            assertEquals(1000, atm.withdrawStub(1000));
        }
        @org.junit.jupiter.api.Test
        public void deposit1000WithDraw600Remaining400(){
            atm.addCredit(1000);
            assertEquals(600, atm.withdraw(600));
            assertEquals(400, atm.balance);
        }
    }

    @AfterEach
    public void clear(){
        atm = null;
    }
}