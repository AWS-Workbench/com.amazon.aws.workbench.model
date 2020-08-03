/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Content Handling</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getContentHandling()
 * @model instanceClass="com.amazon.aws.workbench.model.awsworkbench.ContentHandling"
 * @generated
 */
public enum ContentHandling implements Enumerator {
	/**
	 * The '<em><b>CONVERT TO BINARY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONVERT_TO_BINARY_VALUE
	 * @generated
	 * @ordered
	 */
	CONVERT_TO_BINARY(0, "CONVERT_TO_BINARY", "CONVERT_TO_BINARY"),

	/**
	 * The '<em><b>CONVERT TO TEXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONVERT_TO_TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	CONVERT_TO_TEXT(1, "CONVERT_TO_TEXT", "CONVERT_TO_TEXT");

	/**
	 * The '<em><b>CONVERT TO BINARY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONVERT_TO_BINARY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONVERT_TO_BINARY_VALUE = 0;

	/**
	 * The '<em><b>CONVERT TO TEXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONVERT_TO_TEXT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONVERT_TO_TEXT_VALUE = 1;

	/**
	 * An array of all the '<em><b>Content Handling</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ContentHandling[] VALUES_ARRAY = new ContentHandling[] { CONVERT_TO_BINARY, CONVERT_TO_TEXT, };

	/**
	 * A public read-only list of all the '<em><b>Content Handling</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ContentHandling> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Content Handling</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContentHandling get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContentHandling result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Content Handling</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContentHandling getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContentHandling result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Content Handling</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContentHandling get(int value) {
		switch (value) {
		case CONVERT_TO_BINARY_VALUE:
			return CONVERT_TO_BINARY;
		case CONVERT_TO_TEXT_VALUE:
			return CONVERT_TO_TEXT;
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
	private ContentHandling(int value, String name, String literal) {
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

} //ContentHandling
