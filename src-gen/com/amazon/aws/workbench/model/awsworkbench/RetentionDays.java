/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Retention Days</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getRetentionDays()
 * @model instanceClass="com.amazon.aws.workbench.model.awsworkbench.RetentionDays"
 * @generated
 */
public enum RetentionDays implements Enumerator {
	/**
	 * The '<em><b>ONE DAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_DAY_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_DAY(0, "ONE_DAY", "ONE_DAY"),

	/**
	 * The '<em><b>THREE DAYS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THREE_DAYS_VALUE
	 * @generated
	 * @ordered
	 */
	THREE_DAYS(1, "THREE_DAYS", "THREE_DAYS"),

	/**
	 * The '<em><b>FIVE DAYS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIVE_DAYS_VALUE
	 * @generated
	 * @ordered
	 */
	FIVE_DAYS(2, "FIVE_DAYS", "FIVE_DAYS"),

	/**
	 * The '<em><b>ONE WEEK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_WEEK_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_WEEK(3, "ONE_WEEK", "ONE_WEEK"),

	/**
	 * The '<em><b>TWO WEEKS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_WEEKS_VALUE
	 * @generated
	 * @ordered
	 */
	TWO_WEEKS(4, "TWO_WEEKS", "TWO_WEEKS"),

	/**
	 * The '<em><b>ONE MONTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_MONTH_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_MONTH(5, "ONE_MONTH", "ONE_MONTH"),

	/**
	 * The '<em><b>TWO MONTHS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_MONTHS_VALUE
	 * @generated
	 * @ordered
	 */
	TWO_MONTHS(6, "TWO_MONTHS", "TWO_MONTHS"),

	/**
	 * The '<em><b>THREE MONTHS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THREE_MONTHS_VALUE
	 * @generated
	 * @ordered
	 */
	THREE_MONTHS(7, "THREE_MONTHS", "THREE_MONTHS"),

	/**
	 * The '<em><b>FOUR MONTHS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOUR_MONTHS_VALUE
	 * @generated
	 * @ordered
	 */
	FOUR_MONTHS(8, "FOUR_MONTHS", "FOUR_MONTHS"),

	/**
	 * The '<em><b>FIVE MONTHS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIVE_MONTHS_VALUE
	 * @generated
	 * @ordered
	 */
	FIVE_MONTHS(9, "FIVE_MONTHS", "FIVE_MONTHS"),

	/**
	 * The '<em><b>SIX MONTHS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIX_MONTHS_VALUE
	 * @generated
	 * @ordered
	 */
	SIX_MONTHS(10, "SIX_MONTHS", "SIX_MONTHS"),

	/**
	 * The '<em><b>ONE YEAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_YEAR_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_YEAR(11, "ONE_YEAR", "ONE_YEAR"),

	/**
	 * The '<em><b>THIRTEEN MONTHS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIRTEEN_MONTHS_VALUE
	 * @generated
	 * @ordered
	 */
	THIRTEEN_MONTHS(12, "THIRTEEN_MONTHS", "THIRTEEN_MONTHS"),

	/**
	 * The '<em><b>EIGHTEEN MONTHS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EIGHTEEN_MONTHS_VALUE
	 * @generated
	 * @ordered
	 */
	EIGHTEEN_MONTHS(13, "EIGHTEEN_MONTHS", "EIGHTEEN_MONTHS"),

	/**
	 * The '<em><b>TWO YEARS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_YEARS_VALUE
	 * @generated
	 * @ordered
	 */
	TWO_YEARS(14, "TWO_YEARS", "TWO_YEARS"),

	/**
	 * The '<em><b>FIVE YEARS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIVE_YEARS_VALUE
	 * @generated
	 * @ordered
	 */
	FIVE_YEARS(15, "FIVE_YEARS", "FIVE_YEARS"),

	/**
	 * The '<em><b>TEN YEARS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEN_YEARS_VALUE
	 * @generated
	 * @ordered
	 */
	TEN_YEARS(16, "TEN_YEARS", "TEN_YEARS"),

	/**
	 * The '<em><b>INFINITE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFINITE_VALUE
	 * @generated
	 * @ordered
	 */
	INFINITE(17, "INFINITE", "INFINITE");

