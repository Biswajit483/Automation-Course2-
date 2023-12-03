package LearnTesting;

import org.testng.annotations.Test;

public class BringDataDifferentClass {
	@Test(dataProvider = "ticketData", dataProviderClass = DataProvideInSameClass.class)

	public void bookMyFlightTickets(String fromAddress, String toAddress, String noOfTickets) {

	System.out.println("fromAddress is " + fromAddress + " and to address is " + toAddress + " And I need " + noOfTickets + " tickets to be booked.");

	}

	}


