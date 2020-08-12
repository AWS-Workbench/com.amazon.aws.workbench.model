/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Dns Record Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDnsRecordType()
 * @model instanceClass="com.amazon.aws.workbench.model.awsworkbench.DnsRecordType"
 * @generated
 */
public enum DnsRecordType implements Enumerator {
	/**
	 * The '<em><b>A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #A_VALUE
	 * @generated
	 * @ordered
	 */
	A(0, "A", "A"),

	/**
	 * The '<em><b>AAAA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AAAA_VALUE
	 * @generated
	 * @ordered
	 */
	AAAA(1, "AAAA", "AAAA"),

	/**
	 * The '<em><b>AAAAA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AAAAA_VALUE
	 * @generated
	 * @ordered
	 */
	AAAAA(2, "A_AAAA", "A_AAAA"),

	/**
	 * The '<em><b>SRV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SRV_VALUE
	 * @generated
	 * @ordered
	 */
	SRV(3, "SRV", "SRV"),

	/**
	 * The '<em><b>CNAME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CNAME_VALUE
	 * @generated
	 * @ordered
	 */
	CNAME(4, "CNAME", "CNAME");

	/**
	 * The '<em><b>A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #A
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int A_VALUE = 0;

	/**
	 * The '<em><b>AAAA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AAAA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AAAA_VALUE = 1;

	/**
	 * The '<em><b>AAAAA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AAAAA
	 * @model name="A_AAAA"
	 * @generated
	 * @ordered
	 */
	public static final int AAAAA_VALUE = 2;

	/**
	 * The '<em><b>SRV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SRV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SRV_VALUE = 3;

	/**
	 * The '<em><b>CNAME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CNAME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CNAME_VALUE = 4;

	/**
	 * An array of all the '<em><b>Dns Record Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DnsRecordType[] VALUES_ARRAY = new DnsRecordType[] { A, AAAA, AAAAA, SRV, CNAME, };

	/**
	 * A public read-only list of all the '<em><b>Dns Record Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DnsRecordType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Dns Record Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DnsRecordType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DnsRecordType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dns Record Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DnsRecordType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DnsRecordType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dns Record Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DnsRecordType get(int value) {
		switch (value) {
		case A_VALUE:
			return A;
		case AAAA_VALUE:
			return AAAA;
		case AAAAA_VALUE:
			return AAAAA;
		case SRV_VALUE:
			return SRV;
		case CNAME_VALUE:
			return CNAME;
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
	private DnsRecordType(int value, String name, String literal) {
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

} //DnsRecordType
