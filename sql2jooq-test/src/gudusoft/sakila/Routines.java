/**
 * This class is generated by jOOQ
 */
package gudusoft.sakila;

/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all stored procedures and functions in sakila
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.1.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Routines {

	/**
	 * Call <code>sakila.film_in_stock</code>
	 */
	public static java.lang.Integer filmInStock(org.jooq.Configuration configuration, java.lang.Integer pFilmId, java.lang.Integer pStoreId) {
		gudusoft.sakila.routines.FilmInStock p = new gudusoft.sakila.routines.FilmInStock();
		p.setPFilmId(pFilmId);
		p.setPStoreId(pStoreId);

		p.execute(configuration);
		return p.getPFilmCount();
	}

	/**
	 * Call <code>sakila.film_not_in_stock</code>
	 */
	public static java.lang.Integer filmNotInStock(org.jooq.Configuration configuration, java.lang.Integer pFilmId, java.lang.Integer pStoreId) {
		gudusoft.sakila.routines.FilmNotInStock p = new gudusoft.sakila.routines.FilmNotInStock();
		p.setPFilmId(pFilmId);
		p.setPStoreId(pStoreId);

		p.execute(configuration);
		return p.getPFilmCount();
	}

	/**
	 * Call <code>sakila.get_customer_balance</code>
	 */
	public static java.math.BigDecimal getCustomerBalance(org.jooq.Configuration configuration, java.lang.Integer pCustomerId, java.sql.Timestamp pEffectiveDate) {
		gudusoft.sakila.routines.GetCustomerBalance f = new gudusoft.sakila.routines.GetCustomerBalance();
		f.setPCustomerId(pCustomerId);
		f.setPEffectiveDate(pEffectiveDate);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>sakila.get_customer_balance</code> as a field
	 */
	public static org.jooq.Field<java.math.BigDecimal> getCustomerBalance(java.lang.Integer pCustomerId, java.sql.Timestamp pEffectiveDate) {
		gudusoft.sakila.routines.GetCustomerBalance f = new gudusoft.sakila.routines.GetCustomerBalance();
		f.setPCustomerId(pCustomerId);
		f.setPEffectiveDate(pEffectiveDate);

		return f.asField();
	}

	/**
	 * Get <code>sakila.get_customer_balance</code> as a field
	 */
	public static org.jooq.Field<java.math.BigDecimal> getCustomerBalance(org.jooq.Field<java.lang.Integer> pCustomerId, org.jooq.Field<java.sql.Timestamp> pEffectiveDate) {
		gudusoft.sakila.routines.GetCustomerBalance f = new gudusoft.sakila.routines.GetCustomerBalance();
		f.setPCustomerId(pCustomerId);
		f.setPEffectiveDate(pEffectiveDate);

		return f.asField();
	}

	/**
	 * Call <code>sakila.inventory_held_by_customer</code>
	 */
	public static java.lang.Integer inventoryHeldByCustomer(org.jooq.Configuration configuration, java.lang.Integer pInventoryId) {
		gudusoft.sakila.routines.InventoryHeldByCustomer f = new gudusoft.sakila.routines.InventoryHeldByCustomer();
		f.setPInventoryId(pInventoryId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>sakila.inventory_held_by_customer</code> as a field
	 */
	public static org.jooq.Field<java.lang.Integer> inventoryHeldByCustomer(java.lang.Integer pInventoryId) {
		gudusoft.sakila.routines.InventoryHeldByCustomer f = new gudusoft.sakila.routines.InventoryHeldByCustomer();
		f.setPInventoryId(pInventoryId);

		return f.asField();
	}

	/**
	 * Get <code>sakila.inventory_held_by_customer</code> as a field
	 */
	public static org.jooq.Field<java.lang.Integer> inventoryHeldByCustomer(org.jooq.Field<java.lang.Integer> pInventoryId) {
		gudusoft.sakila.routines.InventoryHeldByCustomer f = new gudusoft.sakila.routines.InventoryHeldByCustomer();
		f.setPInventoryId(pInventoryId);

		return f.asField();
	}

	/**
	 * Call <code>sakila.inventory_in_stock</code>
	 */
	public static java.lang.Byte inventoryInStock(org.jooq.Configuration configuration, java.lang.Integer pInventoryId) {
		gudusoft.sakila.routines.InventoryInStock f = new gudusoft.sakila.routines.InventoryInStock();
		f.setPInventoryId(pInventoryId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>sakila.inventory_in_stock</code> as a field
	 */
	public static org.jooq.Field<java.lang.Byte> inventoryInStock(java.lang.Integer pInventoryId) {
		gudusoft.sakila.routines.InventoryInStock f = new gudusoft.sakila.routines.InventoryInStock();
		f.setPInventoryId(pInventoryId);

		return f.asField();
	}

	/**
	 * Get <code>sakila.inventory_in_stock</code> as a field
	 */
	public static org.jooq.Field<java.lang.Byte> inventoryInStock(org.jooq.Field<java.lang.Integer> pInventoryId) {
		gudusoft.sakila.routines.InventoryInStock f = new gudusoft.sakila.routines.InventoryInStock();
		f.setPInventoryId(pInventoryId);

		return f.asField();
	}

	/**
	 * Call <code>sakila.rewards_report</code>
	 */
	public static java.lang.Integer rewardsReport(org.jooq.Configuration configuration, java.lang.Byte minMonthlyPurchases, java.math.BigDecimal minDollarAmountPurchased) {
		gudusoft.sakila.routines.RewardsReport p = new gudusoft.sakila.routines.RewardsReport();
		p.setMinMonthlyPurchases(minMonthlyPurchases);
		p.setMinDollarAmountPurchased(minDollarAmountPurchased);

		p.execute(configuration);
		return p.getCountRewardees();
	}
}