package io.zipcoder.iotools;

import driverslicense.MyStringUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by mikailaakeredolu on 5/23/16.
 */
public class MyStringUtilsTest {
    @Test
    public void converter() throws Exception {

        String[] myArray = {"Mike","Jones","123"};
        String expectedValues = "Mike,Jones,123";
        String actualValue = MyStringUtils.converter(myArray);
        Assert.assertEquals(expectedValues,actualValue);
    }

    @Test
    public void breakUpArrayOfStrings() throws Exception {
        String myString = "This\nis\na\nstring";
        String[] expectedValue = {"This","is","a","string"};
        String []actualValue = MyStringUtils.breakUpArrayOfStrings(myString);
        Assert.assertArrayEquals(expectedValue,actualValue);
    }

    @Test
    public void reverse() throws Exception {
        String revCapitalize = "REVERSE CAPITALIZE";
        String expectedValue = "rEVERSE cAPITALIZE";
        String actualValue = MyStringUtils.reverse(revCapitalize);
        Assert.assertEquals(expectedValue,actualValue);
    }

    @Test
    public void reverseEachWwordTest() throws  Exception{
        String revWord = "black white";
        String expectedValue = "kcalb etihw";
        String actualValue = MyStringUtils.reverseEachWword(revWord);
        Assert.assertEquals(expectedValue,actualValue);
    }

    @Test
    public void removeWhitespaces() throws Exception {
        String sample = "fake string";
        String expectedValue ="fake\nstring";
        String actualValue = MyStringUtils.removeWhitespaces(sample);
    Assert.assertEquals(expectedValue,actualValue);
    }

    @Test
    public void subArrayTest() throws Exception {
        String sample = "she";
        String[] expectedValue = {"s","sh","she","h","he","e"};
        ArrayList actualValue = MyStringUtils.subArray(sample);
        Assert.assertArrayEquals(expectedValue,actualValue.toArray());

    }

    @Test
    public void optional() throws Exception {

    }

}