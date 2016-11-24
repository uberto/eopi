package com.gamasoft.eopi.cap17_DynamicProgramming;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by uberto on 24/11/16.
 */

// 17.2
public class LevenshteinDistanceTest {


    @Test
    public void zeroStep() throws Exception {
        Assert.assertEquals(0, LevenshteinDistance.measure("abcde", "abcde"));
    }

    @Test
    public void oneStep() throws Exception {
        Assert.assertEquals(1, LevenshteinDistance.measure("aaa", "aa"));
        Assert.assertEquals(1, LevenshteinDistance.measure("aaa", "aba"));
        Assert.assertEquals(1, LevenshteinDistance.measure("a", "ab"));
        Assert.assertEquals(1, LevenshteinDistance.measure("abcde", "abde"));
        Assert.assertEquals(1, LevenshteinDistance.measure("abcde", "abcfde"));
        Assert.assertEquals(1, LevenshteinDistance.measure("abcde", "abfde"));

    }

    @Test
    public void twoSteps() throws Exception {

        Assert.assertEquals(2, LevenshteinDistance.measure("a", "bb"));
        Assert.assertEquals(2, LevenshteinDistance.measure("aaa", "a"));
        Assert.assertEquals(2, LevenshteinDistance.measure("aa", "bb"));
        Assert.assertEquals(2, LevenshteinDistance.measure("ab", "ba"));
        Assert.assertEquals(2, LevenshteinDistance.measure("abcde", "abdce"));
        Assert.assertEquals(2, LevenshteinDistance.measure("abcde", "bcdef"));
    }


    @Test
    public void daysOfTheWeek() throws Exception {

        Assert.assertEquals(2, LevenshteinDistance.measure("sunday", "monday"));
        Assert.assertEquals(3, LevenshteinDistance.measure("saturday", "sunday"));
        Assert.assertEquals(5, LevenshteinDistance.measure("friday", "saturday"));
        Assert.assertEquals(6, LevenshteinDistance.measure("friday", "yadirf"));

    }



    @Test
    public void veryLong() throws Exception {

        Assert.assertEquals(135, LevenshteinDistance.measure(
                "In information theory and computer science, the Levenshtein distance is a string metric for measuring the difference between two sequences.",
                "Informally, the Levenshtein distance between two words is the minimum number of single-character edits (i.e. insertions, deletions or substitutions) required to change one word into the other."));

    }


    @Test
    public void verySimilar() throws Exception {

        Assert.assertEquals(53, LevenshteinDistance.measure(
                "In information theory and computer science, the Levenshtein distance is a string metric for measuring the difference between two sequences. Informally, the Levenshtein distance between two words is the minimum number of single-character edits (i.e. insertions, deletions or substitutions) required to change one word into the other.",
                "Ininformaiton tehoury and compiuter scence, the Levenstan distanse is a strign mertic for mezurin the differencies betwheen too secuenses. Informally, the Lveensthtein ditsacne between tu woursd is the minimum nanber of sainglecharacter edits (i.e. inserzions, delesions or sustitutions) requiared to cahnge uan word intu the ohter."));

    }
}
