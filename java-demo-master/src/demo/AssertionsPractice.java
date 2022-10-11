package demo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsPractice {

    @Test
    public void testHardAssertPass() {
        Assert.assertTrue(true);
        Assert.assertFalse(false);
    }

    @Test
    public void testHardAssertFail() {
        Assert.assertTrue(true);
        Assert.assertFalse(true);
    }

    @Test
    public void testSoftAssertPass() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(true);
        softAssert.assertFalse(true);
    }

    @Test
    public void testSoftAssertFail() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(false);
        softAssert.assertFalse(true);
        softAssert.assertAll();
    }


    @Test
    public void testComboPass1() {
        Assert.assertTrue(true);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(true);
    }

    @Test
    public void testComboPass2() {
        Assert.assertTrue(true);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(false);
    }

    @Test
    public void testComboFail() {
        Assert.assertTrue(false);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(false);
    }




}
