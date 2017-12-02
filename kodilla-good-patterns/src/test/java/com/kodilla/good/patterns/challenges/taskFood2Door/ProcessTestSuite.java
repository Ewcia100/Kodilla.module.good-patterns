package com.kodilla.good.patterns.challenges.taskFood2Door;

import org.junit.Assert;
import org.junit.Test;

public class ProcessTestSuite {
    @Test
    public void testProcessExtraFoodShopAcceptedMoreThan0() {
        //Given
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();

        //When
        boolean result = extraFoodShop.process("Extra Food Shop", "apple", 20, "kg");

        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testProcessExtraFoodShopRejectedEqualsZero() {
        //Given
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();

        //When
        boolean result = extraFoodShop.process("Extra Food Shop", "apple", 0, "kg");

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testProcessGlutenFreeShopAcceptedKgLessThan100() {
        //Given
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();

        //When
        boolean result = glutenFreeShop.process("Gluten Free Shop", "apple", 20, "kg");

        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testProcessGlutenFreeShopAcceptedPcsLessThan100() {
        //Given
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();

        //When
        boolean result = glutenFreeShop.process("Gluten Free Shop", "apple", 20, "pcs");

        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testProcessGlutenFreeShopAcceptedPcsMoreThan100() {
        //Given
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();

        //When
        boolean result = glutenFreeShop.process("Gluten Free Shop", "apple", 200, "pcs");

        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testProcessGlutenFreeShopRejectedKgMoreThan100() {
        //Given
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();

        //When
        boolean result = glutenFreeShop.process("Gluten Free Shop", "apple", 200, "kg");

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testProcessHealthyShopAcceptedWithUnits() {
        //Given
        HealthyShop healthyShop = new HealthyShop();

        //When
        boolean result = healthyShop.process("Gluten Free Shop", "apple", 200, "kg");

        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testProcessHealthyShopRejectedWithoutUnits() {
        //Given
        HealthyShop healthyShop = new HealthyShop();

        //When
        boolean result = healthyShop.process("Gluten Free Shop", "apple", 200, null);

        //Then
        Assert.assertFalse(result);
    }

}

