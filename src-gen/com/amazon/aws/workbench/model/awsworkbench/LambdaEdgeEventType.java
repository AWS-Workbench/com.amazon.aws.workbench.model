/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Lambda Edge Event Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLambdaEdgeEventType()
 * @model instanceClass="com.amazon.aws.workbench.model.awsworkbench.LambdaEdgeEventType"
 * @generated
 */
public enum LambdaEdgeEventType implements Enumerator {
	/**
	 * The '<em><b>ORIGIN REQUEST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORIGIN_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	ORIGIN_REQUEST(0, "ORIGIN_REQUEST", "ORIGIN_REQUEST"),

	/**
	 * The '<em><b>ORIGIN RESPONSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORIGIN_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	ORIGIN_RESPONSE(1, "ORIGIN_RESPONSE", "ORIGIN_RESPONSE"),

	/**
	 * The '<em><b>VIEWER REQUEST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIEWER_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	VIEWER_REQUEST(2, "VIEWER_REQUEST", "VIEWER_REQUEST"),

	/**
	 * The '<em><b>VIEWER RESPONSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIEWER_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	VIEWER_RESPONSE(3, "VIEWER_RESPONSE", "VIEWER_RESPONSE");

	/**
	 * The '<em><b>ORIGIN REQUEST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORIGIN_REQUEST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ORIGIN_REQUEST_VALUE = 0;

	/**
	 * The '<em><b>ORIGIN RESPONSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORIGIN_RESPONSE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ORIGIN_RESPONSE_VALUE = 1;

	/**
	 * The '<em><b>VIEWER REQUEST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIEWER_REQUEST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VIEWER_REQUEST_VALUE = 2;

	/**
	 * The '<em><b>VIEWER RESPONSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIEWER_RESPONSE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VIEWER_RESPONSE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Lambda Edge Event Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LambdaEdgeEventType[] VALUES_ARRAY = new LambdaEdgeEventType[] { ORIGIN_REQUEST,
			ORIGIN_RESPONSE, VIEWER_REQUEST, VIEWER_RESPONSE, };

	/**
	 * A public read-only list of all the '<em><b>Lambda Edge Event Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LambdaEdgeEventType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Lambda Edge Event Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LambdaEdgeEventType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LambdaEdgeEventType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Lambda Edge Event Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LambdaEdgeEventType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LambdaEdgeEventType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Lambda Edge Event Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LambdaEdgeEventType get(int value) {
		switch (value) {
		case ORIGIN_REQUEST_VALUE:
			return ORIGIN_REQUEST;
		case ORIGIN_RESPONSE_VALUE:
			return ORIGIN_RESPONSE;
		case VIEWER_REQUEST_VALUE:
			return VIEWER_REQUEST;
		case VIEWER_RESPONSE_VALUE:
			return VIEWER_RESPONSE;
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
	private LambdaEdgeEventType(int value, String name, String literal) {
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

} //LambdaEdgeEventType
