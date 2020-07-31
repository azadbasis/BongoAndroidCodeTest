package com.bongo.test.anagram;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static com.bongo.test.utils.Constants.BLEAT;
import static com.bongo.test.utils.Constants.TABLE;
import static org.junit.Assert.*;

public class AnagramDetectionTest {

    private AnagramDetection detection;

    @Before
    public void setUp() throws Exception {
    detection=new AnagramDetection();
        System.out.println("Ready for testing");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Done with unit test");
    }
    @Test
    public void testAnagram(){
        boolean isAnagram=detection.isAnagram(BLEAT,TABLE);
        Assert.assertEquals("isAnagram: " + BLEAT + " and " + TABLE + " are anagrams",true,isAnagram);
    }

}