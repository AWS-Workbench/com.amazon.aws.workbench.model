/**
 */
package dynamodb.impl;

import apigateway.ApigatewayPackage;

import apigateway.impl.ApigatewayPackageImpl;

import certificatemanager.CertificatemanagerPackage;

import certificatemanager.impl.CertificatemanagerPackageImpl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;

import com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl;

import core.CorePackage;

import core.impl.CorePackageImpl;

import dynamodb.AttributeBuilder_dynamodb;
import dynamodb.AttributeType;
import dynamodb.BillingMode;
import dynamodb.DynamodbFactory;
import dynamodb.DynamodbPackage;
import dynamodb.EnableScalingPropsBuilder_dynamodb;
import dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb;
import dynamodb.LocalSecondaryIndexPropsBuilder_dynamodb;
import dynamodb.ProjectionType;
import dynamodb.SecondaryIndexPropsBuilder_dynamodb;
import dynamodb.StreamViewType;
import dynamodb.TableAttributesBuilder_dynamodb;
import dynamodb.TableBuilder_dynamodb;
import dynamodb.TableEncryption;
import dynamodb.TableOptionsBuilder_dynamodb;
import dynamodb.TablePropsBuilder_dynamodb;
import dynamodb.UtilizationScalingPropsBuilder_dynamodb;

import ec2.Ec2Package;

import ec2.impl.Ec2PackageImpl;

import iam.IamPackage;

