package cashregister;

import javax.xml.transform.Templates;

public class MockPrinter extends Printer {
 private String TempText="";
	

	public String getTempText() {
	return TempText;
}


public void setTempText(String tempText) {
	TempText = tempText;
}


	@Override
	public void print(String printThis) {	
		super.print(printThis);
		TempText=printThis;
	
        
    }
}
