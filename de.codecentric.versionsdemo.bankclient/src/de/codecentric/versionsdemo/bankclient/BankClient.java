package de.codecentric.versionsdemo.bankclient;

import org.osgi.service.component.annotations.*;

import de.codecentric.versionsdemo.api.AccountCalculator;
import de.codecentric.versionsdemo.bankserviceone.AccountCaclulatorOneImpl;
import de.codecentric.versionsdemo.bankservicetwo.AccountCalculatorTwoImpl;

@Component(immediate=true)
public class BankClient {

	private AccountCalculator accountCalculatorOne;
	
	private AccountCalculator accountCalculatorTwo;
	
	
	@Reference(target="(component.name=Calc1)")
	protected void setAccountCalculatorOne(AccountCalculator accountCaclulatorImpl){
		this.accountCalculatorOne = accountCaclulatorImpl;
	}
	
	@Reference(target="(component.name=Calc2)")
	protected void setAccountCalculatorTwo(AccountCalculator accountCalculatorTwoImpl){
		this.accountCalculatorTwo = accountCalculatorTwoImpl;
	}
	
	 @Activate
	 public void activate() throws Exception {
		 accountCalculatorOne.calculateAmount("111111111", "11111");
		 accountCalculatorTwo.calculateAmount("222222222", "22222");		 
	 }


}
