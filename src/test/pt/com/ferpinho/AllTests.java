package test.pt.com.ferpinho;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import pt.com.ferpinho.dao.ClienteServiceTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ ClienteServiceTest.class, ContratoServiceTest.class })
public class AllTests {
}