/**
 */
package core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Custom Resource Provider Runtime</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see core.CorePackage#getCustomResourceProviderRuntime()
 * @model instanceClass="core.CustomResourceProviderRuntime"
 * @generated
 */
public enum CustomResourceProviderRuntime implements Enumerator {
	/**
	 * The '<em><b>NODEJS 12</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NODEJS_12_VALUE
	 * @generated
	 * @ordered
	 */
	NODEJS_12(0, "NODEJS_12", "NODEJS_12");

	/**
	 * The '<em><b>NODEJS 12</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NODEJS_12
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NODEJS_12_VALUE = 0;

	/**
	 * An array of all the '<em><b>Custom Resource Provider Runtime</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CustomResourceProviderRuntime[] VALUES_ARRAY = new CustomResourceProviderRuntime[] {
			NODEJS_12, };

	/**
	 * A public read-only list of all the '<em><b>Custom Resource Provider Runtime</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CustomResourceProviderRuntime> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Custom Resource Provider Runtime</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CustomResourceProviderRuntime get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CustomResourceProviderRuntime result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Custom Resource Provider Runtime</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CustomResourceProviderRuntime getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CustomResourceProviderRuntime result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Custom Resource Provider Runtime</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CustomResourceProviderRuntime get(int value) {
		switch (value) {
		case NODEJS_12_VALUE:
			return NODEJS_12;
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
	private CustomResourceProviderRuntime(int value, String name, String literal) {
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

} //CustomResourceProviderRuntime
