package com.redhat.bpms.examples.mortgage.service;

public class SimpleCreditService implements CreditService {

	@Override
	public Integer getCreditScore(Integer ssn) {
		int lastDigit = ssn - 10 * ( ssn / 10 );
		int score = 600 + ( lastDigit * 20 );
		System.out.println( "For ssn " + ssn + ", will return credit score of " + score );
		return score;
	}

}
