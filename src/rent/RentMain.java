package rent;

import java.math.BigDecimal;

public class RentMain {

	public static void main(String[] args) {
		RentAttributes obj1 = new RentAttributes();
		obj1.setTenantName("Charan Singh");
		obj1.setAmountPaid(new BigDecimal(0));
		obj1.setMonthyRent(new BigDecimal(4000));
		obj1.setCurrentReading(1500);
		obj1.setPreviousReading(1000);
		obj1.setMainMeterBillAmount(new BigDecimal(2100));
		obj1.setMainMeterUnits(700);
		
		RentAttributes obj2 = new RentAttributes();
		obj2.setTenantName("Rashmi Saini");
		obj2.setAmountPaid(new BigDecimal(0));
		obj2.setMonthyRent(new BigDecimal(7000));
		obj2.setCurrentReading(4500);
		obj2.setPreviousReading(4300);
		obj2.setMainMeterBillAmount(new BigDecimal(2100));
		obj2.setMainMeterUnits(700);
		
		RentAttributes obj3 = new RentAttributes();
		obj3.setTenantName("Seema");
		obj3.setAmountPaid(new BigDecimal(0));
		obj3.setMonthyRent(new BigDecimal(7500));
		obj3.setCurrentReading(500);
		obj3.setPreviousReading(100);
		obj3.setMainMeterBillAmount(new BigDecimal(2100));
		obj3.setMainMeterUnits(700);
		
		
		RentAttributes obj4 = new RentAttributes("Shiv", new BigDecimal(500), new BigDecimal(0), new BigDecimal(2100), 700, 980, 700);
		RentAttributes obj5 = new RentAttributes("RashmiSSSS", new BigDecimal(800), new BigDecimal(0), new BigDecimal(2100), 700, 980, 750);
		RentAttributes obj6 = new RentAttributes("RashmiSSSS", new BigDecimal(800), new BigDecimal(0), new BigDecimal(2100), 700, 980, 750);

	}

}
