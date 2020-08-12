/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Amazon Linux Generation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAmazonLinuxGeneration()
 * @model instanceClass="com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxGeneration"
 * @generated
 */
public enum AmazonLinuxGeneration implements Enumerator {
	/**
	 * The '<em><b>AMAZON LINUX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMAZON_LINUX_VALUE
	 * @generated
	 * @ordered
	 */
	AMAZON_LINUX(0, "AMAZON_LINUX", "AMAZON_LINUX"),

	/**
	 * The '<em><b>AMAZON LINUX 2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMAZON_LINUX_2_VALUE
	 * @generated
	 * @ordered
	 */
	AMAZON_LINUX_2(1, "AMAZON_LINUX_2", "AMAZON_LINUX_2");

	/**
	 * The '<em><b>AMAZON LINUX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMAZON_LINUX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AMAZON_LINUX_VALUE = 0;

	/**
	 * The '<em><b>AMAZON LINUX 2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMAZON_LINUX_2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AMAZON_LINUX_2_VALUE = 1;

	/**
	 * An array of all the '<em><b>Amazon Linux Generation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AmazonLinuxGeneration[] VALUES_ARRAY = new AmazonLinuxGeneration[] { AMAZON_LINUX,
			AMAZON_LINUX_2, };

	/**
	 * A public read-only list of all the '<em><b>Amazon Linux Generation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AmazonLinuxGeneration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Amazon Linux Generation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AmazonLinuxGeneration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AmazonLinuxGeneration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Amazon Linux Generation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AmazonLinuxGeneration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AmazonLinuxGeneration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Amazon Linux Generation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AmazonLinuxGeneration get(int value) {
		switch (value) {
		case AMAZON_LINUX_VALUE:
			return AMAZON_LINUX;
		case AMAZON_LINUX_2_VALUE:
			return AMAZON_LINUX_2;
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
	private AmazonLinuxGeneration(int value, String name, String literal) {
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

} //AmazonLinuxGeneration
