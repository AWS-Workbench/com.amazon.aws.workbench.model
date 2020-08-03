/**
 */
package dynamodb;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dynamodb.DynamodbPackage
 * @generated
 */
public interface DynamodbFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DynamodbFactory eINSTANCE = dynamodb.impl.DynamodbFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Local Secondary Index Props Builder dynamodb</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Secondary Index Props Builder dynamodb</em>'.
	 * @generated
	 */
	LocalSecondaryIndexPropsBuilder_dynamodb createLocalSecondaryIndexPropsBuilder_dynamodb();

	/**
	 * Returns a new object of class '<em>Enable Scaling Props Builder dynamodb</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enable Scaling Props Builder dynamodb</em>'.
	 * @generated
	 */
	EnableScalingPropsBuilder_dynamodb createEnableScalingPropsBuilder_dynamodb();

	/**
	 * Returns a new object of class '<em>Table Props Builder dynamodb</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Props Builder dynamodb</em>'.
	 * @generated
	 */
	TablePropsBuilder_dynamodb createTablePropsBuilder_dynamodb();

	/**
	 * Returns a new object of class '<em>Table Builder dynamodb</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Builder dynamodb</em>'.
	 * @generated
	 */
	TableBuilder_dynamodb createTableBuilder_dynamodb();

	/**
	 * Returns a new object of class '<em>Global Secondary Index Props Builder dynamodb</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Secondary Index Props Builder dynamodb</em>'.
	 * @generated
	 */
	GlobalSecondaryIndexPropsBuilder_dynamodb createGlobalSecondaryIndexPropsBuilder_dynamodb();

	/**
	 * Returns a new object of class '<em>Table Options Builder dynamodb</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Options Builder dynamodb</em>'.
	 * @generated
	 */
	TableOptionsBuilder_dynamodb createTableOptionsBuilder_dynamodb();

	/**
	 * Returns a new object of class '<em>Secondary Index Props Builder dynamodb</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Secondary Index Props Builder dynamodb</em>'.
	 * @generated
	 */
	SecondaryIndexPropsBuilder_dynamodb createSecondaryIndexPropsBuilder_dynamodb();

	/**
	 * Returns a new object of class '<em>Utilization Scaling Props Builder dynamodb</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Utilization Scaling Props Builder dynamodb</em>'.
	 * @generated
	 */
	UtilizationScalingPropsBuilder_dynamodb createUtilizationScalingPropsBuilder_dynamodb();

	/**
	 * Returns a new object of class '<em>Attribute Builder dynamodb</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Builder dynamodb</em>'.
	 * @generated
	 */
	AttributeBuilder_dynamodb createAttributeBuilder_dynamodb();

	/**
	 * Returns a new object of class '<em>Table Attributes Builder dynamodb</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Attributes Builder dynamodb</em>'.
	 * @generated
	 */
	TableAttributesBuilder_dynamodb createTableAttributesBuilder_dynamodb();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DynamodbPackage getDynamodbPackage();

} //DynamodbFactory
