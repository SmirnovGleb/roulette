package by.epam.roulette;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import by.epam.roulette.converter.TestMD5Converter;
import by.epam.roulette.logic.TestCalculateWinnings;
import by.epam.roulette.logic.TestMakeArrayBets;
import by.epam.roulette.validator.TestUserParametersValidator;

/**
 * The Class TestRoulette.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ TestMD5Converter.class, TestCalculateWinnings.class, TestMakeArrayBets.class, TestUserParametersValidator.class })
public class TestRoulette {

}
