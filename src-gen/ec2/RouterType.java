/**
 */
package ec2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Router Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ec2.Ec2Package#getRouterType()
 * @model instanceClass="ec2.RouterType"
 * @generated
 */
public enum RouterType implements Enumerator {
	/**
	 * The '<em><b>EGRESS ONLY INTERNET GATEWAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EGRESS_ONLY_INTERNET_GATEWAY_VALUE
	 * @generated
	 * @ordered
	 */
	EGRESS_ONLY_INTERNET_GATEWAY(0, "EGRESS_ONLY_INTERNET_GATEWAY", "EGRESS_ONLY_INTERNET_GATEWAY"),

	/**
	 * The '<em><b>GATEWAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GATEWAY_VALUE
	 * @generated
	 * @ordered
	 */
	GATEWAY(1, "GATEWAY", "GATEWAY"),

	/**
	 * The '<em><b>INSTANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	INSTANCE(2, "INSTANCE", "INSTANCE"),

	/**
	 * The '<em><b>NAT GATEWAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAT_GATEWAY_VALUE
	 * @generated
	 * @ordered
	 */
	NAT_GATEWAY(3, "NAT_GATEWAY", "NAT_GATEWAY"),

	/**
	 * The '<em><b>NETWORK INTERFACE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWORK_INTERFACE_VALUE
	 * @generated
	 * @ordered
	 */
	NETWORK_INTERFACE(4, "NETWORK_INTERFACE", "NETWORK_INTERFACE"),

	/**
	 * The '<em><b>VPC PEERING CONNECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VPC_PEERING_CONNECTION_VALUE
	 * @generated
	 * @ordered
	 */
	VPC_PEERING_CONNECTION(5, "VPC_PEERING_CONNECTION", "VPC_PEERING_CONNECTION");

	/**
	 * The '<em><b>EGRESS ONLY INTERNET GATEWAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EGRESS_ONLY_INTERNET_GATEWAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EGRESS_ONLY_INTERNET_GATEWAY_VALUE = 0;

	/**
	 * The '<em><b>GATEWAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GATEWAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GATEWAY_VALUE = 1;

	/**
	 * The '<em><b>INSTANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INSTANCE_VALUE = 2;

	/**
	 * The '<em><b>NAT GATEWAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAT_GATEWAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NAT_GATEWAY_VALUE = 3;

	/**
	 * The '<em><b>NETWORK INTERFACE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWORK_INTERFACE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_INTERFACE_VALUE = 4;

	/**
	 * The '<em><b>VPC PEERING CONNECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VPC_PEERING_CONNECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VPC_PEERING_CONNECTION_VALUE = 5;

	/**
	 * An array of all the '<em><b>Router Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RouterType[] VALUES_ARRAY = new RouterType[] { EGRESS_ONLY_INTERNET_GATEWAY, GATEWAY, INSTANCE,
			NAT_GATEWAY, NETWORK_INTERFACE, VPC_PEERING_CONNECTION, };

	/**
	 * A public read-only list of all the '<em><b>Router Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RouterType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Router Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RouterType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RouterType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Router Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RouterType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RouterType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Router Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RouterType get(int value) {
		switch (value) {
		case EGRESS_ONLY_INTERNET_GATEWAY_VALUE:
			return EGRESS_ONLY_INTERNET_GATEWAY;
		case GATEWAY_VALUE:
			return GATEWAY;
		case INSTANCE_VALUE:
			return INSTANCE;
		case NAT_GATEWAY_VALUE:
			return NAT_GATEWAY;
		case NETWORK_INTERFACE_VALUE:
			return NETWORK_INTERFACE;
		case VPC_PEERING_CONNECTION_VALUE:
			return VPC_PEERING_CONNECTION;
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
	private RouterType(int value, String name, String literal) {
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

} //RouterType
