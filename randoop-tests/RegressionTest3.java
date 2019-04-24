import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        inventory0.setSugar((int) (short) 100);
        java.lang.String str13 = inventory0.toString();
        int int14 = inventory0.getCoffee();
        int int15 = inventory0.getCoffee();
        java.lang.String str16 = inventory0.toString();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str16.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setCoffee((int) '#');
        int int6 = inventory0.getChocolate();
        inventory0.setCoffee((int) (short) 0);
        java.lang.String str9 = inventory0.toString();
        int int10 = inventory0.getSugar();
        int int11 = inventory0.getSugar();
        inventory0.setSugar(32);
        inventory0.setSugar(32);
        int int16 = inventory0.getChocolate();
        edu.ncsu.csc326.coffeemaker.Recipe recipe17 = null;
        try {
            boolean boolean18 = inventory0.useIngredients(recipe17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str9.equals("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setCoffee((int) (short) 100);
        int int15 = inventory0.getMilk();
        java.lang.String str16 = inventory0.toString();
        int int17 = inventory0.getSugar();
        int int18 = inventory0.getSugar();
        int int19 = inventory0.getCoffee();
        edu.ncsu.csc326.coffeemaker.Recipe recipe20 = null;
        try {
            boolean boolean21 = inventory0.useIngredients(recipe20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str16.equals("Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        int int9 = inventory0.getChocolate();
        java.lang.String str10 = inventory0.toString();
        inventory0.setChocolate((-1));
        int int13 = inventory0.getChocolate();
        inventory0.setCoffee((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str10.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        inventory0.setMilk(0);
        int int6 = inventory0.getChocolate();
        inventory0.setCoffee(35);
        inventory0.setSugar(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getChocolate();
        inventory0.setCoffee((int) (byte) 1);
        inventory0.setCoffee((int) (byte) 1);
        int int8 = inventory0.getSugar();
        edu.ncsu.csc326.coffeemaker.Recipe recipe9 = null;
        try {
            boolean boolean10 = inventory0.useIngredients(recipe9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) 'a');
        int int6 = inventory0.getSugar();
        java.lang.String str7 = inventory0.toString();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 1\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 97\n"));
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        int int9 = inventory0.getCoffee();
        edu.ncsu.csc326.coffeemaker.Recipe recipe10 = null;
        try {
            boolean boolean11 = inventory0.useIngredients(recipe10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setChocolate((int) '#');
        inventory0.setSugar((int) (byte) 0);
        inventory0.setChocolate(15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) 1);
        inventory0.setSugar((int) (short) 100);
        inventory0.setSugar((int) 'a');
        java.lang.Class<?> wildcardClass12 = inventory0.getClass();
        edu.ncsu.csc326.coffeemaker.Recipe recipe13 = null;
        try {
            boolean boolean14 = inventory0.useIngredients(recipe13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setMilk(15);
        int int8 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass9 = inventory0.getClass();
        inventory0.setMilk((int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        java.lang.String str9 = inventory0.toString();
        inventory0.setSugar((int) (byte) 10);
        inventory0.setMilk(0);
        int int14 = inventory0.getCoffee();
        java.lang.String str15 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 10\nChocolate: 1\n" + "'", str15.equals("Coffee: 15\nMilk: 0\nSugar: 10\nChocolate: 1\n"));
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getChocolate();
        inventory0.setMilk((int) (short) -1);
        inventory0.setSugar(15);
        inventory0.setCoffee(10);
        inventory0.setMilk((int) (short) 10);
        inventory0.setChocolate((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        int int11 = inventory0.getChocolate();
        int int12 = inventory0.getMilk();
        int int13 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 100);
        java.lang.String str16 = inventory0.toString();
        java.lang.String str17 = inventory0.toString();
        int int18 = inventory0.getSugar();
        java.lang.Class<?> wildcardClass19 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 100\n" + "'", str16.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 100\n"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 100\n" + "'", str17.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 100\n"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setCoffee((int) (short) 100);
        inventory0.setSugar(100);
        java.lang.String str17 = inventory0.toString();
        int int18 = inventory0.getMilk();
        inventory0.setCoffee(0);
        int int21 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str17.equals("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getChocolate();
        java.lang.String str7 = inventory0.toString();
        inventory0.setCoffee((int) (short) 10);
        inventory0.setChocolate((int) (byte) 1);
        int int12 = inventory0.getSugar();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 32\nSugar: 100\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        int int11 = inventory0.getMilk();
        inventory0.setChocolate(32);
        inventory0.setChocolate((int) '4');
        inventory0.setSugar((int) (short) 1);
        int int18 = inventory0.getMilk();
        int int19 = inventory0.getCoffee();
        int int20 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        inventory0.setChocolate(15);
        int int4 = inventory0.getCoffee();
        inventory0.setCoffee(0);
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 97\nSugar: 35\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        inventory0.setChocolate(15);
        int int4 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass5 = inventory0.getClass();
        java.lang.String str6 = inventory0.toString();
        int int7 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str6.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setCoffee((int) '#');
        int int6 = inventory0.getChocolate();
        inventory0.setCoffee((int) (short) 0);
        inventory0.setMilk(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getSugar();
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getSugar();
        inventory0.setMilk(0);
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setChocolate((int) '#');
        inventory0.setSugar((int) (byte) 0);
        inventory0.setMilk((int) 'a');
        try {
            inventory0.addSugar("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        java.lang.String str8 = inventory0.toString();
        inventory0.setChocolate((int) ' ');
        int int11 = inventory0.getSugar();
        int int12 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        java.lang.String str8 = inventory0.toString();
        int int9 = inventory0.getSugar();
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
        int int11 = inventory0.getCoffee();
        int int12 = inventory0.getSugar();
        java.lang.String str13 = inventory0.toString();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 0\nSugar: 35\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setMilk(100);
        int int15 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 1);
        inventory0.setCoffee(100);
        int int20 = inventory0.getCoffee();
        int int21 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setChocolate((int) '#');
        inventory0.setSugar((int) (byte) 0);
        int int12 = inventory0.getMilk();
        inventory0.setCoffee(15);
        inventory0.setChocolate((int) (byte) 100);
        inventory0.setChocolate((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getMilk();
        inventory0.setChocolate((int) '4');
        int int10 = inventory0.getSugar();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        int int11 = inventory0.getMilk();
        int int12 = inventory0.getChocolate();
        java.lang.String str13 = inventory0.toString();
        int int14 = inventory0.getCoffee();
        int int15 = inventory0.getCoffee();
        int int16 = inventory0.getMilk();
        java.lang.String str17 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n" + "'", str17.equals("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n"));
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 32\nSugar: 15\nChocolate: 100\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) 1);
        int int8 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        inventory0.setCoffee((int) (short) 100);
        int int8 = inventory0.getMilk();
        inventory0.setSugar((int) '4');
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 10\nSugar: 10\nChocolate: 0\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        inventory0.setSugar((int) (short) 100);
        java.lang.String str13 = inventory0.toString();
        int int14 = inventory0.getCoffee();
        int int15 = inventory0.getCoffee();
        java.lang.String str16 = inventory0.toString();
        inventory0.setCoffee((int) (short) 10);
        int int19 = inventory0.getSugar();
        java.lang.String str20 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str16.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str20.equals("Coffee: 10\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setCoffee((int) (short) 100);
        inventory0.setSugar(100);
        java.lang.String str17 = inventory0.toString();
        int int18 = inventory0.getSugar();
        int int19 = inventory0.getSugar();
        int int20 = inventory0.getMilk();
        inventory0.setSugar((int) '4');
        inventory0.setChocolate((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str17.equals("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getMilk();
        inventory0.setMilk(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setMilk(15);
        int int8 = inventory0.getCoffee();
        inventory0.setSugar(100);
        try {
            inventory0.addChocolate("Coffee: 97\nMilk: 15\nSugar: 15\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        int int11 = inventory0.getMilk();
        inventory0.setChocolate(32);
        inventory0.setMilk(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        int int6 = inventory0.getChocolate();
        java.lang.String str7 = inventory0.toString();
        inventory0.setSugar((int) '4');
        inventory0.setCoffee((int) (short) 100);
        int int12 = inventory0.getSugar();
        java.lang.Class<?> wildcardClass13 = inventory0.getClass();
        try {
            inventory0.addChocolate("Coffee: 0\nMilk: 0\nSugar: 1\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setMilk((int) (short) 100);
        inventory0.setChocolate(1);
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 32\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        inventory0.setCoffee((int) (short) 100);
        inventory0.setSugar((int) (short) 100);
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        java.lang.Class<?> wildcardClass8 = inventory0.getClass();
        int int9 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setMilk(15);
        int int8 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass9 = inventory0.getClass();
        inventory0.setSugar((int) (byte) 0);
        inventory0.setChocolate(0);
        int int14 = inventory0.getMilk();
        int int15 = inventory0.getSugar();
        java.lang.String str16 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 0\n" + "'", str16.equals("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 0\n"));
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setMilk(15);
        int int8 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass9 = inventory0.getClass();
        try {
            inventory0.addMilk("Coffee: 100\nMilk: 15\nSugar: 52\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass5 = inventory0.getClass();
        inventory0.setCoffee(100);
        int int8 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getChocolate();
        int int8 = inventory0.getChocolate();
        int int9 = inventory0.getMilk();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setCoffee((-1));
        inventory0.setChocolate(1);
        inventory0.setSugar((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        int int9 = inventory0.getSugar();
        inventory0.setSugar(100);
        java.lang.String str12 = inventory0.toString();
        inventory0.setMilk((int) '#');
        int int15 = inventory0.getSugar();
        inventory0.setMilk((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str12.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        int int6 = inventory0.getCoffee();
        inventory0.setChocolate(15);
        int int9 = inventory0.getMilk();
        int int10 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        int int6 = inventory0.getMilk();
        int int7 = inventory0.getMilk();
        try {
            inventory0.addChocolate("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setChocolate((int) '#');
        inventory0.setSugar((int) (byte) 0);
        inventory0.setMilk((int) 'a');
        int int14 = inventory0.getChocolate();
        int int15 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 10);
        java.lang.String str18 = inventory0.toString();
        inventory0.setSugar((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Coffee: 15\nMilk: 10\nSugar: 0\nChocolate: 35\n" + "'", str18.equals("Coffee: 15\nMilk: 10\nSugar: 0\nChocolate: 35\n"));
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        inventory0.setCoffee(10);
        int int10 = inventory0.getMilk();
        int int11 = inventory0.getCoffee();
        inventory0.setCoffee((int) (byte) 10);
        int int14 = inventory0.getCoffee();
        int int15 = inventory0.getCoffee();
        inventory0.setMilk(15);
        java.lang.Class<?> wildcardClass18 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setCoffee(0);
        inventory0.setMilk(0);
        int int15 = inventory0.getChocolate();
        int int16 = inventory0.getCoffee();
        int int17 = inventory0.getChocolate();
        java.lang.String str18 = inventory0.toString();
        int int19 = inventory0.getMilk();
        inventory0.setSugar((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Coffee: 0\nMilk: 0\nSugar: 35\nChocolate: 1\n" + "'", str18.equals("Coffee: 0\nMilk: 0\nSugar: 35\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        java.lang.String str9 = inventory0.toString();
        inventory0.setSugar((int) (byte) 10);
        inventory0.setMilk(0);
        int int14 = inventory0.getCoffee();
        inventory0.setMilk(100);
        inventory0.setMilk(35);
        try {
            inventory0.addSugar("Coffee: 10\nMilk: 15\nSugar: 1\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setCoffee((int) (short) 100);
        inventory0.setSugar(100);
        java.lang.String str17 = inventory0.toString();
        java.lang.Class<?> wildcardClass18 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str17.equals("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setChocolate((int) '#');
        inventory0.setSugar((int) '4');
        int int12 = inventory0.getMilk();
        int int13 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setCoffee((int) '#');
        inventory0.setChocolate((int) (short) -1);
        java.lang.Class<?> wildcardClass8 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        int int11 = inventory0.getSugar();
        int int12 = inventory0.getMilk();
        inventory0.setChocolate(0);
        int int15 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        java.lang.String str4 = inventory0.toString();
        int int5 = inventory0.getSugar();
        inventory0.setCoffee((int) '#');
        java.lang.String str8 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str4.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 35\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str8.equals("Coffee: 35\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        java.lang.String str9 = inventory0.toString();
        inventory0.setSugar((int) (byte) 10);
        try {
            inventory0.addCoffee("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        inventory0.setSugar(1);
        inventory0.setSugar(100);
        inventory0.setSugar(97);
        inventory0.setMilk((int) (byte) 10);
        int int16 = inventory0.getChocolate();
        int int17 = inventory0.getMilk();
        int int18 = inventory0.getCoffee();
        int int19 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        int int4 = inventory0.getChocolate();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 32\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass4 = inventory0.getClass();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        inventory0.setMilk(0);
        inventory0.setCoffee((int) (short) 0);
        inventory0.setCoffee(15);
        int int10 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setMilk((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setSugar((int) (short) 10);
        int int15 = inventory0.getChocolate();
        int int16 = inventory0.getMilk();
        try {
            inventory0.addSugar("Coffee: 10\nMilk: 15\nSugar: 100\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        inventory0.setMilk(0);
        inventory0.setCoffee((int) (short) 0);
        int int8 = inventory0.getSugar();
        int int9 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        java.lang.String str6 = inventory0.toString();
        java.lang.String str7 = inventory0.toString();
        try {
            inventory0.addMilk("Coffee: 10\nMilk: 0\nSugar: 15\nChocolate: 0\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str6.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        inventory0.setChocolate(15);
        int int4 = inventory0.getCoffee();
        inventory0.setCoffee(0);
        int int7 = inventory0.getSugar();
        inventory0.setChocolate(52);
        inventory0.setSugar((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        java.lang.String str4 = inventory0.toString();
        int int5 = inventory0.getSugar();
        inventory0.setCoffee((int) '#');
        inventory0.setChocolate(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str4.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        int int8 = inventory0.getChocolate();
        inventory0.setCoffee((int) (byte) 10);
        int int11 = inventory0.getChocolate();
        int int12 = inventory0.getSugar();
        inventory0.setSugar(100);
        int int15 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        inventory0.setChocolate((int) (byte) 10);
        int int8 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        inventory0.setCoffee((int) (short) 100);
        inventory0.setCoffee((int) (short) 1);
        int int10 = inventory0.getCoffee();
        inventory0.setSugar(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getChocolate();
        int int6 = inventory0.getSugar();
        int int7 = inventory0.getMilk();
        inventory0.setSugar((int) (short) -1);
        inventory0.setSugar(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        java.lang.String str7 = inventory0.toString();
        inventory0.setSugar(1);
        java.lang.String str10 = inventory0.toString();
        inventory0.setMilk((int) (byte) 100);
        inventory0.setCoffee(15);
        int int15 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 1\nChocolate: 35\n" + "'", str10.equals("Coffee: 15\nMilk: 15\nSugar: 1\nChocolate: 35\n"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str5 = inventory0.toString();
        inventory0.setMilk(100);
        int int8 = inventory0.getMilk();
        int int9 = inventory0.getCoffee();
        int int10 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setSugar((int) (short) 10);
        int int15 = inventory0.getChocolate();
        int int16 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass17 = inventory0.getClass();
        int int18 = inventory0.getSugar();
        inventory0.setCoffee((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setChocolate((int) '#');
        inventory0.setSugar((int) (byte) 0);
        int int12 = inventory0.getMilk();
        inventory0.setCoffee(15);
        inventory0.setChocolate((int) (byte) 100);
        java.lang.String str17 = inventory0.toString();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 100\n" + "'", str17.equals("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 100\n"));
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setChocolate(15);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        int int11 = inventory0.getMilk();
        int int12 = inventory0.getChocolate();
        java.lang.String str13 = inventory0.toString();
        java.lang.Class<?> wildcardClass14 = inventory0.getClass();
        inventory0.setChocolate(10);
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 1\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 35\nChocolate: 1\n"));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setSugar(0);
        int int10 = inventory0.getMilk();
        int int11 = inventory0.getCoffee();
        java.lang.String str12 = inventory0.toString();
        inventory0.setMilk(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 15\n" + "'", str12.equals("Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 15\n"));
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setCoffee((int) '#');
        int int6 = inventory0.getChocolate();
        inventory0.setCoffee((int) (short) 0);
        int int9 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setCoffee((int) (short) 100);
        int int15 = inventory0.getMilk();
        java.lang.String str16 = inventory0.toString();
        int int17 = inventory0.getSugar();
        int int18 = inventory0.getSugar();
        int int19 = inventory0.getSugar();
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str16.equals("Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        int int5 = inventory0.getChocolate();
        inventory0.setMilk((int) (short) -1);
        inventory0.setSugar((int) '4');
        int int10 = inventory0.getSugar();
        inventory0.setCoffee(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        java.lang.String str9 = inventory0.toString();
        inventory0.setSugar((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setCoffee(0);
        inventory0.setMilk(0);
        int int15 = inventory0.getMilk();
        inventory0.setCoffee(10);
        java.lang.String str18 = inventory0.toString();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setCoffee(32);
        java.lang.String str23 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Coffee: 10\nMilk: 0\nSugar: 35\nChocolate: 1\n" + "'", str18.equals("Coffee: 10\nMilk: 0\nSugar: 35\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Coffee: 32\nMilk: 0\nSugar: 35\nChocolate: 1\n" + "'", str23.equals("Coffee: 32\nMilk: 0\nSugar: 35\nChocolate: 1\n"));
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setCoffee(0);
        int int9 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        int int9 = inventory0.getSugar();
        int int10 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass11 = inventory0.getClass();
        int int12 = inventory0.getChocolate();
        int int13 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getChocolate();
        int int8 = inventory0.getSugar();
        inventory0.setChocolate((int) (short) 0);
        inventory0.setMilk((int) (short) 10);
        int int13 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getChocolate();
        inventory0.setCoffee((int) (byte) 1);
        int int6 = inventory0.getChocolate();
        java.lang.Class<?> wildcardClass7 = inventory0.getClass();
        int int8 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        inventory0.setChocolate((int) (short) -1);
        int int3 = inventory0.getChocolate();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setSugar(32);
        int int9 = inventory0.getMilk();
        inventory0.setCoffee(35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getSugar();
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getSugar();
        inventory0.setCoffee((int) (byte) -1);
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
        try {
            inventory0.addSugar("Coffee: 10\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        int int9 = inventory0.getSugar();
        inventory0.setSugar(100);
        java.lang.String str12 = inventory0.toString();
        inventory0.setMilk((int) '#');
        int int15 = inventory0.getSugar();
        int int16 = inventory0.getSugar();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str12.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        int int8 = inventory0.getChocolate();
        inventory0.setCoffee((int) (byte) 10);
        inventory0.setCoffee((int) '#');
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setMilk(100);
        int int15 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 1);
        int int18 = inventory0.getChocolate();
        java.lang.String str19 = inventory0.toString();
        int int20 = inventory0.getMilk();
        int int21 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Coffee: 15\nMilk: 1\nSugar: 10\nChocolate: 1\n" + "'", str19.equals("Coffee: 15\nMilk: 1\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        int int11 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass12 = inventory0.getClass();
        int int13 = inventory0.getCoffee();
        inventory0.setMilk((int) (short) 100);
        inventory0.setCoffee(1);
        int int18 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        java.lang.String str9 = inventory0.toString();
        inventory0.setSugar((int) (byte) 10);
        inventory0.setMilk(0);
        int int14 = inventory0.getMilk();
        inventory0.setSugar((int) '#');
        java.lang.Class<?> wildcardClass17 = inventory0.getClass();
        java.lang.Class<?> wildcardClass18 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setCoffee((int) (short) 100);
        inventory0.setSugar(100);
        java.lang.String str17 = inventory0.toString();
        int int18 = inventory0.getSugar();
        int int19 = inventory0.getSugar();
        java.lang.Class<?> wildcardClass20 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str17.equals("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setSugar(0);
        inventory0.setMilk(100);
        inventory0.setCoffee((int) (byte) 1);
        inventory0.setChocolate(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        java.lang.String str5 = inventory0.toString();
        inventory0.setCoffee(100);
        int int8 = inventory0.getChocolate();
        int int9 = inventory0.getSugar();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 0\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        java.lang.Class<?> wildcardClass11 = inventory0.getClass();
        int int12 = inventory0.getCoffee();
        inventory0.setMilk(0);
        int int15 = inventory0.getChocolate();
        int int16 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setCoffee((int) '#');
        int int6 = inventory0.getChocolate();
        inventory0.setCoffee((int) (short) 0);
        java.lang.String str9 = inventory0.toString();
        int int10 = inventory0.getSugar();
        int int11 = inventory0.getSugar();
        inventory0.setSugar(32);
        inventory0.setChocolate(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str9.equals("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getChocolate();
        int int8 = inventory0.getChocolate();
        int int9 = inventory0.getMilk();
        inventory0.setMilk((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 10);
        try {
            inventory0.addCoffee("Coffee: 100\nMilk: 15\nSugar: 15\nChocolate: 100\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass7 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        java.lang.String str9 = inventory0.toString();
        inventory0.setSugar((int) (byte) 10);
        int int12 = inventory0.getSugar();
        int int13 = inventory0.getSugar();
        int int14 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getSugar();
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getSugar();
        inventory0.setCoffee((int) (byte) -1);
        java.lang.String str10 = inventory0.toString();
        inventory0.setChocolate((int) (byte) 0);
        int int13 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n" + "'", str10.equals("Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setMilk((int) (short) 100);
        java.lang.String str6 = inventory0.toString();
        java.lang.String str7 = inventory0.toString();
        inventory0.setSugar((int) (byte) 100);
        inventory0.setMilk((int) (byte) 100);
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 32\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n" + "'", str6.equals("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 100\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setChocolate(15);
        inventory0.setMilk((int) 'a');
        int int15 = inventory0.getSugar();
        java.lang.String str16 = inventory0.toString();
        int int17 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 15\nMilk: 97\nSugar: 35\nChocolate: 15\n" + "'", str16.equals("Coffee: 15\nMilk: 97\nSugar: 35\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        inventory0.setSugar((int) (short) 100);
        inventory0.setChocolate((int) (byte) 10);
        inventory0.setChocolate(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        inventory0.setSugar((int) (short) 100);
        java.lang.String str13 = inventory0.toString();
        int int14 = inventory0.getCoffee();
        int int15 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass16 = inventory0.getClass();
        inventory0.setChocolate((int) '4');
        int int19 = inventory0.getSugar();
        java.lang.Class<?> wildcardClass20 = inventory0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        java.lang.String str8 = inventory0.toString();
        inventory0.setChocolate((int) (short) -1);
        java.lang.String str11 = inventory0.toString();
        int int12 = inventory0.getMilk();
        int int13 = inventory0.getSugar();
        inventory0.setChocolate(52);
        try {
            inventory0.addSugar("Coffee: 100\nMilk: 52\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str8.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str11.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getChocolate();
        int int8 = inventory0.getChocolate();
        inventory0.setChocolate((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setCoffee((int) (short) 100);
        inventory0.setSugar(100);
        java.lang.String str17 = inventory0.toString();
        int int18 = inventory0.getSugar();
        int int19 = inventory0.getSugar();
        inventory0.setMilk(10);
        int int22 = inventory0.getMilk();
        int int23 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n" + "'", str17.equals("Coffee: 100\nMilk: 15\nSugar: 100\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getChocolate();
        int int8 = inventory0.getSugar();
        try {
            inventory0.addSugar("Coffee: 0\nMilk: 0\nSugar: 1\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        int int11 = inventory0.getSugar();
        inventory0.setCoffee(0);
        inventory0.setSugar(100);
        inventory0.setSugar(0);
        inventory0.setSugar(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setCoffee((-1));
        try {
            inventory0.addChocolate("Coffee: 100\nMilk: 15\nSugar: 10\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setCoffee((int) '#');
        int int6 = inventory0.getChocolate();
        int int7 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        inventory0.setSugar((int) (short) 100);
        java.lang.String str13 = inventory0.toString();
        int int14 = inventory0.getCoffee();
        int int15 = inventory0.getCoffee();
        inventory0.setMilk((int) (short) 0);
        inventory0.setCoffee(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setCoffee(15);
        try {
            inventory0.addCoffee("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        int int8 = inventory0.getChocolate();
        int int9 = inventory0.getCoffee();
        int int10 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass11 = inventory0.getClass();
        int int12 = inventory0.getMilk();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        int int8 = inventory0.getChocolate();
        inventory0.setCoffee((int) (byte) 10);
        int int11 = inventory0.getChocolate();
        int int12 = inventory0.getSugar();
        inventory0.setSugar(100);
        int int15 = inventory0.getMilk();
        inventory0.setCoffee((int) (short) 1);
        java.lang.String str18 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Coffee: 1\nMilk: 32\nSugar: 100\nChocolate: 15\n" + "'", str18.equals("Coffee: 1\nMilk: 32\nSugar: 100\nChocolate: 15\n"));
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setCoffee((int) (short) 100);
        int int15 = inventory0.getMilk();
        inventory0.setChocolate(0);
        inventory0.setMilk(10);
        int int20 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass21 = inventory0.getClass();
        int int22 = inventory0.getSugar();
        try {
            inventory0.addMilk("Coffee: 15\nMilk: 10\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass5 = inventory0.getClass();
        int int6 = inventory0.getSugar();
        java.lang.String str7 = inventory0.toString();
        inventory0.setMilk(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setMilk(15);
        int int8 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass9 = inventory0.getClass();
        java.lang.String str10 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n" + "'", str10.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n"));
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getCoffee();
        java.lang.String str9 = inventory0.toString();
        inventory0.setSugar((int) (byte) 10);
        inventory0.setMilk(0);
        int int14 = inventory0.getCoffee();
        inventory0.setMilk(100);
        java.lang.String str17 = inventory0.toString();
        try {
            inventory0.addMilk("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 97\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str9.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 1\n" + "'", str17.equals("Coffee: 15\nMilk: 100\nSugar: 10\nChocolate: 1\n"));
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setMilk((int) (short) 100);
        inventory0.setChocolate(1);
        try {
            inventory0.addCoffee("Coffee: 15\nMilk: 10\nSugar: 97\nChocolate: 35\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        inventory0.setSugar((int) (short) 100);
        java.lang.String str13 = inventory0.toString();
        int int14 = inventory0.getCoffee();
        int int15 = inventory0.getCoffee();
        java.lang.String str16 = inventory0.toString();
        inventory0.setCoffee(100);
        inventory0.setCoffee(10);
        inventory0.setMilk((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n" + "'", str16.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 15\n"));
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) (short) 1);
        inventory0.setMilk(15);
        int int8 = inventory0.getCoffee();
        java.lang.Class<?> wildcardClass9 = inventory0.getClass();
        try {
            inventory0.addChocolate("Coffee: 15\nMilk: 32\nSugar: 15\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of chocolate must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 0);
        int int5 = inventory0.getSugar();
        inventory0.setSugar((int) '4');
        int int8 = inventory0.getCoffee();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        inventory0.setChocolate((int) '#');
        int int7 = inventory0.getCoffee();
        inventory0.setCoffee((int) (short) 0);
        java.lang.Class<?> wildcardClass10 = inventory0.getClass();
        try {
            inventory0.addSugar("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setCoffee((int) '#');
        int int6 = inventory0.getChocolate();
        inventory0.setCoffee((int) (short) 0);
        java.lang.String str9 = inventory0.toString();
        int int10 = inventory0.getChocolate();
        inventory0.setSugar((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str9.equals("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        inventory0.setChocolate((int) 'a');
        int int6 = inventory0.getSugar();
        inventory0.setMilk(97);
        inventory0.setMilk((int) (short) 10);
        try {
            inventory0.addCoffee("");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of coffee must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        int int6 = inventory0.getCoffee();
        java.lang.String str7 = inventory0.toString();
        inventory0.setMilk((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n" + "'", str7.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 15\n"));
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setMilk(100);
        int int15 = inventory0.getMilk();
        inventory0.setMilk((int) (byte) 1);
        int int18 = inventory0.getChocolate();
        java.lang.String str19 = inventory0.toString();
        inventory0.setCoffee((int) '4');
        inventory0.setSugar(1);
        inventory0.setChocolate(0);
        try {
            inventory0.addMilk("Coffee: 100\nMilk: 15\nSugar: 52\nChocolate: 1\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of milk must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Coffee: 15\nMilk: 1\nSugar: 10\nChocolate: 1\n" + "'", str19.equals("Coffee: 15\nMilk: 1\nSugar: 10\nChocolate: 1\n"));
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        int int8 = inventory0.getMilk();
        inventory0.setCoffee((-1));
        inventory0.setSugar((int) (short) 100);
        int int13 = inventory0.getCoffee();
        inventory0.setChocolate((int) (byte) 1);
        inventory0.setChocolate(32);
        java.lang.String str18 = inventory0.toString();
        edu.ncsu.csc326.coffeemaker.Recipe recipe19 = null;
        try {
            boolean boolean20 = inventory0.useIngredients(recipe19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 32\n" + "'", str18.equals("Coffee: 15\nMilk: 15\nSugar: 100\nChocolate: 32\n"));
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        java.lang.Class<?> wildcardClass4 = inventory0.getClass();
        inventory0.setCoffee((int) (short) 0);
        inventory0.setSugar((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setMilk(0);
        inventory0.setCoffee((int) (byte) 100);
        inventory0.setMilk((int) (byte) 1);
        int int10 = inventory0.getSugar();
        inventory0.setCoffee((int) (short) 100);
        inventory0.setMilk((int) (short) 10);
        inventory0.setMilk(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setSugar((int) (short) -1);
        inventory0.setChocolate((int) '#');
        inventory0.setChocolate((int) (byte) 1);
        java.lang.String str12 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n" + "'", str12.equals("Coffee: 15\nMilk: 15\nSugar: 10\nChocolate: 1\n"));
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        int int8 = inventory0.getChocolate();
        inventory0.setCoffee((int) (byte) 10);
        java.lang.String str11 = inventory0.toString();
        inventory0.setCoffee((int) (short) 10);
        inventory0.setChocolate(1);
        inventory0.setMilk(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Coffee: 10\nMilk: 32\nSugar: 15\nChocolate: 15\n" + "'", str11.equals("Coffee: 10\nMilk: 32\nSugar: 15\nChocolate: 15\n"));
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        java.lang.Class<?> wildcardClass3 = inventory0.getClass();
        int int4 = inventory0.getChocolate();
        int int5 = inventory0.getSugar();
        inventory0.setMilk((int) ' ');
        inventory0.setChocolate((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setCoffee(0);
        int int13 = inventory0.getCoffee();
        inventory0.setSugar((int) 'a');
        inventory0.setCoffee((int) ' ');
        java.lang.String str18 = inventory0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Coffee: 32\nMilk: 15\nSugar: 97\nChocolate: 1\n" + "'", str18.equals("Coffee: 32\nMilk: 15\nSugar: 97\nChocolate: 1\n"));
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setCoffee((int) '#');
        int int6 = inventory0.getChocolate();
        inventory0.setCoffee((int) (short) 0);
        java.lang.String str9 = inventory0.toString();
        int int10 = inventory0.getSugar();
        int int11 = inventory0.getSugar();
        inventory0.setSugar(32);
        try {
            inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 1\nChocolate: 15\n");
            org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException; message: Units of sugar must be a positive integer");
        } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n" + "'", str9.equals("Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
        int int1 = inventory0.getCoffee();
        int int2 = inventory0.getMilk();
        int int3 = inventory0.getSugar();
        inventory0.setSugar((int) (short) 10);
        inventory0.setChocolate(1);
        int int8 = inventory0.getChocolate();
        inventory0.setSugar((int) '#');
        inventory0.setSugar(10);
        inventory0.setMilk(100);
        inventory0.setChocolate((int) (byte) 10);
        int int17 = inventory0.getMilk();
        inventory0.setSugar((int) (byte) -1);
        java.lang.Class<?> wildcardClass20 = inventory0.getClass();
        int int21 = inventory0.getChocolate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }
}

