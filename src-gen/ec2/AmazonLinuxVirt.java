/**
 */
package ec2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Amazon Linux Virt</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ec2.Ec2Package#getAmazonLinuxVirt()
 * @model instanceClass="ec2.AmazonLinuxVirt"
 * @generated
 */
public enum AmazonLinuxVirt implements Enumerator {
	/**
	 * The '<em><b>HVM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HVM_VALUE
	 * @generated
	 * @ordered
	 */
	HVM(0, "HVM", "HVM"),

	/**
	 * The '<em><b>PV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PV_VALUE
	 * @generated
	 * @ordered
	 */
	PV(1, "PV", "PV");

	/**
	 * The '<em><b>HVM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HVM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HVM_VALUE = 0;

	/**
	 * The '<em><b>PV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PV_VALUE = 1;

	/**
	 * An array of all the '<em><b>Amazon Linux Virt</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AmazonLinuxVirt[] VALUES_ARRAY = new AmazonLinuxVirt[] { HVM, PV, };

	/**
	 * A public read-only list of all the '<em><b>Amazon Linux Virt</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AmazonLinuxVirt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Amazon Linux Virt</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AmazonLinuxVirt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AmazonLinuxVirt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Amazon Linux Virt</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AmazonLinuxVirt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AmazonLinuxVirt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Amazon Linux Virt</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AmazonLinuxVirt get(int value) {
		switch (value) {
		case HVM_VALUE:
			return HVM;
		case PV_VALUE:
			return PV;
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
	private AmazonLinuxVirt(int value, String name, String literal) {
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

} //AmazonLinuxVirt
