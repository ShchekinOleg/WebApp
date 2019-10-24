import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import service.AuthorTest;
import service.BookAttributeTest;
import service.BookTest;
import service.OrderTest;
import validation.PhoneValidatorTest;

@RunWith(Suite.class)
 @Suite.SuiteClasses({
         AuthorTest.class,
         BookAttributeTest.class,
         BookTest.class,
         OrderTest.class,
         PhoneValidatorTest.class,

 })

public class JunitTestSuite {
}
