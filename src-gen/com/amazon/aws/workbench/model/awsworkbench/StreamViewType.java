/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Stream View Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getStreamViewType()
 * @model instanceClass="com.amazon.aws.workbench.model.awsworkbench.StreamViewType"
 * @generated
 */
public enum StreamViewType implements Enumerator {
	/**
	 * The '<em><b>NEW IMAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEW_IMAGE_VALUE
	 * @generated
	 * @ordered
	 */
	NEW_IMAGE(0, "NEW_IMAGE", "NEW_IMAGE"),

	/**
	 * The '<em><b>OLD IMAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OLD_IMAGE_VALUE
	 * @generated
	 * @ordered
	 */
	OLD_IMAGE(1, "OLD_IMAGE", "OLD_IMAGE"),

	/**
	 * The '<em><b>NEW AND OLD IMAGES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEW_AND_OLD_IMAGES_VALUE
	 * @generated
	 * @ordered
	 */
	NEW_AND_OLD_IMAGES(2, "NEW_AND_OLD_IMAGES", "NEW_AND_OLD_IMAGES"),

	/**
	 * The '<em><b>KEYS ONLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYS_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	KEYS_ONLY(3, "KEYS_ONLY", "KEYS_ONLY");

	/**
	 * The '<em><b>NEW IMAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEW_IMAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NEW_IMAGE_VALUE = 0;

	/**
	 * The '<em><b>OLD IMAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OLD_IMAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OLD_IMAGE_VALUE = 1;

	/**
	 * The '<em><b>NEW AND OLD IMAGES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEW_AND_OLD_IMAGES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NEW_AND_OLD_IMAGES_VALUE = 2;

	/**
	 * The '<em><b>KEYS ONLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYS_ONLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KEYS_ONLY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Stream View Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StreamViewType[] VALUES_ARRAY = new StreamViewType[] { NEW_IMAGE, OLD_IMAGE,
			NEW_AND_OLD_IMAGES, KEYS_ONLY, };

	/**
	 * A public read-only list of all the '<em><b>Stream View Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StreamViewType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Stream View Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StreamViewType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StreamViewType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Stream View Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StreamViewType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StreamViewType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Stream View Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StreamViewType get(int value) {
		switch (value) {
		case NEW_IMAGE_VALUE:
			return NEW_IMAGE;
		case OLD_IMAGE_VALUE:
			return OLD_IMAGE;
		case NEW_AND_OLD_IMAGES_VALUE:
			return NEW_AND_OLD_IMAGES;
		case KEYS_ONLY_VALUE:
			return KEYS_ONLY;
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
	private StreamViewType(int value, String name, String literal) {
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

} //StreamViewType