import iam.impl.IamPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DynamodbPackageImpl extends EPackageImpl implements DynamodbPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localSecondaryIndexPropsBuilder_dynamodbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enableScalingPropsBuilder_dynamodbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tablePropsBuilder_dynamodbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableBuilder_dynamodbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalSecondaryIndexPropsBuilder_dynamodbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableOptionsBuilder_dynamodbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secondaryIndexPropsBuilder_dynamodbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass utilizationScalingPropsBuilder_dynamodbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeBuilder_dynamodbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableAttributesBuilder_dynamodbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum streamViewTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tableEncryptionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attributeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum projectionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum billingModeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see dynamodb.DynamodbPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DynamodbPackageImpl() {
		super(eNS_URI, DynamodbFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DynamodbPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DynamodbPackage init() {
		if (isInited)
			return (DynamodbPackage) EPackage.Registry.INSTANCE.getEPackage(DynamodbPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDynamodbPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DynamodbPackageImpl theDynamodbPackage = registeredDynamodbPackage instanceof DynamodbPackageImpl
				? (DynamodbPackageImpl) registeredDynamodbPackage
				: new DynamodbPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AwsworkbenchPackage.eNS_URI);
		AwsworkbenchPackageImpl theAwsworkbenchPackage = (AwsworkbenchPackageImpl) (registeredPackage instanceof AwsworkbenchPackageImpl
				? registeredPackage
				: AwsworkbenchPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI);
		Ec2PackageImpl theEc2Package = (Ec2PackageImpl) (registeredPackage instanceof Ec2PackageImpl ? registeredPackage
				: Ec2Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ApigatewayPackage.eNS_URI);
		ApigatewayPackageImpl theApigatewayPackage = (ApigatewayPackageImpl) (registeredPackage instanceof ApigatewayPackageImpl
				? registeredPackage
				: ApigatewayPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CertificatemanagerPackage.eNS_URI);
		CertificatemanagerPackageImpl theCertificatemanagerPackage = (CertificatemanagerPackageImpl) (registeredPackage instanceof CertificatemanagerPackageImpl
				? registeredPackage
				: CertificatemanagerPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(IamPackage.eNS_URI);
		IamPackageImpl theIamPackage = (IamPackageImpl) (registeredPackage instanceof IamPackageImpl ? registeredPackage
				: IamPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		CorePackageImpl theCorePackage = (CorePackageImpl) (registeredPackage instanceof CorePackageImpl
				? registeredPackage
				: CorePackage.eINSTANCE);

		// Create package meta-data objects
		theDynamodbPackage.createPackageContents();
		theAwsworkbenchPackage.createPackageContents();
		theEc2Package.createPackageContents();
		theApigatewayPackage.createPackageContents();
		theCertificatemanagerPackage.createPackageContents();
		theIamPackage.createPackageContents();
		theCorePackage.createPackageContents();

		// Initialize created meta-data
		theDynamodbPackage.initializePackageContents();
		theAwsworkbenchPackage.initializePackageContents();
		theEc2Package.initializePackageContents();
		theApigatewayPackage.initializePackageContents();
		theCertificatemanagerPackage.initializePackageContents();
		theIamPackage.initializePackageContents();
		theCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDynamodbPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DynamodbPackage.eNS_URI, theDynamodbPackage);
		return theDynamodbPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocalSecondaryIndexPropsBuilder_dynamodb() {
		return localSecondaryIndexPropsBuilder_dynamodbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocalSecondaryIndexPropsBuilder_dynamodb_SortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference() {
		return (EAttribute) localSecondaryIndexPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocalSecondaryIndexPropsBuilder_dynamodb_IndexName_java_lang_String_() {
		return (EAttribute) localSecondaryIndexPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocalSecondaryIndexPropsBuilder_dynamodb_NonKeyAttributes_java_lang_String_AsList() {
		return (EAttribute) localSecondaryIndexPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocalSecondaryIndexPropsBuilder_dynamodb_ProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_() {
		return (EAttribute) localSecondaryIndexPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocalSecondaryIndexPropsBuilder_dynamodb_GeneratedClassName() {
		return (EAttribute) localSecondaryIndexPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocalSecondaryIndexPropsBuilder_dynamodb_VarName() {
		return (EAttribute) localSecondaryIndexPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocalSecondaryIndexPropsBuilder_dynamodb_Identifier() {
		return (EAttribute) localSecondaryIndexPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocalSecondaryIndexPropsBuilder_dynamodb_AdditionalCode() {
		return (EAttribute) localSecondaryIndexPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnableScalingPropsBuilder_dynamodb() {
		return enableScalingPropsBuilder_dynamodbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnableScalingPropsBuilder_dynamodb_MaxCapacity_java_lang_Number_() {
		return (EAttribute) enableScalingPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnableScalingPropsBuilder_dynamodb_MinCapacity_java_lang_Number_() {
		return (EAttribute) enableScalingPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnableScalingPropsBuilder_dynamodb_GeneratedClassName() {
		return (EAttribute) enableScalingPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnableScalingPropsBuilder_dynamodb_VarName() {
		return (EAttribute) enableScalingPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnableScalingPropsBuilder_dynamodb_Identifier() {
		return (EAttribute) enableScalingPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnableScalingPropsBuilder_dynamodb_AdditionalCode() {
		return (EAttribute) enableScalingPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTablePropsBuilder_dynamodb() {
		return tablePropsBuilder_dynamodbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTablePropsBuilder_dynamodb_TableName_java_lang_String_() {
		return (EAttribute) tablePropsBuilder_dynamodbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTablePropsBuilder_dynamodb_PartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference() {
		return (EAttribute) tablePropsBuilder_dynamodbEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTablePropsBuilder_dynamodb_BillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_() {
		return (EAttribute) tablePropsBuilder_dynamodbEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTablePropsBuilder_dynamodb_Encryption_software_amazon_awscdk_services_dynamodb_TableEncryption_() {
		return (EAttribute) tablePropsBuilder_dynamodbEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTablePropsBuilder_dynamodb_EncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference() {
		return (EAttribute) tablePropsBuilder_dynamodbEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTablePropsBuilder_dynamodb_PointInTimeRecovery_java_lang_Boolean_() {
		return (EAttribute) tablePropsBuilder_dynamodbEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTablePropsBuilder_dynamodb_ReadCapacity_java_lang_Number_() {
		return (EAttribute) tablePropsBuilder_dynamodbEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTablePropsBuilder_dynamodb_RemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_() {
		return (EAttribute) tablePropsBuilder_dynamodbEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTablePropsBuilder_dynamodb_ReplicationRegions_java_lang_String_AsList() {
		return (EAttribute) tablePropsBuilder_dynamodbEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTablePropsBuilder_dynamodb_ServerSideEncryption_java_lang_Boolean_() {
		return (EAttribute) tablePropsBuilder_dynamodbEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTablePropsBuilder_dynamodb_SortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference() {
		return (EAttribute) tablePropsBuilder_dynamodbEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTablePropsBuilder_dynamodb_Stream_software_amazon_awscdk_services_dynamodb_StreamViewType_() {
		return (EAttribute) tablePropsBuilder_dynamodbEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTablePropsBuilder_dynamodb_TimeToLiveAttribute_java_lang_String_() {
		return (EAttribute) tablePropsBuilder_dynamodbEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTablePropsBuilder_dynamodb_WriteCapacity_java_lang_Number_() {
		return (EAttribute) tablePropsBuilder_dynamodbEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTablePropsBuilder_dynamodb_GeneratedClassName() {
		return (EAttribute) tablePropsBuilder_dynamodbEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTablePropsBuilder_dynamodb_VarName() {
		return (EAttribute) tablePropsBuilder_dynamodbEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTablePropsBuilder_dynamodb_Identifier() {
		return (EAttribute) tablePropsBuilder_dynamodbEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTablePropsBuilder_dynamodb_AdditionalCode() {
		return (EAttribute) tablePropsBuilder_dynamodbEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableBuilder_dynamodb() {
		return tableBuilder_dynamodbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableBuilder_dynamodb_PartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference() {
		return (EAttribute) tableBuilder_dynamodbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableBuilder_dynamodb_BillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_() {
		return (EAttribute) tableBuilder_dynamodbEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableBuilder_dynamodb_Encryption_software_amazon_awscdk_services_dynamodb_TableEncryption_() {
		return (EAttribute) tableBuilder_dynamodbEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableBuilder_dynamodb_EncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference() {
		return (EAttribute) tableBuilder_dynamodbEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableBuilder_dynamodb_PointInTimeRecovery_java_lang_Boolean_() {
		return (EAttribute) tableBuilder_dynamodbEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableBuilder_dynamodb_ReadCapacity_java_lang_Number_() {
		return (EAttribute) tableBuilder_dynamodbEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableBuilder_dynamodb_RemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_() {
		return (EAttribute) tableBuilder_dynamodbEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableBuilder_dynamodb_ReplicationRegions_java_lang_String_AsList() {
		return (EAttribute) tableBuilder_dynamodbEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableBuilder_dynamodb_ServerSideEncryption_java_lang_Boolean_() {
		return (EAttribute) tableBuilder_dynamodbEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableBuilder_dynamodb_SortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference() {
		return (EAttribute) tableBuilder_dynamodbEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableBuilder_dynamodb_Stream_software_amazon_awscdk_services_dynamodb_StreamViewType_() {
		return (EAttribute) tableBuilder_dynamodbEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableBuilder_dynamodb_TimeToLiveAttribute_java_lang_String_() {
		return (EAttribute) tableBuilder_dynamodbEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableBuilder_dynamodb_WriteCapacity_java_lang_Number_() {
		return (EAttribute) tableBuilder_dynamodbEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableBuilder_dynamodb_TableName_java_lang_String_() {
		return (EAttribute) tableBuilder_dynamodbEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableBuilder_dynamodb_GeneratedClassName() {
		return (EAttribute) tableBuilder_dynamodbEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableBuilder_dynamodb_VarName() {
		return (EAttribute) tableBuilder_dynamodbEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableBuilder_dynamodb_Identifier() {
		return (EAttribute) tableBuilder_dynamodbEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableBuilder_dynamodb_AdditionalCode() {
		return (EAttribute) tableBuilder_dynamodbEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlobalSecondaryIndexPropsBuilder_dynamodb() {
		return globalSecondaryIndexPropsBuilder_dynamodbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlobalSecondaryIndexPropsBuilder_dynamodb_PartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference() {
		return (EAttribute) globalSecondaryIndexPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlobalSecondaryIndexPropsBuilder_dynamodb_ReadCapacity_java_lang_Number_() {
		return (EAttribute) globalSecondaryIndexPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlobalSecondaryIndexPropsBuilder_dynamodb_SortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference() {
		return (EAttribute) globalSecondaryIndexPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlobalSecondaryIndexPropsBuilder_dynamodb_WriteCapacity_java_lang_Number_() {
		return (EAttribute) globalSecondaryIndexPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlobalSecondaryIndexPropsBuilder_dynamodb_IndexName_java_lang_String_() {
		return (EAttribute) globalSecondaryIndexPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlobalSecondaryIndexPropsBuilder_dynamodb_NonKeyAttributes_java_lang_String_AsList() {
		return (EAttribute) globalSecondaryIndexPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlobalSecondaryIndexPropsBuilder_dynamodb_ProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_() {
		return (EAttribute) globalSecondaryIndexPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlobalSecondaryIndexPropsBuilder_dynamodb_GeneratedClassName() {
		return (EAttribute) globalSecondaryIndexPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlobalSecondaryIndexPropsBuilder_dynamodb_VarName() {
		return (EAttribute) globalSecondaryIndexPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlobalSecondaryIndexPropsBuilder_dynamodb_Identifier() {
		return (EAttribute) globalSecondaryIndexPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlobalSecondaryIndexPropsBuilder_dynamodb_AdditionalCode() {
		return (EAttribute) globalSecondaryIndexPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableOptionsBuilder_dynamodb() {
		return tableOptionsBuilder_dynamodbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableOptionsBuilder_dynamodb_PartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference() {
		return (EAttribute) tableOptionsBuilder_dynamodbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableOptionsBuilder_dynamodb_BillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_() {
		return (EAttribute) tableOptionsBuilder_dynamodbEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableOptionsBuilder_dynamodb_Encryption_software_amazon_awscdk_services_dynamodb_TableEncryption_() {
		return (EAttribute) tableOptionsBuilder_dynamodbEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableOptionsBuilder_dynamodb_EncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference() {
		return (EAttribute) tableOptionsBuilder_dynamodbEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableOptionsBuilder_dynamodb_PointInTimeRecovery_java_lang_Boolean_() {
		return (EAttribute) tableOptionsBuilder_dynamodbEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableOptionsBuilder_dynamodb_ReadCapacity_java_lang_Number_() {
		return (EAttribute) tableOptionsBuilder_dynamodbEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableOptionsBuilder_dynamodb_RemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_() {
		return (EAttribute) tableOptionsBuilder_dynamodbEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableOptionsBuilder_dynamodb_ReplicationRegions_java_lang_String_AsList() {
		return (EAttribute) tableOptionsBuilder_dynamodbEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableOptionsBuilder_dynamodb_ServerSideEncryption_java_lang_Boolean_() {
		return (EAttribute) tableOptionsBuilder_dynamodbEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableOptionsBuilder_dynamodb_SortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference() {
		return (EAttribute) tableOptionsBuilder_dynamodbEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableOptionsBuilder_dynamodb_Stream_software_amazon_awscdk_services_dynamodb_StreamViewType_() {
		return (EAttribute) tableOptionsBuilder_dynamodbEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableOptionsBuilder_dynamodb_TimeToLiveAttribute_java_lang_String_() {
		return (EAttribute) tableOptionsBuilder_dynamodbEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableOptionsBuilder_dynamodb_WriteCapacity_java_lang_Number_() {
		return (EAttribute) tableOptionsBuilder_dynamodbEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableOptionsBuilder_dynamodb_GeneratedClassName() {
		return (EAttribute) tableOptionsBuilder_dynamodbEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableOptionsBuilder_dynamodb_VarName() {
		return (EAttribute) tableOptionsBuilder_dynamodbEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableOptionsBuilder_dynamodb_Identifier() {
		return (EAttribute) tableOptionsBuilder_dynamodbEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableOptionsBuilder_dynamodb_AdditionalCode() {
		return (EAttribute) tableOptionsBuilder_dynamodbEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecondaryIndexPropsBuilder_dynamodb() {
		return secondaryIndexPropsBuilder_dynamodbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecondaryIndexPropsBuilder_dynamodb_IndexName_java_lang_String_() {
		return (EAttribute) secondaryIndexPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecondaryIndexPropsBuilder_dynamodb_NonKeyAttributes_java_lang_String_AsList() {
		return (EAttribute) secondaryIndexPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecondaryIndexPropsBuilder_dynamodb_ProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_() {
		return (EAttribute) secondaryIndexPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecondaryIndexPropsBuilder_dynamodb_GeneratedClassName() {
		return (EAttribute) secondaryIndexPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecondaryIndexPropsBuilder_dynamodb_VarName() {
		return (EAttribute) secondaryIndexPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecondaryIndexPropsBuilder_dynamodb_Identifier() {
		return (EAttribute) secondaryIndexPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecondaryIndexPropsBuilder_dynamodb_AdditionalCode() {
		return (EAttribute) secondaryIndexPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUtilizationScalingPropsBuilder_dynamodb() {
		return utilizationScalingPropsBuilder_dynamodbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUtilizationScalingPropsBuilder_dynamodb_TargetUtilizationPercent_java_lang_Number_() {
		return (EAttribute) utilizationScalingPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUtilizationScalingPropsBuilder_dynamodb_DisableScaleIn_java_lang_Boolean_() {
		return (EAttribute) utilizationScalingPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUtilizationScalingPropsBuilder_dynamodb_PolicyName_java_lang_String_() {
		return (EAttribute) utilizationScalingPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUtilizationScalingPropsBuilder_dynamodb_ScaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return (EAttribute) utilizationScalingPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUtilizationScalingPropsBuilder_dynamodb_ScaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return (EAttribute) utilizationScalingPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUtilizationScalingPropsBuilder_dynamodb_GeneratedClassName() {
		return (EAttribute) utilizationScalingPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUtilizationScalingPropsBuilder_dynamodb_VarName() {
		return (EAttribute) utilizationScalingPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUtilizationScalingPropsBuilder_dynamodb_Identifier() {
		return (EAttribute) utilizationScalingPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUtilizationScalingPropsBuilder_dynamodb_AdditionalCode() {
		return (EAttribute) utilizationScalingPropsBuilder_dynamodbEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttributeBuilder_dynamodb() {
		return attributeBuilder_dynamodbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttributeBuilder_dynamodb_Name_java_lang_String_() {
		return (EAttribute) attributeBuilder_dynamodbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttributeBuilder_dynamodb_Type_software_amazon_awscdk_services_dynamodb_AttributeType_() {
		return (EAttribute) attributeBuilder_dynamodbEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttributeBuilder_dynamodb_GeneratedClassName() {
		return (EAttribute) attributeBuilder_dynamodbEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttributeBuilder_dynamodb_VarName() {
		return (EAttribute) attributeBuilder_dynamodbEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttributeBuilder_dynamodb_Identifier() {
		return (EAttribute) attributeBuilder_dynamodbEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttributeBuilder_dynamodb_AdditionalCode() {
		return (EAttribute) attributeBuilder_dynamodbEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableAttributesBuilder_dynamodb() {
		return tableAttributesBuilder_dynamodbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableAttributesBuilder_dynamodb_EncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference() {
		return (EAttribute) tableAttributesBuilder_dynamodbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableAttributesBuilder_dynamodb_GlobalIndexes_java_lang_String_AsList() {
		return (EAttribute) tableAttributesBuilder_dynamodbEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableAttributesBuilder_dynamodb_LocalIndexes_java_lang_String_AsList() {
		return (EAttribute) tableAttributesBuilder_dynamodbEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableAttributesBuilder_dynamodb_TableArn_java_lang_String_() {
		return (EAttribute) tableAttributesBuilder_dynamodbEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableAttributesBuilder_dynamodb_TableName_java_lang_String_() {
		return (EAttribute) tableAttributesBuilder_dynamodbEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableAttributesBuilder_dynamodb_TableStreamArn_java_lang_String_() {
		return (EAttribute) tableAttributesBuilder_dynamodbEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableAttributesBuilder_dynamodb_GeneratedClassName() {
		return (EAttribute) tableAttributesBuilder_dynamodbEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableAttributesBuilder_dynamodb_VarName() {
		return (EAttribute) tableAttributesBuilder_dynamodbEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableAttributesBuilder_dynamodb_Identifier() {
		return (EAttribute) tableAttributesBuilder_dynamodbEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableAttributesBuilder_dynamodb_AdditionalCode() {
		return (EAttribute) tableAttributesBuilder_dynamodbEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getStreamViewType() {
		return streamViewTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTableEncryption() {
		return tableEncryptionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAttributeType() {
		return attributeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProjectionType() {
		return projectionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBillingMode() {
		return billingModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamodbFactory getDynamodbFactory() {
		return (DynamodbFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		localSecondaryIndexPropsBuilder_dynamodbEClass = createEClass(LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB);
		createEAttribute(localSecondaryIndexPropsBuilder_dynamodbEClass,
				LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE);
		createEAttribute(localSecondaryIndexPropsBuilder_dynamodbEClass,
				LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__INDEX_NAME_JAVA_LANG_STRING_);
		createEAttribute(localSecondaryIndexPropsBuilder_dynamodbEClass,
				LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__NON_KEY_ATTRIBUTES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(localSecondaryIndexPropsBuilder_dynamodbEClass,
				LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__PROJECTION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_PROJECTION_TYPE_);
		createEAttribute(localSecondaryIndexPropsBuilder_dynamodbEClass,
				LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__GENERATED_CLASS_NAME);
		createEAttribute(localSecondaryIndexPropsBuilder_dynamodbEClass,
				LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__VAR_NAME);
		createEAttribute(localSecondaryIndexPropsBuilder_dynamodbEClass,
				LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__IDENTIFIER);
		createEAttribute(localSecondaryIndexPropsBuilder_dynamodbEClass,
				LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE);

		enableScalingPropsBuilder_dynamodbEClass = createEClass(ENABLE_SCALING_PROPS_BUILDER_DYNAMODB);
		createEAttribute(enableScalingPropsBuilder_dynamodbEClass,
				ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__MAX_CAPACITY_JAVA_LANG_NUMBER_);
		createEAttribute(enableScalingPropsBuilder_dynamodbEClass,
				ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__MIN_CAPACITY_JAVA_LANG_NUMBER_);
		createEAttribute(enableScalingPropsBuilder_dynamodbEClass,
				ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__GENERATED_CLASS_NAME);
		createEAttribute(enableScalingPropsBuilder_dynamodbEClass, ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__VAR_NAME);
		createEAttribute(enableScalingPropsBuilder_dynamodbEClass, ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__IDENTIFIER);
		createEAttribute(enableScalingPropsBuilder_dynamodbEClass,
				ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE);

		tablePropsBuilder_dynamodbEClass = createEClass(TABLE_PROPS_BUILDER_DYNAMODB);
		createEAttribute(tablePropsBuilder_dynamodbEClass, TABLE_PROPS_BUILDER_DYNAMODB__TABLE_NAME_JAVA_LANG_STRING_);
		createEAttribute(tablePropsBuilder_dynamodbEClass,
				TABLE_PROPS_BUILDER_DYNAMODB__PARTITION_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE);
		createEAttribute(tablePropsBuilder_dynamodbEClass,
				TABLE_PROPS_BUILDER_DYNAMODB__BILLING_MODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_BILLING_MODE_);
		createEAttribute(tablePropsBuilder_dynamodbEClass,
				TABLE_PROPS_BUILDER_DYNAMODB__ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_ENCRYPTION_);
		createEAttribute(tablePropsBuilder_dynamodbEClass,
				TABLE_PROPS_BUILDER_DYNAMODB__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE);
		createEAttribute(tablePropsBuilder_dynamodbEClass,
				TABLE_PROPS_BUILDER_DYNAMODB__POINT_IN_TIME_RECOVERY_JAVA_LANG_BOOLEAN_);
		createEAttribute(tablePropsBuilder_dynamodbEClass,
				TABLE_PROPS_BUILDER_DYNAMODB__READ_CAPACITY_JAVA_LANG_NUMBER_);
		createEAttribute(tablePropsBuilder_dynamodbEClass,
				TABLE_PROPS_BUILDER_DYNAMODB__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_);
		createEAttribute(tablePropsBuilder_dynamodbEClass,
				TABLE_PROPS_BUILDER_DYNAMODB__REPLICATION_REGIONS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(tablePropsBuilder_dynamodbEClass,
				TABLE_PROPS_BUILDER_DYNAMODB__SERVER_SIDE_ENCRYPTION_JAVA_LANG_BOOLEAN_);
		createEAttribute(tablePropsBuilder_dynamodbEClass,
				TABLE_PROPS_BUILDER_DYNAMODB__SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE);
		createEAttribute(tablePropsBuilder_dynamodbEClass,
				TABLE_PROPS_BUILDER_DYNAMODB__STREAM_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_STREAM_VIEW_TYPE_);
		createEAttribute(tablePropsBuilder_dynamodbEClass,
				TABLE_PROPS_BUILDER_DYNAMODB__TIME_TO_LIVE_ATTRIBUTE_JAVA_LANG_STRING_);
		createEAttribute(tablePropsBuilder_dynamodbEClass,
				TABLE_PROPS_BUILDER_DYNAMODB__WRITE_CAPACITY_JAVA_LANG_NUMBER_);
		createEAttribute(tablePropsBuilder_dynamodbEClass, TABLE_PROPS_BUILDER_DYNAMODB__GENERATED_CLASS_NAME);
		createEAttribute(tablePropsBuilder_dynamodbEClass, TABLE_PROPS_BUILDER_DYNAMODB__VAR_NAME);
		createEAttribute(tablePropsBuilder_dynamodbEClass, TABLE_PROPS_BUILDER_DYNAMODB__IDENTIFIER);
		createEAttribute(tablePropsBuilder_dynamodbEClass, TABLE_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE);

		tableBuilder_dynamodbEClass = createEClass(TABLE_BUILDER_DYNAMODB);
		createEAttribute(tableBuilder_dynamodbEClass,
				TABLE_BUILDER_DYNAMODB__PARTITION_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE);
		createEAttribute(tableBuilder_dynamodbEClass,
				TABLE_BUILDER_DYNAMODB__BILLING_MODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_BILLING_MODE_);
		createEAttribute(tableBuilder_dynamodbEClass,
				TABLE_BUILDER_DYNAMODB__ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_ENCRYPTION_);
		createEAttribute(tableBuilder_dynamodbEClass,
				TABLE_BUILDER_DYNAMODB__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE);
		createEAttribute(tableBuilder_dynamodbEClass,
				TABLE_BUILDER_DYNAMODB__POINT_IN_TIME_RECOVERY_JAVA_LANG_BOOLEAN_);
		createEAttribute(tableBuilder_dynamodbEClass, TABLE_BUILDER_DYNAMODB__READ_CAPACITY_JAVA_LANG_NUMBER_);
		createEAttribute(tableBuilder_dynamodbEClass,
				TABLE_BUILDER_DYNAMODB__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_);
		createEAttribute(tableBuilder_dynamodbEClass,
				TABLE_BUILDER_DYNAMODB__REPLICATION_REGIONS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(tableBuilder_dynamodbEClass,
				TABLE_BUILDER_DYNAMODB__SERVER_SIDE_ENCRYPTION_JAVA_LANG_BOOLEAN_);
		createEAttribute(tableBuilder_dynamodbEClass,
				TABLE_BUILDER_DYNAMODB__SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE);
		createEAttribute(tableBuilder_dynamodbEClass,
				TABLE_BUILDER_DYNAMODB__STREAM_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_STREAM_VIEW_TYPE_);
		createEAttribute(tableBuilder_dynamodbEClass, TABLE_BUILDER_DYNAMODB__TIME_TO_LIVE_ATTRIBUTE_JAVA_LANG_STRING_);
		createEAttribute(tableBuilder_dynamodbEClass, TABLE_BUILDER_DYNAMODB__WRITE_CAPACITY_JAVA_LANG_NUMBER_);
		createEAttribute(tableBuilder_dynamodbEClass, TABLE_BUILDER_DYNAMODB__TABLE_NAME_JAVA_LANG_STRING_);
		createEAttribute(tableBuilder_dynamodbEClass, TABLE_BUILDER_DYNAMODB__GENERATED_CLASS_NAME);
		createEAttribute(tableBuilder_dynamodbEClass, TABLE_BUILDER_DYNAMODB__VAR_NAME);
		createEAttribute(tableBuilder_dynamodbEClass, TABLE_BUILDER_DYNAMODB__IDENTIFIER);
		createEAttribute(tableBuilder_dynamodbEClass, TABLE_BUILDER_DYNAMODB__ADDITIONAL_CODE);

		globalSecondaryIndexPropsBuilder_dynamodbEClass = createEClass(GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB);
		createEAttribute(globalSecondaryIndexPropsBuilder_dynamodbEClass,
				GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__PARTITION_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE);
		createEAttribute(globalSecondaryIndexPropsBuilder_dynamodbEClass,
				GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__READ_CAPACITY_JAVA_LANG_NUMBER_);
		createEAttribute(globalSecondaryIndexPropsBuilder_dynamodbEClass,
				GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE);
		createEAttribute(globalSecondaryIndexPropsBuilder_dynamodbEClass,
				GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__WRITE_CAPACITY_JAVA_LANG_NUMBER_);
		createEAttribute(globalSecondaryIndexPropsBuilder_dynamodbEClass,
				GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__INDEX_NAME_JAVA_LANG_STRING_);
		createEAttribute(globalSecondaryIndexPropsBuilder_dynamodbEClass,
				GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__NON_KEY_ATTRIBUTES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(globalSecondaryIndexPropsBuilder_dynamodbEClass,
				GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__PROJECTION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_PROJECTION_TYPE_);
		createEAttribute(globalSecondaryIndexPropsBuilder_dynamodbEClass,
				GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__GENERATED_CLASS_NAME);
		createEAttribute(globalSecondaryIndexPropsBuilder_dynamodbEClass,
				GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__VAR_NAME);
		createEAttribute(globalSecondaryIndexPropsBuilder_dynamodbEClass,
				GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__IDENTIFIER);
		createEAttribute(globalSecondaryIndexPropsBuilder_dynamodbEClass,
				GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE);

		tableOptionsBuilder_dynamodbEClass = createEClass(TABLE_OPTIONS_BUILDER_DYNAMODB);
		createEAttribute(tableOptionsBuilder_dynamodbEClass,
				TABLE_OPTIONS_BUILDER_DYNAMODB__PARTITION_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE);
		createEAttribute(tableOptionsBuilder_dynamodbEClass,
				TABLE_OPTIONS_BUILDER_DYNAMODB__BILLING_MODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_BILLING_MODE_);
		createEAttribute(tableOptionsBuilder_dynamodbEClass,
				TABLE_OPTIONS_BUILDER_DYNAMODB__ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_ENCRYPTION_);
		createEAttribute(tableOptionsBuilder_dynamodbEClass,
				TABLE_OPTIONS_BUILDER_DYNAMODB__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE);
		createEAttribute(tableOptionsBuilder_dynamodbEClass,
				TABLE_OPTIONS_BUILDER_DYNAMODB__POINT_IN_TIME_RECOVERY_JAVA_LANG_BOOLEAN_);
		createEAttribute(tableOptionsBuilder_dynamodbEClass,
				TABLE_OPTIONS_BUILDER_DYNAMODB__READ_CAPACITY_JAVA_LANG_NUMBER_);
		createEAttribute(tableOptionsBuilder_dynamodbEClass,
				TABLE_OPTIONS_BUILDER_DYNAMODB__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_);
		createEAttribute(tableOptionsBuilder_dynamodbEClass,
				TABLE_OPTIONS_BUILDER_DYNAMODB__REPLICATION_REGIONS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(tableOptionsBuilder_dynamodbEClass,
				TABLE_OPTIONS_BUILDER_DYNAMODB__SERVER_SIDE_ENCRYPTION_JAVA_LANG_BOOLEAN_);
		createEAttribute(tableOptionsBuilder_dynamodbEClass,
				TABLE_OPTIONS_BUILDER_DYNAMODB__SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE);
		createEAttribute(tableOptionsBuilder_dynamodbEClass,
				TABLE_OPTIONS_BUILDER_DYNAMODB__STREAM_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_STREAM_VIEW_TYPE_);
		createEAttribute(tableOptionsBuilder_dynamodbEClass,
				TABLE_OPTIONS_BUILDER_DYNAMODB__TIME_TO_LIVE_ATTRIBUTE_JAVA_LANG_STRING_);
		createEAttribute(tableOptionsBuilder_dynamodbEClass,
				TABLE_OPTIONS_BUILDER_DYNAMODB__WRITE_CAPACITY_JAVA_LANG_NUMBER_);
		createEAttribute(tableOptionsBuilder_dynamodbEClass, TABLE_OPTIONS_BUILDER_DYNAMODB__GENERATED_CLASS_NAME);
		createEAttribute(tableOptionsBuilder_dynamodbEClass, TABLE_OPTIONS_BUILDER_DYNAMODB__VAR_NAME);
		createEAttribute(tableOptionsBuilder_dynamodbEClass, TABLE_OPTIONS_BUILDER_DYNAMODB__IDENTIFIER);
		createEAttribute(tableOptionsBuilder_dynamodbEClass, TABLE_OPTIONS_BUILDER_DYNAMODB__ADDITIONAL_CODE);

		secondaryIndexPropsBuilder_dynamodbEClass = createEClass(SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB);
		createEAttribute(secondaryIndexPropsBuilder_dynamodbEClass,
				SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__INDEX_NAME_JAVA_LANG_STRING_);
		createEAttribute(secondaryIndexPropsBuilder_dynamodbEClass,
				SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__NON_KEY_ATTRIBUTES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(secondaryIndexPropsBuilder_dynamodbEClass,
				SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__PROJECTION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_PROJECTION_TYPE_);
		createEAttribute(secondaryIndexPropsBuilder_dynamodbEClass,
				SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__GENERATED_CLASS_NAME);
		createEAttribute(secondaryIndexPropsBuilder_dynamodbEClass, SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__VAR_NAME);
		createEAttribute(secondaryIndexPropsBuilder_dynamodbEClass, SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__IDENTIFIER);
		createEAttribute(secondaryIndexPropsBuilder_dynamodbEClass,
				SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE);

		utilizationScalingPropsBuilder_dynamodbEClass = createEClass(UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB);
		createEAttribute(utilizationScalingPropsBuilder_dynamodbEClass,
				UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__TARGET_UTILIZATION_PERCENT_JAVA_LANG_NUMBER_);
		createEAttribute(utilizationScalingPropsBuilder_dynamodbEClass,
				UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__DISABLE_SCALE_IN_JAVA_LANG_BOOLEAN_);
		createEAttribute(utilizationScalingPropsBuilder_dynamodbEClass,
				UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__POLICY_NAME_JAVA_LANG_STRING_);
		createEAttribute(utilizationScalingPropsBuilder_dynamodbEClass,
				UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__SCALE_IN_COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE);
		createEAttribute(utilizationScalingPropsBuilder_dynamodbEClass,
				UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__SCALE_OUT_COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE);
		createEAttribute(utilizationScalingPropsBuilder_dynamodbEClass,
				UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__GENERATED_CLASS_NAME);
		createEAttribute(utilizationScalingPropsBuilder_dynamodbEClass,
				UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__VAR_NAME);
		createEAttribute(utilizationScalingPropsBuilder_dynamodbEClass,
				UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__IDENTIFIER);
		createEAttribute(utilizationScalingPropsBuilder_dynamodbEClass,
				UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE);

		attributeBuilder_dynamodbEClass = createEClass(ATTRIBUTE_BUILDER_DYNAMODB);
		createEAttribute(attributeBuilder_dynamodbEClass, ATTRIBUTE_BUILDER_DYNAMODB__NAME_JAVA_LANG_STRING_);
		createEAttribute(attributeBuilder_dynamodbEClass,
				ATTRIBUTE_BUILDER_DYNAMODB__TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_TYPE_);
		createEAttribute(attributeBuilder_dynamodbEClass, ATTRIBUTE_BUILDER_DYNAMODB__GENERATED_CLASS_NAME);
		createEAttribute(attributeBuilder_dynamodbEClass, ATTRIBUTE_BUILDER_DYNAMODB__VAR_NAME);
		createEAttribute(attributeBuilder_dynamodbEClass, ATTRIBUTE_BUILDER_DYNAMODB__IDENTIFIER);
		createEAttribute(attributeBuilder_dynamodbEClass, ATTRIBUTE_BUILDER_DYNAMODB__ADDITIONAL_CODE);

		tableAttributesBuilder_dynamodbEClass = createEClass(TABLE_ATTRIBUTES_BUILDER_DYNAMODB);
		createEAttribute(tableAttributesBuilder_dynamodbEClass,
				TABLE_ATTRIBUTES_BUILDER_DYNAMODB__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE);
		createEAttribute(tableAttributesBuilder_dynamodbEClass,
				TABLE_ATTRIBUTES_BUILDER_DYNAMODB__GLOBAL_INDEXES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(tableAttributesBuilder_dynamodbEClass,
				TABLE_ATTRIBUTES_BUILDER_DYNAMODB__LOCAL_INDEXES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(tableAttributesBuilder_dynamodbEClass,
				TABLE_ATTRIBUTES_BUILDER_DYNAMODB__TABLE_ARN_JAVA_LANG_STRING_);
		createEAttribute(tableAttributesBuilder_dynamodbEClass,
				TABLE_ATTRIBUTES_BUILDER_DYNAMODB__TABLE_NAME_JAVA_LANG_STRING_);
		createEAttribute(tableAttributesBuilder_dynamodbEClass,
				TABLE_ATTRIBUTES_BUILDER_DYNAMODB__TABLE_STREAM_ARN_JAVA_LANG_STRING_);
		createEAttribute(tableAttributesBuilder_dynamodbEClass,
				TABLE_ATTRIBUTES_BUILDER_DYNAMODB__GENERATED_CLASS_NAME);
		createEAttribute(tableAttributesBuilder_dynamodbEClass, TABLE_ATTRIBUTES_BUILDER_DYNAMODB__VAR_NAME);
		createEAttribute(tableAttributesBuilder_dynamodbEClass, TABLE_ATTRIBUTES_BUILDER_DYNAMODB__IDENTIFIER);
		createEAttribute(tableAttributesBuilder_dynamodbEClass, TABLE_ATTRIBUTES_BUILDER_DYNAMODB__ADDITIONAL_CODE);

		// Create enums
		streamViewTypeEEnum = createEEnum(STREAM_VIEW_TYPE);
		tableEncryptionEEnum = createEEnum(TABLE_ENCRYPTION);
		attributeTypeEEnum = createEEnum(ATTRIBUTE_TYPE);
		projectionTypeEEnum = createEEnum(PROJECTION_TYPE);
		billingModeEEnum = createEEnum(BILLING_MODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage) EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(localSecondaryIndexPropsBuilder_dynamodbEClass, LocalSecondaryIndexPropsBuilder_dynamodb.class,
				"LocalSecondaryIndexPropsBuilder_dynamodb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getLocalSecondaryIndexPropsBuilder_dynamodb_SortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference(),
				ecorePackage.getEString(),
				"sortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference", null, 0, 1,
				LocalSecondaryIndexPropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalSecondaryIndexPropsBuilder_dynamodb_IndexName_java_lang_String_(),
				ecorePackage.getEString(), "indexName_java_lang_String_", null, 0, 1,
				LocalSecondaryIndexPropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalSecondaryIndexPropsBuilder_dynamodb_NonKeyAttributes_java_lang_String_AsList(),
				ecorePackage.getEString(), "nonKeyAttributes_java_lang_String_AsList", null, 0, 1,
				LocalSecondaryIndexPropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLocalSecondaryIndexPropsBuilder_dynamodb_ProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_(),
				this.getProjectionType(), "projectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_",
				null, 0, 1, LocalSecondaryIndexPropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalSecondaryIndexPropsBuilder_dynamodb_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.dynamodb.LocalSecondaryIndexProps", 0, 1,
				LocalSecondaryIndexPropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalSecondaryIndexPropsBuilder_dynamodb_VarName(), ecorePackage.getEString(), "varName",
				null, 0, 1, LocalSecondaryIndexPropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalSecondaryIndexPropsBuilder_dynamodb_Identifier(), ecorePackage.getEString(),
				"identifier", null, 0, 1, LocalSecondaryIndexPropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalSecondaryIndexPropsBuilder_dynamodb_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, LocalSecondaryIndexPropsBuilder_dynamodb.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enableScalingPropsBuilder_dynamodbEClass, EnableScalingPropsBuilder_dynamodb.class,
				"EnableScalingPropsBuilder_dynamodb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnableScalingPropsBuilder_dynamodb_MaxCapacity_java_lang_Number_(), ecorePackage.getEInt(),
				"maxCapacity_java_lang_Number_", null, 0, 1, EnableScalingPropsBuilder_dynamodb.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnableScalingPropsBuilder_dynamodb_MinCapacity_java_lang_Number_(), ecorePackage.getEInt(),
				"minCapacity_java_lang_Number_", null, 0, 1, EnableScalingPropsBuilder_dynamodb.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnableScalingPropsBuilder_dynamodb_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.dynamodb.EnableScalingProps", 0, 1,
				EnableScalingPropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnableScalingPropsBuilder_dynamodb_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, EnableScalingPropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnableScalingPropsBuilder_dynamodb_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, EnableScalingPropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnableScalingPropsBuilder_dynamodb_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, EnableScalingPropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tablePropsBuilder_dynamodbEClass, TablePropsBuilder_dynamodb.class, "TablePropsBuilder_dynamodb",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTablePropsBuilder_dynamodb_TableName_java_lang_String_(), ecorePackage.getEString(),
				"tableName_java_lang_String_", null, 0, 1, TablePropsBuilder_dynamodb.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getTablePropsBuilder_dynamodb_PartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference(),
				ecorePackage.getEString(),
				"partitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference", null, 0, 1,
				TablePropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getTablePropsBuilder_dynamodb_BillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_(),
				this.getBillingMode(), "billingMode_software_amazon_awscdk_services_dynamodb_BillingMode_", null, 0, 1,
				TablePropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getTablePropsBuilder_dynamodb_Encryption_software_amazon_awscdk_services_dynamodb_TableEncryption_(),
				this.getTableEncryption(), "encryption_software_amazon_awscdk_services_dynamodb_TableEncryption_", null,
				0, 1, TablePropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getTablePropsBuilder_dynamodb_EncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(),
				ecorePackage.getEString(), "encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference",
				null, 0, 1, TablePropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTablePropsBuilder_dynamodb_PointInTimeRecovery_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "pointInTimeRecovery_java_lang_Boolean_", null, 0, 1,
				TablePropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTablePropsBuilder_dynamodb_ReadCapacity_java_lang_Number_(), ecorePackage.getEInt(),
				"readCapacity_java_lang_Number_", null, 0, 1, TablePropsBuilder_dynamodb.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTablePropsBuilder_dynamodb_RemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_(),
				theCorePackage.getRemovalPolicy(), "removalPolicy_software_amazon_awscdk_core_RemovalPolicy_", null, 0,
				1, TablePropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTablePropsBuilder_dynamodb_ReplicationRegions_java_lang_String_AsList(),
				ecorePackage.getEString(), "replicationRegions_java_lang_String_AsList", null, 0, 1,
				TablePropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTablePropsBuilder_dynamodb_ServerSideEncryption_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "serverSideEncryption_java_lang_Boolean_", null, 0, 1,
				TablePropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getTablePropsBuilder_dynamodb_SortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference(),
				ecorePackage.getEString(),
				"sortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference", null, 0, 1,
				TablePropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTablePropsBuilder_dynamodb_Stream_software_amazon_awscdk_services_dynamodb_StreamViewType_(),
				this.getStreamViewType(), "stream_software_amazon_awscdk_services_dynamodb_StreamViewType_", null, 0, 1,
				TablePropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTablePropsBuilder_dynamodb_TimeToLiveAttribute_java_lang_String_(), ecorePackage.getEString(),
				"timeToLiveAttribute_java_lang_String_", null, 0, 1, TablePropsBuilder_dynamodb.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTablePropsBuilder_dynamodb_WriteCapacity_java_lang_Number_(), ecorePackage.getEInt(),
				"writeCapacity_java_lang_Number_", null, 0, 1, TablePropsBuilder_dynamodb.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTablePropsBuilder_dynamodb_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.dynamodb.TableProps", 0, 1,
				TablePropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTablePropsBuilder_dynamodb_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				TablePropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTablePropsBuilder_dynamodb_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				TablePropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTablePropsBuilder_dynamodb_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, TablePropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableBuilder_dynamodbEClass, TableBuilder_dynamodb.class, "TableBuilder_dynamodb", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getTableBuilder_dynamodb_PartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference(),
				ecorePackage.getEString(),
				"partitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference", null, 0, 1,
				TableBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableBuilder_dynamodb_BillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_(),
				this.getBillingMode(), "billingMode_software_amazon_awscdk_services_dynamodb_BillingMode_", null, 0, 1,
				TableBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableBuilder_dynamodb_Encryption_software_amazon_awscdk_services_dynamodb_TableEncryption_(),
				this.getTableEncryption(), "encryption_software_amazon_awscdk_services_dynamodb_TableEncryption_", null,
				0, 1, TableBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getTableBuilder_dynamodb_EncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(),
				ecorePackage.getEString(), "encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference",
				null, 0, 1, TableBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableBuilder_dynamodb_PointInTimeRecovery_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "pointInTimeRecovery_java_lang_Boolean_", null, 0, 1,
				TableBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableBuilder_dynamodb_ReadCapacity_java_lang_Number_(), ecorePackage.getEInt(),
				"readCapacity_java_lang_Number_", null, 0, 1, TableBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableBuilder_dynamodb_RemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_(),
				theCorePackage.getRemovalPolicy(), "removalPolicy_software_amazon_awscdk_core_RemovalPolicy_", null, 0,
				1, TableBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableBuilder_dynamodb_ReplicationRegions_java_lang_String_AsList(), ecorePackage.getEString(),
				"replicationRegions_java_lang_String_AsList", null, 0, 1, TableBuilder_dynamodb.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableBuilder_dynamodb_ServerSideEncryption_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "serverSideEncryption_java_lang_Boolean_", null, 0, 1,
				TableBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getTableBuilder_dynamodb_SortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference(),
				ecorePackage.getEString(),
				"sortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference", null, 0, 1,
				TableBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableBuilder_dynamodb_Stream_software_amazon_awscdk_services_dynamodb_StreamViewType_(),
				this.getStreamViewType(), "stream_software_amazon_awscdk_services_dynamodb_StreamViewType_", null, 0, 1,
				TableBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableBuilder_dynamodb_TimeToLiveAttribute_java_lang_String_(), ecorePackage.getEString(),
				"timeToLiveAttribute_java_lang_String_", null, 0, 1, TableBuilder_dynamodb.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableBuilder_dynamodb_WriteCapacity_java_lang_Number_(), ecorePackage.getEInt(),
				"writeCapacity_java_lang_Number_", null, 0, 1, TableBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableBuilder_dynamodb_TableName_java_lang_String_(), ecorePackage.getEString(),
				"tableName_java_lang_String_", null, 0, 1, TableBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableBuilder_dynamodb_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.dynamodb.Table", 0, 1, TableBuilder_dynamodb.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableBuilder_dynamodb_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				TableBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableBuilder_dynamodb_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				TableBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableBuilder_dynamodb_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0,
				1, TableBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(globalSecondaryIndexPropsBuilder_dynamodbEClass, GlobalSecondaryIndexPropsBuilder_dynamodb.class,
				"GlobalSecondaryIndexPropsBuilder_dynamodb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getGlobalSecondaryIndexPropsBuilder_dynamodb_PartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference(),
				ecorePackage.getEString(),
				"partitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference", null, 0, 1,
				GlobalSecondaryIndexPropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalSecondaryIndexPropsBuilder_dynamodb_ReadCapacity_java_lang_Number_(),
				ecorePackage.getEInt(), "readCapacity_java_lang_Number_", null, 0, 1,
				GlobalSecondaryIndexPropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getGlobalSecondaryIndexPropsBuilder_dynamodb_SortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference(),
				ecorePackage.getEString(),
				"sortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference", null, 0, 1,
				GlobalSecondaryIndexPropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalSecondaryIndexPropsBuilder_dynamodb_WriteCapacity_java_lang_Number_(),
				ecorePackage.getEInt(), "writeCapacity_java_lang_Number_", null, 0, 1,
				GlobalSecondaryIndexPropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalSecondaryIndexPropsBuilder_dynamodb_IndexName_java_lang_String_(),
				ecorePackage.getEString(), "indexName_java_lang_String_", null, 0, 1,
				GlobalSecondaryIndexPropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalSecondaryIndexPropsBuilder_dynamodb_NonKeyAttributes_java_lang_String_AsList(),
				ecorePackage.getEString(), "nonKeyAttributes_java_lang_String_AsList", null, 0, 1,
				GlobalSecondaryIndexPropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getGlobalSecondaryIndexPropsBuilder_dynamodb_ProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_(),
				this.getProjectionType(), "projectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_",
				null, 0, 1, GlobalSecondaryIndexPropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalSecondaryIndexPropsBuilder_dynamodb_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps", 0, 1,
				GlobalSecondaryIndexPropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalSecondaryIndexPropsBuilder_dynamodb_VarName(), ecorePackage.getEString(), "varName",
				null, 0, 1, GlobalSecondaryIndexPropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalSecondaryIndexPropsBuilder_dynamodb_Identifier(), ecorePackage.getEString(),
				"identifier", null, 0, 1, GlobalSecondaryIndexPropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalSecondaryIndexPropsBuilder_dynamodb_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, GlobalSecondaryIndexPropsBuilder_dynamodb.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableOptionsBuilder_dynamodbEClass, TableOptionsBuilder_dynamodb.class,
				"TableOptionsBuilder_dynamodb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getTableOptionsBuilder_dynamodb_PartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference(),
				ecorePackage.getEString(),
				"partitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference", null, 0, 1,
				TableOptionsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getTableOptionsBuilder_dynamodb_BillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_(),
				this.getBillingMode(), "billingMode_software_amazon_awscdk_services_dynamodb_BillingMode_", null, 0, 1,
				TableOptionsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getTableOptionsBuilder_dynamodb_Encryption_software_amazon_awscdk_services_dynamodb_TableEncryption_(),
				this.getTableEncryption(), "encryption_software_amazon_awscdk_services_dynamodb_TableEncryption_", null,
				0, 1, TableOptionsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getTableOptionsBuilder_dynamodb_EncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(),
				ecorePackage.getEString(), "encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference",
				null, 0, 1, TableOptionsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableOptionsBuilder_dynamodb_PointInTimeRecovery_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "pointInTimeRecovery_java_lang_Boolean_", null, 0, 1,
				TableOptionsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableOptionsBuilder_dynamodb_ReadCapacity_java_lang_Number_(), ecorePackage.getEInt(),
				"readCapacity_java_lang_Number_", null, 0, 1, TableOptionsBuilder_dynamodb.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableOptionsBuilder_dynamodb_RemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_(),
				theCorePackage.getRemovalPolicy(), "removalPolicy_software_amazon_awscdk_core_RemovalPolicy_", null, 0,
				1, TableOptionsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableOptionsBuilder_dynamodb_ReplicationRegions_java_lang_String_AsList(),
				ecorePackage.getEString(), "replicationRegions_java_lang_String_AsList", null, 0, 1,
				TableOptionsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableOptionsBuilder_dynamodb_ServerSideEncryption_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "serverSideEncryption_java_lang_Boolean_", null, 0, 1,
				TableOptionsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getTableOptionsBuilder_dynamodb_SortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference(),
				ecorePackage.getEString(),
				"sortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference", null, 0, 1,
				TableOptionsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getTableOptionsBuilder_dynamodb_Stream_software_amazon_awscdk_services_dynamodb_StreamViewType_(),
				this.getStreamViewType(), "stream_software_amazon_awscdk_services_dynamodb_StreamViewType_", null, 0, 1,
				TableOptionsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableOptionsBuilder_dynamodb_TimeToLiveAttribute_java_lang_String_(),
				ecorePackage.getEString(), "timeToLiveAttribute_java_lang_String_", null, 0, 1,
				TableOptionsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableOptionsBuilder_dynamodb_WriteCapacity_java_lang_Number_(), ecorePackage.getEInt(),
				"writeCapacity_java_lang_Number_", null, 0, 1, TableOptionsBuilder_dynamodb.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableOptionsBuilder_dynamodb_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.dynamodb.TableOptions", 0, 1,
				TableOptionsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableOptionsBuilder_dynamodb_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				TableOptionsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableOptionsBuilder_dynamodb_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, TableOptionsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableOptionsBuilder_dynamodb_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, TableOptionsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(secondaryIndexPropsBuilder_dynamodbEClass, SecondaryIndexPropsBuilder_dynamodb.class,
				"SecondaryIndexPropsBuilder_dynamodb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecondaryIndexPropsBuilder_dynamodb_IndexName_java_lang_String_(), ecorePackage.getEString(),
				"indexName_java_lang_String_", null, 0, 1, SecondaryIndexPropsBuilder_dynamodb.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecondaryIndexPropsBuilder_dynamodb_NonKeyAttributes_java_lang_String_AsList(),
				ecorePackage.getEString(), "nonKeyAttributes_java_lang_String_AsList", null, 0, 1,
				SecondaryIndexPropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getSecondaryIndexPropsBuilder_dynamodb_ProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_(),
				this.getProjectionType(), "projectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_",
				null, 0, 1, SecondaryIndexPropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecondaryIndexPropsBuilder_dynamodb_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.dynamodb.SecondaryIndexProps", 0, 1,
				SecondaryIndexPropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecondaryIndexPropsBuilder_dynamodb_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, SecondaryIndexPropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecondaryIndexPropsBuilder_dynamodb_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, SecondaryIndexPropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecondaryIndexPropsBuilder_dynamodb_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, SecondaryIndexPropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(utilizationScalingPropsBuilder_dynamodbEClass, UtilizationScalingPropsBuilder_dynamodb.class,
				"UtilizationScalingPropsBuilder_dynamodb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUtilizationScalingPropsBuilder_dynamodb_TargetUtilizationPercent_java_lang_Number_(),
				ecorePackage.getEInt(), "targetUtilizationPercent_java_lang_Number_", null, 0, 1,
				UtilizationScalingPropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtilizationScalingPropsBuilder_dynamodb_DisableScaleIn_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "disableScaleIn_java_lang_Boolean_", null, 0, 1,
				UtilizationScalingPropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtilizationScalingPropsBuilder_dynamodb_PolicyName_java_lang_String_(),
				ecorePackage.getEString(), "policyName_java_lang_String_", null, 0, 1,
				UtilizationScalingPropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getUtilizationScalingPropsBuilder_dynamodb_ScaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference(),
				ecorePackage.getEString(),
				"scaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference", null, 0, 1,
				UtilizationScalingPropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getUtilizationScalingPropsBuilder_dynamodb_ScaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference(),
				ecorePackage.getEString(),
				"scaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference", null, 0, 1,
				UtilizationScalingPropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtilizationScalingPropsBuilder_dynamodb_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.dynamodb.UtilizationScalingProps", 0, 1,
				UtilizationScalingPropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtilizationScalingPropsBuilder_dynamodb_VarName(), ecorePackage.getEString(), "varName", null,
				0, 1, UtilizationScalingPropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtilizationScalingPropsBuilder_dynamodb_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, UtilizationScalingPropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtilizationScalingPropsBuilder_dynamodb_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, UtilizationScalingPropsBuilder_dynamodb.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeBuilder_dynamodbEClass, AttributeBuilder_dynamodb.class, "AttributeBuilder_dynamodb",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeBuilder_dynamodb_Name_java_lang_String_(), ecorePackage.getEString(),
				"name_java_lang_String_", null, 0, 1, AttributeBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeBuilder_dynamodb_Type_software_amazon_awscdk_services_dynamodb_AttributeType_(),
				this.getAttributeType(), "type_software_amazon_awscdk_services_dynamodb_AttributeType_", null, 0, 1,
				AttributeBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeBuilder_dynamodb_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.dynamodb.Attribute", 0, 1,
				AttributeBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeBuilder_dynamodb_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				AttributeBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeBuilder_dynamodb_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				AttributeBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeBuilder_dynamodb_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null,
				0, 1, AttributeBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableAttributesBuilder_dynamodbEClass, TableAttributesBuilder_dynamodb.class,
				"TableAttributesBuilder_dynamodb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getTableAttributesBuilder_dynamodb_EncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(),
				ecorePackage.getEString(), "encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference",
				null, 0, 1, TableAttributesBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableAttributesBuilder_dynamodb_GlobalIndexes_java_lang_String_AsList(),
				ecorePackage.getEString(), "globalIndexes_java_lang_String_AsList", null, 0, 1,
				TableAttributesBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableAttributesBuilder_dynamodb_LocalIndexes_java_lang_String_AsList(),
				ecorePackage.getEString(), "localIndexes_java_lang_String_AsList", null, 0, 1,
				TableAttributesBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableAttributesBuilder_dynamodb_TableArn_java_lang_String_(), ecorePackage.getEString(),
				"tableArn_java_lang_String_", null, 0, 1, TableAttributesBuilder_dynamodb.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableAttributesBuilder_dynamodb_TableName_java_lang_String_(), ecorePackage.getEString(),
				"tableName_java_lang_String_", null, 0, 1, TableAttributesBuilder_dynamodb.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableAttributesBuilder_dynamodb_TableStreamArn_java_lang_String_(), ecorePackage.getEString(),
				"tableStreamArn_java_lang_String_", null, 0, 1, TableAttributesBuilder_dynamodb.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableAttributesBuilder_dynamodb_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.dynamodb.TableAttributes", 0, 1,
				TableAttributesBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableAttributesBuilder_dynamodb_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				TableAttributesBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableAttributesBuilder_dynamodb_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, TableAttributesBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableAttributesBuilder_dynamodb_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, TableAttributesBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(streamViewTypeEEnum, StreamViewType.class, "StreamViewType");
		addEEnumLiteral(streamViewTypeEEnum, StreamViewType.NEW_IMAGE);
		addEEnumLiteral(streamViewTypeEEnum, StreamViewType.OLD_IMAGE);
		addEEnumLiteral(streamViewTypeEEnum, StreamViewType.NEW_AND_OLD_IMAGES);
		addEEnumLiteral(streamViewTypeEEnum, StreamViewType.KEYS_ONLY);

		initEEnum(tableEncryptionEEnum, TableEncryption.class, "TableEncryption");
		addEEnumLiteral(tableEncryptionEEnum, TableEncryption.DEFAULT);
		addEEnumLiteral(tableEncryptionEEnum, TableEncryption.CUSTOMER_MANAGED);
		addEEnumLiteral(tableEncryptionEEnum, TableEncryption.AWS_MANAGED);

		initEEnum(attributeTypeEEnum, AttributeType.class, "AttributeType");
		addEEnumLiteral(attributeTypeEEnum, AttributeType.BINARY);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.NUMBER);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.STRING);

		initEEnum(projectionTypeEEnum, ProjectionType.class, "ProjectionType");
		addEEnumLiteral(projectionTypeEEnum, ProjectionType.KEYS_ONLY);
		addEEnumLiteral(projectionTypeEEnum, ProjectionType.INCLUDE);
		addEEnumLiteral(projectionTypeEEnum, ProjectionType.ALL);

		initEEnum(billingModeEEnum, BillingMode.class, "BillingMode");
		addEEnumLiteral(billingModeEEnum, BillingMode.PAY_PER_REQUEST);
		addEEnumLiteral(billingModeEEnum, BillingMode.PROVISIONED);

		// Create resource
		createResource(eNS_URI);
	}

} //DynamodbPackageImpl
