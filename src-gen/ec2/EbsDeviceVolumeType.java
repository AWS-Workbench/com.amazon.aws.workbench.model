/**
 */
package ec2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ebs Device Volume Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ec2.Ec2Package#getEbsDeviceVolumeType()
 * @model instanceClass="ec2.EbsDeviceVolumeType"
 * @generated
 */
public enum EbsDeviceVolumeType implements Enumerator {
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
	 * The '<em><b>IO1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IO1_VALUE
	 * @generated
	 * @ordered
	 */
	IO1(1, "IO1", "IO1"),

	/**
	 * The '<em><b>GP2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GP2_VALUE
	 * @generated
	 * @ordered
	 */
	GP2(2, "GP2", "GP2"),

	/**
	 * The '<em><b>ST1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ST1_VALUE
	 * @generated
	 * @ordered
	 */
	ST1(3, "ST1", "ST1"),

	/**
	 * The '<em><b>SC1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SC1_VALUE
	 * @generated
	 * @ordered
	 */
	SC1(4, "SC1", "SC1");

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
	 * The '<em><b>IO1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IO1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IO1_VALUE = 1;

	/**
	 * The '<em><b>GP2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GP2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GP2_VALUE = 2;

	/**
	 * The '<em><b>ST1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ST1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ST1_VALUE = 3;

	/**
	 * The '<em><b>SC1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SC1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SC1_VALUE = 4;

	/**
	 * An array of all the '<em><b>Ebs Device Volume Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EbsDeviceVolumeType[] VALUES_ARRAY = new EbsDeviceVolumeType[] { STANDARD, IO1, GP2, ST1,
			SC1, };

	/**
	 * A public read-only list of all the '<em><b>Ebs Device Volume Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EbsDeviceVolumeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ebs Device Volume Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EbsDeviceVolumeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EbsDeviceVolumeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ebs Device Volume Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EbsDeviceVolumeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EbsDeviceVolumeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ebs Device Volume Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EbsDeviceVolumeType get(int value) {
		switch (value) {
		case STANDARD_VALUE:
			return STANDARD;
		case IO1_VALUE:
			return IO1;
		case GP2_VALUE:
			return GP2;
		case ST1_VALUE:
			return ST1;
		case SC1_VALUE:
			return SC1;
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
	private EbsDeviceVolumeType(int value, String name, String literal) {
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

} //EbsDeviceVolumeType
