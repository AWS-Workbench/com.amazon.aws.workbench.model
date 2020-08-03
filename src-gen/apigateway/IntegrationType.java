/**
 */
package apigateway;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Integration Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see apigateway.ApigatewayPackage#getIntegrationType()
 * @model instanceClass="apigateway.IntegrationType"
 * @generated
 */
public enum IntegrationType implements Enumerator {
	/**
	 * The '<em><b>AWS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AWS_VALUE
	 * @generated
	 * @ordered
	 */
	AWS(0, "AWS", "AWS"),

	/**
	 * The '<em><b>AWS PROXY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AWS_PROXY_VALUE
	 * @generated
	 * @ordered
	 */
	AWS_PROXY(1, "AWS_PROXY", "AWS_PROXY"),

	/**
	 * The '<em><b>HTTP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_VALUE
	 * @generated
	 * @ordered
	 */
	HTTP(2, "HTTP", "HTTP"),

	/**
	 * The '<em><b>HTTP PROXY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_PROXY_VALUE
	 * @generated
	 * @ordered
	 */
	HTTP_PROXY(3, "HTTP_PROXY", "HTTP_PROXY"),

	/**
	 * The '<em><b>MOCK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOCK_VALUE
	 * @generated
	 * @ordered
	 */
	MOCK(4, "MOCK", "MOCK");

	/**
	 * The '<em><b>AWS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AWS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AWS_VALUE = 0;

	/**
	 * The '<em><b>AWS PROXY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AWS_PROXY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AWS_PROXY_VALUE = 1;

	/**
	 * The '<em><b>HTTP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HTTP_VALUE = 2;

	/**
	 * The '<em><b>HTTP PROXY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_PROXY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HTTP_PROXY_VALUE = 3;

	/**
	 * The '<em><b>MOCK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOCK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOCK_VALUE = 4;

	/**
	 * An array of all the '<em><b>Integration Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IntegrationType[] VALUES_ARRAY = new IntegrationType[] { AWS, AWS_PROXY, HTTP, HTTP_PROXY,
			MOCK, };

	/**
	 * A public read-only list of all the '<em><b>Integration Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IntegrationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Integration Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IntegrationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IntegrationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Integration Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IntegrationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IntegrationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Integration Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IntegrationType get(int value) {
		switch (value) {
		case AWS_VALUE:
			return AWS;
		case AWS_PROXY_VALUE:
			return AWS_PROXY;
		case HTTP_VALUE:
			return HTTP;
		case HTTP_PROXY_VALUE:
			return HTTP_PROXY;
		case MOCK_VALUE:
			return MOCK;
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
	private IntegrationType(int value, String name, String literal) {
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

} //IntegrationType
