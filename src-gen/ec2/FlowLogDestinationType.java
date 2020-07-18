/**
 */
package ec2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Flow Log Destination Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ec2.Ec2Package#getFlowLogDestinationType()
 * @model instanceClass="ec2.FlowLogDestinationType"
 * @generated
 */
public enum FlowLogDestinationType implements Enumerator {
	/**
	 * The '<em><b>CLOUD WATCH LOGS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOUD_WATCH_LOGS_VALUE
	 * @generated
	 * @ordered
	 */
	CLOUD_WATCH_LOGS(0, "CLOUD_WATCH_LOGS", "CLOUD_WATCH_LOGS"),

	/**
	 * The '<em><b>S3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S3_VALUE
	 * @generated
	 * @ordered
	 */
	S3(1, "S3", "S3");

	/**
	 * The '<em><b>CLOUD WATCH LOGS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOUD_WATCH_LOGS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLOUD_WATCH_LOGS_VALUE = 0;

	/**
	 * The '<em><b>S3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int S3_VALUE = 1;

	/**
	 * An array of all the '<em><b>Flow Log Destination Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FlowLogDestinationType[] VALUES_ARRAY = new FlowLogDestinationType[] { CLOUD_WATCH_LOGS, S3, };

	/**
	 * A public read-only list of all the '<em><b>Flow Log Destination Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FlowLogDestinationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Flow Log Destination Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FlowLogDestinationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FlowLogDestinationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Flow Log Destination Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FlowLogDestinationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FlowLogDestinationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Flow Log Destination Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FlowLogDestinationType get(int value) {
		switch (value) {
		case CLOUD_WATCH_LOGS_VALUE:
			return CLOUD_WATCH_LOGS;
		case S3_VALUE:
			return S3;
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
	private FlowLogDestinationType(int value, String name, String literal) {
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

} //FlowLogDestinationType
