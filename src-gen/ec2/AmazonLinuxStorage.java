/**
 */
package ec2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Amazon Linux Storage</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ec2.Ec2Package#getAmazonLinuxStorage()
 * @model instanceClass="ec2.AmazonLinuxStorage"
 * @generated
 */
public enum AmazonLinuxStorage implements Enumerator {
	/**
	 * The '<em><b>EBS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EBS_VALUE
	 * @generated
	 * @ordered
	 */
	EBS(0, "EBS", "EBS"),

	/**
	 * The '<em><b>GENERAL PURPOSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERAL_PURPOSE_VALUE
	 * @generated
	 * @ordered
	 */
	GENERAL_PURPOSE(1, "GENERAL_PURPOSE", "GENERAL_PURPOSE");

	/**
	 * The '<em><b>EBS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EBS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EBS_VALUE = 0;

	/**
	 * The '<em><b>GENERAL PURPOSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERAL_PURPOSE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GENERAL_PURPOSE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Amazon Linux Storage</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AmazonLinuxStorage[] VALUES_ARRAY = new AmazonLinuxStorage[] { EBS, GENERAL_PURPOSE, };

	/**
	 * A public read-only list of all the '<em><b>Amazon Linux Storage</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AmazonLinuxStorage> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Amazon Linux Storage</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AmazonLinuxStorage get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AmazonLinuxStorage result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Amazon Linux Storage</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AmazonLinuxStorage getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AmazonLinuxStorage result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Amazon Linux Storage</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AmazonLinuxStorage get(int value) {
		switch (value) {
		case EBS_VALUE:
			return EBS;
		case GENERAL_PURPOSE_VALUE:
			return GENERAL_PURPOSE;
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
	private AmazonLinuxStorage(int value, String name, String literal) {
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

} //AmazonLinuxStorage