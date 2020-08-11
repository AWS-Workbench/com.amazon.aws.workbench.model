/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Bucket Access Control</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBucketAccessControl()
 * @model instanceClass="com.amazon.aws.workbench.model.awsworkbench.BucketAccessControl"
 * @generated
 */
public enum BucketAccessControl implements Enumerator {
	/**
	 * The '<em><b>PRIVATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIVATE_VALUE
	 * @generated
	 * @ordered
	 */
	PRIVATE(0, "PRIVATE", "PRIVATE"),

	/**
	 * The '<em><b>PUBLIC READ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLIC_READ_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLIC_READ(1, "PUBLIC_READ", "PUBLIC_READ"),

	/**
	 * The '<em><b>PUBLIC READ WRITE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLIC_READ_WRITE_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLIC_READ_WRITE(2, "PUBLIC_READ_WRITE", "PUBLIC_READ_WRITE"),

	/**
	 * The '<em><b>AUTHENTICATED READ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHENTICATED_READ_VALUE
	 * @generated
	 * @ordered
	 */
	AUTHENTICATED_READ(3, "AUTHENTICATED_READ", "AUTHENTICATED_READ"),

	/**
	 * The '<em><b>LOG DELIVERY WRITE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOG_DELIVERY_WRITE_VALUE
	 * @generated
	 * @ordered
	 */
	LOG_DELIVERY_WRITE(4, "LOG_DELIVERY_WRITE", "LOG_DELIVERY_WRITE"),

	/**
	 * The '<em><b>BUCKET OWNER READ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUCKET_OWNER_READ_VALUE
	 * @generated
	 * @ordered
	 */
	BUCKET_OWNER_READ(5, "BUCKET_OWNER_READ", "BUCKET_OWNER_READ"),

	/**
	 * The '<em><b>BUCKET OWNER FULL CONTROL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUCKET_OWNER_FULL_CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	BUCKET_OWNER_FULL_CONTROL(6, "BUCKET_OWNER_FULL_CONTROL", "BUCKET_OWNER_FULL_CONTROL"),

	/**
	 * The '<em><b>AWS EXEC READ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AWS_EXEC_READ_VALUE
	 * @generated
	 * @ordered
	 */
	AWS_EXEC_READ(7, "AWS_EXEC_READ", "AWS_EXEC_READ");

	/**
	 * The '<em><b>PRIVATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIVATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRIVATE_VALUE = 0;

	/**
	 * The '<em><b>PUBLIC READ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLIC_READ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUBLIC_READ_VALUE = 1;

	/**
	 * The '<em><b>PUBLIC READ WRITE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLIC_READ_WRITE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUBLIC_READ_WRITE_VALUE = 2;

	/**
	 * The '<em><b>AUTHENTICATED READ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHENTICATED_READ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AUTHENTICATED_READ_VALUE = 3;

	/**
	 * The '<em><b>LOG DELIVERY WRITE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOG_DELIVERY_WRITE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOG_DELIVERY_WRITE_VALUE = 4;

	/**
	 * The '<em><b>BUCKET OWNER READ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUCKET_OWNER_READ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUCKET_OWNER_READ_VALUE = 5;

	/**
	 * The '<em><b>BUCKET OWNER FULL CONTROL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUCKET_OWNER_FULL_CONTROL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUCKET_OWNER_FULL_CONTROL_VALUE = 6;

	/**
	 * The '<em><b>AWS EXEC READ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AWS_EXEC_READ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AWS_EXEC_READ_VALUE = 7;

	/**
	 * An array of all the '<em><b>Bucket Access Control</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BucketAccessControl[] VALUES_ARRAY = new BucketAccessControl[] { PRIVATE, PUBLIC_READ,
			PUBLIC_READ_WRITE, AUTHENTICATED_READ, LOG_DELIVERY_WRITE, BUCKET_OWNER_READ, BUCKET_OWNER_FULL_CONTROL,
			AWS_EXEC_READ, };

	/**
	 * A public read-only list of all the '<em><b>Bucket Access Control</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BucketAccessControl> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Bucket Access Control</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BucketAccessControl get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BucketAccessControl result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bucket Access Control</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BucketAccessControl getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BucketAccessControl result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bucket Access Control</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BucketAccessControl get(int value) {
		switch (value) {
		case PRIVATE_VALUE:
			return PRIVATE;
		case PUBLIC_READ_VALUE:
			return PUBLIC_READ;
		case PUBLIC_READ_WRITE_VALUE:
			return PUBLIC_READ_WRITE;
		case AUTHENTICATED_READ_VALUE:
			return AUTHENTICATED_READ;
		case LOG_DELIVERY_WRITE_VALUE:
			return LOG_DELIVERY_WRITE;
		case BUCKET_OWNER_READ_VALUE:
			return BUCKET_OWNER_READ;
		case BUCKET_OWNER_FULL_CONTROL_VALUE:
			return BUCKET_OWNER_FULL_CONTROL;
		case AWS_EXEC_READ_VALUE:
			return AWS_EXEC_READ;
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
	private BucketAccessControl(int value, String name, String literal) {
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

} //BucketAccessControl
