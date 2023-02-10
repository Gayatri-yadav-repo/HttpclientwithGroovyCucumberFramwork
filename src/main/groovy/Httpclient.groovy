import cucumber.api.PendingException

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)
import io.cucumber.java8.En

When(~/^Make a POST API call$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}


Then(~/^Verify the post API call$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}