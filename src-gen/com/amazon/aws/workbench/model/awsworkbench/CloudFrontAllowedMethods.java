/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cloud Front Allowed Methods</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCloudFrontAllowedMethods()
 * @model instanceClass="com.amazon.aws.workbench.model.awsworkbench.CloudFrontAllowedMethods"
 * @generated
 */
public enum CloudFrontAllowedMethods implements Enumerator {
	/**
	 * The '<em><b>GET HEAD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GET_HEAD_VALUE
	 * @generated
	 * @ordered
	 */
	GET_HEAD(0, "GET_HEAD", "GET_HEAD"),

	/**
	 * The '<em><b>GET HEAD OPTIONS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GET_HEAD_OPTIONS_VALUE
	 * @generated
	 * @ordered
	 */
	GET_HEAD_OPTIONS(1, "GET_HEAD_OPTIONS", "GET_HEAD_OPTIONS"),

	/**
	 * The '<em><b>ALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_VALUE
	 * @generated
	 * @ordered
	 */
	ALL(2, "ALL", "ALL");

	/**
	 * The '<em><b>GET HEAD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GET_HEAD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GET_HEAD_VALUE = 0;

	/**
	 * The '<em><b>GET HEAD OPTIONS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GET_HEAD_OPTIONS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GET_HEAD_OPTIONS_VALUE = 1;

	/**
	 * The '<em><b>ALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Cloud Front Allowed Methods</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CloudFrontAllowedMethods[] VALUES_ARRAY = new CloudFrontAllowedMethods[] { GET_HEAD,
			GET_HEAD_OPTIONS, ALL, };

	/**
	 * A public read-only list of all the '<em><b>Cloud Front Allowed Methods</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CloudFrontAllowedMethods> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cloud Front Allowed Methods</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CloudFrontAllowedMethods get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CloudFrontAllowedMethods result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cloud Front Allowed Methods</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CloudFrontAllowedMethods getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CloudFrontAllowedMethods result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cloud Front Allowed Methods</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CloudFrontAllowedMethods get(int value) {
		switch (value) {
		case GET_HEAD_VALUE:
			return GET_HEAD;
		case GET_HEAD_OPTIONS_VALUE:
			return GET_HEAD_OPTIONS;
		case ALL_VALUE:
			return ALL;
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
	private CloudFrontAllowedMethods(int value, String name, String literal) {
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

} //CloudFrontAllowedMethods
