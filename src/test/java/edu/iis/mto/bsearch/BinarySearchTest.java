package edu.iis.mto.bsearch;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class BinarySearchTest {

    @Test
    public void searchedElementIsInSequence() {
        SearchResult result = BinarySearch.search(2, new int[]{2});
        assertThat(result.isFound(), is(true));
        assertThat(result.getPosition(), is(1));
    }

    @Test
    public void searchedElementIsNotInSequence() {
        SearchResult result = BinarySearch.search(3, new int[]{2});
        assertThat(result.isFound(), is(false));
        assertThat(result.getPosition(), is(-1));
    }

    @Test
    public void searchedElementIsAtTheBeginning() {
        SearchResult result = BinarySearch.search(2, new int[]{2,4,6});
        assertThat(result.isFound(), is(true));
        assertThat(result.getPosition(), is(1));
    }

    @Test
    public void searchedElementIsAtTheEnd() {
        SearchResult result = BinarySearch.search(6, new int[]{2,4,6});
        assertThat(result.isFound(), is(true));
        assertThat(result.getPosition(), is(3));
    }

    @Test
    public void searchedElementIsInTheMiddle() {
        SearchResult result = BinarySearch.search(6, new int[]{2,4,6,8,10});
        assertThat(result.isFound(), is(true));
        assertThat(result.getPosition(), is(3));
    }

    @Test
    public void searchedElementIsNotInLongerSequence() {
        SearchResult result = BinarySearch.search(5, new int[]{2,4,6,8,10});
        assertThat(result.isFound(), is(false));
        assertThat(result.getPosition(), is(-1));
    }
}