/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Viewer Protocol Policy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getViewerProtocolPolicy()
 * @model instanceClass="com.amazon.aws.workbench.model.awsworkbench.ViewerProtocolPolicy"
 * @generated
 */
public enum ViewerProtocolPolicy implements Enumerator {
	/**
	 * The '<em><b>HTTPS ONLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTPS_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	HTTPS_ONLY(0, "HTTPS_ONLY", "HTTPS_ONLY"),

	/**
	 * The '<em><b>REDIRECT TO HTTPS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REDIRECT_TO_HTTPS_VALUE
	 * @generated
	 * @ordered
	 */
	REDIRECT_TO_HTTPS(1, "REDIRECT_TO_HTTPS", "REDIRECT_TO_HTTPS"),

	/**
	 * The '<em><b>ALLOW ALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALLOW_ALL_VALUE
	 * @generated
	 * @ordered
	 */
	ALLOW_ALL(2, "ALLOW_ALL", "ALLOW_ALL");

	/**
	 * The '<em><b>HTTPS ONLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTPS_ONLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HTTPS_ONLY_VALUE = 0;

	/**
	 * The '<em><b>REDIRECT TO HTTPS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REDIRECT_TO_HTTPS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REDIRECT_TO_HTTPS_VALUE = 1;

	/**
	 * The '<em><b>ALLOW ALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALLOW_ALL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALLOW_ALL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Viewer Protocol Policy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ViewerProtocolPolicy[] VALUES_ARRAY = new ViewerProtocolPolicy[] { HTTPS_ONLY,
			REDIRECT_TO_HTTPS, ALLOW_ALL, };

	/**
	 * A public read-only list of all the '<em><b>Viewer Protocol Policy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ViewerProtocolPolicy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Viewer Protocol Policy</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ViewerProtocolPolicy get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ViewerProtocolPolicy result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Viewer Protocol Policy</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ViewerProtocolPolicy getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ViewerProtocolPolicy result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Viewer Protocol Policy</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ViewerProtocolPolicy get(int value) {
		switch (value) {
		case HTTPS_ONLY_VALUE:
			return HTTPS_ONLY;
		case REDIRECT_TO_HTTPS_VALUE:
			return REDIRECT_TO_HTTPS;
		case ALLOW_ALL_VALUE:
			return ALLOW_ALL;
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
	private ViewerProtocolPolicy(int value, String name, String literal) {
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

} //ViewerProtocolPolicy
