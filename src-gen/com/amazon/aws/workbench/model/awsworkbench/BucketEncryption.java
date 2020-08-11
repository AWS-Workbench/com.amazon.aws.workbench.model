/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Bucket Encryption</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBucketEncryption()
 * @model instanceClass="com.amazon.aws.workbench.model.awsworkbench.BucketEncryption"
 * @generated
 */
public enum BucketEncryption implements Enumerator {
	/**
	 * The '<em><b>UNENCRYPTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNENCRYPTED_VALUE
	 * @generated
	 * @ordered
	 */
	UNENCRYPTED(0, "UNENCRYPTED", "UNENCRYPTED"),

	/**
	 * The '<em><b>KMS MANAGED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KMS_MANAGED_VALUE
	 * @generated
	 * @ordered
	 */
	KMS_MANAGED(1, "KMS_MANAGED", "KMS_MANAGED"),

	/**
	 * The '<em><b>S3 MANAGED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S3_MANAGED_VALUE
	 * @generated
	 * @ordered
	 */
	S3_MANAGED(2, "S3_MANAGED", "S3_MANAGED"),

	/**
	 * The '<em><b>KMS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KMS_VALUE
	 * @generated
	 * @ordered
	 */
	KMS(3, "KMS", "KMS");

	/**
	 * The '<em><b>UNENCRYPTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNENCRYPTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNENCRYPTED_VALUE = 0;

	/**
	 * The '<em><b>KMS MANAGED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KMS_MANAGED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KMS_MANAGED_VALUE = 1;

	/**
	 * The '<em><b>S3 MANAGED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S3_MANAGED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int S3_MANAGED_VALUE = 2;

	/**
	 * The '<em><b>KMS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KMS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KMS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Bucket Encryption</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BucketEncryption[] VALUES_ARRAY = new BucketEncryption[] { UNENCRYPTED, KMS_MANAGED,
			S3_MANAGED, KMS, };

	/**
	 * A public read-only list of all the '<em><b>Bucket Encryption</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BucketEncryption> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Bucket Encryption</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BucketEncryption get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BucketEncryption result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bucket Encryption</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BucketEncryption getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BucketEncryption result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bucket Encryption</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BucketEncryption get(int value) {
		switch (value) {
		case UNENCRYPTED_VALUE:
			return UNENCRYPTED;
		case KMS_MANAGED_VALUE:
			return KMS_MANAGED;
		case S3_MANAGED_VALUE:
			return S3_MANAGED;
		case KMS_VALUE:
			return KMS;
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
	private BucketEncryption(int value, String name, String literal) {
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

} //BucketEncryption
