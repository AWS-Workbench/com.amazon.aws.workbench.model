/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Origin Protocol Policy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOriginProtocolPolicy()
 * @model instanceClass="com.amazon.aws.workbench.model.awsworkbench.OriginProtocolPolicy"
 * @generated
 */
public enum OriginProtocolPolicy implements Enumerator {
	/**
	 * The '<em><b>HTTP ONLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	HTTP_ONLY(0, "HTTP_ONLY", "HTTP_ONLY"),

	/**
	 * The '<em><b>MATCH VIEWER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MATCH_VIEWER_VALUE
	 * @generated
	 * @ordered
	 */
	MATCH_VIEWER(1, "MATCH_VIEWER", "MATCH_VIEWER"),

	/**
	 * The '<em><b>HTTPS ONLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTPS_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	HTTPS_ONLY(2, "HTTPS_ONLY", "HTTPS_ONLY");

	/**
	 * The '<em><b>HTTP ONLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_ONLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HTTP_ONLY_VALUE = 0;

	/**
	 * The '<em><b>MATCH VIEWER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MATCH_VIEWER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MATCH_VIEWER_VALUE = 1;

	/**
	 * The '<em><b>HTTPS ONLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTPS_ONLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HTTPS_ONLY_VALUE = 2;

	/**
	 * An array of all the '<em><b>Origin Protocol Policy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OriginProtocolPolicy[] VALUES_ARRAY = new OriginProtocolPolicy[] { HTTP_ONLY, MATCH_VIEWER,
			HTTPS_ONLY, };

	/**
	 * A public read-only list of all the '<em><b>Origin Protocol Policy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OriginProtocolPolicy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Origin Protocol Policy</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OriginProtocolPolicy get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OriginProtocolPolicy result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Origin Protocol Policy</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OriginProtocolPolicy getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OriginProtocolPolicy result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Origin Protocol Policy</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OriginProtocolPolicy get(int value) {
		switch (value) {
		case HTTP_ONLY_VALUE:
			return HTTP_ONLY;
		case MATCH_VIEWER_VALUE:
			return MATCH_VIEWER;
		case HTTPS_ONLY_VALUE:
			return HTTPS_ONLY;
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
	private OriginProtocolPolicy(int value, String name, String literal) {
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

} //OriginProtocolPolicy
