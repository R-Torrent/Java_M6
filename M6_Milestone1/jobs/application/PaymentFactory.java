package M6_Milestone1.jobs.application;

import M6_Milestone1.jobs.domain.IPaymentRate;

public class PaymentFactory {

	public static IPaymentRate createPaymentRateBoss() {
		return new IPaymentRate() {	
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth * 1.5; // +50%
			}
		};
	}
	
	public static IPaymentRate createPaymentRateManager() {
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth * 1.1; // +10% 
			}
		};
	}
	
	public static IPaymentRate createPaymentRateEmployee() {
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth * .85; // -15%
			}
		};
	}
	
}
