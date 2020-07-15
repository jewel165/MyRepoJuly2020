package testSets;

import org.testng.annotations.Test;

import basicSetup.BasicSetUp;

public class AZ_Cart_test extends BasicSetUp {
	
	AZsearch_Test src = new AZsearch_Test();

	
	
	@Test
	public void AZcartTEST() throws Exception {
		src.AmazonSearch();
		
		System.out.println("nEW Code");
		
	}

}
