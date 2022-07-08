import javax.inject.Inject;

public class Library {

    @Inject
    public Library() {

    }

    // To reproduce bug:
    // Change the name of this method, i.e. from doSomething1() to doSomething2() in an incremental change.
    public void doSomething1() {

    }
}
