/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Namespace Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getNamespaceType()
 * @model instanceClass="com.amazon.aws.workbench.model.awsworkbench.NamespaceType"
 * @generated
 */
public enum NamespaceType implements Enumerator {
	/**
	 * The '<em><b>HTTP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_VALUE
	 * @generated
	 * @ordered
	 */
	HTTP(0, "HTTP", "HTTP"),

	/**
	 * The '<em><b>DNS PRIVATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNS_PRIVATE_VALUE
	 * @generated
	 * @ordered
	 */
	DNS_PRIVATE(1, "DNS_PRIVATE", "DNS_PRIVATE"),

	/**
	 * The '<em><b>DNS PUBLIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNS_PUBLIC_VALUE
	 * @generated
	 * @ordered
	 */
	DNS_PUBLIC(2, "DNS_PUBLIC", "DNS_PUBLIC");

	/**
	 * The '<em><b>HTTP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HTTP_VALUE = 0;

	/**
	 * The '<em><b>DNS PRIVATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNS_PRIVATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DNS_PRIVATE_VALUE = 1;

	/**
	 * The '<em><b>DNS PUBLIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNS_PUBLIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DNS_PUBLIC_VALUE = 2;

	/**
	 * An array of all the '<em><b>Namespace Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NamespaceType[] VALUES_ARRAY = new NamespaceType[] { HTTP, DNS_PRIVATE, DNS_PUBLIC, };

	/**
	 * A public read-only list of all the '<em><b>Namespace Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NamespaceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Namespace Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NamespaceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NamespaceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Namespace Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NamespaceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NamespaceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Namespace Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NamespaceType get(int value) {
		switch (value) {
		case HTTP_VALUE:
			return HTTP;
		case DNS_PRIVATE_VALUE:
			return DNS_PRIVATE;
		case DNS_PUBLIC_VALUE:
			return DNS_PUBLIC;
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
	private NamespaceType(int value, String name, String literal) {
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

} //NamespaceType
