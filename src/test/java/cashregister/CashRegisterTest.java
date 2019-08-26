package cashregister;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CashRegisterTest {
	private  static MockPrinter mockPrinter;
	private  static CashRegister cashRegister;
	
	@BeforeAll
	private static void setUp()
	{
		mockPrinter=new MockPrinter();
		cashRegister=new CashRegister(mockPrinter);
	}
	
	@Test
	   public void should_print_the_real_purchase_when_call_process() {
        //given
    	Item items[]= {new Item("test product", 1)};
    	Purchase purchase=new Purchase(items);
        //when
    	
    	cashRegister.process(purchase);
        //then
    	assertEquals("test product\t1.0\n", mockPrinter.getTempText());
    }

	
  /*  @Test
    
    public void should_print_the_real_purchase_when_call_process() {
        //given
    	Item items[]= {new Item("test product", 1)};
    	Purchase purchase=new Purchase(items);
    	MockPrinter mockPrinter=new MockPrinter();
    	CashRegister cashRegister=new CashRegister(mockPrinter);
        //when
    	
    	cashRegister.process(purchase);
        //then
    	assertEquals("test product\t1.0\n", mockPrinter.getTempText());
    }*/

    @Test
    public void should_print_the_stub_purchase_when_call_process() {
        //given
        //when
        //then
    }

    @Test
    public void should_verify_with_process_call_with_mockito() {
        //given
        //when
        //then
    }

}
