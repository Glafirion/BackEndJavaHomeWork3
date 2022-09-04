package TestLesson3BackendJava;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static java.lang.String.valueOf;


public class PalindromeTesting {
    //Lev s yma lamy svel
    private boolean isPalindrome(String word) {
        return true;
    }

    @Test
    void palindromeTest() {
        boolean result = isPalindrome(String.valueOf(939939));
        Assertions.assertTrue(result);
    }
    @ParameterizedTest
    @ValueSource(strings = {"753357", "7 5 3 3 5 7"})
    void isPalindromeTestWithDataProviderT(String word) {
        boolean result = isPalindrome(word);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"753357", " 753 3 5 7"})
    void isPalindromeTestWithDataProviderTree(String word) {
        boolean result = isPalindrome(word);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"753357", "7535357"})
    void isPalindromeTestWithDataProvider(String word) {
        boolean result = isPalindrome(word);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"753357", "-7535357"})
    void isPalindromeTestWithDataProviderF(String word) {
        boolean result = isPalindrome(word);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @CsvSource({"159,false", "654456,true"})
    void csvTest(String word, boolean expectedResult) {
        boolean actualResult = isPalindrome(word);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}

