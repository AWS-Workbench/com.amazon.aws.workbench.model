/**
 */
package dynamodb.impl;

import dynamodb.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DynamodbFactoryImpl extends EFactoryImpl implements DynamodbFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DynamodbFactory init() {
		try {
			DynamodbFactory theDynamodbFactory = (DynamodbFactory) EPackage.Registry.INSTANCE
					.getEFactory(DynamodbPackage.eNS_URI);
			if (theDynamodbFactory != null) {
				return theDynamodbFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DynamodbFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamodbFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB:
			return createLocalSecondaryIndexPropsBuilder_dynamodb();
		case DynamodbPackage.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB:
			return createEnableScalingPropsBuilder_dynamodb();
		case DynamodbPackage.TABLE_PROPS_BUILDER_DYNAMODB:
			return createTablePropsBuilder_dynamodb();
		case DynamodbPackage.TABLE_BUILDER_DYNAMODB:
			return createTableBuilder_dynamodb();
		case DynamodbPackage.GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB:
			return createGlobalSecondaryIndexPropsBuilder_dynamodb();
		case DynamodbPackage.TABLE_OPTIONS_BUILDER_DYNAMODB:
			return createTableOptionsBuilder_dynamodb();
		case DynamodbPackage.SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB:
			return createSecondaryIndexPropsBuilder_dynamodb();
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB:
			return createUtilizationScalingPropsBuilder_dynamodb();
		case DynamodbPackage.ATTRIBUTE_BUILDER_DYNAMODB:
			return createAttributeBuilder_dynamodb();
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB:
			return createTableAttributesBuilder_dynamodb();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case DynamodbPackage.STREAM_VIEW_TYPE:
			return createStreamViewTypeFromString(eDataType, initialValue);
		case DynamodbPackage.TABLE_ENCRYPTION:
			return createTableEncryptionFromString(eDataType, initialValue);
		case DynamodbPackage.ATTRIBUTE_TYPE:
			return createAttributeTypeFromString(eDataType, initialValue);
		case DynamodbPackage.PROJECTION_TYPE:
			return createProjectionTypeFromString(eDataType, initialValue);
		case DynamodbPackage.BILLING_MODE:
			return createBillingModeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case DynamodbPackage.STREAM_VIEW_TYPE:
			return convertStreamViewTypeToString(eDataType, instanceValue);
		case DynamodbPackage.TABLE_ENCRYPTION:
			return convertTableEncryptionToString(eDataType, instanceValue);
		case DynamodbPackage.ATTRIBUTE_TYPE:
			return convertAttributeTypeToString(eDataType, instanceValue);
		case DynamodbPackage.PROJECTION_TYPE:
			return convertProjectionTypeToString(eDataType, instanceValue);
		case DynamodbPackage.BILLING_MODE:
			return convertBillingModeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalSecondaryIndexPropsBuilder_dynamodb createLocalSecondaryIndexPropsBuilder_dynamodb() {
		LocalSecondaryIndexPropsBuilder_dynamodbImpl localSecondaryIndexPropsBuilder_dynamodb = new LocalSecondaryIndexPropsBuilder_dynamodbImpl();
		return localSecondaryIndexPropsBuilder_dynamodb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnableScalingPropsBuilder_dynamodb createEnableScalingPropsBuilder_dynamodb() {
		EnableScalingPropsBuilder_dynamodbImpl enableScalingPropsBuilder_dynamodb = new EnableScalingPropsBuilder_dynamodbImpl();
		return enableScalingPropsBuilder_dynamodb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TablePropsBuilder_dynamodb createTablePropsBuilder_dynamodb() {
		TablePropsBuilder_dynamodbImpl tablePropsBuilder_dynamodb = new TablePropsBuilder_dynamodbImpl();
		return tablePropsBuilder_dynamodb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableBuilder_dynamodb createTableBuilder_dynamodb() {
		TableBuilder_dynamodbImpl tableBuilder_dynamodb = new TableBuilder_dynamodbImpl();
		return tableBuilder_dynamodb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlobalSecondaryIndexPropsBuilder_dynamodb createGlobalSecondaryIndexPropsBuilder_dynamodb() {
		GlobalSecondaryIndexPropsBuilder_dynamodbImpl globalSecondaryIndexPropsBuilder_dynamodb = new GlobalSecondaryIndexPropsBuilder_dynamodbImpl();
		return globalSecondaryIndexPropsBuilder_dynamodb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableOptionsBuilder_dynamodb createTableOptionsBuilder_dynamodb() {
		TableOptionsBuilder_dynamodbImpl tableOptionsBuilder_dynamodb = new TableOptionsBuilder_dynamodbImpl();
		return tableOptionsBuilder_dynamodb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecondaryIndexPropsBuilder_dynamodb createSecondaryIndexPropsBuilder_dynamodb() {
		SecondaryIndexPropsBuilder_dynamodbImpl secondaryIndexPropsBuilder_dynamodb = new SecondaryIndexPropsBuilder_dynamodbImpl();
		return secondaryIndexPropsBuilder_dynamodb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UtilizationScalingPropsBuilder_dynamodb createUtilizationScalingPropsBuilder_dynamodb() {
		UtilizationScalingPropsBuilder_dynamodbImpl utilizationScalingPropsBuilder_dynamodb = new UtilizationScalingPropsBuilder_dynamodbImpl();
		return utilizationScalingPropsBuilder_dynamodb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributeBuilder_dynamodb createAttributeBuilder_dynamodb() {
		AttributeBuilder_dynamodbImpl attributeBuilder_dynamodb = new AttributeBuilder_dynamodbImpl();
		return attributeBuilder_dynamodb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableAttributesBuilder_dynamodb createTableAttributesBuilder_dynamodb() {
		TableAttributesBuilder_dynamodbImpl tableAttributesBuilder_dynamodb = new TableAttributesBuilder_dynamodbImpl();
		return tableAttributesBuilder_dynamodb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamViewType createStreamViewTypeFromString(EDataType eDataType, String initialValue) {
		StreamViewType result = StreamViewType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStreamViewTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableEncryption createTableEncryptionFromString(EDataType eDataType, String initialValue) {
		TableEncryption result = TableEncryption.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTableEncryptionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType createAttributeTypeFromString(EDataType eDataType, String initialValue) {
		AttributeType result = AttributeType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectionType createProjectionTypeFromString(EDataType eDataType, String initialValue) {
		ProjectionType result = ProjectionType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProjectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillingMode createBillingModeFromString(EDataType eDataType, String initialValue) {
		BillingMode result = BillingMode.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBillingModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamodbPackage getDynamodbPackage() {
		return (DynamodbPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DynamodbPackage getPackage() {
		return DynamodbPackage.eINSTANCE;
	}

} //DynamodbFactoryImpl
