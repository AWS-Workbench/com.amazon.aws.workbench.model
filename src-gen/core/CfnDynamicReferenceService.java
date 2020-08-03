/**
 */
package core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cfn Dynamic Reference Service</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see core.CorePackage#getCfnDynamicReferenceService()
 * @model instanceClass="core.CfnDynamicReferenceService"
 * @generated
 */
public enum CfnDynamicReferenceService implements Enumerator {
	/**
	 * The '<em><b>SSM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SSM_VALUE
	 * @generated
	 * @ordered
	 */
	SSM(0, "SSM", "SSM"),

	/**
	 * The '<em><b>SSM SECURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SSM_SECURE_VALUE
	 * @generated
	 * @ordered
	 */
	SSM_SECURE(1, "SSM_SECURE", "SSM_SECURE"),

	/**
	 * The '<em><b>SECRETS MANAGER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECRETS_MANAGER_VALUE
	 * @generated
	 * @ordered
	 */
	SECRETS_MANAGER(2, "SECRETS_MANAGER", "SECRETS_MANAGER");

	/**
	 * The '<em><b>SSM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SSM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SSM_VALUE = 0;

	/**
	 * The '<em><b>SSM SECURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SSM_SECURE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SSM_SECURE_VALUE = 1;

	/**
	 * The '<em><b>SECRETS MANAGER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECRETS_MANAGER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SECRETS_MANAGER_VALUE = 2;

	/**
	 * An array of all the '<em><b>Cfn Dynamic Reference Service</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CfnDynamicReferenceService[] VALUES_ARRAY = new CfnDynamicReferenceService[] { SSM, SSM_SECURE,
			SECRETS_MANAGER, };

	/**
	 * A public read-only list of all the '<em><b>Cfn Dynamic Reference Service</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CfnDynamicReferenceService> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cfn Dynamic Reference Service</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CfnDynamicReferenceService get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CfnDynamicReferenceService result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cfn Dynamic Reference Service</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CfnDynamicReferenceService getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CfnDynamicReferenceService result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cfn Dynamic Reference Service</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CfnDynamicReferenceService get(int value) {
		switch (value) {
		case SSM_VALUE:
			return SSM;
		case SSM_SECURE_VALUE:
			return SSM_SECURE;
		case SECRETS_MANAGER_VALUE:
			return SECRETS_MANAGER;
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
	private CfnDynamicReferenceService(int value, String name, String literal) {
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

} //CfnDynamicReferenceService
