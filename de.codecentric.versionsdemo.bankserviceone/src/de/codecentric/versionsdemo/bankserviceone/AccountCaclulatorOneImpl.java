package de.codecentric.versionsdemo.bankserviceone;

import org.osgi.service.component.annotations.Component;

import de.codecentric.versionsdemo.api.AccountCalculator;

@Component(service=AccountCalculator.class, name="Calc1")
public class AccountCaclulatorOneImpl implements AccountCalculator {

	@Override
	public double calculateAmount(String bankCode, String accountNumber) {
		String action = 
				String.format("Calculating ammount for bankCode %s and accountNumber %s"
						+ " with bank service 1", bankCode, accountNumber);
		System.out.println(action);
		return 1.0;
	}



}
