package test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ AddTest.class, DivisionTest.class, MultiplicationTest.class, SubtractionTest.class })
public class AllTests {

}
