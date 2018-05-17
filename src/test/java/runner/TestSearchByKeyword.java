package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/search/search_by_keyword.feature")
public class TestSearchByKeyword {
	
	
}
