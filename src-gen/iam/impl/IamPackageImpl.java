/**
 */
package iam.impl;

import apigateway.ApigatewayPackage;

import apigateway.impl.ApigatewayPackageImpl;

import certificatemanager.CertificatemanagerPackage;

import certificatemanager.impl.CertificatemanagerPackageImpl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;

import com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl;

import core.CorePackage;

import core.impl.CorePackageImpl;

import dynamodb.DynamodbPackage;

import dynamodb.impl.DynamodbPackageImpl;

import ec2.Ec2Package;

import ec2.impl.Ec2PackageImpl;

import iam.AddToPrincipalPolicyResultBuilder_iam;
import iam.AddToResourcePolicyResultBuilder_iam;
import iam.CommonGrantOptionsBuilder_iam;
import iam.Effect;
import iam.FromRoleArnOptionsBuilder_iam;
import iam.GrantOnPrincipalAndResourceOptionsBuilder_iam;
import iam.GrantOnPrincipalOptionsBuilder_iam;
import iam.GrantWithResourceOptionsBuilder_iam;
import iam.GroupBuilder_iam;
import iam.GroupPropsBuilder_iam;
import iam.IamFactory;
import iam.IamPackage;
import iam.LazyRoleBuilder_iam;
import iam.LazyRolePropsBuilder_iam;
import iam.ManagedPolicyBuilder_iam;
import iam.ManagedPolicyPropsBuilder_iam;
import iam.OpenIdConnectProviderBuilder_iam;
import iam.OpenIdConnectProviderPropsBuilder_iam;
import iam.PolicyBuilder_iam;
import iam.PolicyDocumentBuilder_iam;
import iam.PolicyDocumentPropsBuilder_iam;
import iam.PolicyPropsBuilder_iam;
import iam.PolicyStatementBuilder_iam;
import iam.PolicyStatementPropsBuilder_iam;
import iam.RoleBuilder_iam;
import iam.RolePropsBuilder_iam;
import iam.ServicePrincipalBuilder_iam;
import iam.ServicePrincipalOptsBuilder_iam;
import iam.UnknownPrincipalBuilder_iam;
import iam.UnknownPrincipalPropsBuilder_iam;
import iam.UserBuilder_iam;
import iam.UserPropsBuilder_iam;

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
public class IamPackageImpl extends EPackageImpl implements IamPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rolePropsBuilder_iamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unknownPrincipalPropsBuilder_iamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openIdConnectProviderPropsBuilder_iamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupPropsBuilder_iamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleBuilder_iamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicePrincipalBuilder_iamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grantOnPrincipalOptionsBuilder_iamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userBuilder_iamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grantOnPrincipalAndResourceOptionsBuilder_iamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managedPolicyBuilder_iamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fromRoleArnOptionsBuilder_iamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyDocumentBuilder_iamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyBuilder_iamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyDocumentPropsBuilder_iamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userPropsBuilder_iamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addToResourcePolicyResultBuilder_iamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyStatementPropsBuilder_iamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addToPrincipalPolicyResultBuilder_iamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyStatementBuilder_iamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicePrincipalOptsBuilder_iamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unknownPrincipalBuilder_iamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managedPolicyPropsBuilder_iamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openIdConnectProviderBuilder_iamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lazyRoleBuilder_iamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commonGrantOptionsBuilder_iamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grantWithResourceOptionsBuilder_iamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lazyRolePropsBuilder_iamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyPropsBuilder_iamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupBuilder_iamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum effectEEnum = null;

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
	 * @see iam.IamPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IamPackageImpl() {
		super(eNS_URI, IamFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IamPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IamPackage init() {
		if (isInited)
			return (IamPackage) EPackage.Registry.INSTANCE.getEPackage(IamPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredIamPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		IamPackageImpl theIamPackage = registeredIamPackage instanceof IamPackageImpl
				? (IamPackageImpl) registeredIamPackage
				: new IamPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		CorePackageImpl theCorePackage = (CorePackageImpl) (registeredPackage instanceof CorePackageImpl
				? registeredPackage
				: CorePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DynamodbPackage.eNS_URI);
		DynamodbPackageImpl theDynamodbPackage = (DynamodbPackageImpl) (registeredPackage instanceof DynamodbPackageImpl
				? registeredPackage
				: DynamodbPackage.eINSTANCE);

		// Create package meta-data objects
		theIamPackage.createPackageContents();
		theAwsworkbenchPackage.createPackageContents();
		theEc2Package.createPackageContents();
		theApigatewayPackage.createPackageContents();
		theCertificatemanagerPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theDynamodbPackage.createPackageContents();

		// Initialize created meta-data
		theIamPackage.initializePackageContents();
		theAwsworkbenchPackage.initializePackageContents();
		theEc2Package.initializePackageContents();
		theApigatewayPackage.initializePackageContents();
		theCertificatemanagerPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theDynamodbPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIamPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IamPackage.eNS_URI, theIamPackage);
		return theIamPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRolePropsBuilder_iam() {
		return rolePropsBuilder_iamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRolePropsBuilder_iam_AssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference() {
		return (EAttribute) rolePropsBuilder_iamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRolePropsBuilder_iam_Description_java_lang_String_() {
		return (EAttribute) rolePropsBuilder_iamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRolePropsBuilder_iam_ExternalId_java_lang_String_() {
		return (EAttribute) rolePropsBuilder_iamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRolePropsBuilder_iam_ExternalIds_java_lang_String_AsList() {
		return (EAttribute) rolePropsBuilder_iamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRolePropsBuilder_iam_InlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap() {
		return (EAttribute) rolePropsBuilder_iamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRolePropsBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList() {
		return (EAttribute) rolePropsBuilder_iamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRolePropsBuilder_iam_MaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return (EAttribute) rolePropsBuilder_iamEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRolePropsBuilder_iam_Path_java_lang_String_() {
		return (EAttribute) rolePropsBuilder_iamEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRolePropsBuilder_iam_PermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference() {
		return (EAttribute) rolePropsBuilder_iamEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRolePropsBuilder_iam_RoleName_java_lang_String_() {
		return (EAttribute) rolePropsBuilder_iamEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRolePropsBuilder_iam_GeneratedClassName() {
		return (EAttribute) rolePropsBuilder_iamEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRolePropsBuilder_iam_VarName() {
		return (EAttribute) rolePropsBuilder_iamEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRolePropsBuilder_iam_Identifier() {
		return (EAttribute) rolePropsBuilder_iamEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRolePropsBuilder_iam_AdditionalCode() {
		return (EAttribute) rolePropsBuilder_iamEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnknownPrincipalPropsBuilder_iam() {
		return unknownPrincipalPropsBuilder_iamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnknownPrincipalPropsBuilder_iam_ResourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference() {
		return (EAttribute) unknownPrincipalPropsBuilder_iamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnknownPrincipalPropsBuilder_iam_GeneratedClassName() {
		return (EAttribute) unknownPrincipalPropsBuilder_iamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnknownPrincipalPropsBuilder_iam_VarName() {
		return (EAttribute) unknownPrincipalPropsBuilder_iamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnknownPrincipalPropsBuilder_iam_Identifier() {
		return (EAttribute) unknownPrincipalPropsBuilder_iamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnknownPrincipalPropsBuilder_iam_AdditionalCode() {
		return (EAttribute) unknownPrincipalPropsBuilder_iamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOpenIdConnectProviderPropsBuilder_iam() {
		return openIdConnectProviderPropsBuilder_iamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOpenIdConnectProviderPropsBuilder_iam_Url_java_lang_String_() {
		return (EAttribute) openIdConnectProviderPropsBuilder_iamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOpenIdConnectProviderPropsBuilder_iam_ClientIds_java_lang_String_AsList() {
		return (EAttribute) openIdConnectProviderPropsBuilder_iamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOpenIdConnectProviderPropsBuilder_iam_Thumbprints_java_lang_String_AsList() {
		return (EAttribute) openIdConnectProviderPropsBuilder_iamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOpenIdConnectProviderPropsBuilder_iam_GeneratedClassName() {
		return (EAttribute) openIdConnectProviderPropsBuilder_iamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOpenIdConnectProviderPropsBuilder_iam_VarName() {
		return (EAttribute) openIdConnectProviderPropsBuilder_iamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOpenIdConnectProviderPropsBuilder_iam_Identifier() {
		return (EAttribute) openIdConnectProviderPropsBuilder_iamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOpenIdConnectProviderPropsBuilder_iam_AdditionalCode() {
		return (EAttribute) openIdConnectProviderPropsBuilder_iamEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGroupPropsBuilder_iam() {
		return groupPropsBuilder_iamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroupPropsBuilder_iam_GroupName_java_lang_String_() {
		return (EAttribute) groupPropsBuilder_iamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroupPropsBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList() {
		return (EAttribute) groupPropsBuilder_iamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroupPropsBuilder_iam_Path_java_lang_String_() {
		return (EAttribute) groupPropsBuilder_iamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroupPropsBuilder_iam_GeneratedClassName() {
		return (EAttribute) groupPropsBuilder_iamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroupPropsBuilder_iam_VarName() {
		return (EAttribute) groupPropsBuilder_iamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroupPropsBuilder_iam_Identifier() {
		return (EAttribute) groupPropsBuilder_iamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroupPropsBuilder_iam_AdditionalCode() {
		return (EAttribute) groupPropsBuilder_iamEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoleBuilder_iam() {
		return roleBuilder_iamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleBuilder_iam_AssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference() {
		return (EAttribute) roleBuilder_iamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleBuilder_iam_Description_java_lang_String_() {
		return (EAttribute) roleBuilder_iamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleBuilder_iam_ExternalId_java_lang_String_() {
		return (EAttribute) roleBuilder_iamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleBuilder_iam_ExternalIds_java_lang_String_AsList() {
		return (EAttribute) roleBuilder_iamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleBuilder_iam_InlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap() {
		return (EAttribute) roleBuilder_iamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList() {
		return (EAttribute) roleBuilder_iamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleBuilder_iam_MaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return (EAttribute) roleBuilder_iamEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleBuilder_iam_Path_java_lang_String_() {
		return (EAttribute) roleBuilder_iamEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleBuilder_iam_PermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference() {
		return (EAttribute) roleBuilder_iamEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleBuilder_iam_RoleName_java_lang_String_() {
		return (EAttribute) roleBuilder_iamEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleBuilder_iam_GeneratedClassName() {
		return (EAttribute) roleBuilder_iamEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleBuilder_iam_VarName() {
		return (EAttribute) roleBuilder_iamEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleBuilder_iam_Identifier() {
		return (EAttribute) roleBuilder_iamEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleBuilder_iam_AdditionalCode() {
		return (EAttribute) roleBuilder_iamEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServicePrincipalBuilder_iam() {
		return servicePrincipalBuilder_iamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServicePrincipalBuilder_iam_Conditions_java_lang_String__java_lang_Object_AsMap() {
		return (EAttribute) servicePrincipalBuilder_iamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServicePrincipalBuilder_iam_Region_java_lang_String_() {
		return (EAttribute) servicePrincipalBuilder_iamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServicePrincipalBuilder_iam_GeneratedClassName() {
		return (EAttribute) servicePrincipalBuilder_iamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServicePrincipalBuilder_iam_VarName() {
		return (EAttribute) servicePrincipalBuilder_iamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServicePrincipalBuilder_iam_Identifier() {
		return (EAttribute) servicePrincipalBuilder_iamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServicePrincipalBuilder_iam_AdditionalCode() {
		return (EAttribute) servicePrincipalBuilder_iamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGrantOnPrincipalOptionsBuilder_iam() {
		return grantOnPrincipalOptionsBuilder_iamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrantOnPrincipalOptionsBuilder_iam_ScopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference() {
		return (EAttribute) grantOnPrincipalOptionsBuilder_iamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrantOnPrincipalOptionsBuilder_iam_Actions_java_lang_String_AsList() {
		return (EAttribute) grantOnPrincipalOptionsBuilder_iamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrantOnPrincipalOptionsBuilder_iam_GranteeWithIGrantable_software_amazon_awscdk_services_iam_IGrantable_AsReference() {
		return (EAttribute) grantOnPrincipalOptionsBuilder_iamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrantOnPrincipalOptionsBuilder_iam_ResourceArns_java_lang_String_AsList() {
		return (EAttribute) grantOnPrincipalOptionsBuilder_iamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrantOnPrincipalOptionsBuilder_iam_GeneratedClassName() {
		return (EAttribute) grantOnPrincipalOptionsBuilder_iamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrantOnPrincipalOptionsBuilder_iam_VarName() {
		return (EAttribute) grantOnPrincipalOptionsBuilder_iamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrantOnPrincipalOptionsBuilder_iam_Identifier() {
		return (EAttribute) grantOnPrincipalOptionsBuilder_iamEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrantOnPrincipalOptionsBuilder_iam_AdditionalCode() {
		return (EAttribute) grantOnPrincipalOptionsBuilder_iamEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUserBuilder_iam() {
		return userBuilder_iamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserBuilder_iam_Groups_software_amazon_awscdk_services_iam_IGroup_AsList() {
		return (EAttribute) userBuilder_iamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList() {
		return (EAttribute) userBuilder_iamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserBuilder_iam_PasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference() {
		return (EAttribute) userBuilder_iamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserBuilder_iam_PasswordResetRequired_java_lang_Boolean_() {
		return (EAttribute) userBuilder_iamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserBuilder_iam_Path_java_lang_String_() {
		return (EAttribute) userBuilder_iamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserBuilder_iam_PermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference() {
		return (EAttribute) userBuilder_iamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserBuilder_iam_UserName_java_lang_String_() {
		return (EAttribute) userBuilder_iamEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserBuilder_iam_GeneratedClassName() {
		return (EAttribute) userBuilder_iamEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserBuilder_iam_VarName() {
		return (EAttribute) userBuilder_iamEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserBuilder_iam_Identifier() {
		return (EAttribute) userBuilder_iamEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserBuilder_iam_AdditionalCode() {
		return (EAttribute) userBuilder_iamEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGrantOnPrincipalAndResourceOptionsBuilder_iam() {
		return grantOnPrincipalAndResourceOptionsBuilder_iamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrantOnPrincipalAndResourceOptionsBuilder_iam_ResourceWithIResourceWithPolicy_software_amazon_awscdk_services_iam_IResourceWithPolicy_AsReference() {
		return (EAttribute) grantOnPrincipalAndResourceOptionsBuilder_iamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrantOnPrincipalAndResourceOptionsBuilder_iam_ResourcePolicyPrincipalWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference() {
		return (EAttribute) grantOnPrincipalAndResourceOptionsBuilder_iamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrantOnPrincipalAndResourceOptionsBuilder_iam_ResourceSelfArns_java_lang_String_AsList() {
		return (EAttribute) grantOnPrincipalAndResourceOptionsBuilder_iamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrantOnPrincipalAndResourceOptionsBuilder_iam_Actions_java_lang_String_AsList() {
		return (EAttribute) grantOnPrincipalAndResourceOptionsBuilder_iamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrantOnPrincipalAndResourceOptionsBuilder_iam_GranteeWithIGrantable_software_amazon_awscdk_services_iam_IGrantable_AsReference() {
		return (EAttribute) grantOnPrincipalAndResourceOptionsBuilder_iamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrantOnPrincipalAndResourceOptionsBuilder_iam_ResourceArns_java_lang_String_AsList() {
		return (EAttribute) grantOnPrincipalAndResourceOptionsBuilder_iamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrantOnPrincipalAndResourceOptionsBuilder_iam_GeneratedClassName() {
		return (EAttribute) grantOnPrincipalAndResourceOptionsBuilder_iamEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrantOnPrincipalAndResourceOptionsBuilder_iam_VarName() {
		return (EAttribute) grantOnPrincipalAndResourceOptionsBuilder_iamEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrantOnPrincipalAndResourceOptionsBuilder_iam_Identifier() {
		return (EAttribute) grantOnPrincipalAndResourceOptionsBuilder_iamEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrantOnPrincipalAndResourceOptionsBuilder_iam_AdditionalCode() {
		return (EAttribute) grantOnPrincipalAndResourceOptionsBuilder_iamEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getManagedPolicyBuilder_iam() {
		return managedPolicyBuilder_iamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManagedPolicyBuilder_iam_Description_java_lang_String_() {
		return (EAttribute) managedPolicyBuilder_iamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManagedPolicyBuilder_iam_DocumentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference() {
		return (EAttribute) managedPolicyBuilder_iamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManagedPolicyBuilder_iam_Groups_software_amazon_awscdk_services_iam_IGroup_AsList() {
		return (EAttribute) managedPolicyBuilder_iamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManagedPolicyBuilder_iam_ManagedPolicyName_java_lang_String_() {
		return (EAttribute) managedPolicyBuilder_iamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManagedPolicyBuilder_iam_Path_java_lang_String_() {
		return (EAttribute) managedPolicyBuilder_iamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManagedPolicyBuilder_iam_Roles_software_amazon_awscdk_services_iam_IRole_AsList() {
		return (EAttribute) managedPolicyBuilder_iamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManagedPolicyBuilder_iam_Statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList() {
		return (EAttribute) managedPolicyBuilder_iamEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManagedPolicyBuilder_iam_Users_software_amazon_awscdk_services_iam_IUser_AsList() {
		return (EAttribute) managedPolicyBuilder_iamEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManagedPolicyBuilder_iam_GeneratedClassName() {
		return (EAttribute) managedPolicyBuilder_iamEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManagedPolicyBuilder_iam_VarName() {
		return (EAttribute) managedPolicyBuilder_iamEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManagedPolicyBuilder_iam_Identifier() {
		return (EAttribute) managedPolicyBuilder_iamEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManagedPolicyBuilder_iam_AdditionalCode() {
		return (EAttribute) managedPolicyBuilder_iamEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFromRoleArnOptionsBuilder_iam() {
		return fromRoleArnOptionsBuilder_iamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFromRoleArnOptionsBuilder_iam_Mutable_java_lang_Boolean_() {
		return (EAttribute) fromRoleArnOptionsBuilder_iamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFromRoleArnOptionsBuilder_iam_GeneratedClassName() {
		return (EAttribute) fromRoleArnOptionsBuilder_iamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFromRoleArnOptionsBuilder_iam_VarName() {
		return (EAttribute) fromRoleArnOptionsBuilder_iamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFromRoleArnOptionsBuilder_iam_Identifier() {
		return (EAttribute) fromRoleArnOptionsBuilder_iamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFromRoleArnOptionsBuilder_iam_AdditionalCode() {
		return (EAttribute) fromRoleArnOptionsBuilder_iamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolicyDocumentBuilder_iam() {
		return policyDocumentBuilder_iamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyDocumentBuilder_iam_AssignSids_java_lang_Boolean_() {
		return (EAttribute) policyDocumentBuilder_iamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyDocumentBuilder_iam_Statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList() {
		return (EAttribute) policyDocumentBuilder_iamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyDocumentBuilder_iam_GeneratedClassName() {
		return (EAttribute) policyDocumentBuilder_iamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyDocumentBuilder_iam_VarName() {
		return (EAttribute) policyDocumentBuilder_iamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyDocumentBuilder_iam_Identifier() {
		return (EAttribute) policyDocumentBuilder_iamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyDocumentBuilder_iam_AdditionalCode() {
		return (EAttribute) policyDocumentBuilder_iamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolicyBuilder_iam() {
		return policyBuilder_iamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyBuilder_iam_Force_java_lang_Boolean_() {
		return (EAttribute) policyBuilder_iamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyBuilder_iam_Groups_software_amazon_awscdk_services_iam_IGroup_AsList() {
		return (EAttribute) policyBuilder_iamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyBuilder_iam_PolicyName_java_lang_String_() {
		return (EAttribute) policyBuilder_iamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyBuilder_iam_Roles_software_amazon_awscdk_services_iam_IRole_AsList() {
		return (EAttribute) policyBuilder_iamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyBuilder_iam_Statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList() {
		return (EAttribute) policyBuilder_iamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyBuilder_iam_Users_software_amazon_awscdk_services_iam_IUser_AsList() {
		return (EAttribute) policyBuilder_iamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyBuilder_iam_GeneratedClassName() {
		return (EAttribute) policyBuilder_iamEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyBuilder_iam_VarName() {
		return (EAttribute) policyBuilder_iamEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyBuilder_iam_Identifier() {
		return (EAttribute) policyBuilder_iamEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyBuilder_iam_AdditionalCode() {
		return (EAttribute) policyBuilder_iamEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolicyDocumentPropsBuilder_iam() {
		return policyDocumentPropsBuilder_iamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyDocumentPropsBuilder_iam_AssignSids_java_lang_Boolean_() {
		return (EAttribute) policyDocumentPropsBuilder_iamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyDocumentPropsBuilder_iam_Statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList() {
		return (EAttribute) policyDocumentPropsBuilder_iamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyDocumentPropsBuilder_iam_GeneratedClassName() {
		return (EAttribute) policyDocumentPropsBuilder_iamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyDocumentPropsBuilder_iam_VarName() {
		return (EAttribute) policyDocumentPropsBuilder_iamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyDocumentPropsBuilder_iam_Identifier() {
		return (EAttribute) policyDocumentPropsBuilder_iamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyDocumentPropsBuilder_iam_AdditionalCode() {
		return (EAttribute) policyDocumentPropsBuilder_iamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUserPropsBuilder_iam() {
		return userPropsBuilder_iamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserPropsBuilder_iam_Groups_software_amazon_awscdk_services_iam_IGroup_AsList() {
		return (EAttribute) userPropsBuilder_iamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserPropsBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList() {
		return (EAttribute) userPropsBuilder_iamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserPropsBuilder_iam_PasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference() {
		return (EAttribute) userPropsBuilder_iamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserPropsBuilder_iam_PasswordResetRequired_java_lang_Boolean_() {
		return (EAttribute) userPropsBuilder_iamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserPropsBuilder_iam_Path_java_lang_String_() {
		return (EAttribute) userPropsBuilder_iamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserPropsBuilder_iam_PermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference() {
		return (EAttribute) userPropsBuilder_iamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserPropsBuilder_iam_UserName_java_lang_String_() {
		return (EAttribute) userPropsBuilder_iamEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserPropsBuilder_iam_GeneratedClassName() {
		return (EAttribute) userPropsBuilder_iamEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserPropsBuilder_iam_VarName() {
		return (EAttribute) userPropsBuilder_iamEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserPropsBuilder_iam_Identifier() {
		return (EAttribute) userPropsBuilder_iamEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserPropsBuilder_iam_AdditionalCode() {
		return (EAttribute) userPropsBuilder_iamEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddToResourcePolicyResultBuilder_iam() {
		return addToResourcePolicyResultBuilder_iamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddToResourcePolicyResultBuilder_iam_StatementAdded_java_lang_Boolean_() {
		return (EAttribute) addToResourcePolicyResultBuilder_iamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddToResourcePolicyResultBuilder_iam_PolicyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference() {
		return (EAttribute) addToResourcePolicyResultBuilder_iamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddToResourcePolicyResultBuilder_iam_GeneratedClassName() {
		return (EAttribute) addToResourcePolicyResultBuilder_iamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddToResourcePolicyResultBuilder_iam_VarName() {
		return (EAttribute) addToResourcePolicyResultBuilder_iamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddToResourcePolicyResultBuilder_iam_Identifier() {
		return (EAttribute) addToResourcePolicyResultBuilder_iamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddToResourcePolicyResultBuilder_iam_AdditionalCode() {
		return (EAttribute) addToResourcePolicyResultBuilder_iamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolicyStatementPropsBuilder_iam() {
		return policyStatementPropsBuilder_iamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementPropsBuilder_iam_Actions_java_lang_String_AsList() {
		return (EAttribute) policyStatementPropsBuilder_iamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementPropsBuilder_iam_Conditions_java_lang_String__java_lang_Object_AsMap() {
		return (EAttribute) policyStatementPropsBuilder_iamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementPropsBuilder_iam_Effect_software_amazon_awscdk_services_iam_Effect_() {
		return (EAttribute) policyStatementPropsBuilder_iamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementPropsBuilder_iam_NotActions_java_lang_String_AsList() {
		return (EAttribute) policyStatementPropsBuilder_iamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementPropsBuilder_iam_NotPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList() {
		return (EAttribute) policyStatementPropsBuilder_iamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementPropsBuilder_iam_NotResources_java_lang_String_AsList() {
		return (EAttribute) policyStatementPropsBuilder_iamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementPropsBuilder_iam_Principals_software_amazon_awscdk_services_iam_IPrincipal_AsList() {
		return (EAttribute) policyStatementPropsBuilder_iamEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementPropsBuilder_iam_Resources_java_lang_String_AsList() {
		return (EAttribute) policyStatementPropsBuilder_iamEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementPropsBuilder_iam_Sid_java_lang_String_() {
		return (EAttribute) policyStatementPropsBuilder_iamEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementPropsBuilder_iam_GeneratedClassName() {
		return (EAttribute) policyStatementPropsBuilder_iamEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementPropsBuilder_iam_VarName() {
		return (EAttribute) policyStatementPropsBuilder_iamEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementPropsBuilder_iam_Identifier() {
		return (EAttribute) policyStatementPropsBuilder_iamEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementPropsBuilder_iam_AdditionalCode() {
		return (EAttribute) policyStatementPropsBuilder_iamEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddToPrincipalPolicyResultBuilder_iam() {
		return addToPrincipalPolicyResultBuilder_iamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddToPrincipalPolicyResultBuilder_iam_StatementAdded_java_lang_Boolean_() {
		return (EAttribute) addToPrincipalPolicyResultBuilder_iamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddToPrincipalPolicyResultBuilder_iam_PolicyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference() {
		return (EAttribute) addToPrincipalPolicyResultBuilder_iamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddToPrincipalPolicyResultBuilder_iam_GeneratedClassName() {
		return (EAttribute) addToPrincipalPolicyResultBuilder_iamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddToPrincipalPolicyResultBuilder_iam_VarName() {
		return (EAttribute) addToPrincipalPolicyResultBuilder_iamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddToPrincipalPolicyResultBuilder_iam_Identifier() {
		return (EAttribute) addToPrincipalPolicyResultBuilder_iamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddToPrincipalPolicyResultBuilder_iam_AdditionalCode() {
		return (EAttribute) addToPrincipalPolicyResultBuilder_iamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolicyStatementBuilder_iam() {
		return policyStatementBuilder_iamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementBuilder_iam_Actions_java_lang_String_AsList() {
		return (EAttribute) policyStatementBuilder_iamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementBuilder_iam_Conditions_java_lang_String__java_lang_Object_AsMap() {
		return (EAttribute) policyStatementBuilder_iamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementBuilder_iam_Effect_software_amazon_awscdk_services_iam_Effect_() {
		return (EAttribute) policyStatementBuilder_iamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementBuilder_iam_NotActions_java_lang_String_AsList() {
		return (EAttribute) policyStatementBuilder_iamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementBuilder_iam_NotPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList() {
		return (EAttribute) policyStatementBuilder_iamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementBuilder_iam_NotResources_java_lang_String_AsList() {
		return (EAttribute) policyStatementBuilder_iamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementBuilder_iam_Principals_software_amazon_awscdk_services_iam_IPrincipal_AsList() {
		return (EAttribute) policyStatementBuilder_iamEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementBuilder_iam_Resources_java_lang_String_AsList() {
		return (EAttribute) policyStatementBuilder_iamEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementBuilder_iam_Sid_java_lang_String_() {
		return (EAttribute) policyStatementBuilder_iamEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementBuilder_iam_GeneratedClassName() {
		return (EAttribute) policyStatementBuilder_iamEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementBuilder_iam_VarName() {
		return (EAttribute) policyStatementBuilder_iamEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementBuilder_iam_Identifier() {
		return (EAttribute) policyStatementBuilder_iamEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementBuilder_iam_AdditionalCode() {
		return (EAttribute) policyStatementBuilder_iamEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServicePrincipalOptsBuilder_iam() {
		return servicePrincipalOptsBuilder_iamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServicePrincipalOptsBuilder_iam_Conditions_java_lang_String__java_lang_Object_AsMap() {
		return (EAttribute) servicePrincipalOptsBuilder_iamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServicePrincipalOptsBuilder_iam_Region_java_lang_String_() {
		return (EAttribute) servicePrincipalOptsBuilder_iamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServicePrincipalOptsBuilder_iam_GeneratedClassName() {
		return (EAttribute) servicePrincipalOptsBuilder_iamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServicePrincipalOptsBuilder_iam_VarName() {
		return (EAttribute) servicePrincipalOptsBuilder_iamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServicePrincipalOptsBuilder_iam_Identifier() {
		return (EAttribute) servicePrincipalOptsBuilder_iamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServicePrincipalOptsBuilder_iam_AdditionalCode() {
		return (EAttribute) servicePrincipalOptsBuilder_iamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnknownPrincipalBuilder_iam() {
		return unknownPrincipalBuilder_iamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnknownPrincipalBuilder_iam_ResourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference() {
		return (EAttribute) unknownPrincipalBuilder_iamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnknownPrincipalBuilder_iam_GeneratedClassName() {
		return (EAttribute) unknownPrincipalBuilder_iamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnknownPrincipalBuilder_iam_VarName() {
		return (EAttribute) unknownPrincipalBuilder_iamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnknownPrincipalBuilder_iam_Identifier() {
		return (EAttribute) unknownPrincipalBuilder_iamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnknownPrincipalBuilder_iam_AdditionalCode() {
		return (EAttribute) unknownPrincipalBuilder_iamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getManagedPolicyPropsBuilder_iam() {
		return managedPolicyPropsBuilder_iamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManagedPolicyPropsBuilder_iam_Description_java_lang_String_() {
		return (EAttribute) managedPolicyPropsBuilder_iamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManagedPolicyPropsBuilder_iam_DocumentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference() {
		return (EAttribute) managedPolicyPropsBuilder_iamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManagedPolicyPropsBuilder_iam_Groups_software_amazon_awscdk_services_iam_IGroup_AsList() {
		return (EAttribute) managedPolicyPropsBuilder_iamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManagedPolicyPropsBuilder_iam_ManagedPolicyName_java_lang_String_() {
		return (EAttribute) managedPolicyPropsBuilder_iamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManagedPolicyPropsBuilder_iam_Path_java_lang_String_() {
		return (EAttribute) managedPolicyPropsBuilder_iamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManagedPolicyPropsBuilder_iam_Roles_software_amazon_awscdk_services_iam_IRole_AsList() {
		return (EAttribute) managedPolicyPropsBuilder_iamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManagedPolicyPropsBuilder_iam_Statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList() {
		return (EAttribute) managedPolicyPropsBuilder_iamEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManagedPolicyPropsBuilder_iam_Users_software_amazon_awscdk_services_iam_IUser_AsList() {
		return (EAttribute) managedPolicyPropsBuilder_iamEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManagedPolicyPropsBuilder_iam_GeneratedClassName() {
		return (EAttribute) managedPolicyPropsBuilder_iamEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManagedPolicyPropsBuilder_iam_VarName() {
		return (EAttribute) managedPolicyPropsBuilder_iamEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManagedPolicyPropsBuilder_iam_Identifier() {
		return (EAttribute) managedPolicyPropsBuilder_iamEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManagedPolicyPropsBuilder_iam_AdditionalCode() {
		return (EAttribute) managedPolicyPropsBuilder_iamEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOpenIdConnectProviderBuilder_iam() {
		return openIdConnectProviderBuilder_iamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOpenIdConnectProviderBuilder_iam_Url_java_lang_String_() {
		return (EAttribute) openIdConnectProviderBuilder_iamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOpenIdConnectProviderBuilder_iam_ClientIds_java_lang_String_AsList() {
		return (EAttribute) openIdConnectProviderBuilder_iamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOpenIdConnectProviderBuilder_iam_Thumbprints_java_lang_String_AsList() {
		return (EAttribute) openIdConnectProviderBuilder_iamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOpenIdConnectProviderBuilder_iam_GeneratedClassName() {
		return (EAttribute) openIdConnectProviderBuilder_iamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOpenIdConnectProviderBuilder_iam_VarName() {
		return (EAttribute) openIdConnectProviderBuilder_iamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOpenIdConnectProviderBuilder_iam_Identifier() {
		return (EAttribute) openIdConnectProviderBuilder_iamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOpenIdConnectProviderBuilder_iam_AdditionalCode() {
		return (EAttribute) openIdConnectProviderBuilder_iamEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLazyRoleBuilder_iam() {
		return lazyRoleBuilder_iamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyRoleBuilder_iam_AssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference() {
		return (EAttribute) lazyRoleBuilder_iamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyRoleBuilder_iam_Description_java_lang_String_() {
		return (EAttribute) lazyRoleBuilder_iamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyRoleBuilder_iam_ExternalId_java_lang_String_() {
		return (EAttribute) lazyRoleBuilder_iamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyRoleBuilder_iam_ExternalIds_java_lang_String_AsList() {
		return (EAttribute) lazyRoleBuilder_iamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyRoleBuilder_iam_InlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap() {
		return (EAttribute) lazyRoleBuilder_iamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyRoleBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList() {
		return (EAttribute) lazyRoleBuilder_iamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyRoleBuilder_iam_MaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return (EAttribute) lazyRoleBuilder_iamEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyRoleBuilder_iam_Path_java_lang_String_() {
		return (EAttribute) lazyRoleBuilder_iamEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyRoleBuilder_iam_PermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference() {
		return (EAttribute) lazyRoleBuilder_iamEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyRoleBuilder_iam_RoleName_java_lang_String_() {
		return (EAttribute) lazyRoleBuilder_iamEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyRoleBuilder_iam_GeneratedClassName() {
		return (EAttribute) lazyRoleBuilder_iamEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyRoleBuilder_iam_VarName() {
		return (EAttribute) lazyRoleBuilder_iamEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyRoleBuilder_iam_Identifier() {
		return (EAttribute) lazyRoleBuilder_iamEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyRoleBuilder_iam_AdditionalCode() {
		return (EAttribute) lazyRoleBuilder_iamEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommonGrantOptionsBuilder_iam() {
		return commonGrantOptionsBuilder_iamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommonGrantOptionsBuilder_iam_Actions_java_lang_String_AsList() {
		return (EAttribute) commonGrantOptionsBuilder_iamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommonGrantOptionsBuilder_iam_GranteeWithIGrantable_software_amazon_awscdk_services_iam_IGrantable_AsReference() {
		return (EAttribute) commonGrantOptionsBuilder_iamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommonGrantOptionsBuilder_iam_ResourceArns_java_lang_String_AsList() {
		return (EAttribute) commonGrantOptionsBuilder_iamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommonGrantOptionsBuilder_iam_GeneratedClassName() {
		return (EAttribute) commonGrantOptionsBuilder_iamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommonGrantOptionsBuilder_iam_VarName() {
		return (EAttribute) commonGrantOptionsBuilder_iamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommonGrantOptionsBuilder_iam_Identifier() {
		return (EAttribute) commonGrantOptionsBuilder_iamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommonGrantOptionsBuilder_iam_AdditionalCode() {
		return (EAttribute) commonGrantOptionsBuilder_iamEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGrantWithResourceOptionsBuilder_iam() {
		return grantWithResourceOptionsBuilder_iamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrantWithResourceOptionsBuilder_iam_ResourceWithIResourceWithPolicy_software_amazon_awscdk_services_iam_IResourceWithPolicy_AsReference() {
		return (EAttribute) grantWithResourceOptionsBuilder_iamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrantWithResourceOptionsBuilder_iam_ResourceSelfArns_java_lang_String_AsList() {
		return (EAttribute) grantWithResourceOptionsBuilder_iamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrantWithResourceOptionsBuilder_iam_Actions_java_lang_String_AsList() {
		return (EAttribute) grantWithResourceOptionsBuilder_iamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrantWithResourceOptionsBuilder_iam_GranteeWithIGrantable_software_amazon_awscdk_services_iam_IGrantable_AsReference() {
		return (EAttribute) grantWithResourceOptionsBuilder_iamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrantWithResourceOptionsBuilder_iam_ResourceArns_java_lang_String_AsList() {
		return (EAttribute) grantWithResourceOptionsBuilder_iamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrantWithResourceOptionsBuilder_iam_GeneratedClassName() {
		return (EAttribute) grantWithResourceOptionsBuilder_iamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrantWithResourceOptionsBuilder_iam_VarName() {
		return (EAttribute) grantWithResourceOptionsBuilder_iamEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrantWithResourceOptionsBuilder_iam_Identifier() {
		return (EAttribute) grantWithResourceOptionsBuilder_iamEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrantWithResourceOptionsBuilder_iam_AdditionalCode() {
		return (EAttribute) grantWithResourceOptionsBuilder_iamEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLazyRolePropsBuilder_iam() {
		return lazyRolePropsBuilder_iamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyRolePropsBuilder_iam_AssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference() {
		return (EAttribute) lazyRolePropsBuilder_iamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyRolePropsBuilder_iam_Description_java_lang_String_() {
		return (EAttribute) lazyRolePropsBuilder_iamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyRolePropsBuilder_iam_ExternalId_java_lang_String_() {
		return (EAttribute) lazyRolePropsBuilder_iamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyRolePropsBuilder_iam_ExternalIds_java_lang_String_AsList() {
		return (EAttribute) lazyRolePropsBuilder_iamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyRolePropsBuilder_iam_InlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap() {
		return (EAttribute) lazyRolePropsBuilder_iamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyRolePropsBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList() {
		return (EAttribute) lazyRolePropsBuilder_iamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyRolePropsBuilder_iam_MaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return (EAttribute) lazyRolePropsBuilder_iamEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyRolePropsBuilder_iam_Path_java_lang_String_() {
		return (EAttribute) lazyRolePropsBuilder_iamEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyRolePropsBuilder_iam_PermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference() {
		return (EAttribute) lazyRolePropsBuilder_iamEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyRolePropsBuilder_iam_RoleName_java_lang_String_() {
		return (EAttribute) lazyRolePropsBuilder_iamEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyRolePropsBuilder_iam_GeneratedClassName() {
		return (EAttribute) lazyRolePropsBuilder_iamEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyRolePropsBuilder_iam_VarName() {
		return (EAttribute) lazyRolePropsBuilder_iamEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyRolePropsBuilder_iam_Identifier() {
		return (EAttribute) lazyRolePropsBuilder_iamEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyRolePropsBuilder_iam_AdditionalCode() {
		return (EAttribute) lazyRolePropsBuilder_iamEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolicyPropsBuilder_iam() {
		return policyPropsBuilder_iamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyPropsBuilder_iam_Force_java_lang_Boolean_() {
		return (EAttribute) policyPropsBuilder_iamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyPropsBuilder_iam_Groups_software_amazon_awscdk_services_iam_IGroup_AsList() {
		return (EAttribute) policyPropsBuilder_iamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyPropsBuilder_iam_PolicyName_java_lang_String_() {
		return (EAttribute) policyPropsBuilder_iamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyPropsBuilder_iam_Roles_software_amazon_awscdk_services_iam_IRole_AsList() {
		return (EAttribute) policyPropsBuilder_iamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyPropsBuilder_iam_Statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList() {
		return (EAttribute) policyPropsBuilder_iamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyPropsBuilder_iam_Users_software_amazon_awscdk_services_iam_IUser_AsList() {
		return (EAttribute) policyPropsBuilder_iamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyPropsBuilder_iam_GeneratedClassName() {
		return (EAttribute) policyPropsBuilder_iamEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyPropsBuilder_iam_VarName() {
		return (EAttribute) policyPropsBuilder_iamEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyPropsBuilder_iam_Identifier() {
		return (EAttribute) policyPropsBuilder_iamEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyPropsBuilder_iam_AdditionalCode() {
		return (EAttribute) policyPropsBuilder_iamEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGroupBuilder_iam() {
		return groupBuilder_iamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroupBuilder_iam_GroupName_java_lang_String_() {
		return (EAttribute) groupBuilder_iamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroupBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList() {
		return (EAttribute) groupBuilder_iamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroupBuilder_iam_Path_java_lang_String_() {
		return (EAttribute) groupBuilder_iamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroupBuilder_iam_GeneratedClassName() {
		return (EAttribute) groupBuilder_iamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroupBuilder_iam_VarName() {
		return (EAttribute) groupBuilder_iamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroupBuilder_iam_Identifier() {
		return (EAttribute) groupBuilder_iamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroupBuilder_iam_AdditionalCode() {
		return (EAttribute) groupBuilder_iamEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEffect() {
		return effectEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IamFactory getIamFactory() {
		return (IamFactory) getEFactoryInstance();
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
		rolePropsBuilder_iamEClass = createEClass(ROLE_PROPS_BUILDER_IAM);
		createEAttribute(rolePropsBuilder_iamEClass,
				ROLE_PROPS_BUILDER_IAM__ASSUMED_BY_WITH_IPRINCIPAL_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_REFERENCE);
		createEAttribute(rolePropsBuilder_iamEClass, ROLE_PROPS_BUILDER_IAM__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(rolePropsBuilder_iamEClass, ROLE_PROPS_BUILDER_IAM__EXTERNAL_ID_JAVA_LANG_STRING_);
		createEAttribute(rolePropsBuilder_iamEClass, ROLE_PROPS_BUILDER_IAM__EXTERNAL_IDS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(rolePropsBuilder_iamEClass,
				ROLE_PROPS_BUILDER_IAM__INLINE_POLICIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_MAP);
		createEAttribute(rolePropsBuilder_iamEClass,
				ROLE_PROPS_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST);
		createEAttribute(rolePropsBuilder_iamEClass,
				ROLE_PROPS_BUILDER_IAM__MAX_SESSION_DURATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE);
		createEAttribute(rolePropsBuilder_iamEClass, ROLE_PROPS_BUILDER_IAM__PATH_JAVA_LANG_STRING_);
		createEAttribute(rolePropsBuilder_iamEClass,
				ROLE_PROPS_BUILDER_IAM__PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE);
		createEAttribute(rolePropsBuilder_iamEClass, ROLE_PROPS_BUILDER_IAM__ROLE_NAME_JAVA_LANG_STRING_);
		createEAttribute(rolePropsBuilder_iamEClass, ROLE_PROPS_BUILDER_IAM__GENERATED_CLASS_NAME);
		createEAttribute(rolePropsBuilder_iamEClass, ROLE_PROPS_BUILDER_IAM__VAR_NAME);
		createEAttribute(rolePropsBuilder_iamEClass, ROLE_PROPS_BUILDER_IAM__IDENTIFIER);
		createEAttribute(rolePropsBuilder_iamEClass, ROLE_PROPS_BUILDER_IAM__ADDITIONAL_CODE);

		unknownPrincipalPropsBuilder_iamEClass = createEClass(UNKNOWN_PRINCIPAL_PROPS_BUILDER_IAM);
		createEAttribute(unknownPrincipalPropsBuilder_iamEClass,
				UNKNOWN_PRINCIPAL_PROPS_BUILDER_IAM__RESOURCE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE);
		createEAttribute(unknownPrincipalPropsBuilder_iamEClass,
				UNKNOWN_PRINCIPAL_PROPS_BUILDER_IAM__GENERATED_CLASS_NAME);
		createEAttribute(unknownPrincipalPropsBuilder_iamEClass, UNKNOWN_PRINCIPAL_PROPS_BUILDER_IAM__VAR_NAME);
		createEAttribute(unknownPrincipalPropsBuilder_iamEClass, UNKNOWN_PRINCIPAL_PROPS_BUILDER_IAM__IDENTIFIER);
		createEAttribute(unknownPrincipalPropsBuilder_iamEClass, UNKNOWN_PRINCIPAL_PROPS_BUILDER_IAM__ADDITIONAL_CODE);

		openIdConnectProviderPropsBuilder_iamEClass = createEClass(OPEN_ID_CONNECT_PROVIDER_PROPS_BUILDER_IAM);
		createEAttribute(openIdConnectProviderPropsBuilder_iamEClass,
				OPEN_ID_CONNECT_PROVIDER_PROPS_BUILDER_IAM__URL_JAVA_LANG_STRING_);
		createEAttribute(openIdConnectProviderPropsBuilder_iamEClass,
				OPEN_ID_CONNECT_PROVIDER_PROPS_BUILDER_IAM__CLIENT_IDS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(openIdConnectProviderPropsBuilder_iamEClass,
				OPEN_ID_CONNECT_PROVIDER_PROPS_BUILDER_IAM__THUMBPRINTS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(openIdConnectProviderPropsBuilder_iamEClass,
				OPEN_ID_CONNECT_PROVIDER_PROPS_BUILDER_IAM__GENERATED_CLASS_NAME);
		createEAttribute(openIdConnectProviderPropsBuilder_iamEClass,
				OPEN_ID_CONNECT_PROVIDER_PROPS_BUILDER_IAM__VAR_NAME);
		createEAttribute(openIdConnectProviderPropsBuilder_iamEClass,
				OPEN_ID_CONNECT_PROVIDER_PROPS_BUILDER_IAM__IDENTIFIER);
		createEAttribute(openIdConnectProviderPropsBuilder_iamEClass,
				OPEN_ID_CONNECT_PROVIDER_PROPS_BUILDER_IAM__ADDITIONAL_CODE);

		groupPropsBuilder_iamEClass = createEClass(GROUP_PROPS_BUILDER_IAM);
		createEAttribute(groupPropsBuilder_iamEClass, GROUP_PROPS_BUILDER_IAM__GROUP_NAME_JAVA_LANG_STRING_);
		createEAttribute(groupPropsBuilder_iamEClass,
				GROUP_PROPS_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST);
		createEAttribute(groupPropsBuilder_iamEClass, GROUP_PROPS_BUILDER_IAM__PATH_JAVA_LANG_STRING_);
		createEAttribute(groupPropsBuilder_iamEClass, GROUP_PROPS_BUILDER_IAM__GENERATED_CLASS_NAME);
		createEAttribute(groupPropsBuilder_iamEClass, GROUP_PROPS_BUILDER_IAM__VAR_NAME);
		createEAttribute(groupPropsBuilder_iamEClass, GROUP_PROPS_BUILDER_IAM__IDENTIFIER);
		createEAttribute(groupPropsBuilder_iamEClass, GROUP_PROPS_BUILDER_IAM__ADDITIONAL_CODE);

		roleBuilder_iamEClass = createEClass(ROLE_BUILDER_IAM);
		createEAttribute(roleBuilder_iamEClass,
				ROLE_BUILDER_IAM__ASSUMED_BY_WITH_IPRINCIPAL_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_REFERENCE);
		createEAttribute(roleBuilder_iamEClass, ROLE_BUILDER_IAM__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(roleBuilder_iamEClass, ROLE_BUILDER_IAM__EXTERNAL_ID_JAVA_LANG_STRING_);
		createEAttribute(roleBuilder_iamEClass, ROLE_BUILDER_IAM__EXTERNAL_IDS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(roleBuilder_iamEClass,
				ROLE_BUILDER_IAM__INLINE_POLICIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_MAP);
		createEAttribute(roleBuilder_iamEClass,
				ROLE_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST);
		createEAttribute(roleBuilder_iamEClass,
				ROLE_BUILDER_IAM__MAX_SESSION_DURATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE);
		createEAttribute(roleBuilder_iamEClass, ROLE_BUILDER_IAM__PATH_JAVA_LANG_STRING_);
		createEAttribute(roleBuilder_iamEClass,
				ROLE_BUILDER_IAM__PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE);
		createEAttribute(roleBuilder_iamEClass, ROLE_BUILDER_IAM__ROLE_NAME_JAVA_LANG_STRING_);
		createEAttribute(roleBuilder_iamEClass, ROLE_BUILDER_IAM__GENERATED_CLASS_NAME);
		createEAttribute(roleBuilder_iamEClass, ROLE_BUILDER_IAM__VAR_NAME);
		createEAttribute(roleBuilder_iamEClass, ROLE_BUILDER_IAM__IDENTIFIER);
		createEAttribute(roleBuilder_iamEClass, ROLE_BUILDER_IAM__ADDITIONAL_CODE);

		servicePrincipalBuilder_iamEClass = createEClass(SERVICE_PRINCIPAL_BUILDER_IAM);
		createEAttribute(servicePrincipalBuilder_iamEClass,
				SERVICE_PRINCIPAL_BUILDER_IAM__CONDITIONS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP);
		createEAttribute(servicePrincipalBuilder_iamEClass, SERVICE_PRINCIPAL_BUILDER_IAM__REGION_JAVA_LANG_STRING_);
		createEAttribute(servicePrincipalBuilder_iamEClass, SERVICE_PRINCIPAL_BUILDER_IAM__GENERATED_CLASS_NAME);
		createEAttribute(servicePrincipalBuilder_iamEClass, SERVICE_PRINCIPAL_BUILDER_IAM__VAR_NAME);
		createEAttribute(servicePrincipalBuilder_iamEClass, SERVICE_PRINCIPAL_BUILDER_IAM__IDENTIFIER);
		createEAttribute(servicePrincipalBuilder_iamEClass, SERVICE_PRINCIPAL_BUILDER_IAM__ADDITIONAL_CODE);

		grantOnPrincipalOptionsBuilder_iamEClass = createEClass(GRANT_ON_PRINCIPAL_OPTIONS_BUILDER_IAM);
		createEAttribute(grantOnPrincipalOptionsBuilder_iamEClass,
				GRANT_ON_PRINCIPAL_OPTIONS_BUILDER_IAM__SCOPE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE);
		createEAttribute(grantOnPrincipalOptionsBuilder_iamEClass,
				GRANT_ON_PRINCIPAL_OPTIONS_BUILDER_IAM__ACTIONS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(grantOnPrincipalOptionsBuilder_iamEClass,
				GRANT_ON_PRINCIPAL_OPTIONS_BUILDER_IAM__GRANTEE_WITH_IGRANTABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGRANTABLE_AS_REFERENCE);
		createEAttribute(grantOnPrincipalOptionsBuilder_iamEClass,
				GRANT_ON_PRINCIPAL_OPTIONS_BUILDER_IAM__RESOURCE_ARNS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(grantOnPrincipalOptionsBuilder_iamEClass,
				GRANT_ON_PRINCIPAL_OPTIONS_BUILDER_IAM__GENERATED_CLASS_NAME);
		createEAttribute(grantOnPrincipalOptionsBuilder_iamEClass, GRANT_ON_PRINCIPAL_OPTIONS_BUILDER_IAM__VAR_NAME);
		createEAttribute(grantOnPrincipalOptionsBuilder_iamEClass, GRANT_ON_PRINCIPAL_OPTIONS_BUILDER_IAM__IDENTIFIER);
		createEAttribute(grantOnPrincipalOptionsBuilder_iamEClass,
				GRANT_ON_PRINCIPAL_OPTIONS_BUILDER_IAM__ADDITIONAL_CODE);

		userBuilder_iamEClass = createEClass(USER_BUILDER_IAM);
		createEAttribute(userBuilder_iamEClass,
				USER_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST);
		createEAttribute(userBuilder_iamEClass,
				USER_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST);
		createEAttribute(userBuilder_iamEClass,
				USER_BUILDER_IAM__PASSWORD_WITH_SECRET_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_SECRET_VALUE_AS_REFERENCE);
		createEAttribute(userBuilder_iamEClass, USER_BUILDER_IAM__PASSWORD_RESET_REQUIRED_JAVA_LANG_BOOLEAN_);
		createEAttribute(userBuilder_iamEClass, USER_BUILDER_IAM__PATH_JAVA_LANG_STRING_);
		createEAttribute(userBuilder_iamEClass,
				USER_BUILDER_IAM__PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE);
		createEAttribute(userBuilder_iamEClass, USER_BUILDER_IAM__USER_NAME_JAVA_LANG_STRING_);
		createEAttribute(userBuilder_iamEClass, USER_BUILDER_IAM__GENERATED_CLASS_NAME);
		createEAttribute(userBuilder_iamEClass, USER_BUILDER_IAM__VAR_NAME);
		createEAttribute(userBuilder_iamEClass, USER_BUILDER_IAM__IDENTIFIER);
		createEAttribute(userBuilder_iamEClass, USER_BUILDER_IAM__ADDITIONAL_CODE);

		grantOnPrincipalAndResourceOptionsBuilder_iamEClass = createEClass(
				GRANT_ON_PRINCIPAL_AND_RESOURCE_OPTIONS_BUILDER_IAM);
		createEAttribute(grantOnPrincipalAndResourceOptionsBuilder_iamEClass,
				GRANT_ON_PRINCIPAL_AND_RESOURCE_OPTIONS_BUILDER_IAM__RESOURCE_WITH_IRESOURCE_WITH_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IRESOURCE_WITH_POLICY_AS_REFERENCE);
		createEAttribute(grantOnPrincipalAndResourceOptionsBuilder_iamEClass,
				GRANT_ON_PRINCIPAL_AND_RESOURCE_OPTIONS_BUILDER_IAM__RESOURCE_POLICY_PRINCIPAL_WITH_IPRINCIPAL_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_REFERENCE);
		createEAttribute(grantOnPrincipalAndResourceOptionsBuilder_iamEClass,
				GRANT_ON_PRINCIPAL_AND_RESOURCE_OPTIONS_BUILDER_IAM__RESOURCE_SELF_ARNS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(grantOnPrincipalAndResourceOptionsBuilder_iamEClass,
				GRANT_ON_PRINCIPAL_AND_RESOURCE_OPTIONS_BUILDER_IAM__ACTIONS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(grantOnPrincipalAndResourceOptionsBuilder_iamEClass,
				GRANT_ON_PRINCIPAL_AND_RESOURCE_OPTIONS_BUILDER_IAM__GRANTEE_WITH_IGRANTABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGRANTABLE_AS_REFERENCE);
		createEAttribute(grantOnPrincipalAndResourceOptionsBuilder_iamEClass,
				GRANT_ON_PRINCIPAL_AND_RESOURCE_OPTIONS_BUILDER_IAM__RESOURCE_ARNS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(grantOnPrincipalAndResourceOptionsBuilder_iamEClass,
				GRANT_ON_PRINCIPAL_AND_RESOURCE_OPTIONS_BUILDER_IAM__GENERATED_CLASS_NAME);
		createEAttribute(grantOnPrincipalAndResourceOptionsBuilder_iamEClass,
				GRANT_ON_PRINCIPAL_AND_RESOURCE_OPTIONS_BUILDER_IAM__VAR_NAME);
		createEAttribute(grantOnPrincipalAndResourceOptionsBuilder_iamEClass,
				GRANT_ON_PRINCIPAL_AND_RESOURCE_OPTIONS_BUILDER_IAM__IDENTIFIER);
		createEAttribute(grantOnPrincipalAndResourceOptionsBuilder_iamEClass,
				GRANT_ON_PRINCIPAL_AND_RESOURCE_OPTIONS_BUILDER_IAM__ADDITIONAL_CODE);

		managedPolicyBuilder_iamEClass = createEClass(MANAGED_POLICY_BUILDER_IAM);
		createEAttribute(managedPolicyBuilder_iamEClass, MANAGED_POLICY_BUILDER_IAM__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(managedPolicyBuilder_iamEClass,
				MANAGED_POLICY_BUILDER_IAM__DOCUMENT_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE);
		createEAttribute(managedPolicyBuilder_iamEClass,
				MANAGED_POLICY_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST);
		createEAttribute(managedPolicyBuilder_iamEClass,
				MANAGED_POLICY_BUILDER_IAM__MANAGED_POLICY_NAME_JAVA_LANG_STRING_);
		createEAttribute(managedPolicyBuilder_iamEClass, MANAGED_POLICY_BUILDER_IAM__PATH_JAVA_LANG_STRING_);
		createEAttribute(managedPolicyBuilder_iamEClass,
				MANAGED_POLICY_BUILDER_IAM__ROLES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_LIST);
		createEAttribute(managedPolicyBuilder_iamEClass,
				MANAGED_POLICY_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST);
		createEAttribute(managedPolicyBuilder_iamEClass,
				MANAGED_POLICY_BUILDER_IAM__USERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IUSER_AS_LIST);
		createEAttribute(managedPolicyBuilder_iamEClass, MANAGED_POLICY_BUILDER_IAM__GENERATED_CLASS_NAME);
		createEAttribute(managedPolicyBuilder_iamEClass, MANAGED_POLICY_BUILDER_IAM__VAR_NAME);
		createEAttribute(managedPolicyBuilder_iamEClass, MANAGED_POLICY_BUILDER_IAM__IDENTIFIER);
		createEAttribute(managedPolicyBuilder_iamEClass, MANAGED_POLICY_BUILDER_IAM__ADDITIONAL_CODE);

		fromRoleArnOptionsBuilder_iamEClass = createEClass(FROM_ROLE_ARN_OPTIONS_BUILDER_IAM);
		createEAttribute(fromRoleArnOptionsBuilder_iamEClass,
				FROM_ROLE_ARN_OPTIONS_BUILDER_IAM__MUTABLE_JAVA_LANG_BOOLEAN_);
		createEAttribute(fromRoleArnOptionsBuilder_iamEClass, FROM_ROLE_ARN_OPTIONS_BUILDER_IAM__GENERATED_CLASS_NAME);
		createEAttribute(fromRoleArnOptionsBuilder_iamEClass, FROM_ROLE_ARN_OPTIONS_BUILDER_IAM__VAR_NAME);
		createEAttribute(fromRoleArnOptionsBuilder_iamEClass, FROM_ROLE_ARN_OPTIONS_BUILDER_IAM__IDENTIFIER);
		createEAttribute(fromRoleArnOptionsBuilder_iamEClass, FROM_ROLE_ARN_OPTIONS_BUILDER_IAM__ADDITIONAL_CODE);

		policyDocumentBuilder_iamEClass = createEClass(POLICY_DOCUMENT_BUILDER_IAM);
		createEAttribute(policyDocumentBuilder_iamEClass, POLICY_DOCUMENT_BUILDER_IAM__ASSIGN_SIDS_JAVA_LANG_BOOLEAN_);
		createEAttribute(policyDocumentBuilder_iamEClass,
				POLICY_DOCUMENT_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST);
		createEAttribute(policyDocumentBuilder_iamEClass, POLICY_DOCUMENT_BUILDER_IAM__GENERATED_CLASS_NAME);
		createEAttribute(policyDocumentBuilder_iamEClass, POLICY_DOCUMENT_BUILDER_IAM__VAR_NAME);
		createEAttribute(policyDocumentBuilder_iamEClass, POLICY_DOCUMENT_BUILDER_IAM__IDENTIFIER);
		createEAttribute(policyDocumentBuilder_iamEClass, POLICY_DOCUMENT_BUILDER_IAM__ADDITIONAL_CODE);

		policyBuilder_iamEClass = createEClass(POLICY_BUILDER_IAM);
		createEAttribute(policyBuilder_iamEClass, POLICY_BUILDER_IAM__FORCE_JAVA_LANG_BOOLEAN_);
		createEAttribute(policyBuilder_iamEClass,
				POLICY_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST);
		createEAttribute(policyBuilder_iamEClass, POLICY_BUILDER_IAM__POLICY_NAME_JAVA_LANG_STRING_);
		createEAttribute(policyBuilder_iamEClass,
				POLICY_BUILDER_IAM__ROLES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_LIST);
		createEAttribute(policyBuilder_iamEClass,
				POLICY_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST);
		createEAttribute(policyBuilder_iamEClass,
				POLICY_BUILDER_IAM__USERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IUSER_AS_LIST);
		createEAttribute(policyBuilder_iamEClass, POLICY_BUILDER_IAM__GENERATED_CLASS_NAME);
		createEAttribute(policyBuilder_iamEClass, POLICY_BUILDER_IAM__VAR_NAME);
		createEAttribute(policyBuilder_iamEClass, POLICY_BUILDER_IAM__IDENTIFIER);
		createEAttribute(policyBuilder_iamEClass, POLICY_BUILDER_IAM__ADDITIONAL_CODE);

		policyDocumentPropsBuilder_iamEClass = createEClass(POLICY_DOCUMENT_PROPS_BUILDER_IAM);
		createEAttribute(policyDocumentPropsBuilder_iamEClass,
				POLICY_DOCUMENT_PROPS_BUILDER_IAM__ASSIGN_SIDS_JAVA_LANG_BOOLEAN_);
		createEAttribute(policyDocumentPropsBuilder_iamEClass,
				POLICY_DOCUMENT_PROPS_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST);
		createEAttribute(policyDocumentPropsBuilder_iamEClass, POLICY_DOCUMENT_PROPS_BUILDER_IAM__GENERATED_CLASS_NAME);
		createEAttribute(policyDocumentPropsBuilder_iamEClass, POLICY_DOCUMENT_PROPS_BUILDER_IAM__VAR_NAME);
		createEAttribute(policyDocumentPropsBuilder_iamEClass, POLICY_DOCUMENT_PROPS_BUILDER_IAM__IDENTIFIER);
		createEAttribute(policyDocumentPropsBuilder_iamEClass, POLICY_DOCUMENT_PROPS_BUILDER_IAM__ADDITIONAL_CODE);

		userPropsBuilder_iamEClass = createEClass(USER_PROPS_BUILDER_IAM);
		createEAttribute(userPropsBuilder_iamEClass,
				USER_PROPS_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST);
		createEAttribute(userPropsBuilder_iamEClass,
				USER_PROPS_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST);
		createEAttribute(userPropsBuilder_iamEClass,
				USER_PROPS_BUILDER_IAM__PASSWORD_WITH_SECRET_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_SECRET_VALUE_AS_REFERENCE);
		createEAttribute(userPropsBuilder_iamEClass,
				USER_PROPS_BUILDER_IAM__PASSWORD_RESET_REQUIRED_JAVA_LANG_BOOLEAN_);
		createEAttribute(userPropsBuilder_iamEClass, USER_PROPS_BUILDER_IAM__PATH_JAVA_LANG_STRING_);
		createEAttribute(userPropsBuilder_iamEClass,
				USER_PROPS_BUILDER_IAM__PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE);
		createEAttribute(userPropsBuilder_iamEClass, USER_PROPS_BUILDER_IAM__USER_NAME_JAVA_LANG_STRING_);
		createEAttribute(userPropsBuilder_iamEClass, USER_PROPS_BUILDER_IAM__GENERATED_CLASS_NAME);
		createEAttribute(userPropsBuilder_iamEClass, USER_PROPS_BUILDER_IAM__VAR_NAME);
		createEAttribute(userPropsBuilder_iamEClass, USER_PROPS_BUILDER_IAM__IDENTIFIER);
		createEAttribute(userPropsBuilder_iamEClass, USER_PROPS_BUILDER_IAM__ADDITIONAL_CODE);

		addToResourcePolicyResultBuilder_iamEClass = createEClass(ADD_TO_RESOURCE_POLICY_RESULT_BUILDER_IAM);
		createEAttribute(addToResourcePolicyResultBuilder_iamEClass,
				ADD_TO_RESOURCE_POLICY_RESULT_BUILDER_IAM__STATEMENT_ADDED_JAVA_LANG_BOOLEAN_);
		createEAttribute(addToResourcePolicyResultBuilder_iamEClass,
				ADD_TO_RESOURCE_POLICY_RESULT_BUILDER_IAM__POLICY_DEPENDABLE_WITH_IDEPENDABLE_SOFTWARE_AMAZON_AWSCDK_CORE_IDEPENDABLE_AS_REFERENCE);
		createEAttribute(addToResourcePolicyResultBuilder_iamEClass,
				ADD_TO_RESOURCE_POLICY_RESULT_BUILDER_IAM__GENERATED_CLASS_NAME);
		createEAttribute(addToResourcePolicyResultBuilder_iamEClass,
				ADD_TO_RESOURCE_POLICY_RESULT_BUILDER_IAM__VAR_NAME);
		createEAttribute(addToResourcePolicyResultBuilder_iamEClass,
				ADD_TO_RESOURCE_POLICY_RESULT_BUILDER_IAM__IDENTIFIER);
		createEAttribute(addToResourcePolicyResultBuilder_iamEClass,
				ADD_TO_RESOURCE_POLICY_RESULT_BUILDER_IAM__ADDITIONAL_CODE);

		policyStatementPropsBuilder_iamEClass = createEClass(POLICY_STATEMENT_PROPS_BUILDER_IAM);
		createEAttribute(policyStatementPropsBuilder_iamEClass,
				POLICY_STATEMENT_PROPS_BUILDER_IAM__ACTIONS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(policyStatementPropsBuilder_iamEClass,
				POLICY_STATEMENT_PROPS_BUILDER_IAM__CONDITIONS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP);
		createEAttribute(policyStatementPropsBuilder_iamEClass,
				POLICY_STATEMENT_PROPS_BUILDER_IAM__EFFECT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_EFFECT_);
		createEAttribute(policyStatementPropsBuilder_iamEClass,
				POLICY_STATEMENT_PROPS_BUILDER_IAM__NOT_ACTIONS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(policyStatementPropsBuilder_iamEClass,
				POLICY_STATEMENT_PROPS_BUILDER_IAM__NOT_PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST);
		createEAttribute(policyStatementPropsBuilder_iamEClass,
				POLICY_STATEMENT_PROPS_BUILDER_IAM__NOT_RESOURCES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(policyStatementPropsBuilder_iamEClass,
				POLICY_STATEMENT_PROPS_BUILDER_IAM__PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST);
		createEAttribute(policyStatementPropsBuilder_iamEClass,
				POLICY_STATEMENT_PROPS_BUILDER_IAM__RESOURCES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(policyStatementPropsBuilder_iamEClass,
				POLICY_STATEMENT_PROPS_BUILDER_IAM__SID_JAVA_LANG_STRING_);
		createEAttribute(policyStatementPropsBuilder_iamEClass,
				POLICY_STATEMENT_PROPS_BUILDER_IAM__GENERATED_CLASS_NAME);
		createEAttribute(policyStatementPropsBuilder_iamEClass, POLICY_STATEMENT_PROPS_BUILDER_IAM__VAR_NAME);
		createEAttribute(policyStatementPropsBuilder_iamEClass, POLICY_STATEMENT_PROPS_BUILDER_IAM__IDENTIFIER);
		createEAttribute(policyStatementPropsBuilder_iamEClass, POLICY_STATEMENT_PROPS_BUILDER_IAM__ADDITIONAL_CODE);

		addToPrincipalPolicyResultBuilder_iamEClass = createEClass(ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM);
		createEAttribute(addToPrincipalPolicyResultBuilder_iamEClass,
				ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__STATEMENT_ADDED_JAVA_LANG_BOOLEAN_);
		createEAttribute(addToPrincipalPolicyResultBuilder_iamEClass,
				ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__POLICY_DEPENDABLE_WITH_IDEPENDABLE_SOFTWARE_AMAZON_AWSCDK_CORE_IDEPENDABLE_AS_REFERENCE);
		createEAttribute(addToPrincipalPolicyResultBuilder_iamEClass,
				ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__GENERATED_CLASS_NAME);
		createEAttribute(addToPrincipalPolicyResultBuilder_iamEClass,
				ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__VAR_NAME);
		createEAttribute(addToPrincipalPolicyResultBuilder_iamEClass,
				ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__IDENTIFIER);
		createEAttribute(addToPrincipalPolicyResultBuilder_iamEClass,
				ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__ADDITIONAL_CODE);

		policyStatementBuilder_iamEClass = createEClass(POLICY_STATEMENT_BUILDER_IAM);
		createEAttribute(policyStatementBuilder_iamEClass,
				POLICY_STATEMENT_BUILDER_IAM__ACTIONS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(policyStatementBuilder_iamEClass,
				POLICY_STATEMENT_BUILDER_IAM__CONDITIONS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP);
		createEAttribute(policyStatementBuilder_iamEClass,
				POLICY_STATEMENT_BUILDER_IAM__EFFECT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_EFFECT_);
		createEAttribute(policyStatementBuilder_iamEClass,
				POLICY_STATEMENT_BUILDER_IAM__NOT_ACTIONS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(policyStatementBuilder_iamEClass,
				POLICY_STATEMENT_BUILDER_IAM__NOT_PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST);
		createEAttribute(policyStatementBuilder_iamEClass,
				POLICY_STATEMENT_BUILDER_IAM__NOT_RESOURCES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(policyStatementBuilder_iamEClass,
				POLICY_STATEMENT_BUILDER_IAM__PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST);
		createEAttribute(policyStatementBuilder_iamEClass,
				POLICY_STATEMENT_BUILDER_IAM__RESOURCES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(policyStatementBuilder_iamEClass, POLICY_STATEMENT_BUILDER_IAM__SID_JAVA_LANG_STRING_);
		createEAttribute(policyStatementBuilder_iamEClass, POLICY_STATEMENT_BUILDER_IAM__GENERATED_CLASS_NAME);
		createEAttribute(policyStatementBuilder_iamEClass, POLICY_STATEMENT_BUILDER_IAM__VAR_NAME);
		createEAttribute(policyStatementBuilder_iamEClass, POLICY_STATEMENT_BUILDER_IAM__IDENTIFIER);
		createEAttribute(policyStatementBuilder_iamEClass, POLICY_STATEMENT_BUILDER_IAM__ADDITIONAL_CODE);

		servicePrincipalOptsBuilder_iamEClass = createEClass(SERVICE_PRINCIPAL_OPTS_BUILDER_IAM);
		createEAttribute(servicePrincipalOptsBuilder_iamEClass,
				SERVICE_PRINCIPAL_OPTS_BUILDER_IAM__CONDITIONS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP);
		createEAttribute(servicePrincipalOptsBuilder_iamEClass,
				SERVICE_PRINCIPAL_OPTS_BUILDER_IAM__REGION_JAVA_LANG_STRING_);
		createEAttribute(servicePrincipalOptsBuilder_iamEClass,
				SERVICE_PRINCIPAL_OPTS_BUILDER_IAM__GENERATED_CLASS_NAME);
		createEAttribute(servicePrincipalOptsBuilder_iamEClass, SERVICE_PRINCIPAL_OPTS_BUILDER_IAM__VAR_NAME);
		createEAttribute(servicePrincipalOptsBuilder_iamEClass, SERVICE_PRINCIPAL_OPTS_BUILDER_IAM__IDENTIFIER);
		createEAttribute(servicePrincipalOptsBuilder_iamEClass, SERVICE_PRINCIPAL_OPTS_BUILDER_IAM__ADDITIONAL_CODE);

		unknownPrincipalBuilder_iamEClass = createEClass(UNKNOWN_PRINCIPAL_BUILDER_IAM);
		createEAttribute(unknownPrincipalBuilder_iamEClass,
				UNKNOWN_PRINCIPAL_BUILDER_IAM__RESOURCE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE);
		createEAttribute(unknownPrincipalBuilder_iamEClass, UNKNOWN_PRINCIPAL_BUILDER_IAM__GENERATED_CLASS_NAME);
		createEAttribute(unknownPrincipalBuilder_iamEClass, UNKNOWN_PRINCIPAL_BUILDER_IAM__VAR_NAME);
		createEAttribute(unknownPrincipalBuilder_iamEClass, UNKNOWN_PRINCIPAL_BUILDER_IAM__IDENTIFIER);
		createEAttribute(unknownPrincipalBuilder_iamEClass, UNKNOWN_PRINCIPAL_BUILDER_IAM__ADDITIONAL_CODE);

		managedPolicyPropsBuilder_iamEClass = createEClass(MANAGED_POLICY_PROPS_BUILDER_IAM);
		createEAttribute(managedPolicyPropsBuilder_iamEClass,
				MANAGED_POLICY_PROPS_BUILDER_IAM__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(managedPolicyPropsBuilder_iamEClass,
				MANAGED_POLICY_PROPS_BUILDER_IAM__DOCUMENT_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE);
		createEAttribute(managedPolicyPropsBuilder_iamEClass,
				MANAGED_POLICY_PROPS_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST);
		createEAttribute(managedPolicyPropsBuilder_iamEClass,
				MANAGED_POLICY_PROPS_BUILDER_IAM__MANAGED_POLICY_NAME_JAVA_LANG_STRING_);
		createEAttribute(managedPolicyPropsBuilder_iamEClass, MANAGED_POLICY_PROPS_BUILDER_IAM__PATH_JAVA_LANG_STRING_);
		createEAttribute(managedPolicyPropsBuilder_iamEClass,
				MANAGED_POLICY_PROPS_BUILDER_IAM__ROLES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_LIST);
		createEAttribute(managedPolicyPropsBuilder_iamEClass,
				MANAGED_POLICY_PROPS_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST);
		createEAttribute(managedPolicyPropsBuilder_iamEClass,
				MANAGED_POLICY_PROPS_BUILDER_IAM__USERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IUSER_AS_LIST);
		createEAttribute(managedPolicyPropsBuilder_iamEClass, MANAGED_POLICY_PROPS_BUILDER_IAM__GENERATED_CLASS_NAME);
		createEAttribute(managedPolicyPropsBuilder_iamEClass, MANAGED_POLICY_PROPS_BUILDER_IAM__VAR_NAME);
		createEAttribute(managedPolicyPropsBuilder_iamEClass, MANAGED_POLICY_PROPS_BUILDER_IAM__IDENTIFIER);
		createEAttribute(managedPolicyPropsBuilder_iamEClass, MANAGED_POLICY_PROPS_BUILDER_IAM__ADDITIONAL_CODE);

		openIdConnectProviderBuilder_iamEClass = createEClass(OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM);
		createEAttribute(openIdConnectProviderBuilder_iamEClass,
				OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__URL_JAVA_LANG_STRING_);
		createEAttribute(openIdConnectProviderBuilder_iamEClass,
				OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__CLIENT_IDS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(openIdConnectProviderBuilder_iamEClass,
				OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__THUMBPRINTS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(openIdConnectProviderBuilder_iamEClass,
				OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__GENERATED_CLASS_NAME);
		createEAttribute(openIdConnectProviderBuilder_iamEClass, OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__VAR_NAME);
		createEAttribute(openIdConnectProviderBuilder_iamEClass, OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__IDENTIFIER);
		createEAttribute(openIdConnectProviderBuilder_iamEClass, OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__ADDITIONAL_CODE);

		lazyRoleBuilder_iamEClass = createEClass(LAZY_ROLE_BUILDER_IAM);
		createEAttribute(lazyRoleBuilder_iamEClass,
				LAZY_ROLE_BUILDER_IAM__ASSUMED_BY_WITH_IPRINCIPAL_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_REFERENCE);
		createEAttribute(lazyRoleBuilder_iamEClass, LAZY_ROLE_BUILDER_IAM__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(lazyRoleBuilder_iamEClass, LAZY_ROLE_BUILDER_IAM__EXTERNAL_ID_JAVA_LANG_STRING_);
		createEAttribute(lazyRoleBuilder_iamEClass, LAZY_ROLE_BUILDER_IAM__EXTERNAL_IDS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(lazyRoleBuilder_iamEClass,
				LAZY_ROLE_BUILDER_IAM__INLINE_POLICIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_MAP);
		createEAttribute(lazyRoleBuilder_iamEClass,
				LAZY_ROLE_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST);
		createEAttribute(lazyRoleBuilder_iamEClass,
				LAZY_ROLE_BUILDER_IAM__MAX_SESSION_DURATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE);
		createEAttribute(lazyRoleBuilder_iamEClass, LAZY_ROLE_BUILDER_IAM__PATH_JAVA_LANG_STRING_);
		createEAttribute(lazyRoleBuilder_iamEClass,
				LAZY_ROLE_BUILDER_IAM__PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE);
		createEAttribute(lazyRoleBuilder_iamEClass, LAZY_ROLE_BUILDER_IAM__ROLE_NAME_JAVA_LANG_STRING_);
		createEAttribute(lazyRoleBuilder_iamEClass, LAZY_ROLE_BUILDER_IAM__GENERATED_CLASS_NAME);
		createEAttribute(lazyRoleBuilder_iamEClass, LAZY_ROLE_BUILDER_IAM__VAR_NAME);
		createEAttribute(lazyRoleBuilder_iamEClass, LAZY_ROLE_BUILDER_IAM__IDENTIFIER);
		createEAttribute(lazyRoleBuilder_iamEClass, LAZY_ROLE_BUILDER_IAM__ADDITIONAL_CODE);

		commonGrantOptionsBuilder_iamEClass = createEClass(COMMON_GRANT_OPTIONS_BUILDER_IAM);
		createEAttribute(commonGrantOptionsBuilder_iamEClass,
				COMMON_GRANT_OPTIONS_BUILDER_IAM__ACTIONS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(commonGrantOptionsBuilder_iamEClass,
				COMMON_GRANT_OPTIONS_BUILDER_IAM__GRANTEE_WITH_IGRANTABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGRANTABLE_AS_REFERENCE);
		createEAttribute(commonGrantOptionsBuilder_iamEClass,
				COMMON_GRANT_OPTIONS_BUILDER_IAM__RESOURCE_ARNS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(commonGrantOptionsBuilder_iamEClass, COMMON_GRANT_OPTIONS_BUILDER_IAM__GENERATED_CLASS_NAME);
		createEAttribute(commonGrantOptionsBuilder_iamEClass, COMMON_GRANT_OPTIONS_BUILDER_IAM__VAR_NAME);
		createEAttribute(commonGrantOptionsBuilder_iamEClass, COMMON_GRANT_OPTIONS_BUILDER_IAM__IDENTIFIER);
		createEAttribute(commonGrantOptionsBuilder_iamEClass, COMMON_GRANT_OPTIONS_BUILDER_IAM__ADDITIONAL_CODE);

		grantWithResourceOptionsBuilder_iamEClass = createEClass(GRANT_WITH_RESOURCE_OPTIONS_BUILDER_IAM);
		createEAttribute(grantWithResourceOptionsBuilder_iamEClass,
				GRANT_WITH_RESOURCE_OPTIONS_BUILDER_IAM__RESOURCE_WITH_IRESOURCE_WITH_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IRESOURCE_WITH_POLICY_AS_REFERENCE);
		createEAttribute(grantWithResourceOptionsBuilder_iamEClass,
				GRANT_WITH_RESOURCE_OPTIONS_BUILDER_IAM__RESOURCE_SELF_ARNS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(grantWithResourceOptionsBuilder_iamEClass,
				GRANT_WITH_RESOURCE_OPTIONS_BUILDER_IAM__ACTIONS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(grantWithResourceOptionsBuilder_iamEClass,
				GRANT_WITH_RESOURCE_OPTIONS_BUILDER_IAM__GRANTEE_WITH_IGRANTABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGRANTABLE_AS_REFERENCE);
		createEAttribute(grantWithResourceOptionsBuilder_iamEClass,
				GRANT_WITH_RESOURCE_OPTIONS_BUILDER_IAM__RESOURCE_ARNS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(grantWithResourceOptionsBuilder_iamEClass,
				GRANT_WITH_RESOURCE_OPTIONS_BUILDER_IAM__GENERATED_CLASS_NAME);
		createEAttribute(grantWithResourceOptionsBuilder_iamEClass, GRANT_WITH_RESOURCE_OPTIONS_BUILDER_IAM__VAR_NAME);
		createEAttribute(grantWithResourceOptionsBuilder_iamEClass,
				GRANT_WITH_RESOURCE_OPTIONS_BUILDER_IAM__IDENTIFIER);
		createEAttribute(grantWithResourceOptionsBuilder_iamEClass,
				GRANT_WITH_RESOURCE_OPTIONS_BUILDER_IAM__ADDITIONAL_CODE);

		lazyRolePropsBuilder_iamEClass = createEClass(LAZY_ROLE_PROPS_BUILDER_IAM);
		createEAttribute(lazyRolePropsBuilder_iamEClass,
				LAZY_ROLE_PROPS_BUILDER_IAM__ASSUMED_BY_WITH_IPRINCIPAL_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_REFERENCE);
		createEAttribute(lazyRolePropsBuilder_iamEClass, LAZY_ROLE_PROPS_BUILDER_IAM__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(lazyRolePropsBuilder_iamEClass, LAZY_ROLE_PROPS_BUILDER_IAM__EXTERNAL_ID_JAVA_LANG_STRING_);
		createEAttribute(lazyRolePropsBuilder_iamEClass,
				LAZY_ROLE_PROPS_BUILDER_IAM__EXTERNAL_IDS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(lazyRolePropsBuilder_iamEClass,
				LAZY_ROLE_PROPS_BUILDER_IAM__INLINE_POLICIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_MAP);
		createEAttribute(lazyRolePropsBuilder_iamEClass,
				LAZY_ROLE_PROPS_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST);
		createEAttribute(lazyRolePropsBuilder_iamEClass,
				LAZY_ROLE_PROPS_BUILDER_IAM__MAX_SESSION_DURATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE);
		createEAttribute(lazyRolePropsBuilder_iamEClass, LAZY_ROLE_PROPS_BUILDER_IAM__PATH_JAVA_LANG_STRING_);
		createEAttribute(lazyRolePropsBuilder_iamEClass,
				LAZY_ROLE_PROPS_BUILDER_IAM__PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE);
		createEAttribute(lazyRolePropsBuilder_iamEClass, LAZY_ROLE_PROPS_BUILDER_IAM__ROLE_NAME_JAVA_LANG_STRING_);
		createEAttribute(lazyRolePropsBuilder_iamEClass, LAZY_ROLE_PROPS_BUILDER_IAM__GENERATED_CLASS_NAME);
		createEAttribute(lazyRolePropsBuilder_iamEClass, LAZY_ROLE_PROPS_BUILDER_IAM__VAR_NAME);
		createEAttribute(lazyRolePropsBuilder_iamEClass, LAZY_ROLE_PROPS_BUILDER_IAM__IDENTIFIER);
		createEAttribute(lazyRolePropsBuilder_iamEClass, LAZY_ROLE_PROPS_BUILDER_IAM__ADDITIONAL_CODE);

		policyPropsBuilder_iamEClass = createEClass(POLICY_PROPS_BUILDER_IAM);
		createEAttribute(policyPropsBuilder_iamEClass, POLICY_PROPS_BUILDER_IAM__FORCE_JAVA_LANG_BOOLEAN_);
		createEAttribute(policyPropsBuilder_iamEClass,
				POLICY_PROPS_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST);
		createEAttribute(policyPropsBuilder_iamEClass, POLICY_PROPS_BUILDER_IAM__POLICY_NAME_JAVA_LANG_STRING_);
		createEAttribute(policyPropsBuilder_iamEClass,
				POLICY_PROPS_BUILDER_IAM__ROLES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_LIST);
		createEAttribute(policyPropsBuilder_iamEClass,
				POLICY_PROPS_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST);
		createEAttribute(policyPropsBuilder_iamEClass,
				POLICY_PROPS_BUILDER_IAM__USERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IUSER_AS_LIST);
		createEAttribute(policyPropsBuilder_iamEClass, POLICY_PROPS_BUILDER_IAM__GENERATED_CLASS_NAME);
		createEAttribute(policyPropsBuilder_iamEClass, POLICY_PROPS_BUILDER_IAM__VAR_NAME);
		createEAttribute(policyPropsBuilder_iamEClass, POLICY_PROPS_BUILDER_IAM__IDENTIFIER);
		createEAttribute(policyPropsBuilder_iamEClass, POLICY_PROPS_BUILDER_IAM__ADDITIONAL_CODE);

		groupBuilder_iamEClass = createEClass(GROUP_BUILDER_IAM);
		createEAttribute(groupBuilder_iamEClass, GROUP_BUILDER_IAM__GROUP_NAME_JAVA_LANG_STRING_);
		createEAttribute(groupBuilder_iamEClass,
				GROUP_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST);
		createEAttribute(groupBuilder_iamEClass, GROUP_BUILDER_IAM__PATH_JAVA_LANG_STRING_);
		createEAttribute(groupBuilder_iamEClass, GROUP_BUILDER_IAM__GENERATED_CLASS_NAME);
		createEAttribute(groupBuilder_iamEClass, GROUP_BUILDER_IAM__VAR_NAME);
		createEAttribute(groupBuilder_iamEClass, GROUP_BUILDER_IAM__IDENTIFIER);
		createEAttribute(groupBuilder_iamEClass, GROUP_BUILDER_IAM__ADDITIONAL_CODE);

		// Create enums
		effectEEnum = createEEnum(EFFECT);
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
		initEClass(rolePropsBuilder_iamEClass, RolePropsBuilder_iam.class, "RolePropsBuilder_iam", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getRolePropsBuilder_iam_AssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference(),
				ecorePackage.getEString(),
				"assumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference", null, 0, 1,
				RolePropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRolePropsBuilder_iam_Description_java_lang_String_(), ecorePackage.getEString(),
				"description_java_lang_String_", null, 0, 1, RolePropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRolePropsBuilder_iam_ExternalId_java_lang_String_(), ecorePackage.getEString(),
				"externalId_java_lang_String_", null, 0, 1, RolePropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRolePropsBuilder_iam_ExternalIds_java_lang_String_AsList(), ecorePackage.getEString(),
				"externalIds_java_lang_String_AsList", null, 0, 1, RolePropsBuilder_iam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRolePropsBuilder_iam_InlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap(),
				ecorePackage.getEString(),
				"inlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap", null, 0, 1,
				RolePropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRolePropsBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList(),
				ecorePackage.getEString(), "managedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList",
				null, 0, 1, RolePropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRolePropsBuilder_iam_MaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference(),
				ecorePackage.getEString(),
				"maxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference", null, 0, 1,
				RolePropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRolePropsBuilder_iam_Path_java_lang_String_(), ecorePackage.getEString(),
				"path_java_lang_String_", null, 0, 1, RolePropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRolePropsBuilder_iam_PermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference(),
				ecorePackage.getEString(),
				"permissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference",
				null, 0, 1, RolePropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRolePropsBuilder_iam_RoleName_java_lang_String_(), ecorePackage.getEString(),
				"roleName_java_lang_String_", null, 0, 1, RolePropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRolePropsBuilder_iam_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.iam.RoleProps", 0, 1, RolePropsBuilder_iam.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRolePropsBuilder_iam_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				RolePropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRolePropsBuilder_iam_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				RolePropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRolePropsBuilder_iam_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0,
				1, RolePropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unknownPrincipalPropsBuilder_iamEClass, UnknownPrincipalPropsBuilder_iam.class,
				"UnknownPrincipalPropsBuilder_iam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getUnknownPrincipalPropsBuilder_iam_ResourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference(),
				ecorePackage.getEString(), "resourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference",
				null, 0, 1, UnknownPrincipalPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnknownPrincipalPropsBuilder_iam_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.iam.UnknownPrincipalProps", 0, 1,
				UnknownPrincipalPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnknownPrincipalPropsBuilder_iam_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				UnknownPrincipalPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnknownPrincipalPropsBuilder_iam_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, UnknownPrincipalPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnknownPrincipalPropsBuilder_iam_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, UnknownPrincipalPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(openIdConnectProviderPropsBuilder_iamEClass, OpenIdConnectProviderPropsBuilder_iam.class,
				"OpenIdConnectProviderPropsBuilder_iam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpenIdConnectProviderPropsBuilder_iam_Url_java_lang_String_(), ecorePackage.getEString(),
				"url_java_lang_String_", null, 0, 1, OpenIdConnectProviderPropsBuilder_iam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenIdConnectProviderPropsBuilder_iam_ClientIds_java_lang_String_AsList(),
				ecorePackage.getEString(), "clientIds_java_lang_String_AsList", null, 0, 1,
				OpenIdConnectProviderPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenIdConnectProviderPropsBuilder_iam_Thumbprints_java_lang_String_AsList(),
				ecorePackage.getEString(), "thumbprints_java_lang_String_AsList", null, 0, 1,
				OpenIdConnectProviderPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenIdConnectProviderPropsBuilder_iam_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.iam.OpenIdConnectProviderProps", 0, 1,
				OpenIdConnectProviderPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenIdConnectProviderPropsBuilder_iam_VarName(), ecorePackage.getEString(), "varName", null,
				0, 1, OpenIdConnectProviderPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenIdConnectProviderPropsBuilder_iam_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, OpenIdConnectProviderPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenIdConnectProviderPropsBuilder_iam_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, OpenIdConnectProviderPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupPropsBuilder_iamEClass, GroupPropsBuilder_iam.class, "GroupPropsBuilder_iam", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroupPropsBuilder_iam_GroupName_java_lang_String_(), ecorePackage.getEString(),
				"groupName_java_lang_String_", null, 0, 1, GroupPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getGroupPropsBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList(),
				ecorePackage.getEString(), "managedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList",
				null, 0, 1, GroupPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupPropsBuilder_iam_Path_java_lang_String_(), ecorePackage.getEString(),
				"path_java_lang_String_", null, 0, 1, GroupPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupPropsBuilder_iam_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.iam.GroupProps", 0, 1, GroupPropsBuilder_iam.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupPropsBuilder_iam_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				GroupPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupPropsBuilder_iam_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				GroupPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupPropsBuilder_iam_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0,
				1, GroupPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleBuilder_iamEClass, RoleBuilder_iam.class, "RoleBuilder_iam", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getRoleBuilder_iam_AssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference(),
				ecorePackage.getEString(),
				"assumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference", null, 0, 1,
				RoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleBuilder_iam_Description_java_lang_String_(), ecorePackage.getEString(),
				"description_java_lang_String_", null, 0, 1, RoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleBuilder_iam_ExternalId_java_lang_String_(), ecorePackage.getEString(),
				"externalId_java_lang_String_", null, 0, 1, RoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleBuilder_iam_ExternalIds_java_lang_String_AsList(), ecorePackage.getEString(),
				"externalIds_java_lang_String_AsList", null, 0, 1, RoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRoleBuilder_iam_InlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap(),
				ecorePackage.getEString(),
				"inlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap", null, 0, 1,
				RoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList(),
				ecorePackage.getEString(), "managedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList",
				null, 0, 1, RoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRoleBuilder_iam_MaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference(),
				ecorePackage.getEString(),
				"maxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference", null, 0, 1,
				RoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleBuilder_iam_Path_java_lang_String_(), ecorePackage.getEString(), "path_java_lang_String_",
				null, 0, 1, RoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRoleBuilder_iam_PermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference(),
				ecorePackage.getEString(),
				"permissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference",
				null, 0, 1, RoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleBuilder_iam_RoleName_java_lang_String_(), ecorePackage.getEString(),
				"roleName_java_lang_String_", null, 0, 1, RoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleBuilder_iam_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.iam.Role", 0, 1, RoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleBuilder_iam_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				RoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleBuilder_iam_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				RoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleBuilder_iam_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0, 1,
				RoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(servicePrincipalBuilder_iamEClass, ServicePrincipalBuilder_iam.class, "ServicePrincipalBuilder_iam",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServicePrincipalBuilder_iam_Conditions_java_lang_String__java_lang_Object_AsMap(),
				ecorePackage.getEString(), "conditions_java_lang_String__java_lang_Object_AsMap", null, 0, 1,
				ServicePrincipalBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServicePrincipalBuilder_iam_Region_java_lang_String_(), ecorePackage.getEString(),
				"region_java_lang_String_", null, 0, 1, ServicePrincipalBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServicePrincipalBuilder_iam_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.iam.ServicePrincipal", 0, 1,
				ServicePrincipalBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServicePrincipalBuilder_iam_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				ServicePrincipalBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServicePrincipalBuilder_iam_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				ServicePrincipalBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServicePrincipalBuilder_iam_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, ServicePrincipalBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(grantOnPrincipalOptionsBuilder_iamEClass, GrantOnPrincipalOptionsBuilder_iam.class,
				"GrantOnPrincipalOptionsBuilder_iam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getGrantOnPrincipalOptionsBuilder_iam_ScopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference(),
				ecorePackage.getEString(), "scopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference",
				null, 0, 1, GrantOnPrincipalOptionsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrantOnPrincipalOptionsBuilder_iam_Actions_java_lang_String_AsList(),
				ecorePackage.getEString(), "actions_java_lang_String_AsList", null, 0, 1,
				GrantOnPrincipalOptionsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getGrantOnPrincipalOptionsBuilder_iam_GranteeWithIGrantable_software_amazon_awscdk_services_iam_IGrantable_AsReference(),
				ecorePackage.getEString(),
				"granteeWithIGrantable_software_amazon_awscdk_services_iam_IGrantable_AsReference", null, 0, 1,
				GrantOnPrincipalOptionsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrantOnPrincipalOptionsBuilder_iam_ResourceArns_java_lang_String_AsList(),
				ecorePackage.getEString(), "resourceArns_java_lang_String_AsList", null, 0, 1,
				GrantOnPrincipalOptionsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrantOnPrincipalOptionsBuilder_iam_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.iam.GrantOnPrincipalOptions", 0, 1,
				GrantOnPrincipalOptionsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrantOnPrincipalOptionsBuilder_iam_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, GrantOnPrincipalOptionsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrantOnPrincipalOptionsBuilder_iam_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, GrantOnPrincipalOptionsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrantOnPrincipalOptionsBuilder_iam_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, GrantOnPrincipalOptionsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userBuilder_iamEClass, UserBuilder_iam.class, "UserBuilder_iam", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserBuilder_iam_Groups_software_amazon_awscdk_services_iam_IGroup_AsList(),
				ecorePackage.getEString(), "groups_software_amazon_awscdk_services_iam_IGroup_AsList", null, 0, 1,
				UserBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList(),
				ecorePackage.getEString(), "managedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList",
				null, 0, 1, UserBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserBuilder_iam_PasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference(),
				ecorePackage.getEString(),
				"passwordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference", null, 0, 1,
				UserBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserBuilder_iam_PasswordResetRequired_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"passwordResetRequired_java_lang_Boolean_", null, 0, 1, UserBuilder_iam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserBuilder_iam_Path_java_lang_String_(), ecorePackage.getEString(), "path_java_lang_String_",
				null, 0, 1, UserBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getUserBuilder_iam_PermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference(),
				ecorePackage.getEString(),
				"permissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference",
				null, 0, 1, UserBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserBuilder_iam_UserName_java_lang_String_(), ecorePackage.getEString(),
				"userName_java_lang_String_", null, 0, 1, UserBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserBuilder_iam_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.iam.User", 0, 1, UserBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserBuilder_iam_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				UserBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserBuilder_iam_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				UserBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserBuilder_iam_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0, 1,
				UserBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(grantOnPrincipalAndResourceOptionsBuilder_iamEClass,
				GrantOnPrincipalAndResourceOptionsBuilder_iam.class, "GrantOnPrincipalAndResourceOptionsBuilder_iam",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getGrantOnPrincipalAndResourceOptionsBuilder_iam_ResourceWithIResourceWithPolicy_software_amazon_awscdk_services_iam_IResourceWithPolicy_AsReference(),
				ecorePackage.getEString(),
				"resourceWithIResourceWithPolicy_software_amazon_awscdk_services_iam_IResourceWithPolicy_AsReference",
				null, 0, 1, GrantOnPrincipalAndResourceOptionsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getGrantOnPrincipalAndResourceOptionsBuilder_iam_ResourcePolicyPrincipalWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference(),
				ecorePackage.getEString(),
				"resourcePolicyPrincipalWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference",
				null, 0, 1, GrantOnPrincipalAndResourceOptionsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrantOnPrincipalAndResourceOptionsBuilder_iam_ResourceSelfArns_java_lang_String_AsList(),
				ecorePackage.getEString(), "resourceSelfArns_java_lang_String_AsList", null, 0, 1,
				GrantOnPrincipalAndResourceOptionsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrantOnPrincipalAndResourceOptionsBuilder_iam_Actions_java_lang_String_AsList(),
				ecorePackage.getEString(), "actions_java_lang_String_AsList", null, 0, 1,
				GrantOnPrincipalAndResourceOptionsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getGrantOnPrincipalAndResourceOptionsBuilder_iam_GranteeWithIGrantable_software_amazon_awscdk_services_iam_IGrantable_AsReference(),
				ecorePackage.getEString(),
				"granteeWithIGrantable_software_amazon_awscdk_services_iam_IGrantable_AsReference", null, 0, 1,
				GrantOnPrincipalAndResourceOptionsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrantOnPrincipalAndResourceOptionsBuilder_iam_ResourceArns_java_lang_String_AsList(),
				ecorePackage.getEString(), "resourceArns_java_lang_String_AsList", null, 0, 1,
				GrantOnPrincipalAndResourceOptionsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrantOnPrincipalAndResourceOptionsBuilder_iam_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.iam.GrantOnPrincipalAndResourceOptions", 0, 1,
				GrantOnPrincipalAndResourceOptionsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrantOnPrincipalAndResourceOptionsBuilder_iam_VarName(), ecorePackage.getEString(), "varName",
				null, 0, 1, GrantOnPrincipalAndResourceOptionsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrantOnPrincipalAndResourceOptionsBuilder_iam_Identifier(), ecorePackage.getEString(),
				"identifier", null, 0, 1, GrantOnPrincipalAndResourceOptionsBuilder_iam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrantOnPrincipalAndResourceOptionsBuilder_iam_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, GrantOnPrincipalAndResourceOptionsBuilder_iam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(managedPolicyBuilder_iamEClass, ManagedPolicyBuilder_iam.class, "ManagedPolicyBuilder_iam",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManagedPolicyBuilder_iam_Description_java_lang_String_(), ecorePackage.getEString(),
				"description_java_lang_String_", null, 0, 1, ManagedPolicyBuilder_iam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getManagedPolicyBuilder_iam_DocumentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference(),
				ecorePackage.getEString(),
				"documentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference", null, 0, 1,
				ManagedPolicyBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagedPolicyBuilder_iam_Groups_software_amazon_awscdk_services_iam_IGroup_AsList(),
				ecorePackage.getEString(), "groups_software_amazon_awscdk_services_iam_IGroup_AsList", null, 0, 1,
				ManagedPolicyBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagedPolicyBuilder_iam_ManagedPolicyName_java_lang_String_(), ecorePackage.getEString(),
				"managedPolicyName_java_lang_String_", null, 0, 1, ManagedPolicyBuilder_iam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagedPolicyBuilder_iam_Path_java_lang_String_(), ecorePackage.getEString(),
				"path_java_lang_String_", null, 0, 1, ManagedPolicyBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagedPolicyBuilder_iam_Roles_software_amazon_awscdk_services_iam_IRole_AsList(),
				ecorePackage.getEString(), "roles_software_amazon_awscdk_services_iam_IRole_AsList", null, 0, 1,
				ManagedPolicyBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getManagedPolicyBuilder_iam_Statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList(),
				ecorePackage.getEString(), "statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList",
				null, 0, 1, ManagedPolicyBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagedPolicyBuilder_iam_Users_software_amazon_awscdk_services_iam_IUser_AsList(),
				ecorePackage.getEString(), "users_software_amazon_awscdk_services_iam_IUser_AsList", null, 0, 1,
				ManagedPolicyBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagedPolicyBuilder_iam_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.iam.ManagedPolicy", 0, 1,
				ManagedPolicyBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagedPolicyBuilder_iam_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				ManagedPolicyBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagedPolicyBuilder_iam_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				ManagedPolicyBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagedPolicyBuilder_iam_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null,
				0, 1, ManagedPolicyBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fromRoleArnOptionsBuilder_iamEClass, FromRoleArnOptionsBuilder_iam.class,
				"FromRoleArnOptionsBuilder_iam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFromRoleArnOptionsBuilder_iam_Mutable_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"mutable_java_lang_Boolean_", null, 0, 1, FromRoleArnOptionsBuilder_iam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFromRoleArnOptionsBuilder_iam_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.iam.FromRoleArnOptions", 0, 1,
				FromRoleArnOptionsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFromRoleArnOptionsBuilder_iam_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				FromRoleArnOptionsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFromRoleArnOptionsBuilder_iam_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, FromRoleArnOptionsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFromRoleArnOptionsBuilder_iam_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, FromRoleArnOptionsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyDocumentBuilder_iamEClass, PolicyDocumentBuilder_iam.class, "PolicyDocumentBuilder_iam",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolicyDocumentBuilder_iam_AssignSids_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"assignSids_java_lang_Boolean_", null, 0, 1, PolicyDocumentBuilder_iam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getPolicyDocumentBuilder_iam_Statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList(),
				ecorePackage.getEString(), "statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList",
				null, 0, 1, PolicyDocumentBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyDocumentBuilder_iam_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.iam.PolicyDocument", 0, 1,
				PolicyDocumentBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyDocumentBuilder_iam_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				PolicyDocumentBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyDocumentBuilder_iam_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				PolicyDocumentBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyDocumentBuilder_iam_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null,
				0, 1, PolicyDocumentBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyBuilder_iamEClass, PolicyBuilder_iam.class, "PolicyBuilder_iam", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolicyBuilder_iam_Force_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"force_java_lang_Boolean_", null, 0, 1, PolicyBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyBuilder_iam_Groups_software_amazon_awscdk_services_iam_IGroup_AsList(),
				ecorePackage.getEString(), "groups_software_amazon_awscdk_services_iam_IGroup_AsList", null, 0, 1,
				PolicyBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyBuilder_iam_PolicyName_java_lang_String_(), ecorePackage.getEString(),
				"policyName_java_lang_String_", null, 0, 1, PolicyBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyBuilder_iam_Roles_software_amazon_awscdk_services_iam_IRole_AsList(),
				ecorePackage.getEString(), "roles_software_amazon_awscdk_services_iam_IRole_AsList", null, 0, 1,
				PolicyBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyBuilder_iam_Statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList(),
				ecorePackage.getEString(), "statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList",
				null, 0, 1, PolicyBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyBuilder_iam_Users_software_amazon_awscdk_services_iam_IUser_AsList(),
				ecorePackage.getEString(), "users_software_amazon_awscdk_services_iam_IUser_AsList", null, 0, 1,
				PolicyBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyBuilder_iam_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.iam.Policy", 0, 1, PolicyBuilder_iam.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyBuilder_iam_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				PolicyBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyBuilder_iam_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				PolicyBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyBuilder_iam_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0, 1,
				PolicyBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(policyDocumentPropsBuilder_iamEClass, PolicyDocumentPropsBuilder_iam.class,
				"PolicyDocumentPropsBuilder_iam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolicyDocumentPropsBuilder_iam_AssignSids_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "assignSids_java_lang_Boolean_", null, 0, 1,
				PolicyDocumentPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getPolicyDocumentPropsBuilder_iam_Statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList(),
				ecorePackage.getEString(), "statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList",
				null, 0, 1, PolicyDocumentPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyDocumentPropsBuilder_iam_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.iam.PolicyDocumentProps", 0, 1,
				PolicyDocumentPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyDocumentPropsBuilder_iam_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				PolicyDocumentPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyDocumentPropsBuilder_iam_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, PolicyDocumentPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyDocumentPropsBuilder_iam_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, PolicyDocumentPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userPropsBuilder_iamEClass, UserPropsBuilder_iam.class, "UserPropsBuilder_iam", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserPropsBuilder_iam_Groups_software_amazon_awscdk_services_iam_IGroup_AsList(),
				ecorePackage.getEString(), "groups_software_amazon_awscdk_services_iam_IGroup_AsList", null, 0, 1,
				UserPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getUserPropsBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList(),
				ecorePackage.getEString(), "managedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList",
				null, 0, 1, UserPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getUserPropsBuilder_iam_PasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference(),
				ecorePackage.getEString(),
				"passwordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference", null, 0, 1,
				UserPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserPropsBuilder_iam_PasswordResetRequired_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "passwordResetRequired_java_lang_Boolean_", null, 0, 1,
				UserPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserPropsBuilder_iam_Path_java_lang_String_(), ecorePackage.getEString(),
				"path_java_lang_String_", null, 0, 1, UserPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getUserPropsBuilder_iam_PermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference(),
				ecorePackage.getEString(),
				"permissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference",
				null, 0, 1, UserPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserPropsBuilder_iam_UserName_java_lang_String_(), ecorePackage.getEString(),
				"userName_java_lang_String_", null, 0, 1, UserPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserPropsBuilder_iam_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.iam.UserProps", 0, 1, UserPropsBuilder_iam.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserPropsBuilder_iam_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				UserPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserPropsBuilder_iam_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				UserPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserPropsBuilder_iam_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0,
				1, UserPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addToResourcePolicyResultBuilder_iamEClass, AddToResourcePolicyResultBuilder_iam.class,
				"AddToResourcePolicyResultBuilder_iam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddToResourcePolicyResultBuilder_iam_StatementAdded_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "statementAdded_java_lang_Boolean_", null, 0, 1,
				AddToResourcePolicyResultBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getAddToResourcePolicyResultBuilder_iam_PolicyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference(),
				ecorePackage.getEString(),
				"policyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference", null, 0, 1,
				AddToResourcePolicyResultBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddToResourcePolicyResultBuilder_iam_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.iam.AddToResourcePolicyResult", 0, 1,
				AddToResourcePolicyResultBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddToResourcePolicyResultBuilder_iam_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, AddToResourcePolicyResultBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddToResourcePolicyResultBuilder_iam_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, AddToResourcePolicyResultBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddToResourcePolicyResultBuilder_iam_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, AddToResourcePolicyResultBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyStatementPropsBuilder_iamEClass, PolicyStatementPropsBuilder_iam.class,
				"PolicyStatementPropsBuilder_iam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolicyStatementPropsBuilder_iam_Actions_java_lang_String_AsList(), ecorePackage.getEString(),
				"actions_java_lang_String_AsList", null, 0, 1, PolicyStatementPropsBuilder_iam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyStatementPropsBuilder_iam_Conditions_java_lang_String__java_lang_Object_AsMap(),
				ecorePackage.getEString(), "conditions_java_lang_String__java_lang_Object_AsMap", null, 0, 1,
				PolicyStatementPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyStatementPropsBuilder_iam_Effect_software_amazon_awscdk_services_iam_Effect_(),
				this.getEffect(), "effect_software_amazon_awscdk_services_iam_Effect_", null, 0, 1,
				PolicyStatementPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyStatementPropsBuilder_iam_NotActions_java_lang_String_AsList(),
				ecorePackage.getEString(), "notActions_java_lang_String_AsList", null, 0, 1,
				PolicyStatementPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getPolicyStatementPropsBuilder_iam_NotPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList(),
				ecorePackage.getEString(), "notPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList", null,
				0, 1, PolicyStatementPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyStatementPropsBuilder_iam_NotResources_java_lang_String_AsList(),
				ecorePackage.getEString(), "notResources_java_lang_String_AsList", null, 0, 1,
				PolicyStatementPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getPolicyStatementPropsBuilder_iam_Principals_software_amazon_awscdk_services_iam_IPrincipal_AsList(),
				ecorePackage.getEString(), "principals_software_amazon_awscdk_services_iam_IPrincipal_AsList", null, 0,
				1, PolicyStatementPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyStatementPropsBuilder_iam_Resources_java_lang_String_AsList(),
				ecorePackage.getEString(), "resources_java_lang_String_AsList", null, 0, 1,
				PolicyStatementPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyStatementPropsBuilder_iam_Sid_java_lang_String_(), ecorePackage.getEString(),
				"sid_java_lang_String_", null, 0, 1, PolicyStatementPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyStatementPropsBuilder_iam_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.iam.PolicyStatementProps", 0, 1,
				PolicyStatementPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyStatementPropsBuilder_iam_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				PolicyStatementPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyStatementPropsBuilder_iam_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, PolicyStatementPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyStatementPropsBuilder_iam_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, PolicyStatementPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addToPrincipalPolicyResultBuilder_iamEClass, AddToPrincipalPolicyResultBuilder_iam.class,
				"AddToPrincipalPolicyResultBuilder_iam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddToPrincipalPolicyResultBuilder_iam_StatementAdded_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "statementAdded_java_lang_Boolean_", null, 0, 1,
				AddToPrincipalPolicyResultBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getAddToPrincipalPolicyResultBuilder_iam_PolicyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference(),
				ecorePackage.getEString(),
				"policyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference", null, 0, 1,
				AddToPrincipalPolicyResultBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddToPrincipalPolicyResultBuilder_iam_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.iam.AddToPrincipalPolicyResult", 0, 1,
				AddToPrincipalPolicyResultBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddToPrincipalPolicyResultBuilder_iam_VarName(), ecorePackage.getEString(), "varName", null,
				0, 1, AddToPrincipalPolicyResultBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddToPrincipalPolicyResultBuilder_iam_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, AddToPrincipalPolicyResultBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddToPrincipalPolicyResultBuilder_iam_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, AddToPrincipalPolicyResultBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyStatementBuilder_iamEClass, PolicyStatementBuilder_iam.class, "PolicyStatementBuilder_iam",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolicyStatementBuilder_iam_Actions_java_lang_String_AsList(), ecorePackage.getEString(),
				"actions_java_lang_String_AsList", null, 0, 1, PolicyStatementBuilder_iam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyStatementBuilder_iam_Conditions_java_lang_String__java_lang_Object_AsMap(),
				ecorePackage.getEString(), "conditions_java_lang_String__java_lang_Object_AsMap", null, 0, 1,
				PolicyStatementBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyStatementBuilder_iam_Effect_software_amazon_awscdk_services_iam_Effect_(),
				this.getEffect(), "effect_software_amazon_awscdk_services_iam_Effect_", null, 0, 1,
				PolicyStatementBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyStatementBuilder_iam_NotActions_java_lang_String_AsList(), ecorePackage.getEString(),
				"notActions_java_lang_String_AsList", null, 0, 1, PolicyStatementBuilder_iam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getPolicyStatementBuilder_iam_NotPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList(),
				ecorePackage.getEString(), "notPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList", null,
				0, 1, PolicyStatementBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyStatementBuilder_iam_NotResources_java_lang_String_AsList(), ecorePackage.getEString(),
				"notResources_java_lang_String_AsList", null, 0, 1, PolicyStatementBuilder_iam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyStatementBuilder_iam_Principals_software_amazon_awscdk_services_iam_IPrincipal_AsList(),
				ecorePackage.getEString(), "principals_software_amazon_awscdk_services_iam_IPrincipal_AsList", null, 0,
				1, PolicyStatementBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyStatementBuilder_iam_Resources_java_lang_String_AsList(), ecorePackage.getEString(),
				"resources_java_lang_String_AsList", null, 0, 1, PolicyStatementBuilder_iam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyStatementBuilder_iam_Sid_java_lang_String_(), ecorePackage.getEString(),
				"sid_java_lang_String_", null, 0, 1, PolicyStatementBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyStatementBuilder_iam_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.iam.PolicyStatement", 0, 1,
				PolicyStatementBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyStatementBuilder_iam_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				PolicyStatementBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyStatementBuilder_iam_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				PolicyStatementBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyStatementBuilder_iam_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, PolicyStatementBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(servicePrincipalOptsBuilder_iamEClass, ServicePrincipalOptsBuilder_iam.class,
				"ServicePrincipalOptsBuilder_iam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServicePrincipalOptsBuilder_iam_Conditions_java_lang_String__java_lang_Object_AsMap(),
				ecorePackage.getEString(), "conditions_java_lang_String__java_lang_Object_AsMap", null, 0, 1,
				ServicePrincipalOptsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServicePrincipalOptsBuilder_iam_Region_java_lang_String_(), ecorePackage.getEString(),
				"region_java_lang_String_", null, 0, 1, ServicePrincipalOptsBuilder_iam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServicePrincipalOptsBuilder_iam_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.iam.ServicePrincipalOpts", 0, 1,
				ServicePrincipalOptsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServicePrincipalOptsBuilder_iam_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				ServicePrincipalOptsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServicePrincipalOptsBuilder_iam_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, ServicePrincipalOptsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServicePrincipalOptsBuilder_iam_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, ServicePrincipalOptsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unknownPrincipalBuilder_iamEClass, UnknownPrincipalBuilder_iam.class, "UnknownPrincipalBuilder_iam",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getUnknownPrincipalBuilder_iam_ResourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference(),
				ecorePackage.getEString(), "resourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference",
				null, 0, 1, UnknownPrincipalBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnknownPrincipalBuilder_iam_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.iam.UnknownPrincipal", 0, 1,
				UnknownPrincipalBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnknownPrincipalBuilder_iam_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				UnknownPrincipalBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnknownPrincipalBuilder_iam_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				UnknownPrincipalBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnknownPrincipalBuilder_iam_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, UnknownPrincipalBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(managedPolicyPropsBuilder_iamEClass, ManagedPolicyPropsBuilder_iam.class,
				"ManagedPolicyPropsBuilder_iam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManagedPolicyPropsBuilder_iam_Description_java_lang_String_(), ecorePackage.getEString(),
				"description_java_lang_String_", null, 0, 1, ManagedPolicyPropsBuilder_iam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getManagedPolicyPropsBuilder_iam_DocumentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference(),
				ecorePackage.getEString(),
				"documentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference", null, 0, 1,
				ManagedPolicyPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagedPolicyPropsBuilder_iam_Groups_software_amazon_awscdk_services_iam_IGroup_AsList(),
				ecorePackage.getEString(), "groups_software_amazon_awscdk_services_iam_IGroup_AsList", null, 0, 1,
				ManagedPolicyPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagedPolicyPropsBuilder_iam_ManagedPolicyName_java_lang_String_(),
				ecorePackage.getEString(), "managedPolicyName_java_lang_String_", null, 0, 1,
				ManagedPolicyPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagedPolicyPropsBuilder_iam_Path_java_lang_String_(), ecorePackage.getEString(),
				"path_java_lang_String_", null, 0, 1, ManagedPolicyPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagedPolicyPropsBuilder_iam_Roles_software_amazon_awscdk_services_iam_IRole_AsList(),
				ecorePackage.getEString(), "roles_software_amazon_awscdk_services_iam_IRole_AsList", null, 0, 1,
				ManagedPolicyPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getManagedPolicyPropsBuilder_iam_Statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList(),
				ecorePackage.getEString(), "statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList",
				null, 0, 1, ManagedPolicyPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagedPolicyPropsBuilder_iam_Users_software_amazon_awscdk_services_iam_IUser_AsList(),
				ecorePackage.getEString(), "users_software_amazon_awscdk_services_iam_IUser_AsList", null, 0, 1,
				ManagedPolicyPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagedPolicyPropsBuilder_iam_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.iam.ManagedPolicyProps", 0, 1,
				ManagedPolicyPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagedPolicyPropsBuilder_iam_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				ManagedPolicyPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagedPolicyPropsBuilder_iam_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, ManagedPolicyPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagedPolicyPropsBuilder_iam_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, ManagedPolicyPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(openIdConnectProviderBuilder_iamEClass, OpenIdConnectProviderBuilder_iam.class,
				"OpenIdConnectProviderBuilder_iam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpenIdConnectProviderBuilder_iam_Url_java_lang_String_(), ecorePackage.getEString(),
				"url_java_lang_String_", null, 0, 1, OpenIdConnectProviderBuilder_iam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenIdConnectProviderBuilder_iam_ClientIds_java_lang_String_AsList(),
				ecorePackage.getEString(), "clientIds_java_lang_String_AsList", null, 0, 1,
				OpenIdConnectProviderBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenIdConnectProviderBuilder_iam_Thumbprints_java_lang_String_AsList(),
				ecorePackage.getEString(), "thumbprints_java_lang_String_AsList", null, 0, 1,
				OpenIdConnectProviderBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenIdConnectProviderBuilder_iam_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.iam.OpenIdConnectProvider", 0, 1,
				OpenIdConnectProviderBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenIdConnectProviderBuilder_iam_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				OpenIdConnectProviderBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenIdConnectProviderBuilder_iam_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, OpenIdConnectProviderBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenIdConnectProviderBuilder_iam_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, OpenIdConnectProviderBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lazyRoleBuilder_iamEClass, LazyRoleBuilder_iam.class, "LazyRoleBuilder_iam", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getLazyRoleBuilder_iam_AssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference(),
				ecorePackage.getEString(),
				"assumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference", null, 0, 1,
				LazyRoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLazyRoleBuilder_iam_Description_java_lang_String_(), ecorePackage.getEString(),
				"description_java_lang_String_", null, 0, 1, LazyRoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLazyRoleBuilder_iam_ExternalId_java_lang_String_(), ecorePackage.getEString(),
				"externalId_java_lang_String_", null, 0, 1, LazyRoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLazyRoleBuilder_iam_ExternalIds_java_lang_String_AsList(), ecorePackage.getEString(),
				"externalIds_java_lang_String_AsList", null, 0, 1, LazyRoleBuilder_iam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLazyRoleBuilder_iam_InlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap(),
				ecorePackage.getEString(),
				"inlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap", null, 0, 1,
				LazyRoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLazyRoleBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList(),
				ecorePackage.getEString(), "managedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList",
				null, 0, 1, LazyRoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLazyRoleBuilder_iam_MaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference(),
				ecorePackage.getEString(),
				"maxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference", null, 0, 1,
				LazyRoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLazyRoleBuilder_iam_Path_java_lang_String_(), ecorePackage.getEString(),
				"path_java_lang_String_", null, 0, 1, LazyRoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLazyRoleBuilder_iam_PermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference(),
				ecorePackage.getEString(),
				"permissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference",
				null, 0, 1, LazyRoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLazyRoleBuilder_iam_RoleName_java_lang_String_(), ecorePackage.getEString(),
				"roleName_java_lang_String_", null, 0, 1, LazyRoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLazyRoleBuilder_iam_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.iam.LazyRole", 0, 1, LazyRoleBuilder_iam.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLazyRoleBuilder_iam_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				LazyRoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLazyRoleBuilder_iam_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				LazyRoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLazyRoleBuilder_iam_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0, 1,
				LazyRoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commonGrantOptionsBuilder_iamEClass, CommonGrantOptionsBuilder_iam.class,
				"CommonGrantOptionsBuilder_iam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommonGrantOptionsBuilder_iam_Actions_java_lang_String_AsList(), ecorePackage.getEString(),
				"actions_java_lang_String_AsList", null, 0, 1, CommonGrantOptionsBuilder_iam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getCommonGrantOptionsBuilder_iam_GranteeWithIGrantable_software_amazon_awscdk_services_iam_IGrantable_AsReference(),
				ecorePackage.getEString(),
				"granteeWithIGrantable_software_amazon_awscdk_services_iam_IGrantable_AsReference", null, 0, 1,
				CommonGrantOptionsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommonGrantOptionsBuilder_iam_ResourceArns_java_lang_String_AsList(),
				ecorePackage.getEString(), "resourceArns_java_lang_String_AsList", null, 0, 1,
				CommonGrantOptionsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommonGrantOptionsBuilder_iam_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.iam.CommonGrantOptions", 0, 1,
				CommonGrantOptionsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommonGrantOptionsBuilder_iam_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				CommonGrantOptionsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommonGrantOptionsBuilder_iam_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, CommonGrantOptionsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommonGrantOptionsBuilder_iam_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, CommonGrantOptionsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(grantWithResourceOptionsBuilder_iamEClass, GrantWithResourceOptionsBuilder_iam.class,
				"GrantWithResourceOptionsBuilder_iam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getGrantWithResourceOptionsBuilder_iam_ResourceWithIResourceWithPolicy_software_amazon_awscdk_services_iam_IResourceWithPolicy_AsReference(),
				ecorePackage.getEString(),
				"resourceWithIResourceWithPolicy_software_amazon_awscdk_services_iam_IResourceWithPolicy_AsReference",
				null, 0, 1, GrantWithResourceOptionsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrantWithResourceOptionsBuilder_iam_ResourceSelfArns_java_lang_String_AsList(),
				ecorePackage.getEString(), "resourceSelfArns_java_lang_String_AsList", null, 0, 1,
				GrantWithResourceOptionsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrantWithResourceOptionsBuilder_iam_Actions_java_lang_String_AsList(),
				ecorePackage.getEString(), "actions_java_lang_String_AsList", null, 0, 1,
				GrantWithResourceOptionsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getGrantWithResourceOptionsBuilder_iam_GranteeWithIGrantable_software_amazon_awscdk_services_iam_IGrantable_AsReference(),
				ecorePackage.getEString(),
				"granteeWithIGrantable_software_amazon_awscdk_services_iam_IGrantable_AsReference", null, 0, 1,
				GrantWithResourceOptionsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrantWithResourceOptionsBuilder_iam_ResourceArns_java_lang_String_AsList(),
				ecorePackage.getEString(), "resourceArns_java_lang_String_AsList", null, 0, 1,
				GrantWithResourceOptionsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrantWithResourceOptionsBuilder_iam_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.iam.GrantWithResourceOptions", 0, 1,
				GrantWithResourceOptionsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrantWithResourceOptionsBuilder_iam_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, GrantWithResourceOptionsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrantWithResourceOptionsBuilder_iam_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, GrantWithResourceOptionsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrantWithResourceOptionsBuilder_iam_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, GrantWithResourceOptionsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lazyRolePropsBuilder_iamEClass, LazyRolePropsBuilder_iam.class, "LazyRolePropsBuilder_iam",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getLazyRolePropsBuilder_iam_AssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference(),
				ecorePackage.getEString(),
				"assumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference", null, 0, 1,
				LazyRolePropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLazyRolePropsBuilder_iam_Description_java_lang_String_(), ecorePackage.getEString(),
				"description_java_lang_String_", null, 0, 1, LazyRolePropsBuilder_iam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLazyRolePropsBuilder_iam_ExternalId_java_lang_String_(), ecorePackage.getEString(),
				"externalId_java_lang_String_", null, 0, 1, LazyRolePropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLazyRolePropsBuilder_iam_ExternalIds_java_lang_String_AsList(), ecorePackage.getEString(),
				"externalIds_java_lang_String_AsList", null, 0, 1, LazyRolePropsBuilder_iam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLazyRolePropsBuilder_iam_InlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap(),
				ecorePackage.getEString(),
				"inlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap", null, 0, 1,
				LazyRolePropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLazyRolePropsBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList(),
				ecorePackage.getEString(), "managedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList",
				null, 0, 1, LazyRolePropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLazyRolePropsBuilder_iam_MaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference(),
				ecorePackage.getEString(),
				"maxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference", null, 0, 1,
				LazyRolePropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLazyRolePropsBuilder_iam_Path_java_lang_String_(), ecorePackage.getEString(),
				"path_java_lang_String_", null, 0, 1, LazyRolePropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLazyRolePropsBuilder_iam_PermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference(),
				ecorePackage.getEString(),
				"permissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference",
				null, 0, 1, LazyRolePropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLazyRolePropsBuilder_iam_RoleName_java_lang_String_(), ecorePackage.getEString(),
				"roleName_java_lang_String_", null, 0, 1, LazyRolePropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLazyRolePropsBuilder_iam_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.iam.LazyRoleProps", 0, 1,
				LazyRolePropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLazyRolePropsBuilder_iam_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				LazyRolePropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLazyRolePropsBuilder_iam_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				LazyRolePropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLazyRolePropsBuilder_iam_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null,
				0, 1, LazyRolePropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyPropsBuilder_iamEClass, PolicyPropsBuilder_iam.class, "PolicyPropsBuilder_iam", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolicyPropsBuilder_iam_Force_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"force_java_lang_Boolean_", null, 0, 1, PolicyPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyPropsBuilder_iam_Groups_software_amazon_awscdk_services_iam_IGroup_AsList(),
				ecorePackage.getEString(), "groups_software_amazon_awscdk_services_iam_IGroup_AsList", null, 0, 1,
				PolicyPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyPropsBuilder_iam_PolicyName_java_lang_String_(), ecorePackage.getEString(),
				"policyName_java_lang_String_", null, 0, 1, PolicyPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyPropsBuilder_iam_Roles_software_amazon_awscdk_services_iam_IRole_AsList(),
				ecorePackage.getEString(), "roles_software_amazon_awscdk_services_iam_IRole_AsList", null, 0, 1,
				PolicyPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getPolicyPropsBuilder_iam_Statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList(),
				ecorePackage.getEString(), "statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList",
				null, 0, 1, PolicyPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyPropsBuilder_iam_Users_software_amazon_awscdk_services_iam_IUser_AsList(),
				ecorePackage.getEString(), "users_software_amazon_awscdk_services_iam_IUser_AsList", null, 0, 1,
				PolicyPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyPropsBuilder_iam_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.iam.PolicyProps", 0, 1, PolicyPropsBuilder_iam.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyPropsBuilder_iam_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				PolicyPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyPropsBuilder_iam_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				PolicyPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyPropsBuilder_iam_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0,
				1, PolicyPropsBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupBuilder_iamEClass, GroupBuilder_iam.class, "GroupBuilder_iam", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroupBuilder_iam_GroupName_java_lang_String_(), ecorePackage.getEString(),
				"groupName_java_lang_String_", null, 0, 1, GroupBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList(),
				ecorePackage.getEString(), "managedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList",
				null, 0, 1, GroupBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupBuilder_iam_Path_java_lang_String_(), ecorePackage.getEString(),
				"path_java_lang_String_", null, 0, 1, GroupBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupBuilder_iam_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.iam.Group", 0, 1, GroupBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupBuilder_iam_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				GroupBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupBuilder_iam_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				GroupBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupBuilder_iam_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0, 1,
				GroupBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(effectEEnum, Effect.class, "Effect");
		addEEnumLiteral(effectEEnum, Effect.ALLOW);
		addEEnumLiteral(effectEEnum, Effect.DENY);

		// Create resource
		createResource(eNS_URI);
	}

} //IamPackageImpl
