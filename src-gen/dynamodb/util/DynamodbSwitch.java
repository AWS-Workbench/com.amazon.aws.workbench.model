/**
 */
package dynamodb.util;

import dynamodb.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see dynamodb.DynamodbPackage
 * @generated
 */
public class DynamodbSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DynamodbPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamodbSwitch() {
		if (modelPackage == null) {
			modelPackage = DynamodbPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB: {
			LocalSecondaryIndexPropsBuilder_dynamodb localSecondaryIndexPropsBuilder_dynamodb = (LocalSecondaryIndexPropsBuilder_dynamodb) theEObject;
			T result = caseLocalSecondaryIndexPropsBuilder_dynamodb(localSecondaryIndexPropsBuilder_dynamodb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DynamodbPackage.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB: {
			EnableScalingPropsBuilder_dynamodb enableScalingPropsBuilder_dynamodb = (EnableScalingPropsBuilder_dynamodb) theEObject;
			T result = caseEnableScalingPropsBuilder_dynamodb(enableScalingPropsBuilder_dynamodb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DynamodbPackage.TABLE_PROPS_BUILDER_DYNAMODB: {
			TablePropsBuilder_dynamodb tablePropsBuilder_dynamodb = (TablePropsBuilder_dynamodb) theEObject;
			T result = caseTablePropsBuilder_dynamodb(tablePropsBuilder_dynamodb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DynamodbPackage.TABLE_BUILDER_DYNAMODB: {
			TableBuilder_dynamodb tableBuilder_dynamodb = (TableBuilder_dynamodb) theEObject;
			T result = caseTableBuilder_dynamodb(tableBuilder_dynamodb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DynamodbPackage.GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB: {
			GlobalSecondaryIndexPropsBuilder_dynamodb globalSecondaryIndexPropsBuilder_dynamodb = (GlobalSecondaryIndexPropsBuilder_dynamodb) theEObject;
			T result = caseGlobalSecondaryIndexPropsBuilder_dynamodb(globalSecondaryIndexPropsBuilder_dynamodb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DynamodbPackage.TABLE_OPTIONS_BUILDER_DYNAMODB: {
			TableOptionsBuilder_dynamodb tableOptionsBuilder_dynamodb = (TableOptionsBuilder_dynamodb) theEObject;
			T result = caseTableOptionsBuilder_dynamodb(tableOptionsBuilder_dynamodb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DynamodbPackage.SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB: {
			SecondaryIndexPropsBuilder_dynamodb secondaryIndexPropsBuilder_dynamodb = (SecondaryIndexPropsBuilder_dynamodb) theEObject;
			T result = caseSecondaryIndexPropsBuilder_dynamodb(secondaryIndexPropsBuilder_dynamodb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB: {
			UtilizationScalingPropsBuilder_dynamodb utilizationScalingPropsBuilder_dynamodb = (UtilizationScalingPropsBuilder_dynamodb) theEObject;
			T result = caseUtilizationScalingPropsBuilder_dynamodb(utilizationScalingPropsBuilder_dynamodb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DynamodbPackage.ATTRIBUTE_BUILDER_DYNAMODB: {
			AttributeBuilder_dynamodb attributeBuilder_dynamodb = (AttributeBuilder_dynamodb) theEObject;
			T result = caseAttributeBuilder_dynamodb(attributeBuilder_dynamodb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB: {
			TableAttributesBuilder_dynamodb tableAttributesBuilder_dynamodb = (TableAttributesBuilder_dynamodb) theEObject;
			T result = caseTableAttributesBuilder_dynamodb(tableAttributesBuilder_dynamodb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Secondary Index Props Builder dynamodb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Secondary Index Props Builder dynamodb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalSecondaryIndexPropsBuilder_dynamodb(LocalSecondaryIndexPropsBuilder_dynamodb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enable Scaling Props Builder dynamodb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enable Scaling Props Builder dynamodb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnableScalingPropsBuilder_dynamodb(EnableScalingPropsBuilder_dynamodb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Props Builder dynamodb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Props Builder dynamodb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTablePropsBuilder_dynamodb(TablePropsBuilder_dynamodb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Builder dynamodb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Builder dynamodb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableBuilder_dynamodb(TableBuilder_dynamodb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Secondary Index Props Builder dynamodb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Secondary Index Props Builder dynamodb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalSecondaryIndexPropsBuilder_dynamodb(GlobalSecondaryIndexPropsBuilder_dynamodb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Options Builder dynamodb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Options Builder dynamodb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableOptionsBuilder_dynamodb(TableOptionsBuilder_dynamodb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Secondary Index Props Builder dynamodb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Secondary Index Props Builder dynamodb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecondaryIndexPropsBuilder_dynamodb(SecondaryIndexPropsBuilder_dynamodb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Utilization Scaling Props Builder dynamodb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Utilization Scaling Props Builder dynamodb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUtilizationScalingPropsBuilder_dynamodb(UtilizationScalingPropsBuilder_dynamodb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Builder dynamodb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Builder dynamodb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeBuilder_dynamodb(AttributeBuilder_dynamodb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Attributes Builder dynamodb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Attributes Builder dynamodb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableAttributesBuilder_dynamodb(TableAttributesBuilder_dynamodb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DynamodbSwitch
