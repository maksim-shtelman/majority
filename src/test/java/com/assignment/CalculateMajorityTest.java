package com.assignment;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

import com.assignment.exceptions.EmptyListException;
import com.assignment.exceptions.NoMajorityException;
import com.assignment.CalculateMajority;

public class CalculateMajorityTest {

    @Test
    public void testFindMajorityElementWithMajority() throws Exception{
        CalculateMajority calculateMajority = new CalculateMajority();
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,1,2,1,3));

        assertEquals((Integer) 1, calculateMajority.findMajorityElement(nums));
    }

    @Test
    public void testFindMajorityElementWithoutMajority() {
        CalculateMajority calculateMajority = new CalculateMajority();
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,1,2,2));
        try {
            calculateMajority.findMajorityElement(nums);
            fail("Expected NoMajorityException");
        } catch (NoMajorityException e) {
            // success
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testFindMajorityElementWithEmptyList() {
        CalculateMajority calculateMajority = new CalculateMajority();
        ArrayList<Integer> nums = new ArrayList<>();
        try {
            calculateMajority.findMajorityElement(nums);
            fail("Expected EmptyListException to be thrown");
        } catch (EmptyListException e) {
            // success
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }
}