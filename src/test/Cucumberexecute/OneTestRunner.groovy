import org.junit.runner.RunWith

import io.cucumber.junit.CucumberOptions
import io.cucumber.junit.Cucumber
import io.cucumber.c21e
import org.junit.runner.RunWith
@RunWith(Cucumber)
@CucumberOptions(

        dryRun = false,
       // strict = true,
         plugin=["pretty"],
        stepNotifications = false,
        features = ["src/test/groovy"],
        glue = ["src/main/groovy"],

        tags ="@example1"


)

class OneTestRunner {
}
