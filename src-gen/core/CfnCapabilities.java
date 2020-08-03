/**
 */
package core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cfn Capabilities</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see core.CorePackage#getCfnCapabilities()
 * @model instanceClass="core.CfnCapabilities"
 * @generated
 */
public enum CfnCapabilities implements Enumerator {
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
	 * The '<em><b>ANONYMOUS IAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANONYMOUS_IAM_VALUE
	 * @generated
	 * @ordered
	 */
	ANONYMOUS_IAM(1, "ANONYMOUS_IAM", "ANONYMOUS_IAM"),

	/**
	 * The '<em><b>NAMED IAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAMED_IAM_VALUE
	 * @generated
	 * @ordered
	 */
	NAMED_IAM(2, "NAMED_IAM", "NAMED_IAM"),

	/**
	 * The '<em><b>AUTO EXPAND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTO_EXPAND_VALUE
	 * @generated
	 * @ordered
	 */
	AUTO_EXPAND(3, "AUTO_EXPAND", "AUTO_EXPAND");

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
	 * The '<em><b>ANONYMOUS IAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANONYMOUS_IAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANONYMOUS_IAM_VALUE = 1;

	/**
	 * The '<em><b>NAMED IAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAMED_IAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NAMED_IAM_VALUE = 2;

	/**
	 * The '<em><b>AUTO EXPAND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTO_EXPAND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AUTO_EXPAND_VALUE = 3;

	/**
	 * An array of all the '<em><b>Cfn Capabilities</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CfnCapabilities[] VALUES_ARRAY = new CfnCapabilities[] { NONE, ANONYMOUS_IAM, NAMED_IAM,
			AUTO_EXPAND, };

	/**
	 * A public read-only list of all the '<em><b>Cfn Capabilities</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CfnCapabilities> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cfn Capabilities</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CfnCapabilities get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CfnCapabilities result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cfn Capabilities</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CfnCapabilities getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CfnCapabilities result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cfn Capabilities</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CfnCapabilities get(int value) {
		switch (value) {
		case NONE_VALUE:
			return NONE;
		case ANONYMOUS_IAM_VALUE:
			return ANONYMOUS_IAM;
		case NAMED_IAM_VALUE:
			return NAMED_IAM;
		case AUTO_EXPAND_VALUE:
			return AUTO_EXPAND;
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
	private CfnCapabilities(int value, String name, String literal) {
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

} //CfnCapabilities
