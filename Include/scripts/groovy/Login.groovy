import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.ConditionType

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

class Login {

	@Given("User opens the browser")
	def void userOpensBrowser() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://demoqa.com/login')
	}

	@When("User enters username {string}")
	def void userEntersUsername(String username) {
		WebUI.setText(findTestObject('Object Repository/Login_02/Page_DEMOQA/inputuserName'), username)
	}

	@And("User enters encrypted password {string}")
	def void userEntersEncryptedPassword(String encryptedPassword) {
		WebUI.setEncryptedText(findTestObject('Object Repository/Login_02/Page_DEMOQA/inputpassword'), encryptedPassword)
	}

	@And("User clicks on the Login button")
	def void userClicksLoginButton() {
		WebUI.click(findTestObject('Object Repository/Login_02/Page_DEMOQA/button_Login'))
	}

	@Then("User closes the browser")
	def void userClosesBrowser() {
		WebUI.closeBrowser()
	}
}
