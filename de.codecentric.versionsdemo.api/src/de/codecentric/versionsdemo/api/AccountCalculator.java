package de.codecentric.versionsdemo.api;

import org.osgi.service.component.annotations.*;


public interface AccountCalculator {

	double calculateAmount(String bankCode, String accountNumber);

}
