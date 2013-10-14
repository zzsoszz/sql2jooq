/**
 * This class is generated by jOOQ
 */
package gudusoft.sakila.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.1.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Country extends org.jooq.impl.TableImpl<gudusoft.sakila.tables.records.CountryRecord> {

	private static final long serialVersionUID = 1237965455;

	/**
	 * The singleton instance of <code>sakila.country</code>
	 */
	public static final gudusoft.sakila.tables.Country COUNTRY = new gudusoft.sakila.tables.Country();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<gudusoft.sakila.tables.records.CountryRecord> getRecordType() {
		return gudusoft.sakila.tables.records.CountryRecord.class;
	}

	/**
	 * The column <code>sakila.country.country_id</code>. 
	 */
	public final org.jooq.TableField<gudusoft.sakila.tables.records.CountryRecord, org.jooq.types.UShort> COUNTRY_ID = createField("country_id", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED, this);

	/**
	 * The column <code>sakila.country.country</code>. 
	 */
	public final org.jooq.TableField<gudusoft.sakila.tables.records.CountryRecord, java.lang.String> COUNTRY_ = createField("country", org.jooq.impl.SQLDataType.VARCHAR.length(50), this);

	/**
	 * The column <code>sakila.country.last_update</code>. 
	 */
	public final org.jooq.TableField<gudusoft.sakila.tables.records.CountryRecord, java.sql.Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>sakila.country</code> table reference
	 */
	public Country() {
		super("country", gudusoft.sakila.Sakila.SAKILA);
	}

	/**
	 * Create an aliased <code>sakila.country</code> table reference
	 */
	public Country(java.lang.String alias) {
		super(alias, gudusoft.sakila.Sakila.SAKILA, gudusoft.sakila.tables.Country.COUNTRY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<gudusoft.sakila.tables.records.CountryRecord, org.jooq.types.UShort> getIdentity() {
		return gudusoft.sakila.Keys.IDENTITY_COUNTRY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<gudusoft.sakila.tables.records.CountryRecord> getPrimaryKey() {
		return gudusoft.sakila.Keys.KEY_COUNTRY_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<gudusoft.sakila.tables.records.CountryRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<gudusoft.sakila.tables.records.CountryRecord>>asList(gudusoft.sakila.Keys.KEY_COUNTRY_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public gudusoft.sakila.tables.Country as(java.lang.String alias) {
		return new gudusoft.sakila.tables.Country(alias);
	}
}