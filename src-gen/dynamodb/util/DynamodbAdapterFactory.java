/**
 */
package dynamodb.util;

import dynamodb.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dynamodb.DynamodbPackage
 * @generated
 */
public class DynamodbAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DynamodbPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamodbAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DynamodbPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamodbSwitch<Adapter> modelSwitch = new DynamodbSwitch<Adapter>() {
		@Override
		public Adapter caseLocalSecondaryIndexPropsBuilder_dynamodb(LocalSecondaryIndexPropsBuilder_dynamodb object) {
			return createLocalSecondaryIndexPropsBuilder_dynamodbAdapter();
		}

		@Override
		public Adapter caseEnableScalingPropsBuilder_dynamodb(EnableScalingPropsBuilder_dynamodb object) {
			return createEnableScalingPropsBuilder_dynamodbAdapter();
		}

		@Override
		public Adapter caseTablePropsBuilder_dynamodb(TablePropsBuilder_dynamodb object) {
			return createTablePropsBuilder_dynamodbAdapter();
		}

		@Override
		public Adapter caseTableBuilder_dynamodb(TableBuilder_dynamodb object) {
			return createTableBuilder_dynamodbAdapter();
		}

		@Override
		public Adapter caseGlobalSecondaryIndexPropsBuilder_dynamodb(GlobalSecondaryIndexPropsBuilder_dynamodb object) {
			return createGlobalSecondaryIndexPropsBuilder_dynamodbAdapter();
		}

		@Override
		public Adapter caseTableOptionsBuilder_dynamodb(TableOptionsBuilder_dynamodb object) {
			return createTableOptionsBuilder_dynamodbAdapter();
		}

		@Override
		public Adapter caseSecondaryIndexPropsBuilder_dynamodb(SecondaryIndexPropsBuilder_dynamodb object) {
			return createSecondaryIndexPropsBuilder_dynamodbAdapter();
		}

		@Override
		public Adapter caseUtilizationScalingPropsBuilder_dynamodb(UtilizationScalingPropsBuilder_dynamodb object) {
			return createUtilizationScalingPropsBuilder_dynamodbAdapter();
		}

		@Override
		public Adapter caseAttributeBuilder_dynamodb(AttributeBuilder_dynamodb object) {
			return createAttributeBuilder_dynamodbAdapter();
		}

		@Override
		public Adapter caseTableAttributesBuilder_dynamodb(TableAttributesBuilder_dynamodb object) {
			return createTableAttributesBuilder_dynamodbAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link dynamodb.LocalSecondaryIndexPropsBuilder_dynamodb <em>Local Secondary Index Props Builder dynamodb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dynamodb.LocalSecondaryIndexPropsBuilder_dynamodb
	 * @generated
	 */
	public Adapter createLocalSecondaryIndexPropsBuilder_dynamodbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dynamodb.EnableScalingPropsBuilder_dynamodb <em>Enable Scaling Props Builder dynamodb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dynamodb.EnableScalingPropsBuilder_dynamodb
	 * @generated
	 */
	public Adapter createEnableScalingPropsBuilder_dynamodbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dynamodb.TablePropsBuilder_dynamodb <em>Table Props Builder dynamodb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dynamodb.TablePropsBuilder_dynamodb
	 * @generated
	 */
	public Adapter createTablePropsBuilder_dynamodbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dynamodb.TableBuilder_dynamodb <em>Table Builder dynamodb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dynamodb.TableBuilder_dynamodb
	 * @generated
	 */
	public Adapter createTableBuilder_dynamodbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb <em>Global Secondary Index Props Builder dynamodb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb
	 * @generated
	 */
	public Adapter createGlobalSecondaryIndexPropsBuilder_dynamodbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dynamodb.TableOptionsBuilder_dynamodb <em>Table Options Builder dynamodb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dynamodb.TableOptionsBuilder_dynamodb
	 * @generated
	 */
	public Adapter createTableOptionsBuilder_dynamodbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dynamodb.SecondaryIndexPropsBuilder_dynamodb <em>Secondary Index Props Builder dynamodb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dynamodb.SecondaryIndexPropsBuilder_dynamodb
	 * @generated
	 */
	public Adapter createSecondaryIndexPropsBuilder_dynamodbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dynamodb.UtilizationScalingPropsBuilder_dynamodb <em>Utilization Scaling Props Builder dynamodb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dynamodb.UtilizationScalingPropsBuilder_dynamodb
	 * @generated
	 */
	public Adapter createUtilizationScalingPropsBuilder_dynamodbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dynamodb.AttributeBuilder_dynamodb <em>Attribute Builder dynamodb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dynamodb.AttributeBuilder_dynamodb
	 * @generated
	 */
	public Adapter createAttributeBuilder_dynamodbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dynamodb.TableAttributesBuilder_dynamodb <em>Table Attributes Builder dynamodb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dynamodb.TableAttributesBuilder_dynamodb
	 * @generated
	 */
	public Adapter createTableAttributesBuilder_dynamodbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DynamodbAdapterFactory
