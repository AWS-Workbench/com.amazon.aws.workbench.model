/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Network Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getNetworkMode()
 * @model instanceClass="com.amazon.aws.workbench.model.awsworkbench.NetworkMode"
 * @generated
 */
public enum NetworkMode implements Enumerator {
	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "NONE", "NONE"),

	/**
	 * The '<em><b>BRIDGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRIDGE_VALUE
	 * @generated
	 * @ordered
	 */
	BRIDGE(1, "BRIDGE", "BRIDGE"),

	/**
	 * The '<em><b>AWS VPC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AWS_VPC_VALUE
	 * @generated
	 * @ordered
	 */
	AWS_VPC(2, "AWS_VPC", "AWS_VPC"),

	/**
	 * The '<em><b>HOST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOST_VALUE
	 * @generated
	 * @ordered
	 */
	HOST(3, "HOST", "HOST"),

	/**
	 * The '<em><b>NAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAT_VALUE
	 * @generated
	 * @ordered
	 */
	NAT(4, "NAT", "NAT");

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>BRIDGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRIDGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BRIDGE_VALUE = 1;

	/**
	 * The '<em><b>AWS VPC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AWS_VPC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AWS_VPC_VALUE = 2;

	/**
	 * The '<em><b>HOST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HOST_VALUE = 3;

	/**
	 * The '<em><b>NAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NAT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Network Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NetworkMode[] VALUES_ARRAY = new NetworkMode[] { NONE, BRIDGE, AWS_VPC, HOST, NAT, };

	/**
	 * A public read-only list of all the '<em><b>Network Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NetworkMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Network Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NetworkMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NetworkMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Network Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NetworkMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NetworkMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Network Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NetworkMode get(int value) {
		switch (value) {
		case NONE_VALUE:
			return NONE;
		case BRIDGE_VALUE:
			return BRIDGE;
		case AWS_VPC_VALUE:
			return AWS_VPC;
		case HOST_VALUE:
			return HOST;
		case NAT_VALUE:
			return NAT;
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
	private NetworkMode(int value, String name, String literal) {
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

} //NetworkMode
