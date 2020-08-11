/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Security Policy Protocol</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSecurityPolicyProtocol()
 * @model instanceClass="com.amazon.aws.workbench.model.awsworkbench.SecurityPolicyProtocol"
 * @generated
 */
public enum SecurityPolicyProtocol implements Enumerator {
	/**
	 * The '<em><b>SSL V3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SSL_V3_VALUE
	 * @generated
	 * @ordered
	 */
	SSL_V3(0, "SSL_V3", "SSL_V3"),

	/**
	 * The '<em><b>TLS V1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TLS_V1_VALUE
	 * @generated
	 * @ordered
	 */
	TLS_V1(1, "TLS_V1", "TLS_V1"),

	/**
	 * The '<em><b>TLS V1 2016</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TLS_V1_2016_VALUE
	 * @generated
	 * @ordered
	 */
	TLS_V1_2016(2, "TLS_V1_2016", "TLS_V1_2016"),

	/**
	 * The '<em><b>TLS V1 12016</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TLS_V1_12016_VALUE
	 * @generated
	 * @ordered
	 */
	TLS_V1_12016(3, "TLS_V1_1_2016", "TLS_V1_1_2016"),

	/**
	 * The '<em><b>TLS V1 22018</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TLS_V1_22018_VALUE
	 * @generated
	 * @ordered
	 */
	TLS_V1_22018(4, "TLS_V1_2_2018", "TLS_V1_2_2018");

	/**
	 * The '<em><b>SSL V3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SSL_V3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SSL_V3_VALUE = 0;

	/**
	 * The '<em><b>TLS V1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TLS_V1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TLS_V1_VALUE = 1;

	/**
	 * The '<em><b>TLS V1 2016</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TLS_V1_2016
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TLS_V1_2016_VALUE = 2;

	/**
	 * The '<em><b>TLS V1 12016</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TLS_V1_12016
	 * @model name="TLS_V1_1_2016"
	 * @generated
	 * @ordered
	 */
	public static final int TLS_V1_12016_VALUE = 3;

	/**
	 * The '<em><b>TLS V1 22018</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TLS_V1_22018
	 * @model name="TLS_V1_2_2018"
	 * @generated
	 * @ordered
	 */
	public static final int TLS_V1_22018_VALUE = 4;

	/**
	 * An array of all the '<em><b>Security Policy Protocol</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SecurityPolicyProtocol[] VALUES_ARRAY = new SecurityPolicyProtocol[] { SSL_V3, TLS_V1,
			TLS_V1_2016, TLS_V1_12016, TLS_V1_22018, };

	/**
	 * A public read-only list of all the '<em><b>Security Policy Protocol</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SecurityPolicyProtocol> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Security Policy Protocol</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SecurityPolicyProtocol get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SecurityPolicyProtocol result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Security Policy Protocol</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SecurityPolicyProtocol getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SecurityPolicyProtocol result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Security Policy Protocol</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SecurityPolicyProtocol get(int value) {
		switch (value) {
		case SSL_V3_VALUE:
			return SSL_V3;
		case TLS_V1_VALUE:
			return TLS_V1;
		case TLS_V1_2016_VALUE:
			return TLS_V1_2016;
		case TLS_V1_12016_VALUE:
			return TLS_V1_12016;
		case TLS_V1_22018_VALUE:
			return TLS_V1_22018;
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
	private SecurityPolicyProtocol(int value, String name, String literal) {
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

} //SecurityPolicyProtocol
