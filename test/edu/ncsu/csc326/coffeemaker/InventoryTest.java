package edu.ncsu.csc326.coffeemaker;

import org.junit.Test;
import static org.junit.Assert.*;
import edu.ncsu.csc326.coffeemaker.Inventory;
import edu.ncsu.csc326.coffeemaker.exceptions.InventoryException;
import edu.ncsu.csc326.coffeemaker.Recipe;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class InventoryTest {
	
	@Test
	public void testDefaults() {
		Inventory inventory = new Inventory();
		int chocUnits = inventory.getChocolate();
		assertEquals(15, chocUnits);

		int milkUnits = inventory.getMilk();
		assertEquals(15, milkUnits);

		int sugarUnits = inventory.getSugar();
		assertEquals(15, sugarUnits);

		int coffeeUnits = inventory.getCoffee();
		assertEquals(15, coffeeUnits);

		StringBuffer buf = new StringBuffer();
    	buf.append("Coffee: ");
    	buf.append(15);
    	buf.append("\n");
    	buf.append("Milk: ");
    	buf.append(15);
    	buf.append("\n");
    	buf.append("Sugar: ");
    	buf.append(15);
    	buf.append("\n");
    	buf.append("Chocolate: ");
    	buf.append(15);
    	buf.append("\n");
		String defaultString = buf.toString();
		String stringified = inventory.toString();
		assertEquals(defaultString, stringified);
	}

	@Test
	public void testSetting() {
		Inventory inventory = new Inventory();
		inventory.setChocolate(-1);
		int chocUnits = inventory.getChocolate();
		assertEquals(15, chocUnits);

		inventory.setChocolate(1);
		chocUnits = inventory.getChocolate();
		assertEquals(1, chocUnits);

		inventory.setChocolate(0);
		chocUnits = inventory.getChocolate();
		assertEquals(0, chocUnits);

		inventory.setMilk(-1);
		int milkUnits = inventory.getMilk();
		assertEquals(15, milkUnits);

		inventory.setMilk(1);
		milkUnits = inventory.getMilk();
		assertEquals(1, milkUnits);

		inventory.setMilk(0);
		milkUnits = inventory.getMilk();
		assertEquals(0, milkUnits);

		inventory.setCoffee(-1);
		int coffeeUnits = inventory.getCoffee();
		assertEquals(15, coffeeUnits);

		inventory.setCoffee(1);
		coffeeUnits = inventory.getCoffee();
		assertEquals(1, coffeeUnits);

		inventory.setCoffee(0);
		coffeeUnits = inventory.getCoffee();
		assertEquals(0, coffeeUnits);

		inventory.setSugar(-1);
		int sugarUnits = inventory.getSugar();
		assertEquals(15, sugarUnits);

		inventory.setSugar(1);
		sugarUnits = inventory.getSugar();
		assertEquals(1, sugarUnits);

		inventory.setSugar(0);
		sugarUnits = inventory.getSugar();
		assertEquals(0, sugarUnits);

	}

	public void testAdding() throws InventoryException{
		Inventory inventory = new Inventory();

		inventory.addChocolate("1");
		int chocUnits = inventory.getChocolate();
		assertEquals(16, chocUnits);

		inventory.addChocolate("0");
		chocUnits = inventory.getChocolate();
		assertEquals(16, chocUnits);
	}

	@Test(expected = InventoryException.class)
	public void testAddingString() throws InventoryException {
		Inventory inventory = new Inventory();
		inventory.addChocolate("a");
	}

	@Test(expected = InventoryException.class)
	public void testAddingNegative() throws InventoryException {
		Inventory inventory = new Inventory();
		inventory.addChocolate("-1");
	}

	@Test 
	public void testUseIngredients()  throws RecipeException{
		Inventory inventory = new Inventory();
		Recipe good = new Recipe();
		assertTrue(inventory.useIngredients(good));

		Recipe bad = new Recipe();
		bad.setAmtChocolate("20");
		assertFalse(inventory.useIngredients(bad));
	}

	@Test
	public void testBugInUseIngredients() throws RecipeException{
		Inventory inventory = new Inventory();
		Recipe good = new Recipe();
		int prevCoffee = inventory.getCoffee();
		good.setAmtCoffee("1");
		assertTrue(inventory.useIngredients(good));

		assertEquals(prevCoffee - 1, inventory.getCoffee());
	}

	@Test
	public void testBugInAddSugar() throws InventoryException{
		Inventory inventory = new Inventory();
		inventory.addSugar("5");
		assertEquals(20, inventory.getSugar());
	}
	
}