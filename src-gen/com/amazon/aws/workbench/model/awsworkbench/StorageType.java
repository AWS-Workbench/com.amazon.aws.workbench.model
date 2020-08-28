/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Storage Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getStorageType()
 * @model instanceClass="com.amazon.aws.workbench.model.awsworkbench.StorageType"
 * @generated
 */
public enum StorageType implements Enumerator {
	/**
	 * The '<em><b>STANDARD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD(0, "STANDARD", "STANDARD"),

	/**
	 * The '<em><b>GP2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GP2_VALUE
	 * @generated
	 * @ordered
	 */
	GP2(1, "GP2", "GP2"),

	/**
	 * The '<em><b>IO1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IO1_VALUE
	 * @generated
	 * @ordered
	 */
	IO1(2, "IO1", "IO1");

	/**
	 * The '<em><b>STANDARD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD_VALUE = 0;

	/**
	 * The '<em><b>GP2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GP2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GP2_VALUE = 1;

	/**
	 * The '<em><b>IO1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IO1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IO1_VALUE = 2;

	/**
	 * An array of all the '<em><b>Storage Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StorageType[] VALUES_ARRAY = new StorageType[] { STANDARD, GP2, IO1, };

	/**
	 * A public read-only list of all the '<em><b>Storage Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StorageType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Storage Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StorageType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StorageType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Storage Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StorageType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StorageType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Storage Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StorageType get(int value) {
		switch (value) {
		case STANDARD_VALUE:
			return STANDARD;
		case GP2_VALUE:
			return GP2;
		case IO1_VALUE:
			return IO1;
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
	private StorageType(int value, String name, String literal) {
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

} //StorageType
