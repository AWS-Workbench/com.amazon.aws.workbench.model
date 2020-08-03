/**
 */
package certificatemanager.impl;

import apigateway.ApigatewayPackage;

import apigateway.impl.ApigatewayPackageImpl;

import certificatemanager.CertificateBuilder_certificatemanager;
import certificatemanager.CertificatePropsBuilder_certificatemanager;
import certificatemanager.CertificatemanagerFactory;
import certificatemanager.CertificatemanagerPackage;
import certificatemanager.DnsValidatedCertificateBuilder_certificatemanager;
import certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager;
import certificatemanager.ValidationMethod;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;

import com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl;

import core.CorePackage;

import core.impl.CorePackageImpl;

import dynamodb.DynamodbPackage;

import dynamodb.impl.DynamodbPackageImpl;

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
public class CertificatemanagerPackageImpl extends EPackageImpl implements CertificatemanagerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass certificateBuilder_certificatemanagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dnsValidatedCertificatePropsBuilder_certificatemanagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass certificatePropsBuilder_certificatemanagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dnsValidatedCertificateBuilder_certificatemanagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum validationMethodEEnum = null;

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
	 * @see certificatemanager.CertificatemanagerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CertificatemanagerPackageImpl() {
		super(eNS_URI, CertificatemanagerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CertificatemanagerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CertificatemanagerPackage init() {
		if (isInited)
			return (CertificatemanagerPackage) EPackage.Registry.INSTANCE
					.getEPackage(CertificatemanagerPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCertificatemanagerPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CertificatemanagerPackageImpl theCertificatemanagerPackage = registeredCertificatemanagerPackage instanceof CertificatemanagerPackageImpl
				? (CertificatemanagerPackageImpl) registeredCertificatemanagerPackage
				: new CertificatemanagerPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(IamPackage.eNS_URI);
		IamPackageImpl theIamPackage = (IamPackageImpl) (registeredPackage instanceof IamPackageImpl ? registeredPackage
				: IamPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		CorePackageImpl theCorePackage = (CorePackageImpl) (registeredPackage instanceof CorePackageImpl
				? registeredPackage
				: CorePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DynamodbPackage.eNS_URI);
		DynamodbPackageImpl theDynamodbPackage = (DynamodbPackageImpl) (registeredPackage instanceof DynamodbPackageImpl
				? registeredPackage
				: DynamodbPackage.eINSTANCE);

		// Create package meta-data objects
		theCertificatemanagerPackage.createPackageContents();
		theAwsworkbenchPackage.createPackageContents();
		theEc2Package.createPackageContents();
		theApigatewayPackage.createPackageContents();
		theIamPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theDynamodbPackage.createPackageContents();

		// Initialize created meta-data
		theCertificatemanagerPackage.initializePackageContents();
		theAwsworkbenchPackage.initializePackageContents();
		theEc2Package.initializePackageContents();
		theApigatewayPackage.initializePackageContents();
		theIamPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theDynamodbPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCertificatemanagerPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CertificatemanagerPackage.eNS_URI, theCertificatemanagerPackage);
		return theCertificatemanagerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCertificateBuilder_certificatemanager() {
		return certificateBuilder_certificatemanagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificateBuilder_certificatemanager_DomainName_java_lang_String_() {
		return (EAttribute) certificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificateBuilder_certificatemanager_SubjectAlternativeNames_java_lang_String_AsList() {
		return (EAttribute) certificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificateBuilder_certificatemanager_ValidationDomains_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) certificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificateBuilder_certificatemanager_ValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_() {
		return (EAttribute) certificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificateBuilder_certificatemanager_GeneratedClassName() {
		return (EAttribute) certificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificateBuilder_certificatemanager_VarName() {
		return (EAttribute) certificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificateBuilder_certificatemanager_Identifier() {
		return (EAttribute) certificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificateBuilder_certificatemanager_AdditionalCode() {
		return (EAttribute) certificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDnsValidatedCertificatePropsBuilder_certificatemanager() {
		return dnsValidatedCertificatePropsBuilder_certificatemanagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDnsValidatedCertificatePropsBuilder_certificatemanager_HostedZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference() {
		return (EAttribute) dnsValidatedCertificatePropsBuilder_certificatemanagerEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDnsValidatedCertificatePropsBuilder_certificatemanager_CustomResourceRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() {
		return (EAttribute) dnsValidatedCertificatePropsBuilder_certificatemanagerEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDnsValidatedCertificatePropsBuilder_certificatemanager_Region_java_lang_String_() {
		return (EAttribute) dnsValidatedCertificatePropsBuilder_certificatemanagerEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDnsValidatedCertificatePropsBuilder_certificatemanager_Route53Endpoint_java_lang_String_() {
		return (EAttribute) dnsValidatedCertificatePropsBuilder_certificatemanagerEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDnsValidatedCertificatePropsBuilder_certificatemanager_DomainName_java_lang_String_() {
		return (EAttribute) dnsValidatedCertificatePropsBuilder_certificatemanagerEClass.getEStructuralFeatures()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDnsValidatedCertificatePropsBuilder_certificatemanager_SubjectAlternativeNames_java_lang_String_AsList() {
		return (EAttribute) dnsValidatedCertificatePropsBuilder_certificatemanagerEClass.getEStructuralFeatures()
				.get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDnsValidatedCertificatePropsBuilder_certificatemanager_ValidationDomains_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) dnsValidatedCertificatePropsBuilder_certificatemanagerEClass.getEStructuralFeatures()
				.get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDnsValidatedCertificatePropsBuilder_certificatemanager_ValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_() {
		return (EAttribute) dnsValidatedCertificatePropsBuilder_certificatemanagerEClass.getEStructuralFeatures()
				.get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDnsValidatedCertificatePropsBuilder_certificatemanager_GeneratedClassName() {
		return (EAttribute) dnsValidatedCertificatePropsBuilder_certificatemanagerEClass.getEStructuralFeatures()
				.get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDnsValidatedCertificatePropsBuilder_certificatemanager_VarName() {
		return (EAttribute) dnsValidatedCertificatePropsBuilder_certificatemanagerEClass.getEStructuralFeatures()
				.get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDnsValidatedCertificatePropsBuilder_certificatemanager_Identifier() {
		return (EAttribute) dnsValidatedCertificatePropsBuilder_certificatemanagerEClass.getEStructuralFeatures()
				.get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDnsValidatedCertificatePropsBuilder_certificatemanager_AdditionalCode() {
		return (EAttribute) dnsValidatedCertificatePropsBuilder_certificatemanagerEClass.getEStructuralFeatures()
				.get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCertificatePropsBuilder_certificatemanager() {
		return certificatePropsBuilder_certificatemanagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificatePropsBuilder_certificatemanager_DomainName_java_lang_String_() {
		return (EAttribute) certificatePropsBuilder_certificatemanagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificatePropsBuilder_certificatemanager_SubjectAlternativeNames_java_lang_String_AsList() {
		return (EAttribute) certificatePropsBuilder_certificatemanagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificatePropsBuilder_certificatemanager_ValidationDomains_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) certificatePropsBuilder_certificatemanagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificatePropsBuilder_certificatemanager_ValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_() {
		return (EAttribute) certificatePropsBuilder_certificatemanagerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificatePropsBuilder_certificatemanager_GeneratedClassName() {
		return (EAttribute) certificatePropsBuilder_certificatemanagerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificatePropsBuilder_certificatemanager_VarName() {
		return (EAttribute) certificatePropsBuilder_certificatemanagerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificatePropsBuilder_certificatemanager_Identifier() {
		return (EAttribute) certificatePropsBuilder_certificatemanagerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificatePropsBuilder_certificatemanager_AdditionalCode() {
		return (EAttribute) certificatePropsBuilder_certificatemanagerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDnsValidatedCertificateBuilder_certificatemanager() {
		return dnsValidatedCertificateBuilder_certificatemanagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDnsValidatedCertificateBuilder_certificatemanager_DomainName_java_lang_String_() {
		return (EAttribute) dnsValidatedCertificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDnsValidatedCertificateBuilder_certificatemanager_SubjectAlternativeNames_java_lang_String_AsList() {
		return (EAttribute) dnsValidatedCertificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDnsValidatedCertificateBuilder_certificatemanager_ValidationDomains_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) dnsValidatedCertificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDnsValidatedCertificateBuilder_certificatemanager_ValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_() {
		return (EAttribute) dnsValidatedCertificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDnsValidatedCertificateBuilder_certificatemanager_HostedZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference() {
		return (EAttribute) dnsValidatedCertificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDnsValidatedCertificateBuilder_certificatemanager_CustomResourceRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() {
		return (EAttribute) dnsValidatedCertificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDnsValidatedCertificateBuilder_certificatemanager_Region_java_lang_String_() {
		return (EAttribute) dnsValidatedCertificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDnsValidatedCertificateBuilder_certificatemanager_Route53Endpoint_java_lang_String_() {
		return (EAttribute) dnsValidatedCertificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDnsValidatedCertificateBuilder_certificatemanager_GeneratedClassName() {
		return (EAttribute) dnsValidatedCertificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDnsValidatedCertificateBuilder_certificatemanager_VarName() {
		return (EAttribute) dnsValidatedCertificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDnsValidatedCertificateBuilder_certificatemanager_Identifier() {
		return (EAttribute) dnsValidatedCertificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDnsValidatedCertificateBuilder_certificatemanager_AdditionalCode() {
		return (EAttribute) dnsValidatedCertificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getValidationMethod() {
		return validationMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CertificatemanagerFactory getCertificatemanagerFactory() {
		return (CertificatemanagerFactory) getEFactoryInstance();
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
		certificateBuilder_certificatemanagerEClass = createEClass(CERTIFICATE_BUILDER_CERTIFICATEMANAGER);
		createEAttribute(certificateBuilder_certificatemanagerEClass,
				CERTIFICATE_BUILDER_CERTIFICATEMANAGER__DOMAIN_NAME_JAVA_LANG_STRING_);
		createEAttribute(certificateBuilder_certificatemanagerEClass,
				CERTIFICATE_BUILDER_CERTIFICATEMANAGER__SUBJECT_ALTERNATIVE_NAMES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(certificateBuilder_certificatemanagerEClass,
				CERTIFICATE_BUILDER_CERTIFICATEMANAGER__VALIDATION_DOMAINS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(certificateBuilder_certificatemanagerEClass,
				CERTIFICATE_BUILDER_CERTIFICATEMANAGER__VALIDATION_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_VALIDATION_METHOD_);
		createEAttribute(certificateBuilder_certificatemanagerEClass,
				CERTIFICATE_BUILDER_CERTIFICATEMANAGER__GENERATED_CLASS_NAME);
		createEAttribute(certificateBuilder_certificatemanagerEClass, CERTIFICATE_BUILDER_CERTIFICATEMANAGER__VAR_NAME);
		createEAttribute(certificateBuilder_certificatemanagerEClass,
				CERTIFICATE_BUILDER_CERTIFICATEMANAGER__IDENTIFIER);
		createEAttribute(certificateBuilder_certificatemanagerEClass,
				CERTIFICATE_BUILDER_CERTIFICATEMANAGER__ADDITIONAL_CODE);

		dnsValidatedCertificatePropsBuilder_certificatemanagerEClass = createEClass(
				DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER);
		createEAttribute(dnsValidatedCertificatePropsBuilder_certificatemanagerEClass,
				DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__HOSTED_ZONE_WITH_IHOSTED_ZONE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ROUTE53_IHOSTED_ZONE_AS_REFERENCE);
		createEAttribute(dnsValidatedCertificatePropsBuilder_certificatemanagerEClass,
				DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__CUSTOM_RESOURCE_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE);
		createEAttribute(dnsValidatedCertificatePropsBuilder_certificatemanagerEClass,
				DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__REGION_JAVA_LANG_STRING_);
		createEAttribute(dnsValidatedCertificatePropsBuilder_certificatemanagerEClass,
				DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__ROUTE53_ENDPOINT_JAVA_LANG_STRING_);
		createEAttribute(dnsValidatedCertificatePropsBuilder_certificatemanagerEClass,
				DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__DOMAIN_NAME_JAVA_LANG_STRING_);
		createEAttribute(dnsValidatedCertificatePropsBuilder_certificatemanagerEClass,
				DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__SUBJECT_ALTERNATIVE_NAMES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(dnsValidatedCertificatePropsBuilder_certificatemanagerEClass,
				DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__VALIDATION_DOMAINS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(dnsValidatedCertificatePropsBuilder_certificatemanagerEClass,
				DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__VALIDATION_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_VALIDATION_METHOD_);
		createEAttribute(dnsValidatedCertificatePropsBuilder_certificatemanagerEClass,
				DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__GENERATED_CLASS_NAME);
		createEAttribute(dnsValidatedCertificatePropsBuilder_certificatemanagerEClass,
				DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__VAR_NAME);
		createEAttribute(dnsValidatedCertificatePropsBuilder_certificatemanagerEClass,
				DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__IDENTIFIER);
		createEAttribute(dnsValidatedCertificatePropsBuilder_certificatemanagerEClass,
				DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__ADDITIONAL_CODE);

		certificatePropsBuilder_certificatemanagerEClass = createEClass(CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER);
		createEAttribute(certificatePropsBuilder_certificatemanagerEClass,
				CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__DOMAIN_NAME_JAVA_LANG_STRING_);
		createEAttribute(certificatePropsBuilder_certificatemanagerEClass,
				CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__SUBJECT_ALTERNATIVE_NAMES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(certificatePropsBuilder_certificatemanagerEClass,
				CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__VALIDATION_DOMAINS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(certificatePropsBuilder_certificatemanagerEClass,
				CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__VALIDATION_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_VALIDATION_METHOD_);
		createEAttribute(certificatePropsBuilder_certificatemanagerEClass,
				CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__GENERATED_CLASS_NAME);
		createEAttribute(certificatePropsBuilder_certificatemanagerEClass,
				CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__VAR_NAME);
		createEAttribute(certificatePropsBuilder_certificatemanagerEClass,
				CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__IDENTIFIER);
		createEAttribute(certificatePropsBuilder_certificatemanagerEClass,
				CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__ADDITIONAL_CODE);

		dnsValidatedCertificateBuilder_certificatemanagerEClass = createEClass(
				DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER);
		createEAttribute(dnsValidatedCertificateBuilder_certificatemanagerEClass,
				DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__DOMAIN_NAME_JAVA_LANG_STRING_);
		createEAttribute(dnsValidatedCertificateBuilder_certificatemanagerEClass,
				DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__SUBJECT_ALTERNATIVE_NAMES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(dnsValidatedCertificateBuilder_certificatemanagerEClass,
				DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__VALIDATION_DOMAINS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(dnsValidatedCertificateBuilder_certificatemanagerEClass,
				DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__VALIDATION_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_VALIDATION_METHOD_);
		createEAttribute(dnsValidatedCertificateBuilder_certificatemanagerEClass,
				DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__HOSTED_ZONE_WITH_IHOSTED_ZONE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ROUTE53_IHOSTED_ZONE_AS_REFERENCE);
		createEAttribute(dnsValidatedCertificateBuilder_certificatemanagerEClass,
				DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__CUSTOM_RESOURCE_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE);
		createEAttribute(dnsValidatedCertificateBuilder_certificatemanagerEClass,
				DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__REGION_JAVA_LANG_STRING_);
		createEAttribute(dnsValidatedCertificateBuilder_certificatemanagerEClass,
				DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__ROUTE53_ENDPOINT_JAVA_LANG_STRING_);
		createEAttribute(dnsValidatedCertificateBuilder_certificatemanagerEClass,
				DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__GENERATED_CLASS_NAME);
		createEAttribute(dnsValidatedCertificateBuilder_certificatemanagerEClass,
				DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__VAR_NAME);
		createEAttribute(dnsValidatedCertificateBuilder_certificatemanagerEClass,
				DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__IDENTIFIER);
		createEAttribute(dnsValidatedCertificateBuilder_certificatemanagerEClass,
				DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__ADDITIONAL_CODE);

		// Create enums
		validationMethodEEnum = createEEnum(VALIDATION_METHOD);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(certificateBuilder_certificatemanagerEClass, CertificateBuilder_certificatemanager.class,
				"CertificateBuilder_certificatemanager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCertificateBuilder_certificatemanager_DomainName_java_lang_String_(),
				ecorePackage.getEString(), "domainName_java_lang_String_", null, 0, 1,
				CertificateBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCertificateBuilder_certificatemanager_SubjectAlternativeNames_java_lang_String_AsList(),
				ecorePackage.getEString(), "subjectAlternativeNames_java_lang_String_AsList", null, 0, 1,
				CertificateBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getCertificateBuilder_certificatemanager_ValidationDomains_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "validationDomains_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				CertificateBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getCertificateBuilder_certificatemanager_ValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_(),
				this.getValidationMethod(),
				"validationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_", null, 0, 1,
				CertificateBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCertificateBuilder_certificatemanager_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.certificatemanager.Certificate", 0, 1,
				CertificateBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCertificateBuilder_certificatemanager_VarName(), ecorePackage.getEString(), "varName", null,
				0, 1, CertificateBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCertificateBuilder_certificatemanager_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, CertificateBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCertificateBuilder_certificatemanager_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, CertificateBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dnsValidatedCertificatePropsBuilder_certificatemanagerEClass,
				DnsValidatedCertificatePropsBuilder_certificatemanager.class,
				"DnsValidatedCertificatePropsBuilder_certificatemanager", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getDnsValidatedCertificatePropsBuilder_certificatemanager_HostedZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference(),
				ecorePackage.getEString(),
				"hostedZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference", null, 0, 1,
				DnsValidatedCertificatePropsBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getDnsValidatedCertificatePropsBuilder_certificatemanager_CustomResourceRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(),
				ecorePackage.getEString(),
				"customResourceRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference", null, 0, 1,
				DnsValidatedCertificatePropsBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDnsValidatedCertificatePropsBuilder_certificatemanager_Region_java_lang_String_(),
				ecorePackage.getEString(), "region_java_lang_String_", null, 0, 1,
				DnsValidatedCertificatePropsBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDnsValidatedCertificatePropsBuilder_certificatemanager_Route53Endpoint_java_lang_String_(),
				ecorePackage.getEString(), "route53Endpoint_java_lang_String_", null, 0, 1,
				DnsValidatedCertificatePropsBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDnsValidatedCertificatePropsBuilder_certificatemanager_DomainName_java_lang_String_(),
				ecorePackage.getEString(), "domainName_java_lang_String_", null, 0, 1,
				DnsValidatedCertificatePropsBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getDnsValidatedCertificatePropsBuilder_certificatemanager_SubjectAlternativeNames_java_lang_String_AsList(),
				ecorePackage.getEString(), "subjectAlternativeNames_java_lang_String_AsList", null, 0, 1,
				DnsValidatedCertificatePropsBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getDnsValidatedCertificatePropsBuilder_certificatemanager_ValidationDomains_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "validationDomains_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				DnsValidatedCertificatePropsBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getDnsValidatedCertificatePropsBuilder_certificatemanager_ValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_(),
				this.getValidationMethod(),
				"validationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_", null, 0, 1,
				DnsValidatedCertificatePropsBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDnsValidatedCertificatePropsBuilder_certificatemanager_GeneratedClassName(),
				ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps", 0, 1,
				DnsValidatedCertificatePropsBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDnsValidatedCertificatePropsBuilder_certificatemanager_VarName(), ecorePackage.getEString(),
				"varName", null, 0, 1, DnsValidatedCertificatePropsBuilder_certificatemanager.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDnsValidatedCertificatePropsBuilder_certificatemanager_Identifier(),
				ecorePackage.getEString(), "identifier", null, 0, 1,
				DnsValidatedCertificatePropsBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDnsValidatedCertificatePropsBuilder_certificatemanager_AdditionalCode(),
				ecorePackage.getEString(), "additionalCode", null, 0, 1,
				DnsValidatedCertificatePropsBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(certificatePropsBuilder_certificatemanagerEClass, CertificatePropsBuilder_certificatemanager.class,
				"CertificatePropsBuilder_certificatemanager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCertificatePropsBuilder_certificatemanager_DomainName_java_lang_String_(),
				ecorePackage.getEString(), "domainName_java_lang_String_", null, 0, 1,
				CertificatePropsBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCertificatePropsBuilder_certificatemanager_SubjectAlternativeNames_java_lang_String_AsList(),
				ecorePackage.getEString(), "subjectAlternativeNames_java_lang_String_AsList", null, 0, 1,
				CertificatePropsBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getCertificatePropsBuilder_certificatemanager_ValidationDomains_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "validationDomains_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				CertificatePropsBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getCertificatePropsBuilder_certificatemanager_ValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_(),
				this.getValidationMethod(),
				"validationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_", null, 0, 1,
				CertificatePropsBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCertificatePropsBuilder_certificatemanager_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.certificatemanager.CertificateProps", 0, 1,
				CertificatePropsBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCertificatePropsBuilder_certificatemanager_VarName(), ecorePackage.getEString(), "varName",
				null, 0, 1, CertificatePropsBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCertificatePropsBuilder_certificatemanager_Identifier(), ecorePackage.getEString(),
				"identifier", null, 0, 1, CertificatePropsBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCertificatePropsBuilder_certificatemanager_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, CertificatePropsBuilder_certificatemanager.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dnsValidatedCertificateBuilder_certificatemanagerEClass,
				DnsValidatedCertificateBuilder_certificatemanager.class,
				"DnsValidatedCertificateBuilder_certificatemanager", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDnsValidatedCertificateBuilder_certificatemanager_DomainName_java_lang_String_(),
				ecorePackage.getEString(), "domainName_java_lang_String_", null, 0, 1,
				DnsValidatedCertificateBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getDnsValidatedCertificateBuilder_certificatemanager_SubjectAlternativeNames_java_lang_String_AsList(),
				ecorePackage.getEString(), "subjectAlternativeNames_java_lang_String_AsList", null, 0, 1,
				DnsValidatedCertificateBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getDnsValidatedCertificateBuilder_certificatemanager_ValidationDomains_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "validationDomains_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				DnsValidatedCertificateBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getDnsValidatedCertificateBuilder_certificatemanager_ValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_(),
				this.getValidationMethod(),
				"validationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_", null, 0, 1,
				DnsValidatedCertificateBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getDnsValidatedCertificateBuilder_certificatemanager_HostedZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference(),
				ecorePackage.getEString(),
				"hostedZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference", null, 0, 1,
				DnsValidatedCertificateBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getDnsValidatedCertificateBuilder_certificatemanager_CustomResourceRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(),
				ecorePackage.getEString(),
				"customResourceRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference", null, 0, 1,
				DnsValidatedCertificateBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDnsValidatedCertificateBuilder_certificatemanager_Region_java_lang_String_(),
				ecorePackage.getEString(), "region_java_lang_String_", null, 0, 1,
				DnsValidatedCertificateBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDnsValidatedCertificateBuilder_certificatemanager_Route53Endpoint_java_lang_String_(),
				ecorePackage.getEString(), "route53Endpoint_java_lang_String_", null, 0, 1,
				DnsValidatedCertificateBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDnsValidatedCertificateBuilder_certificatemanager_GeneratedClassName(),
				ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificate", 0, 1,
				DnsValidatedCertificateBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDnsValidatedCertificateBuilder_certificatemanager_VarName(), ecorePackage.getEString(),
				"varName", null, 0, 1, DnsValidatedCertificateBuilder_certificatemanager.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDnsValidatedCertificateBuilder_certificatemanager_Identifier(), ecorePackage.getEString(),
				"identifier", null, 0, 1, DnsValidatedCertificateBuilder_certificatemanager.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDnsValidatedCertificateBuilder_certificatemanager_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, DnsValidatedCertificateBuilder_certificatemanager.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(validationMethodEEnum, ValidationMethod.class, "ValidationMethod");
		addEEnumLiteral(validationMethodEEnum, ValidationMethod.EMAIL);
		addEEnumLiteral(validationMethodEEnum, ValidationMethod.DNS);

		// Create resource
		createResource(eNS_URI);
	}

} //CertificatemanagerPackageImpl
