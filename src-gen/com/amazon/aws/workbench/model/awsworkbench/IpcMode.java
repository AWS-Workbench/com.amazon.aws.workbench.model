/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ipc Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getIpcMode()
 * @model instanceClass="com.amazon.aws.workbench.model.awsworkbench.IpcMode"
 * @generated
 */
public enum IpcMode implements Enumerator {
	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "NONE", "NONE"),

	/**
	 * The '<em><b>HOST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOST_VALUE
	 * @generated
	 * @ordered
	 */
	HOST(1, "HOST", "HOST"),

	/**
	 * The '<em><b>TASK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TASK_VALUE
	 * @generated
	 * @ordered
	 */
	TASK(2, "TASK", "TASK");

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>HOST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HOST_VALUE = 1;

	/**
	 * The '<em><b>TASK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TASK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TASK_VALUE = 2;

	/**
	 * An array of all the '<em><b>Ipc Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IpcMode[] VALUES_ARRAY = new IpcMode[] { NONE, HOST, TASK, };

	/**
	 * A public read-only list of all the '<em><b>Ipc Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IpcMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ipc Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IpcMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IpcMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ipc Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IpcMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IpcMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ipc Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IpcMode get(int value) {
		switch (value) {
		case NONE_VALUE:
			return NONE;
		case HOST_VALUE:
			return HOST;
		case TASK_VALUE:
			return TASK;
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
	private IpcMode(int value, String name, String literal) {
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

} //IpcMode
