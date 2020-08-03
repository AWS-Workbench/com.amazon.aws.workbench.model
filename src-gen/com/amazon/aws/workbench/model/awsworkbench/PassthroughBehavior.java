/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Passthrough Behavior</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPassthroughBehavior()
 * @model instanceClass="com.amazon.aws.workbench.model.awsworkbench.PassthroughBehavior"
 * @generated
 */
public enum PassthroughBehavior implements Enumerator {
	/**
	 * The '<em><b>WHEN NO MATCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHEN_NO_MATCH_VALUE
	 * @generated
	 * @ordered
	 */
	WHEN_NO_MATCH(0, "WHEN_NO_MATCH", "WHEN_NO_MATCH"),

	/**
	 * The '<em><b>NEVER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEVER_VALUE
	 * @generated
	 * @ordered
	 */
	NEVER(1, "NEVER", "NEVER"),

	/**
	 * The '<em><b>WHEN NO TEMPLATES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHEN_NO_TEMPLATES_VALUE
	 * @generated
	 * @ordered
	 */
	WHEN_NO_TEMPLATES(2, "WHEN_NO_TEMPLATES", "WHEN_NO_TEMPLATES");

	/**
	 * The '<em><b>WHEN NO MATCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHEN_NO_MATCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WHEN_NO_MATCH_VALUE = 0;

	/**
	 * The '<em><b>NEVER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEVER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NEVER_VALUE = 1;

	/**
	 * The '<em><b>WHEN NO TEMPLATES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHEN_NO_TEMPLATES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WHEN_NO_TEMPLATES_VALUE = 2;

	/**
	 * An array of all the '<em><b>Passthrough Behavior</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PassthroughBehavior[] VALUES_ARRAY = new PassthroughBehavior[] { WHEN_NO_MATCH, NEVER,
			WHEN_NO_TEMPLATES, };

	/**
	 * A public read-only list of all the '<em><b>Passthrough Behavior</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PassthroughBehavior> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Passthrough Behavior</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PassthroughBehavior get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PassthroughBehavior result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Passthrough Behavior</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PassthroughBehavior getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PassthroughBehavior result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Passthrough Behavior</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PassthroughBehavior get(int value) {
		switch (value) {
		case WHEN_NO_MATCH_VALUE:
			return WHEN_NO_MATCH;
		case NEVER_VALUE:
			return NEVER;
		case WHEN_NO_TEMPLATES_VALUE:
			return WHEN_NO_TEMPLATES;
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
	private PassthroughBehavior(int value, String name, String literal) {
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

} //PassthroughBehavior