	/**
	 * The '<em><b>ONE DAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_DAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONE_DAY_VALUE = 0;

	/**
	 * The '<em><b>THREE DAYS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THREE_DAYS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int THREE_DAYS_VALUE = 1;

	/**
	 * The '<em><b>FIVE DAYS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIVE_DAYS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIVE_DAYS_VALUE = 2;

	/**
	 * The '<em><b>ONE WEEK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_WEEK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONE_WEEK_VALUE = 3;

	/**
	 * The '<em><b>TWO WEEKS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_WEEKS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TWO_WEEKS_VALUE = 4;

	/**
	 * The '<em><b>ONE MONTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_MONTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONE_MONTH_VALUE = 5;

	/**
	 * The '<em><b>TWO MONTHS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_MONTHS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TWO_MONTHS_VALUE = 6;

	/**
	 * The '<em><b>THREE MONTHS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THREE_MONTHS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int THREE_MONTHS_VALUE = 7;

	/**
	 * The '<em><b>FOUR MONTHS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOUR_MONTHS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FOUR_MONTHS_VALUE = 8;

	/**
	 * The '<em><b>FIVE MONTHS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIVE_MONTHS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIVE_MONTHS_VALUE = 9;

	/**
	 * The '<em><b>SIX MONTHS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIX_MONTHS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIX_MONTHS_VALUE = 10;

	/**
	 * The '<em><b>ONE YEAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_YEAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONE_YEAR_VALUE = 11;

	/**
	 * The '<em><b>THIRTEEN MONTHS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIRTEEN_MONTHS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int THIRTEEN_MONTHS_VALUE = 12;

	/**
	 * The '<em><b>EIGHTEEN MONTHS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EIGHTEEN_MONTHS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EIGHTEEN_MONTHS_VALUE = 13;

	/**
	 * The '<em><b>TWO YEARS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_YEARS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TWO_YEARS_VALUE = 14;

	/**
	 * The '<em><b>FIVE YEARS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIVE_YEARS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIVE_YEARS_VALUE = 15;

	/**
	 * The '<em><b>TEN YEARS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEN_YEARS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEN_YEARS_VALUE = 16;

	/**
	 * The '<em><b>INFINITE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFINITE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INFINITE_VALUE = 17;

	/**
	 * An array of all the '<em><b>Retention Days</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RetentionDays[] VALUES_ARRAY = new RetentionDays[] { ONE_DAY, THREE_DAYS, FIVE_DAYS, ONE_WEEK,
			TWO_WEEKS, ONE_MONTH, TWO_MONTHS, THREE_MONTHS, FOUR_MONTHS, FIVE_MONTHS, SIX_MONTHS, ONE_YEAR,
			THIRTEEN_MONTHS, EIGHTEEN_MONTHS, TWO_YEARS, FIVE_YEARS, TEN_YEARS, INFINITE, };

	/**
	 * A public read-only list of all the '<em><b>Retention Days</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RetentionDays> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Retention Days</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RetentionDays get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RetentionDays result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Retention Days</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RetentionDays getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RetentionDays result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Retention Days</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RetentionDays get(int value) {
		switch (value) {
		case ONE_DAY_VALUE:
			return ONE_DAY;
		case THREE_DAYS_VALUE:
			return THREE_DAYS;
		case FIVE_DAYS_VALUE:
			return FIVE_DAYS;
		case ONE_WEEK_VALUE:
			return ONE_WEEK;
		case TWO_WEEKS_VALUE:
			return TWO_WEEKS;
		case ONE_MONTH_VALUE:
			return ONE_MONTH;
		case TWO_MONTHS_VALUE:
			return TWO_MONTHS;
		case THREE_MONTHS_VALUE:
			return THREE_MONTHS;
		case FOUR_MONTHS_VALUE:
			return FOUR_MONTHS;
		case FIVE_MONTHS_VALUE:
			return FIVE_MONTHS;
		case SIX_MONTHS_VALUE:
			return SIX_MONTHS;
		case ONE_YEAR_VALUE:
			return ONE_YEAR;
		case THIRTEEN_MONTHS_VALUE:
			return THIRTEEN_MONTHS;
		case EIGHTEEN_MONTHS_VALUE:
			return EIGHTEEN_MONTHS;
		case TWO_YEARS_VALUE:
			return TWO_YEARS;
		case FIVE_YEARS_VALUE:
			return FIVE_YEARS;
		case TEN_YEARS_VALUE:
			return TEN_YEARS;
		case INFINITE_VALUE:
			return INFINITE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RetentionDays(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //RetentionDays
