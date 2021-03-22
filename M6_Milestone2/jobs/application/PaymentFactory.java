package M6_Milestone2.jobs.application;

import M6_Milestone2.jobs.domain.IPaymentRate;

public class PaymentFactory { // Increased salaries

	public static IPaymentRate createPaymentRateBoss(){
		return new IPaymentRate() {	
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth * 1.5; // +50% of base salary
			}
		};
	}
	
	public static IPaymentRate createPaymentRateManager(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth * 1.1; // +10% of base salary 
			}
		};
	}

	public static IPaymentRate createPaymentRateSeniorEmployee(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth * 0.95; // -5% of base salary
			}
		};
	}
	
	public static IPaymentRate createPaymentRateMidEmployee(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth * 0.9; // -10% of base salary
			}
		};
	}
	
	public static IPaymentRate createPaymentRateJuniorEmployee(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth * 0.85; // -15% of base salary
			}
		};
	}
	
}
