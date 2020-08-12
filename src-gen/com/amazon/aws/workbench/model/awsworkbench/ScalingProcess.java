/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Scaling Process</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getScalingProcess()
 * @model instanceClass="com.amazon.aws.workbench.model.awsworkbench.ScalingProcess"
 * @generated
 */
public enum ScalingProcess implements Enumerator {
	/**
	 * The '<em><b>LAUNCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAUNCH_VALUE
	 * @generated
	 * @ordered
	 */
	LAUNCH(0, "LAUNCH", "LAUNCH"),

	/**
	 * The '<em><b>TERMINATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TERMINATE_VALUE
	 * @generated
	 * @ordered
	 */
	TERMINATE(1, "TERMINATE", "TERMINATE"),

	/**
	 * The '<em><b>HEALTH CHECK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEALTH_CHECK_VALUE
	 * @generated
	 * @ordered
	 */
	HEALTH_CHECK(2, "HEALTH_CHECK", "HEALTH_CHECK"),

	/**
	 * The '<em><b>REPLACE UNHEALTHY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLACE_UNHEALTHY_VALUE
	 * @generated
	 * @ordered
	 */
	REPLACE_UNHEALTHY(3, "REPLACE_UNHEALTHY", "REPLACE_UNHEALTHY"),

	/**
	 * The '<em><b>AZ REBALANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AZ_REBALANCE_VALUE
	 * @generated
	 * @ordered
	 */
	AZ_REBALANCE(4, "AZ_REBALANCE", "AZ_REBALANCE"),

	/**
	 * The '<em><b>ALARM NOTIFICATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALARM_NOTIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	ALARM_NOTIFICATION(5, "ALARM_NOTIFICATION", "ALARM_NOTIFICATION"),

	/**
	 * The '<em><b>SCHEDULED ACTIONS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHEDULED_ACTIONS_VALUE
	 * @generated
	 * @ordered
	 */
	SCHEDULED_ACTIONS(6, "SCHEDULED_ACTIONS", "SCHEDULED_ACTIONS"),

	/**
	 * The '<em><b>ADD TO LOAD BALANCER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADD_TO_LOAD_BALANCER_VALUE
	 * @generated
	 * @ordered
	 */
	ADD_TO_LOAD_BALANCER(7, "ADD_TO_LOAD_BALANCER", "ADD_TO_LOAD_BALANCER");

	/**
	 * The '<em><b>LAUNCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAUNCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LAUNCH_VALUE = 0;

	/**
	 * The '<em><b>TERMINATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TERMINATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TERMINATE_VALUE = 1;

	/**
	 * The '<em><b>HEALTH CHECK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEALTH_CHECK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEALTH_CHECK_VALUE = 2;

	/**
	 * The '<em><b>REPLACE UNHEALTHY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLACE_UNHEALTHY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REPLACE_UNHEALTHY_VALUE = 3;

	/**
	 * The '<em><b>AZ REBALANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AZ_REBALANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AZ_REBALANCE_VALUE = 4;

	/**
	 * The '<em><b>ALARM NOTIFICATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALARM_NOTIFICATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALARM_NOTIFICATION_VALUE = 5;

	/**
	 * The '<em><b>SCHEDULED ACTIONS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHEDULED_ACTIONS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SCHEDULED_ACTIONS_VALUE = 6;

	/**
	 * The '<em><b>ADD TO LOAD BALANCER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADD_TO_LOAD_BALANCER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADD_TO_LOAD_BALANCER_VALUE = 7;

	/**
	 * An array of all the '<em><b>Scaling Process</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ScalingProcess[] VALUES_ARRAY = new ScalingProcess[] { LAUNCH, TERMINATE, HEALTH_CHECK,
			REPLACE_UNHEALTHY, AZ_REBALANCE, ALARM_NOTIFICATION, SCHEDULED_ACTIONS, ADD_TO_LOAD_BALANCER, };

	/**
	 * A public read-only list of all the '<em><b>Scaling Process</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ScalingProcess> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Scaling Process</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ScalingProcess get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ScalingProcess result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scaling Process</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ScalingProcess getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ScalingProcess result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scaling Process</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ScalingProcess get(int value) {
		switch (value) {
		case LAUNCH_VALUE:
			return LAUNCH;
		case TERMINATE_VALUE:
			return TERMINATE;
		case HEALTH_CHECK_VALUE:
			return HEALTH_CHECK;
		case REPLACE_UNHEALTHY_VALUE:
			return REPLACE_UNHEALTHY;
		case AZ_REBALANCE_VALUE:
			return AZ_REBALANCE;
		case ALARM_NOTIFICATION_VALUE:
			return ALARM_NOTIFICATION;
		case SCHEDULED_ACTIONS_VALUE:
			return SCHEDULED_ACTIONS;
		case ADD_TO_LOAD_BALANCER_VALUE:
			return ADD_TO_LOAD_BALANCER;
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
	private ScalingProcess(int value, String name, String literal) {
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

} //ScalingProcess
