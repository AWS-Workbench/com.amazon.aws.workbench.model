/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Fargate Platform Version</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFargatePlatformVersion()
 * @model instanceClass="com.amazon.aws.workbench.model.awsworkbench.FargatePlatformVersion"
 * @generated
 */
public enum FargatePlatformVersion implements Enumerator {
	/**
	 * The '<em><b>LATEST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATEST_VALUE
	 * @generated
	 * @ordered
	 */
	LATEST(0, "LATEST", "LATEST"),

	/**
	 * The '<em><b>VERSION1 4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERSION1_4_VALUE
	 * @generated
	 * @ordered
	 */
	VERSION1_4(1, "VERSION1_4", "VERSION1_4"),

	/**
	 * The '<em><b>VERSION1 3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERSION1_3_VALUE
	 * @generated
	 * @ordered
	 */
	VERSION1_3(2, "VERSION1_3", "VERSION1_3"),

	/**
	 * The '<em><b>VERSION1 2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERSION1_2_VALUE
	 * @generated
	 * @ordered
	 */
	VERSION1_2(3, "VERSION1_2", "VERSION1_2"),

	/**
	 * The '<em><b>VERSION1 1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERSION1_1_VALUE
	 * @generated
	 * @ordered
	 */
	VERSION1_1(4, "VERSION1_1", "VERSION1_1"),

	/**
	 * The '<em><b>VERSION1 0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERSION1_0_VALUE
	 * @generated
	 * @ordered
	 */
	VERSION1_0(5, "VERSION1_0", "VERSION1_0");

	/**
	 * The '<em><b>LATEST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATEST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LATEST_VALUE = 0;

	/**
	 * The '<em><b>VERSION1 4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERSION1_4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VERSION1_4_VALUE = 1;

	/**
	 * The '<em><b>VERSION1 3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERSION1_3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VERSION1_3_VALUE = 2;

	/**
	 * The '<em><b>VERSION1 2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERSION1_2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VERSION1_2_VALUE = 3;

	/**
	 * The '<em><b>VERSION1 1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERSION1_1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VERSION1_1_VALUE = 4;

	/**
	 * The '<em><b>VERSION1 0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERSION1_0
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VERSION1_0_VALUE = 5;

	/**
	 * An array of all the '<em><b>Fargate Platform Version</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FargatePlatformVersion[] VALUES_ARRAY = new FargatePlatformVersion[] { LATEST, VERSION1_4,
			VERSION1_3, VERSION1_2, VERSION1_1, VERSION1_0, };

	/**
	 * A public read-only list of all the '<em><b>Fargate Platform Version</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FargatePlatformVersion> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Fargate Platform Version</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FargatePlatformVersion get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FargatePlatformVersion result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fargate Platform Version</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FargatePlatformVersion getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FargatePlatformVersion result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fargate Platform Version</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FargatePlatformVersion get(int value) {
		switch (value) {
		case LATEST_VALUE:
			return LATEST;
		case VERSION1_4_VALUE:
			return VERSION1_4;
		case VERSION1_3_VALUE:
			return VERSION1_3;
		case VERSION1_2_VALUE:
			return VERSION1_2;
		case VERSION1_1_VALUE:
			return VERSION1_1;
		case VERSION1_0_VALUE:
			return VERSION1_0;
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
	private FargatePlatformVersion(int value, String name, String literal) {
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

} //FargatePlatformVersion
