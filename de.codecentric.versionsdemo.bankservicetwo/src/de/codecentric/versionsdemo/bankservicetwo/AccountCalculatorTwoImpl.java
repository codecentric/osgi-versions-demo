package de.codecentric.versionsdemo.bankservicetwo;

import org.osgi.service.component.annotations.*;

import de.codecentric.versionsdemo.api.AccountCalculator;

@Component(service=AccountCalculator.class, name="Calc2")
public class AccountCalculatorTwoImpl implements AccountCalculator{

	@Override
	public double calculateAmount(String bankCode, String accountNumber) {
		String action = 
				String.format("Calculating ammount for bankCode %s and accountNumber %s"
						+ " with bank service 2", bankCode, accountNumber);
		System.out.println(action);
		return 2.0;
	}

}
