/**
 * This class is generated by jOOQ
 */
package gudusoft.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.1.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PaymentRecord extends org.jooq.impl.UpdatableRecordImpl<gudusoft.sakila.tables.records.PaymentRecord> implements org.jooq.Record7<org.jooq.types.UShort, org.jooq.types.UShort, org.jooq.types.UByte, java.lang.Integer, java.math.BigDecimal, java.sql.Timestamp, java.sql.Timestamp> {

	private static final long serialVersionUID = 961341792;

	/**
	 * Setter for <code>sakila.payment.payment_id</code>. 
	 */
	public void setPaymentId(org.jooq.types.UShort value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sakila.payment.payment_id</code>. 
	 */
	public org.jooq.types.UShort getPaymentId() {
		return (org.jooq.types.UShort) getValue(0);
	}

	/**
	 * Setter for <code>sakila.payment.customer_id</code>. 
	 */
	public void setCustomerId(org.jooq.types.UShort value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sakila.payment.customer_id</code>. 
	 */
	public org.jooq.types.UShort getCustomerId() {
		return (org.jooq.types.UShort) getValue(1);
	}

	/**
	 * Setter for <code>sakila.payment.staff_id</code>. 
	 */
	public void setStaffId(org.jooq.types.UByte value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sakila.payment.staff_id</code>. 
	 */
	public org.jooq.types.UByte getStaffId() {
		return (org.jooq.types.UByte) getValue(2);
	}

	/**
	 * Setter for <code>sakila.payment.rental_id</code>. 
	 */
	public void setRentalId(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>sakila.payment.rental_id</code>. 
	 */
	public java.lang.Integer getRentalId() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>sakila.payment.amount</code>. 
	 */
	public void setAmount(java.math.BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>sakila.payment.amount</code>. 
	 */
	public java.math.BigDecimal getAmount() {
		return (java.math.BigDecimal) getValue(4);
	}

	/**
	 * Setter for <code>sakila.payment.payment_date</code>. 
	 */
	public void setPaymentDate(java.sql.Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>sakila.payment.payment_date</code>. 
	 */
	public java.sql.Timestamp getPaymentDate() {
		return (java.sql.Timestamp) getValue(5);
	}

	/**
	 * Setter for <code>sakila.payment.last_update</code>. 
	 */
	public void setLastUpdate(java.sql.Timestamp value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>sakila.payment.last_update</code>. 
	 */
	public java.sql.Timestamp getLastUpdate() {
		return (java.sql.Timestamp) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<org.jooq.types.UShort> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<org.jooq.types.UShort, org.jooq.types.UShort, org.jooq.types.UByte, java.lang.Integer, java.math.BigDecimal, java.sql.Timestamp, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<org.jooq.types.UShort, org.jooq.types.UShort, org.jooq.types.UByte, java.lang.Integer, java.math.BigDecimal, java.sql.Timestamp, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.UShort> field1() {
		return gudusoft.sakila.tables.Payment.PAYMENT.PAYMENT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.UShort> field2() {
		return gudusoft.sakila.tables.Payment.PAYMENT.CUSTOMER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.UByte> field3() {
		return gudusoft.sakila.tables.Payment.PAYMENT.STAFF_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return gudusoft.sakila.tables.Payment.PAYMENT.RENTAL_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field5() {
		return gudusoft.sakila.tables.Payment.PAYMENT.AMOUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field6() {
		return gudusoft.sakila.tables.Payment.PAYMENT.PAYMENT_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field7() {
		return gudusoft.sakila.tables.Payment.PAYMENT.LAST_UPDATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.UShort value1() {
		return getPaymentId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.UShort value2() {
		return getCustomerId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.UByte value3() {
		return getStaffId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getRentalId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value5() {
		return getAmount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value6() {
		return getPaymentDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value7() {
		return getLastUpdate();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PaymentRecord
	 */
	public PaymentRecord() {
		super(gudusoft.sakila.tables.Payment.PAYMENT);
	}
}