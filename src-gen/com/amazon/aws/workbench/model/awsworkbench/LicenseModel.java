/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>License Model</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLicenseModel()
 * @model instanceClass="com.amazon.aws.workbench.model.awsworkbench.LicenseModel"
 * @generated
 */
public enum LicenseModel implements Enumerator {
	/**
	 * The '<em><b>LICENSE INCLUDED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LICENSE_INCLUDED_VALUE
	 * @generated
	 * @ordered
	 */
	LICENSE_INCLUDED(0, "LICENSE_INCLUDED", "LICENSE_INCLUDED"),

	/**
	 * The '<em><b>BRING YOUR OWN LICENSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRING_YOUR_OWN_LICENSE_VALUE
	 * @generated
	 * @ordered
	 */
	BRING_YOUR_OWN_LICENSE(1, "BRING_YOUR_OWN_LICENSE", "BRING_YOUR_OWN_LICENSE"),

	/**
	 * The '<em><b>GENERAL PUBLIC LICENSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERAL_PUBLIC_LICENSE_VALUE
	 * @generated
	 * @ordered
	 */
	GENERAL_PUBLIC_LICENSE(2, "GENERAL_PUBLIC_LICENSE", "GENERAL_PUBLIC_LICENSE");

	/**
	 * The '<em><b>LICENSE INCLUDED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LICENSE_INCLUDED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LICENSE_INCLUDED_VALUE = 0;

	/**
	 * The '<em><b>BRING YOUR OWN LICENSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRING_YOUR_OWN_LICENSE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BRING_YOUR_OWN_LICENSE_VALUE = 1;

	/**
	 * The '<em><b>GENERAL PUBLIC LICENSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERAL_PUBLIC_LICENSE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GENERAL_PUBLIC_LICENSE_VALUE = 2;

	/**
	 * An array of all the '<em><b>License Model</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LicenseModel[] VALUES_ARRAY = new LicenseModel[] { LICENSE_INCLUDED, BRING_YOUR_OWN_LICENSE,
			GENERAL_PUBLIC_LICENSE, };

	/**
	 * A public read-only list of all the '<em><b>License Model</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LicenseModel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>License Model</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LicenseModel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LicenseModel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>License Model</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LicenseModel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LicenseModel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>License Model</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LicenseModel get(int value) {
		switch (value) {
		case LICENSE_INCLUDED_VALUE:
			return LICENSE_INCLUDED;
		case BRING_YOUR_OWN_LICENSE_VALUE:
			return BRING_YOUR_OWN_LICENSE;
		case GENERAL_PUBLIC_LICENSE_VALUE:
			return GENERAL_PUBLIC_LICENSE;
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
	private LicenseModel(int value, String name, String literal) {
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

} //LicenseModel
