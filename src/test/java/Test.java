import com.sun.org.slf4j.internal.LoggerFactory;
import org.junit.jupiter.api.*;
import sun.security.pkcs11.wrapper.Functions;
import junit.jupiter.params.ParameterizedTest;
import junit.jupiter.params.provider.ValueSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory


import java.util.logging.Logger;

public class Test {
    Functions functions = new Functions();
    private static Logger logger = LoggerFactory.getLogger(CommonTest.class);

    @BeforeAll
    static void beforeAllTests() {
        logger.info("Before all tests");
    }
    @Test
    void test() {
        boolean result = functions.isNumberEven(5);
        Assertions.assertFalse(result);
    }
}
