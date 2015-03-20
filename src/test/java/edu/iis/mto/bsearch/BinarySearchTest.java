package edu.iis.mto.bsearch;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class BinarySearchTest {

    @Test
    public void searchedElementIsInSequence() {
        SearchResult result = BinarySearch.search(2, new int[]{2});
        assertTrue(result.isFound());
    }

    @Test
    public void searchedElementIsNotInSequence() {
        SearchResult result = BinarySearch.search(3, new int[]{2});
        assertFalse(result.isFound());
    }

    @Test
         public void searchedElementIsAtTheBeginning() {
        SearchResult result = BinarySearch.search(2, new int[]{2,4,6});
        assertTrue(result.isFound());
    }

    @Test
    public void searchedElementIsAtTheEnd() {
        SearchResult result = BinarySearch.search(6, new int[]{2,4,6});
        assertTrue(result.isFound());
    }

    @Test
    public void searchedElementIsInTheMiddle() {
        SearchResult result = BinarySearch.search(6, new int[]{2,4,6,8,10});
        assertTrue(result.isFound());
    }

    @Test
    public void searchedElementIsNotInLongerSequence() {
        SearchResult result = BinarySearch.search(5, new int[]{2,4,6,8,10});
        assertFalse(result.isFound());
    }
}