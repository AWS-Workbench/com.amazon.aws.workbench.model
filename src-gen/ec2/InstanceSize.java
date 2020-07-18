/**
 */
package ec2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Instance Size</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ec2.Ec2Package#getInstanceSize()
 * @model instanceClass="ec2.InstanceSize"
 * @generated
 */
public enum InstanceSize implements Enumerator {
	/**
	 * The '<em><b>NANO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NANO_VALUE
	 * @generated
	 * @ordered
	 */
	NANO(0, "NANO", "NANO"),

	/**
	 * The '<em><b>MICRO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICRO_VALUE
	 * @generated
	 * @ordered
	 */
	MICRO(1, "MICRO", "MICRO"),

	/**
	 * The '<em><b>SMALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALL_VALUE
	 * @generated
	 * @ordered
	 */
	SMALL(2, "SMALL", "SMALL"),

	/**
	 * The '<em><b>MEDIUM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIUM_VALUE
	 * @generated
	 * @ordered
	 */
	MEDIUM(3, "MEDIUM", "MEDIUM"),

	/**
	 * The '<em><b>LARGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LARGE_VALUE
	 * @generated
	 * @ordered
	 */
	LARGE(4, "LARGE", "LARGE"),

	/**
	 * The '<em><b>XLARGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XLARGE_VALUE
	 * @generated
	 * @ordered
	 */
	XLARGE(5, "XLARGE", "XLARGE"),

	/**
	 * The '<em><b>XLARGE2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XLARGE2_VALUE
	 * @generated
	 * @ordered
	 */
	XLARGE2(6, "XLARGE2", "XLARGE2"),

	/**
	 * The '<em><b>XLARGE4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XLARGE4_VALUE
	 * @generated
	 * @ordered
	 */
	XLARGE4(7, "XLARGE4", "XLARGE4"),

	/**
	 * The '<em><b>XLARGE8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XLARGE8_VALUE
	 * @generated
	 * @ordered
	 */
	XLARGE8(8, "XLARGE8", "XLARGE8"),

	/**
	 * The '<em><b>XLARGE9</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XLARGE9_VALUE
	 * @generated
	 * @ordered
	 */
	XLARGE9(9, "XLARGE9", "XLARGE9"),

	/**
	 * The '<em><b>XLARGE10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XLARGE10_VALUE
	 * @generated
	 * @ordered
	 */
	XLARGE10(10, "XLARGE10", "XLARGE10"),

	/**
	 * The '<em><b>XLARGE12</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XLARGE12_VALUE
	 * @generated
	 * @ordered
	 */
	XLARGE12(11, "XLARGE12", "XLARGE12"),

	/**
	 * The '<em><b>XLARGE16</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XLARGE16_VALUE
	 * @generated
	 * @ordered
	 */
	XLARGE16(12, "XLARGE16", "XLARGE16"),

	/**
	 * The '<em><b>XLARGE18</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XLARGE18_VALUE
	 * @generated
	 * @ordered
	 */
	XLARGE18(13, "XLARGE18", "XLARGE18"),

	/**
	 * The '<em><b>XLARGE24</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XLARGE24_VALUE
	 * @generated
	 * @ordered
	 */
	XLARGE24(14, "XLARGE24", "XLARGE24"),

	/**
	 * The '<em><b>XLARGE32</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XLARGE32_VALUE
	 * @generated
	 * @ordered
	 */
	XLARGE32(15, "XLARGE32", "XLARGE32"),

	/**
	 * The '<em><b>METAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METAL_VALUE
	 * @generated
	 * @ordered
	 */
	METAL(16, "METAL", "METAL");

	/**
	 * The '<em><b>NANO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NANO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NANO_VALUE = 0;

	/**
	 * The '<em><b>MICRO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICRO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MICRO_VALUE = 1;

	/**
	 * The '<em><b>SMALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SMALL_VALUE = 2;

	/**
	 * The '<em><b>MEDIUM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIUM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MEDIUM_VALUE = 3;

	/**
	 * The '<em><b>LARGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LARGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LARGE_VALUE = 4;

	/**
	 * The '<em><b>XLARGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XLARGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XLARGE_VALUE = 5;

	/**
	 * The '<em><b>XLARGE2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XLARGE2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XLARGE2_VALUE = 6;

	/**
	 * The '<em><b>XLARGE4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XLARGE4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XLARGE4_VALUE = 7;

	/**
	 * The '<em><b>XLARGE8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XLARGE8
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XLARGE8_VALUE = 8;

	/**
	 * The '<em><b>XLARGE9</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XLARGE9
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XLARGE9_VALUE = 9;

	/**
	 * The '<em><b>XLARGE10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XLARGE10
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XLARGE10_VALUE = 10;

	/**
	 * The '<em><b>XLARGE12</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XLARGE12
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XLARGE12_VALUE = 11;

	/**
	 * The '<em><b>XLARGE16</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XLARGE16
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XLARGE16_VALUE = 12;

	/**
	 * The '<em><b>XLARGE18</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XLARGE18
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XLARGE18_VALUE = 13;

	/**
	 * The '<em><b>XLARGE24</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XLARGE24
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XLARGE24_VALUE = 14;

	/**
	 * The '<em><b>XLARGE32</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XLARGE32
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XLARGE32_VALUE = 15;

	/**
	 * The '<em><b>METAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int METAL_VALUE = 16;

	/**
	 * An array of all the '<em><b>Instance Size</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InstanceSize[] VALUES_ARRAY = new InstanceSize[] { NANO, MICRO, SMALL, MEDIUM, LARGE, XLARGE,
			XLARGE2, XLARGE4, XLARGE8, XLARGE9, XLARGE10, XLARGE12, XLARGE16, XLARGE18, XLARGE24, XLARGE32, METAL, };

	/**
	 * A public read-only list of all the '<em><b>Instance Size</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InstanceSize> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Instance Size</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InstanceSize get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InstanceSize result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Instance Size</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InstanceSize getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InstanceSize result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Instance Size</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InstanceSize get(int value) {
		switch (value) {
		case NANO_VALUE:
			return NANO;
		case MICRO_VALUE:
			return MICRO;
		case SMALL_VALUE:
			return SMALL;
		case MEDIUM_VALUE:
			return MEDIUM;
		case LARGE_VALUE:
			return LARGE;
		case XLARGE_VALUE:
			return XLARGE;
		case XLARGE2_VALUE:
			return XLARGE2;
		case XLARGE4_VALUE:
			return XLARGE4;
		case XLARGE8_VALUE:
			return XLARGE8;
		case XLARGE9_VALUE:
			return XLARGE9;
		case XLARGE10_VALUE:
			return XLARGE10;
		case XLARGE12_VALUE:
			return XLARGE12;
		case XLARGE16_VALUE:
			return XLARGE16;
		case XLARGE18_VALUE:
			return XLARGE18;
		case XLARGE24_VALUE:
			return XLARGE24;
		case XLARGE32_VALUE:
			return XLARGE32;
		case METAL_VALUE:
			return METAL;
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
	private InstanceSize(int value, String name, String literal) {
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

} //InstanceSize
