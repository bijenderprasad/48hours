
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateEmployee {

	testsession test = new testsession();
	registerloc rloc = new registerloc();
	loc lo = new loc();
	
	By register= lo.register;
	By firstname = rloc.firstname;
	
	@Test
	public void navigatetohomepage() {

		test.keywordsclass.launchurl("http://newtours.demoaut.com/mercurywelcome.php");
	}

	@Test (dependsOnMethods = "navigatetohomepage")
	public void navigateToRegisterPage() {
		test.keywordsclass.clickonRegisterbutton(register);
		
	}
	
	@Test  (dependsOnMethods = "navigateToRegisterPage")
	public void enterfirstname() {
		test.registerkeyword.enterfirstname(firstname, "Bijender");
	}
@Test
public void navigatetohomepage() {

	test.keywordsclass.launchurl("http://newtours.demoaut.com/mercurywelcome.php");
}

@Test (dependsOnMethods = "navigatetohomepage")
public void navigateToRegisterPage() {
	test.keywordsclass.clickonRegisterbutton(register);
}
  
	
}