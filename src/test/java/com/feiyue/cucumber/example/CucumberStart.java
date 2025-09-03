import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.feiyue.stepdefs",
        plugin = {
                "pretty",
                "json:target/cucumber.json",
                "html:target/cucumber-html-report",
                "io.qameta.allure.cucumberjvm.AllureCucumberJvm"  // 关键：生成 Allure 结果
        }
)
public class CucumberStart {
}// sss