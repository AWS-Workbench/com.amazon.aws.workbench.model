/**
 */
package apigateway;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Json Schema Version</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see apigateway.ApigatewayPackage#getJsonSchemaVersion()
 * @model instanceClass="apigateway.JsonSchemaVersion"
 * @generated
 */
public enum JsonSchemaVersion implements Enumerator {
	/**
	 * The '<em><b>DRAFT4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRAFT4_VALUE
	 * @generated
	 * @ordered
	 */
	DRAFT4(0, "DRAFT4", "DRAFT4"),

	/**
	 * The '<em><b>DRAFT7</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRAFT7_VALUE
	 * @generated
	 * @ordered
	 */
	DRAFT7(1, "DRAFT7", "DRAFT7");

	/**
	 * The '<em><b>DRAFT4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRAFT4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DRAFT4_VALUE = 0;

	/**
	 * The '<em><b>DRAFT7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRAFT7
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DRAFT7_VALUE = 1;

	/**
	 * An array of all the '<em><b>Json Schema Version</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final JsonSchemaVersion[] VALUES_ARRAY = new JsonSchemaVersion[] { DRAFT4, DRAFT7, };

	/**
	 * A public read-only list of all the '<em><b>Json Schema Version</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<JsonSchemaVersion> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Json Schema Version</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JsonSchemaVersion get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JsonSchemaVersion result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Json Schema Version</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JsonSchemaVersion getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JsonSchemaVersion result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Json Schema Version</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JsonSchemaVersion get(int value) {
		switch (value) {
		case DRAFT4_VALUE:
			return DRAFT4;
		case DRAFT7_VALUE:
			return DRAFT7;
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
	private JsonSchemaVersion(int value, String name, String literal) {
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

} //JsonSchemaVersion
