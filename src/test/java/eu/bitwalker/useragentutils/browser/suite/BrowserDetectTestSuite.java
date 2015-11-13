package src.test.java.eu.bitwalker.useragentutils.browser.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import src.test.java.eu.bitwalker.useragentutils.browser.BlackberryParameterizedTest;
import src.test.java.eu.bitwalker.useragentutils.browser.BotParameterizedTest;
import src.test.java.eu.bitwalker.useragentutils.browser.CFNetworkParameterizedTest;
import src.test.java.eu.bitwalker.useragentutils.browser.CaminoParameterizedTest;
import src.test.java.eu.bitwalker.useragentutils.browser.ChromeMobileParameterizedTest;
import src.test.java.eu.bitwalker.useragentutils.browser.ChromeParameterizedTest;
import src.test.java.eu.bitwalker.useragentutils.browser.FirefoxParameterizedTest;
import src.test.java.eu.bitwalker.useragentutils.browser.InternetExplorerMobileParameterizedTest;
import src.test.java.eu.bitwalker.useragentutils.browser.InternetExplorerParameterizedTest;
import src.test.java.eu.bitwalker.useragentutils.browser.InternetExplorerXboxParameterizedTest;
import src.test.java.eu.bitwalker.useragentutils.browser.KonquerorParameterizedTest;
import src.test.java.eu.bitwalker.useragentutils.browser.LotusParameterizedTest;
import src.test.java.eu.bitwalker.useragentutils.browser.LynxParameterizedTest;
import src.test.java.eu.bitwalker.useragentutils.browser.OperaParameterizedTest;
import src.test.java.eu.bitwalker.useragentutils.browser.OthersParameterizedTest;
import src.test.java.eu.bitwalker.useragentutils.browser.OutlookParameterizedTest;
import src.test.java.eu.bitwalker.useragentutils.browser.SafariParameterizedTest;
import src.test.java.eu.bitwalker.useragentutils.browser.ThunderbirdParameterizedTest;
import src.test.java.eu.bitwalker.useragentutils.browser.ToolParameterizedTest;

@RunWith(Suite.class)
@SuiteClasses({ 
		BlackberryParameterizedTest.class, 
		BotParameterizedTest.class,
		CaminoParameterizedTest.class, 
		CFNetworkParameterizedTest.class,
		ChromeParameterizedTest.class,
		ChromeMobileParameterizedTest.class, 
		FirefoxParameterizedTest.class,
		InternetExplorerMobileParameterizedTest.class,
		InternetExplorerParameterizedTest.class,
		InternetExplorerXboxParameterizedTest.class,
		KonquerorParameterizedTest.class, 
		LotusParameterizedTest.class,
		LynxParameterizedTest.class, 
		OperaParameterizedTest.class,
		OthersParameterizedTest.class, 
		OutlookParameterizedTest.class,
		SafariParameterizedTest.class, 
		ThunderbirdParameterizedTest.class,
		ToolParameterizedTest.class })
public class BrowserDetectTestSuite {

}
