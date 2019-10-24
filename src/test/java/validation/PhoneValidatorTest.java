package validation;

import com.os.validation.PhoneValidator;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(value = Parameterized.class)
public class PhoneValidatorTest {
    public static String regEx;

    @Parameterized.Parameter
    public String phoneNumber;
    @Parameterized.Parameter(1)
    public boolean expectedResult;

    @Parameterized.Parameters
    public static Collection data() {
        init();

        return Arrays.asList(new Object[][]{
                {"380661234567", true},
                {"380997654321", true},
                {"380445554433", true},
                {"370445554433", false},
                {"180445554433", false},
        });
    }

    @BeforeClass
    public static void init() {
        regEx = PhoneValidator.getLocalPhoneRegex();
    }

    @Test
    public void testIsPhoneUkrLocal() {
        boolean result = PhoneValidator.isPhoneUkrLocal(phoneNumber);
        Assert.assertTrue(expectedResult == result);

    }
}
