/**
 */
package iam;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see iam.IamFactory
 * @model kind="package"
 * @generated
 */
public interface IamPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "iam";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "AWSWorkbenchSources/default.software.amazon.awscdk.services.iam";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "iam";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IamPackage eINSTANCE = iam.impl.IamPackageImpl.init();

	/**
	 * The meta object id for the '{@link iam.impl.RolePropsBuilder_iamImpl <em>Role Props Builder iam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iam.impl.RolePropsBuilder_iamImpl
	 * @see iam.impl.IamPackageImpl#getRolePropsBuilder_iam()
	 * @generated
	 */
	int ROLE_PROPS_BUILDER_IAM = 0;

	/**
	 * The feature id for the '<em><b>Assumed By With IPrincipal software amazon awscdk services iam IPrincipal As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PROPS_BUILDER_IAM__ASSUMED_BY_WITH_IPRINCIPAL_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Description java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PROPS_BUILDER_IAM__DESCRIPTION_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>External Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PROPS_BUILDER_IAM__EXTERNAL_ID_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>External Ids java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PROPS_BUILDER_IAM__EXTERNAL_IDS_JAVA_LANG_STRING_AS_LIST = 3;

	/**
	 * The feature id for the '<em><b>Inline Policies java lang String software amazon awscdk services iam Policy Document As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PROPS_BUILDER_IAM__INLINE_POLICIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_MAP = 4;

	/**
	 * The feature id for the '<em><b>Managed Policies software amazon awscdk services iam IManaged Policy As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PROPS_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST = 5;

	/**
	 * The feature id for the '<em><b>Max Session Duration With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PROPS_BUILDER_IAM__MAX_SESSION_DURATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Path java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PROPS_BUILDER_IAM__PATH_JAVA_LANG_STRING_ = 7;

	/**
	 * The feature id for the '<em><b>Permissions Boundary With IManaged Policy software amazon awscdk services iam IManaged Policy As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PROPS_BUILDER_IAM__PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE = 8;

	/**
	 * The feature id for the '<em><b>Role Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PROPS_BUILDER_IAM__ROLE_NAME_JAVA_LANG_STRING_ = 9;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PROPS_BUILDER_IAM__GENERATED_CLASS_NAME = 10;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PROPS_BUILDER_IAM__VAR_NAME = 11;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PROPS_BUILDER_IAM__IDENTIFIER = 12;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PROPS_BUILDER_IAM__ADDITIONAL_CODE = 13;

	/**
	 * The number of structural features of the '<em>Role Props Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PROPS_BUILDER_IAM_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Role Props Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PROPS_BUILDER_IAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iam.impl.UnknownPrincipalPropsBuilder_iamImpl <em>Unknown Principal Props Builder iam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iam.impl.UnknownPrincipalPropsBuilder_iamImpl
	 * @see iam.impl.IamPackageImpl#getUnknownPrincipalPropsBuilder_iam()
	 * @generated
	 */
	int UNKNOWN_PRINCIPAL_PROPS_BUILDER_IAM = 1;

	/**
	 * The feature id for the '<em><b>Resource With IConstruct software amazon awscdk core IConstruct As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PRINCIPAL_PROPS_BUILDER_IAM__RESOURCE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PRINCIPAL_PROPS_BUILDER_IAM__GENERATED_CLASS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PRINCIPAL_PROPS_BUILDER_IAM__VAR_NAME = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PRINCIPAL_PROPS_BUILDER_IAM__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PRINCIPAL_PROPS_BUILDER_IAM__ADDITIONAL_CODE = 4;

	/**
	 * The number of structural features of the '<em>Unknown Principal Props Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PRINCIPAL_PROPS_BUILDER_IAM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Unknown Principal Props Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PRINCIPAL_PROPS_BUILDER_IAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iam.impl.OpenIdConnectProviderPropsBuilder_iamImpl <em>Open Id Connect Provider Props Builder iam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iam.impl.OpenIdConnectProviderPropsBuilder_iamImpl
	 * @see iam.impl.IamPackageImpl#getOpenIdConnectProviderPropsBuilder_iam()
	 * @generated
	 */
	int OPEN_ID_CONNECT_PROVIDER_PROPS_BUILDER_IAM = 2;

	/**
	 * The feature id for the '<em><b>Url java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ID_CONNECT_PROVIDER_PROPS_BUILDER_IAM__URL_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Client Ids java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ID_CONNECT_PROVIDER_PROPS_BUILDER_IAM__CLIENT_IDS_JAVA_LANG_STRING_AS_LIST = 1;

	/**
	 * The feature id for the '<em><b>Thumbprints java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ID_CONNECT_PROVIDER_PROPS_BUILDER_IAM__THUMBPRINTS_JAVA_LANG_STRING_AS_LIST = 2;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ID_CONNECT_PROVIDER_PROPS_BUILDER_IAM__GENERATED_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ID_CONNECT_PROVIDER_PROPS_BUILDER_IAM__VAR_NAME = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ID_CONNECT_PROVIDER_PROPS_BUILDER_IAM__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ID_CONNECT_PROVIDER_PROPS_BUILDER_IAM__ADDITIONAL_CODE = 6;

	/**
	 * The number of structural features of the '<em>Open Id Connect Provider Props Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ID_CONNECT_PROVIDER_PROPS_BUILDER_IAM_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Open Id Connect Provider Props Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ID_CONNECT_PROVIDER_PROPS_BUILDER_IAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iam.impl.GroupPropsBuilder_iamImpl <em>Group Props Builder iam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iam.impl.GroupPropsBuilder_iamImpl
	 * @see iam.impl.IamPackageImpl#getGroupPropsBuilder_iam()
	 * @generated
	 */
	int GROUP_PROPS_BUILDER_IAM = 3;

	/**
	 * The feature id for the '<em><b>Group Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PROPS_BUILDER_IAM__GROUP_NAME_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Managed Policies software amazon awscdk services iam IManaged Policy As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PROPS_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST = 1;

	/**
	 * The feature id for the '<em><b>Path java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PROPS_BUILDER_IAM__PATH_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PROPS_BUILDER_IAM__GENERATED_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PROPS_BUILDER_IAM__VAR_NAME = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PROPS_BUILDER_IAM__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PROPS_BUILDER_IAM__ADDITIONAL_CODE = 6;

	/**
	 * The number of structural features of the '<em>Group Props Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PROPS_BUILDER_IAM_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Group Props Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PROPS_BUILDER_IAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iam.impl.RoleBuilder_iamImpl <em>Role Builder iam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iam.impl.RoleBuilder_iamImpl
	 * @see iam.impl.IamPackageImpl#getRoleBuilder_iam()
	 * @generated
	 */
	int ROLE_BUILDER_IAM = 4;

	/**
	 * The feature id for the '<em><b>Assumed By With IPrincipal software amazon awscdk services iam IPrincipal As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BUILDER_IAM__ASSUMED_BY_WITH_IPRINCIPAL_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Description java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BUILDER_IAM__DESCRIPTION_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>External Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BUILDER_IAM__EXTERNAL_ID_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>External Ids java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BUILDER_IAM__EXTERNAL_IDS_JAVA_LANG_STRING_AS_LIST = 3;

	/**
	 * The feature id for the '<em><b>Inline Policies java lang String software amazon awscdk services iam Policy Document As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BUILDER_IAM__INLINE_POLICIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_MAP = 4;

	/**
	 * The feature id for the '<em><b>Managed Policies software amazon awscdk services iam IManaged Policy As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST = 5;

	/**
	 * The feature id for the '<em><b>Max Session Duration With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BUILDER_IAM__MAX_SESSION_DURATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Path java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BUILDER_IAM__PATH_JAVA_LANG_STRING_ = 7;

	/**
	 * The feature id for the '<em><b>Permissions Boundary With IManaged Policy software amazon awscdk services iam IManaged Policy As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BUILDER_IAM__PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE = 8;

	/**
	 * The feature id for the '<em><b>Role Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BUILDER_IAM__ROLE_NAME_JAVA_LANG_STRING_ = 9;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BUILDER_IAM__GENERATED_CLASS_NAME = 10;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BUILDER_IAM__VAR_NAME = 11;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BUILDER_IAM__IDENTIFIER = 12;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BUILDER_IAM__ADDITIONAL_CODE = 13;

	/**
	 * The number of structural features of the '<em>Role Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BUILDER_IAM_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Role Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BUILDER_IAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iam.impl.ServicePrincipalBuilder_iamImpl <em>Service Principal Builder iam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iam.impl.ServicePrincipalBuilder_iamImpl
	 * @see iam.impl.IamPackageImpl#getServicePrincipalBuilder_iam()
	 * @generated
	 */
	int SERVICE_PRINCIPAL_BUILDER_IAM = 5;

	/**
	 * The feature id for the '<em><b>Conditions java lang String java lang Object As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PRINCIPAL_BUILDER_IAM__CONDITIONS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP = 0;

	/**
	 * The feature id for the '<em><b>Region java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PRINCIPAL_BUILDER_IAM__REGION_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PRINCIPAL_BUILDER_IAM__GENERATED_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PRINCIPAL_BUILDER_IAM__VAR_NAME = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PRINCIPAL_BUILDER_IAM__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PRINCIPAL_BUILDER_IAM__ADDITIONAL_CODE = 5;

	/**
	 * The number of structural features of the '<em>Service Principal Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PRINCIPAL_BUILDER_IAM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Service Principal Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PRINCIPAL_BUILDER_IAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iam.impl.GrantOnPrincipalOptionsBuilder_iamImpl <em>Grant On Principal Options Builder iam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iam.impl.GrantOnPrincipalOptionsBuilder_iamImpl
	 * @see iam.impl.IamPackageImpl#getGrantOnPrincipalOptionsBuilder_iam()
	 * @generated
	 */
	int GRANT_ON_PRINCIPAL_OPTIONS_BUILDER_IAM = 6;

	/**
	 * The feature id for the '<em><b>Scope With IConstruct software amazon awscdk core IConstruct As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_ON_PRINCIPAL_OPTIONS_BUILDER_IAM__SCOPE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Actions java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_ON_PRINCIPAL_OPTIONS_BUILDER_IAM__ACTIONS_JAVA_LANG_STRING_AS_LIST = 1;

	/**
	 * The feature id for the '<em><b>Grantee With IGrantable software amazon awscdk services iam IGrantable As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_ON_PRINCIPAL_OPTIONS_BUILDER_IAM__GRANTEE_WITH_IGRANTABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGRANTABLE_AS_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Resource Arns java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_ON_PRINCIPAL_OPTIONS_BUILDER_IAM__RESOURCE_ARNS_JAVA_LANG_STRING_AS_LIST = 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_ON_PRINCIPAL_OPTIONS_BUILDER_IAM__GENERATED_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_ON_PRINCIPAL_OPTIONS_BUILDER_IAM__VAR_NAME = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_ON_PRINCIPAL_OPTIONS_BUILDER_IAM__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_ON_PRINCIPAL_OPTIONS_BUILDER_IAM__ADDITIONAL_CODE = 7;

	/**
	 * The number of structural features of the '<em>Grant On Principal Options Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_ON_PRINCIPAL_OPTIONS_BUILDER_IAM_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Grant On Principal Options Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_ON_PRINCIPAL_OPTIONS_BUILDER_IAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iam.impl.UserBuilder_iamImpl <em>User Builder iam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iam.impl.UserBuilder_iamImpl
	 * @see iam.impl.IamPackageImpl#getUserBuilder_iam()
	 * @generated
	 */
	int USER_BUILDER_IAM = 7;

	/**
	 * The feature id for the '<em><b>Groups software amazon awscdk services iam IGroup As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST = 0;

	/**
	 * The feature id for the '<em><b>Managed Policies software amazon awscdk services iam IManaged Policy As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST = 1;

	/**
	 * The feature id for the '<em><b>Password With Secret Value software amazon awscdk core Secret Value As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BUILDER_IAM__PASSWORD_WITH_SECRET_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_SECRET_VALUE_AS_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Password Reset Required java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BUILDER_IAM__PASSWORD_RESET_REQUIRED_JAVA_LANG_BOOLEAN_ = 3;

	/**
	 * The feature id for the '<em><b>Path java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BUILDER_IAM__PATH_JAVA_LANG_STRING_ = 4;

	/**
	 * The feature id for the '<em><b>Permissions Boundary With IManaged Policy software amazon awscdk services iam IManaged Policy As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BUILDER_IAM__PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>User Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BUILDER_IAM__USER_NAME_JAVA_LANG_STRING_ = 6;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BUILDER_IAM__GENERATED_CLASS_NAME = 7;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BUILDER_IAM__VAR_NAME = 8;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BUILDER_IAM__IDENTIFIER = 9;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BUILDER_IAM__ADDITIONAL_CODE = 10;

	/**
	 * The number of structural features of the '<em>User Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BUILDER_IAM_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>User Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BUILDER_IAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iam.impl.GrantOnPrincipalAndResourceOptionsBuilder_iamImpl <em>Grant On Principal And Resource Options Builder iam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iam.impl.GrantOnPrincipalAndResourceOptionsBuilder_iamImpl
	 * @see iam.impl.IamPackageImpl#getGrantOnPrincipalAndResourceOptionsBuilder_iam()
	 * @generated
	 */
	int GRANT_ON_PRINCIPAL_AND_RESOURCE_OPTIONS_BUILDER_IAM = 8;

	/**
	 * The feature id for the '<em><b>Resource With IResource With Policy software amazon awscdk services iam IResource With Policy As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_ON_PRINCIPAL_AND_RESOURCE_OPTIONS_BUILDER_IAM__RESOURCE_WITH_IRESOURCE_WITH_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IRESOURCE_WITH_POLICY_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Resource Policy Principal With IPrincipal software amazon awscdk services iam IPrincipal As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_ON_PRINCIPAL_AND_RESOURCE_OPTIONS_BUILDER_IAM__RESOURCE_POLICY_PRINCIPAL_WITH_IPRINCIPAL_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Resource Self Arns java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_ON_PRINCIPAL_AND_RESOURCE_OPTIONS_BUILDER_IAM__RESOURCE_SELF_ARNS_JAVA_LANG_STRING_AS_LIST = 2;

	/**
	 * The feature id for the '<em><b>Actions java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_ON_PRINCIPAL_AND_RESOURCE_OPTIONS_BUILDER_IAM__ACTIONS_JAVA_LANG_STRING_AS_LIST = 3;

	/**
	 * The feature id for the '<em><b>Grantee With IGrantable software amazon awscdk services iam IGrantable As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_ON_PRINCIPAL_AND_RESOURCE_OPTIONS_BUILDER_IAM__GRANTEE_WITH_IGRANTABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGRANTABLE_AS_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Resource Arns java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_ON_PRINCIPAL_AND_RESOURCE_OPTIONS_BUILDER_IAM__RESOURCE_ARNS_JAVA_LANG_STRING_AS_LIST = 5;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_ON_PRINCIPAL_AND_RESOURCE_OPTIONS_BUILDER_IAM__GENERATED_CLASS_NAME = 6;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_ON_PRINCIPAL_AND_RESOURCE_OPTIONS_BUILDER_IAM__VAR_NAME = 7;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_ON_PRINCIPAL_AND_RESOURCE_OPTIONS_BUILDER_IAM__IDENTIFIER = 8;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_ON_PRINCIPAL_AND_RESOURCE_OPTIONS_BUILDER_IAM__ADDITIONAL_CODE = 9;

	/**
	 * The number of structural features of the '<em>Grant On Principal And Resource Options Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_ON_PRINCIPAL_AND_RESOURCE_OPTIONS_BUILDER_IAM_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Grant On Principal And Resource Options Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_ON_PRINCIPAL_AND_RESOURCE_OPTIONS_BUILDER_IAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iam.impl.ManagedPolicyBuilder_iamImpl <em>Managed Policy Builder iam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iam.impl.ManagedPolicyBuilder_iamImpl
	 * @see iam.impl.IamPackageImpl#getManagedPolicyBuilder_iam()
	 * @generated
	 */
	int MANAGED_POLICY_BUILDER_IAM = 9;

	/**
	 * The feature id for the '<em><b>Description java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_POLICY_BUILDER_IAM__DESCRIPTION_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Document With Policy Document software amazon awscdk services iam Policy Document As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_POLICY_BUILDER_IAM__DOCUMENT_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Groups software amazon awscdk services iam IGroup As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_POLICY_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST = 2;

	/**
	 * The feature id for the '<em><b>Managed Policy Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_POLICY_BUILDER_IAM__MANAGED_POLICY_NAME_JAVA_LANG_STRING_ = 3;

	/**
	 * The feature id for the '<em><b>Path java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_POLICY_BUILDER_IAM__PATH_JAVA_LANG_STRING_ = 4;

	/**
	 * The feature id for the '<em><b>Roles software amazon awscdk services iam IRole As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_POLICY_BUILDER_IAM__ROLES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_LIST = 5;

	/**
	 * The feature id for the '<em><b>Statements software amazon awscdk services iam Policy Statement As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_POLICY_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST = 6;

	/**
	 * The feature id for the '<em><b>Users software amazon awscdk services iam IUser As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_POLICY_BUILDER_IAM__USERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IUSER_AS_LIST = 7;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_POLICY_BUILDER_IAM__GENERATED_CLASS_NAME = 8;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_POLICY_BUILDER_IAM__VAR_NAME = 9;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_POLICY_BUILDER_IAM__IDENTIFIER = 10;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_POLICY_BUILDER_IAM__ADDITIONAL_CODE = 11;

	/**
	 * The number of structural features of the '<em>Managed Policy Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_POLICY_BUILDER_IAM_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Managed Policy Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_POLICY_BUILDER_IAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iam.impl.FromRoleArnOptionsBuilder_iamImpl <em>From Role Arn Options Builder iam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iam.impl.FromRoleArnOptionsBuilder_iamImpl
	 * @see iam.impl.IamPackageImpl#getFromRoleArnOptionsBuilder_iam()
	 * @generated
	 */
	int FROM_ROLE_ARN_OPTIONS_BUILDER_IAM = 10;

	/**
	 * The feature id for the '<em><b>Mutable java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_ROLE_ARN_OPTIONS_BUILDER_IAM__MUTABLE_JAVA_LANG_BOOLEAN_ = 0;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_ROLE_ARN_OPTIONS_BUILDER_IAM__GENERATED_CLASS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_ROLE_ARN_OPTIONS_BUILDER_IAM__VAR_NAME = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_ROLE_ARN_OPTIONS_BUILDER_IAM__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_ROLE_ARN_OPTIONS_BUILDER_IAM__ADDITIONAL_CODE = 4;

	/**
	 * The number of structural features of the '<em>From Role Arn Options Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_ROLE_ARN_OPTIONS_BUILDER_IAM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>From Role Arn Options Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_ROLE_ARN_OPTIONS_BUILDER_IAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iam.impl.PolicyDocumentBuilder_iamImpl <em>Policy Document Builder iam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iam.impl.PolicyDocumentBuilder_iamImpl
	 * @see iam.impl.IamPackageImpl#getPolicyDocumentBuilder_iam()
	 * @generated
	 */
	int POLICY_DOCUMENT_BUILDER_IAM = 11;

	/**
	 * The feature id for the '<em><b>Assign Sids java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_DOCUMENT_BUILDER_IAM__ASSIGN_SIDS_JAVA_LANG_BOOLEAN_ = 0;

	/**
	 * The feature id for the '<em><b>Statements software amazon awscdk services iam Policy Statement As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_DOCUMENT_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST = 1;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_DOCUMENT_BUILDER_IAM__GENERATED_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_DOCUMENT_BUILDER_IAM__VAR_NAME = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_DOCUMENT_BUILDER_IAM__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_DOCUMENT_BUILDER_IAM__ADDITIONAL_CODE = 5;

	/**
	 * The number of structural features of the '<em>Policy Document Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_DOCUMENT_BUILDER_IAM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Policy Document Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_DOCUMENT_BUILDER_IAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iam.impl.PolicyBuilder_iamImpl <em>Policy Builder iam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iam.impl.PolicyBuilder_iamImpl
	 * @see iam.impl.IamPackageImpl#getPolicyBuilder_iam()
	 * @generated
	 */
	int POLICY_BUILDER_IAM = 12;

	/**
	 * The feature id for the '<em><b>Force java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_BUILDER_IAM__FORCE_JAVA_LANG_BOOLEAN_ = 0;

	/**
	 * The feature id for the '<em><b>Groups software amazon awscdk services iam IGroup As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST = 1;

	/**
	 * The feature id for the '<em><b>Policy Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_BUILDER_IAM__POLICY_NAME_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Roles software amazon awscdk services iam IRole As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_BUILDER_IAM__ROLES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_LIST = 3;

	/**
	 * The feature id for the '<em><b>Statements software amazon awscdk services iam Policy Statement As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST = 4;

	/**
	 * The feature id for the '<em><b>Users software amazon awscdk services iam IUser As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_BUILDER_IAM__USERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IUSER_AS_LIST = 5;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_BUILDER_IAM__GENERATED_CLASS_NAME = 6;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_BUILDER_IAM__VAR_NAME = 7;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_BUILDER_IAM__IDENTIFIER = 8;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_BUILDER_IAM__ADDITIONAL_CODE = 9;

	/**
	 * The number of structural features of the '<em>Policy Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_BUILDER_IAM_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Policy Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_BUILDER_IAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iam.impl.PolicyDocumentPropsBuilder_iamImpl <em>Policy Document Props Builder iam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iam.impl.PolicyDocumentPropsBuilder_iamImpl
	 * @see iam.impl.IamPackageImpl#getPolicyDocumentPropsBuilder_iam()
	 * @generated
	 */
	int POLICY_DOCUMENT_PROPS_BUILDER_IAM = 13;

	/**
	 * The feature id for the '<em><b>Assign Sids java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_DOCUMENT_PROPS_BUILDER_IAM__ASSIGN_SIDS_JAVA_LANG_BOOLEAN_ = 0;

	/**
	 * The feature id for the '<em><b>Statements software amazon awscdk services iam Policy Statement As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_DOCUMENT_PROPS_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST = 1;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_DOCUMENT_PROPS_BUILDER_IAM__GENERATED_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_DOCUMENT_PROPS_BUILDER_IAM__VAR_NAME = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_DOCUMENT_PROPS_BUILDER_IAM__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_DOCUMENT_PROPS_BUILDER_IAM__ADDITIONAL_CODE = 5;

	/**
	 * The number of structural features of the '<em>Policy Document Props Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_DOCUMENT_PROPS_BUILDER_IAM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Policy Document Props Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_DOCUMENT_PROPS_BUILDER_IAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iam.impl.UserPropsBuilder_iamImpl <em>User Props Builder iam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iam.impl.UserPropsBuilder_iamImpl
	 * @see iam.impl.IamPackageImpl#getUserPropsBuilder_iam()
	 * @generated
	 */
	int USER_PROPS_BUILDER_IAM = 14;

	/**
	 * The feature id for the '<em><b>Groups software amazon awscdk services iam IGroup As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROPS_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST = 0;

	/**
	 * The feature id for the '<em><b>Managed Policies software amazon awscdk services iam IManaged Policy As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROPS_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST = 1;

	/**
	 * The feature id for the '<em><b>Password With Secret Value software amazon awscdk core Secret Value As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROPS_BUILDER_IAM__PASSWORD_WITH_SECRET_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_SECRET_VALUE_AS_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Password Reset Required java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROPS_BUILDER_IAM__PASSWORD_RESET_REQUIRED_JAVA_LANG_BOOLEAN_ = 3;

	/**
	 * The feature id for the '<em><b>Path java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROPS_BUILDER_IAM__PATH_JAVA_LANG_STRING_ = 4;

	/**
	 * The feature id for the '<em><b>Permissions Boundary With IManaged Policy software amazon awscdk services iam IManaged Policy As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROPS_BUILDER_IAM__PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>User Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROPS_BUILDER_IAM__USER_NAME_JAVA_LANG_STRING_ = 6;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROPS_BUILDER_IAM__GENERATED_CLASS_NAME = 7;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROPS_BUILDER_IAM__VAR_NAME = 8;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROPS_BUILDER_IAM__IDENTIFIER = 9;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROPS_BUILDER_IAM__ADDITIONAL_CODE = 10;

	/**
	 * The number of structural features of the '<em>User Props Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROPS_BUILDER_IAM_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>User Props Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROPS_BUILDER_IAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iam.impl.AddToResourcePolicyResultBuilder_iamImpl <em>Add To Resource Policy Result Builder iam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iam.impl.AddToResourcePolicyResultBuilder_iamImpl
	 * @see iam.impl.IamPackageImpl#getAddToResourcePolicyResultBuilder_iam()
	 * @generated
	 */
	int ADD_TO_RESOURCE_POLICY_RESULT_BUILDER_IAM = 15;

	/**
	 * The feature id for the '<em><b>Statement Added java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TO_RESOURCE_POLICY_RESULT_BUILDER_IAM__STATEMENT_ADDED_JAVA_LANG_BOOLEAN_ = 0;

	/**
	 * The feature id for the '<em><b>Policy Dependable With IDependable software amazon awscdk core IDependable As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TO_RESOURCE_POLICY_RESULT_BUILDER_IAM__POLICY_DEPENDABLE_WITH_IDEPENDABLE_SOFTWARE_AMAZON_AWSCDK_CORE_IDEPENDABLE_AS_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TO_RESOURCE_POLICY_RESULT_BUILDER_IAM__GENERATED_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TO_RESOURCE_POLICY_RESULT_BUILDER_IAM__VAR_NAME = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TO_RESOURCE_POLICY_RESULT_BUILDER_IAM__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TO_RESOURCE_POLICY_RESULT_BUILDER_IAM__ADDITIONAL_CODE = 5;

	/**
	 * The number of structural features of the '<em>Add To Resource Policy Result Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TO_RESOURCE_POLICY_RESULT_BUILDER_IAM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Add To Resource Policy Result Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TO_RESOURCE_POLICY_RESULT_BUILDER_IAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iam.impl.PolicyStatementPropsBuilder_iamImpl <em>Policy Statement Props Builder iam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iam.impl.PolicyStatementPropsBuilder_iamImpl
	 * @see iam.impl.IamPackageImpl#getPolicyStatementPropsBuilder_iam()
	 * @generated
	 */
	int POLICY_STATEMENT_PROPS_BUILDER_IAM = 16;

	/**
	 * The feature id for the '<em><b>Actions java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT_PROPS_BUILDER_IAM__ACTIONS_JAVA_LANG_STRING_AS_LIST = 0;

	/**
	 * The feature id for the '<em><b>Conditions java lang String java lang Object As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT_PROPS_BUILDER_IAM__CONDITIONS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP = 1;

	/**
	 * The feature id for the '<em><b>Effect software amazon awscdk services iam Effect </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT_PROPS_BUILDER_IAM__EFFECT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_EFFECT_ = 2;

	/**
	 * The feature id for the '<em><b>Not Actions java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT_PROPS_BUILDER_IAM__NOT_ACTIONS_JAVA_LANG_STRING_AS_LIST = 3;

	/**
	 * The feature id for the '<em><b>Not Principals software amazon awscdk services iam IPrincipal As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT_PROPS_BUILDER_IAM__NOT_PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST = 4;

	/**
	 * The feature id for the '<em><b>Not Resources java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT_PROPS_BUILDER_IAM__NOT_RESOURCES_JAVA_LANG_STRING_AS_LIST = 5;

	/**
	 * The feature id for the '<em><b>Principals software amazon awscdk services iam IPrincipal As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT_PROPS_BUILDER_IAM__PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST = 6;

	/**
	 * The feature id for the '<em><b>Resources java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT_PROPS_BUILDER_IAM__RESOURCES_JAVA_LANG_STRING_AS_LIST = 7;

	/**
	 * The feature id for the '<em><b>Sid java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT_PROPS_BUILDER_IAM__SID_JAVA_LANG_STRING_ = 8;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT_PROPS_BUILDER_IAM__GENERATED_CLASS_NAME = 9;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT_PROPS_BUILDER_IAM__VAR_NAME = 10;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT_PROPS_BUILDER_IAM__IDENTIFIER = 11;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT_PROPS_BUILDER_IAM__ADDITIONAL_CODE = 12;

	/**
	 * The number of structural features of the '<em>Policy Statement Props Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT_PROPS_BUILDER_IAM_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Policy Statement Props Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT_PROPS_BUILDER_IAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iam.impl.AddToPrincipalPolicyResultBuilder_iamImpl <em>Add To Principal Policy Result Builder iam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iam.impl.AddToPrincipalPolicyResultBuilder_iamImpl
	 * @see iam.impl.IamPackageImpl#getAddToPrincipalPolicyResultBuilder_iam()
	 * @generated
	 */
	int ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM = 17;

	/**
	 * The feature id for the '<em><b>Statement Added java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__STATEMENT_ADDED_JAVA_LANG_BOOLEAN_ = 0;

	/**
	 * The feature id for the '<em><b>Policy Dependable With IDependable software amazon awscdk core IDependable As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__POLICY_DEPENDABLE_WITH_IDEPENDABLE_SOFTWARE_AMAZON_AWSCDK_CORE_IDEPENDABLE_AS_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__GENERATED_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__VAR_NAME = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__ADDITIONAL_CODE = 5;

	/**
	 * The number of structural features of the '<em>Add To Principal Policy Result Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Add To Principal Policy Result Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iam.impl.PolicyStatementBuilder_iamImpl <em>Policy Statement Builder iam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iam.impl.PolicyStatementBuilder_iamImpl
	 * @see iam.impl.IamPackageImpl#getPolicyStatementBuilder_iam()
	 * @generated
	 */
	int POLICY_STATEMENT_BUILDER_IAM = 18;

	/**
	 * The feature id for the '<em><b>Actions java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT_BUILDER_IAM__ACTIONS_JAVA_LANG_STRING_AS_LIST = 0;

	/**
	 * The feature id for the '<em><b>Conditions java lang String java lang Object As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT_BUILDER_IAM__CONDITIONS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP = 1;

	/**
	 * The feature id for the '<em><b>Effect software amazon awscdk services iam Effect </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT_BUILDER_IAM__EFFECT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_EFFECT_ = 2;

	/**
	 * The feature id for the '<em><b>Not Actions java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT_BUILDER_IAM__NOT_ACTIONS_JAVA_LANG_STRING_AS_LIST = 3;

	/**
	 * The feature id for the '<em><b>Not Principals software amazon awscdk services iam IPrincipal As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT_BUILDER_IAM__NOT_PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST = 4;

	/**
	 * The feature id for the '<em><b>Not Resources java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT_BUILDER_IAM__NOT_RESOURCES_JAVA_LANG_STRING_AS_LIST = 5;

	/**
	 * The feature id for the '<em><b>Principals software amazon awscdk services iam IPrincipal As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT_BUILDER_IAM__PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST = 6;

	/**
	 * The feature id for the '<em><b>Resources java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT_BUILDER_IAM__RESOURCES_JAVA_LANG_STRING_AS_LIST = 7;

	/**
	 * The feature id for the '<em><b>Sid java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT_BUILDER_IAM__SID_JAVA_LANG_STRING_ = 8;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT_BUILDER_IAM__GENERATED_CLASS_NAME = 9;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT_BUILDER_IAM__VAR_NAME = 10;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT_BUILDER_IAM__IDENTIFIER = 11;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT_BUILDER_IAM__ADDITIONAL_CODE = 12;

	/**
	 * The number of structural features of the '<em>Policy Statement Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT_BUILDER_IAM_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Policy Statement Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT_BUILDER_IAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iam.impl.ServicePrincipalOptsBuilder_iamImpl <em>Service Principal Opts Builder iam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iam.impl.ServicePrincipalOptsBuilder_iamImpl
	 * @see iam.impl.IamPackageImpl#getServicePrincipalOptsBuilder_iam()
	 * @generated
	 */
	int SERVICE_PRINCIPAL_OPTS_BUILDER_IAM = 19;

	/**
	 * The feature id for the '<em><b>Conditions java lang String java lang Object As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PRINCIPAL_OPTS_BUILDER_IAM__CONDITIONS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP = 0;

	/**
	 * The feature id for the '<em><b>Region java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PRINCIPAL_OPTS_BUILDER_IAM__REGION_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PRINCIPAL_OPTS_BUILDER_IAM__GENERATED_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PRINCIPAL_OPTS_BUILDER_IAM__VAR_NAME = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PRINCIPAL_OPTS_BUILDER_IAM__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PRINCIPAL_OPTS_BUILDER_IAM__ADDITIONAL_CODE = 5;

	/**
	 * The number of structural features of the '<em>Service Principal Opts Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PRINCIPAL_OPTS_BUILDER_IAM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Service Principal Opts Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PRINCIPAL_OPTS_BUILDER_IAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iam.impl.UnknownPrincipalBuilder_iamImpl <em>Unknown Principal Builder iam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iam.impl.UnknownPrincipalBuilder_iamImpl
	 * @see iam.impl.IamPackageImpl#getUnknownPrincipalBuilder_iam()
	 * @generated
	 */
	int UNKNOWN_PRINCIPAL_BUILDER_IAM = 20;

	/**
	 * The feature id for the '<em><b>Resource With IConstruct software amazon awscdk core IConstruct As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PRINCIPAL_BUILDER_IAM__RESOURCE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PRINCIPAL_BUILDER_IAM__GENERATED_CLASS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PRINCIPAL_BUILDER_IAM__VAR_NAME = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PRINCIPAL_BUILDER_IAM__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PRINCIPAL_BUILDER_IAM__ADDITIONAL_CODE = 4;

	/**
	 * The number of structural features of the '<em>Unknown Principal Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PRINCIPAL_BUILDER_IAM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Unknown Principal Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_PRINCIPAL_BUILDER_IAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iam.impl.ManagedPolicyPropsBuilder_iamImpl <em>Managed Policy Props Builder iam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iam.impl.ManagedPolicyPropsBuilder_iamImpl
	 * @see iam.impl.IamPackageImpl#getManagedPolicyPropsBuilder_iam()
	 * @generated
	 */
	int MANAGED_POLICY_PROPS_BUILDER_IAM = 21;

	/**
	 * The feature id for the '<em><b>Description java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_POLICY_PROPS_BUILDER_IAM__DESCRIPTION_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Document With Policy Document software amazon awscdk services iam Policy Document As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_POLICY_PROPS_BUILDER_IAM__DOCUMENT_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Groups software amazon awscdk services iam IGroup As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_POLICY_PROPS_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST = 2;

	/**
	 * The feature id for the '<em><b>Managed Policy Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_POLICY_PROPS_BUILDER_IAM__MANAGED_POLICY_NAME_JAVA_LANG_STRING_ = 3;

	/**
	 * The feature id for the '<em><b>Path java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_POLICY_PROPS_BUILDER_IAM__PATH_JAVA_LANG_STRING_ = 4;

	/**
	 * The feature id for the '<em><b>Roles software amazon awscdk services iam IRole As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_POLICY_PROPS_BUILDER_IAM__ROLES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_LIST = 5;

	/**
	 * The feature id for the '<em><b>Statements software amazon awscdk services iam Policy Statement As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_POLICY_PROPS_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST = 6;

	/**
	 * The feature id for the '<em><b>Users software amazon awscdk services iam IUser As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_POLICY_PROPS_BUILDER_IAM__USERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IUSER_AS_LIST = 7;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_POLICY_PROPS_BUILDER_IAM__GENERATED_CLASS_NAME = 8;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_POLICY_PROPS_BUILDER_IAM__VAR_NAME = 9;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_POLICY_PROPS_BUILDER_IAM__IDENTIFIER = 10;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_POLICY_PROPS_BUILDER_IAM__ADDITIONAL_CODE = 11;

	/**
	 * The number of structural features of the '<em>Managed Policy Props Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_POLICY_PROPS_BUILDER_IAM_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Managed Policy Props Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_POLICY_PROPS_BUILDER_IAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iam.impl.OpenIdConnectProviderBuilder_iamImpl <em>Open Id Connect Provider Builder iam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iam.impl.OpenIdConnectProviderBuilder_iamImpl
	 * @see iam.impl.IamPackageImpl#getOpenIdConnectProviderBuilder_iam()
	 * @generated
	 */
	int OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM = 22;

	/**
	 * The feature id for the '<em><b>Url java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__URL_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Client Ids java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__CLIENT_IDS_JAVA_LANG_STRING_AS_LIST = 1;

	/**
	 * The feature id for the '<em><b>Thumbprints java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__THUMBPRINTS_JAVA_LANG_STRING_AS_LIST = 2;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__GENERATED_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__VAR_NAME = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__ADDITIONAL_CODE = 6;

	/**
	 * The number of structural features of the '<em>Open Id Connect Provider Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Open Id Connect Provider Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iam.impl.LazyRoleBuilder_iamImpl <em>Lazy Role Builder iam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iam.impl.LazyRoleBuilder_iamImpl
	 * @see iam.impl.IamPackageImpl#getLazyRoleBuilder_iam()
	 * @generated
	 */
	int LAZY_ROLE_BUILDER_IAM = 23;

	/**
	 * The feature id for the '<em><b>Assumed By With IPrincipal software amazon awscdk services iam IPrincipal As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ROLE_BUILDER_IAM__ASSUMED_BY_WITH_IPRINCIPAL_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Description java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ROLE_BUILDER_IAM__DESCRIPTION_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>External Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ROLE_BUILDER_IAM__EXTERNAL_ID_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>External Ids java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ROLE_BUILDER_IAM__EXTERNAL_IDS_JAVA_LANG_STRING_AS_LIST = 3;

	/**
	 * The feature id for the '<em><b>Inline Policies java lang String software amazon awscdk services iam Policy Document As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ROLE_BUILDER_IAM__INLINE_POLICIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_MAP = 4;

	/**
	 * The feature id for the '<em><b>Managed Policies software amazon awscdk services iam IManaged Policy As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ROLE_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST = 5;

	/**
	 * The feature id for the '<em><b>Max Session Duration With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ROLE_BUILDER_IAM__MAX_SESSION_DURATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Path java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ROLE_BUILDER_IAM__PATH_JAVA_LANG_STRING_ = 7;

	/**
	 * The feature id for the '<em><b>Permissions Boundary With IManaged Policy software amazon awscdk services iam IManaged Policy As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ROLE_BUILDER_IAM__PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE = 8;

	/**
	 * The feature id for the '<em><b>Role Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ROLE_BUILDER_IAM__ROLE_NAME_JAVA_LANG_STRING_ = 9;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ROLE_BUILDER_IAM__GENERATED_CLASS_NAME = 10;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ROLE_BUILDER_IAM__VAR_NAME = 11;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ROLE_BUILDER_IAM__IDENTIFIER = 12;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ROLE_BUILDER_IAM__ADDITIONAL_CODE = 13;

	/**
	 * The number of structural features of the '<em>Lazy Role Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ROLE_BUILDER_IAM_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Lazy Role Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ROLE_BUILDER_IAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iam.impl.CommonGrantOptionsBuilder_iamImpl <em>Common Grant Options Builder iam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iam.impl.CommonGrantOptionsBuilder_iamImpl
	 * @see iam.impl.IamPackageImpl#getCommonGrantOptionsBuilder_iam()
	 * @generated
	 */
	int COMMON_GRANT_OPTIONS_BUILDER_IAM = 24;

	/**
	 * The feature id for the '<em><b>Actions java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_GRANT_OPTIONS_BUILDER_IAM__ACTIONS_JAVA_LANG_STRING_AS_LIST = 0;

	/**
	 * The feature id for the '<em><b>Grantee With IGrantable software amazon awscdk services iam IGrantable As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_GRANT_OPTIONS_BUILDER_IAM__GRANTEE_WITH_IGRANTABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGRANTABLE_AS_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Resource Arns java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_GRANT_OPTIONS_BUILDER_IAM__RESOURCE_ARNS_JAVA_LANG_STRING_AS_LIST = 2;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_GRANT_OPTIONS_BUILDER_IAM__GENERATED_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_GRANT_OPTIONS_BUILDER_IAM__VAR_NAME = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_GRANT_OPTIONS_BUILDER_IAM__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_GRANT_OPTIONS_BUILDER_IAM__ADDITIONAL_CODE = 6;

	/**
	 * The number of structural features of the '<em>Common Grant Options Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_GRANT_OPTIONS_BUILDER_IAM_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Common Grant Options Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_GRANT_OPTIONS_BUILDER_IAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iam.impl.GrantWithResourceOptionsBuilder_iamImpl <em>Grant With Resource Options Builder iam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iam.impl.GrantWithResourceOptionsBuilder_iamImpl
	 * @see iam.impl.IamPackageImpl#getGrantWithResourceOptionsBuilder_iam()
	 * @generated
	 */
	int GRANT_WITH_RESOURCE_OPTIONS_BUILDER_IAM = 25;

	/**
	 * The feature id for the '<em><b>Resource With IResource With Policy software amazon awscdk services iam IResource With Policy As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_WITH_RESOURCE_OPTIONS_BUILDER_IAM__RESOURCE_WITH_IRESOURCE_WITH_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IRESOURCE_WITH_POLICY_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Resource Self Arns java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_WITH_RESOURCE_OPTIONS_BUILDER_IAM__RESOURCE_SELF_ARNS_JAVA_LANG_STRING_AS_LIST = 1;

	/**
	 * The feature id for the '<em><b>Actions java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_WITH_RESOURCE_OPTIONS_BUILDER_IAM__ACTIONS_JAVA_LANG_STRING_AS_LIST = 2;

	/**
	 * The feature id for the '<em><b>Grantee With IGrantable software amazon awscdk services iam IGrantable As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_WITH_RESOURCE_OPTIONS_BUILDER_IAM__GRANTEE_WITH_IGRANTABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGRANTABLE_AS_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Resource Arns java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_WITH_RESOURCE_OPTIONS_BUILDER_IAM__RESOURCE_ARNS_JAVA_LANG_STRING_AS_LIST = 4;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_WITH_RESOURCE_OPTIONS_BUILDER_IAM__GENERATED_CLASS_NAME = 5;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_WITH_RESOURCE_OPTIONS_BUILDER_IAM__VAR_NAME = 6;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_WITH_RESOURCE_OPTIONS_BUILDER_IAM__IDENTIFIER = 7;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_WITH_RESOURCE_OPTIONS_BUILDER_IAM__ADDITIONAL_CODE = 8;

	/**
	 * The number of structural features of the '<em>Grant With Resource Options Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_WITH_RESOURCE_OPTIONS_BUILDER_IAM_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Grant With Resource Options Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_WITH_RESOURCE_OPTIONS_BUILDER_IAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iam.impl.LazyRolePropsBuilder_iamImpl <em>Lazy Role Props Builder iam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iam.impl.LazyRolePropsBuilder_iamImpl
	 * @see iam.impl.IamPackageImpl#getLazyRolePropsBuilder_iam()
	 * @generated
	 */
	int LAZY_ROLE_PROPS_BUILDER_IAM = 26;

	/**
	 * The feature id for the '<em><b>Assumed By With IPrincipal software amazon awscdk services iam IPrincipal As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ROLE_PROPS_BUILDER_IAM__ASSUMED_BY_WITH_IPRINCIPAL_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Description java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ROLE_PROPS_BUILDER_IAM__DESCRIPTION_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>External Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ROLE_PROPS_BUILDER_IAM__EXTERNAL_ID_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>External Ids java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ROLE_PROPS_BUILDER_IAM__EXTERNAL_IDS_JAVA_LANG_STRING_AS_LIST = 3;

	/**
	 * The feature id for the '<em><b>Inline Policies java lang String software amazon awscdk services iam Policy Document As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ROLE_PROPS_BUILDER_IAM__INLINE_POLICIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_MAP = 4;

	/**
	 * The feature id for the '<em><b>Managed Policies software amazon awscdk services iam IManaged Policy As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ROLE_PROPS_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST = 5;

	/**
	 * The feature id for the '<em><b>Max Session Duration With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ROLE_PROPS_BUILDER_IAM__MAX_SESSION_DURATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Path java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ROLE_PROPS_BUILDER_IAM__PATH_JAVA_LANG_STRING_ = 7;

	/**
	 * The feature id for the '<em><b>Permissions Boundary With IManaged Policy software amazon awscdk services iam IManaged Policy As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ROLE_PROPS_BUILDER_IAM__PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE = 8;

	/**
	 * The feature id for the '<em><b>Role Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ROLE_PROPS_BUILDER_IAM__ROLE_NAME_JAVA_LANG_STRING_ = 9;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ROLE_PROPS_BUILDER_IAM__GENERATED_CLASS_NAME = 10;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ROLE_PROPS_BUILDER_IAM__VAR_NAME = 11;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ROLE_PROPS_BUILDER_IAM__IDENTIFIER = 12;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ROLE_PROPS_BUILDER_IAM__ADDITIONAL_CODE = 13;

	/**
	 * The number of structural features of the '<em>Lazy Role Props Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ROLE_PROPS_BUILDER_IAM_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Lazy Role Props Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ROLE_PROPS_BUILDER_IAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iam.impl.PolicyPropsBuilder_iamImpl <em>Policy Props Builder iam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iam.impl.PolicyPropsBuilder_iamImpl
	 * @see iam.impl.IamPackageImpl#getPolicyPropsBuilder_iam()
	 * @generated
	 */
	int POLICY_PROPS_BUILDER_IAM = 27;

	/**
	 * The feature id for the '<em><b>Force java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_PROPS_BUILDER_IAM__FORCE_JAVA_LANG_BOOLEAN_ = 0;

	/**
	 * The feature id for the '<em><b>Groups software amazon awscdk services iam IGroup As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_PROPS_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST = 1;

	/**
	 * The feature id for the '<em><b>Policy Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_PROPS_BUILDER_IAM__POLICY_NAME_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Roles software amazon awscdk services iam IRole As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_PROPS_BUILDER_IAM__ROLES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_LIST = 3;

	/**
	 * The feature id for the '<em><b>Statements software amazon awscdk services iam Policy Statement As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_PROPS_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST = 4;

	/**
	 * The feature id for the '<em><b>Users software amazon awscdk services iam IUser As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_PROPS_BUILDER_IAM__USERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IUSER_AS_LIST = 5;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_PROPS_BUILDER_IAM__GENERATED_CLASS_NAME = 6;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_PROPS_BUILDER_IAM__VAR_NAME = 7;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_PROPS_BUILDER_IAM__IDENTIFIER = 8;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_PROPS_BUILDER_IAM__ADDITIONAL_CODE = 9;

	/**
	 * The number of structural features of the '<em>Policy Props Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_PROPS_BUILDER_IAM_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Policy Props Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_PROPS_BUILDER_IAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iam.impl.GroupBuilder_iamImpl <em>Group Builder iam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iam.impl.GroupBuilder_iamImpl
	 * @see iam.impl.IamPackageImpl#getGroupBuilder_iam()
	 * @generated
	 */
	int GROUP_BUILDER_IAM = 28;

	/**
	 * The feature id for the '<em><b>Group Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BUILDER_IAM__GROUP_NAME_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Managed Policies software amazon awscdk services iam IManaged Policy As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST = 1;

	/**
	 * The feature id for the '<em><b>Path java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BUILDER_IAM__PATH_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BUILDER_IAM__GENERATED_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BUILDER_IAM__VAR_NAME = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BUILDER_IAM__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BUILDER_IAM__ADDITIONAL_CODE = 6;

	/**
	 * The number of structural features of the '<em>Group Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BUILDER_IAM_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Group Builder iam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BUILDER_IAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iam.Effect <em>Effect</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iam.Effect
	 * @see iam.impl.IamPackageImpl#getEffect()
	 * @generated
	 */
	int EFFECT = 29;

	/**
	 * Returns the meta object for class '{@link iam.RolePropsBuilder_iam <em>Role Props Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Props Builder iam</em>'.
	 * @see iam.RolePropsBuilder_iam
	 * @generated
	 */
	EClass getRolePropsBuilder_iam();

	/**
	 * Returns the meta object for the attribute '{@link iam.RolePropsBuilder_iam#getAssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference <em>Assumed By With IPrincipal software amazon awscdk services iam IPrincipal As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assumed By With IPrincipal software amazon awscdk services iam IPrincipal As Reference</em>'.
	 * @see iam.RolePropsBuilder_iam#getAssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference()
	 * @see #getRolePropsBuilder_iam()
	 * @generated
	 */
	EAttribute getRolePropsBuilder_iam_AssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link iam.RolePropsBuilder_iam#getDescription_java_lang_String_ <em>Description java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description java lang String </em>'.
	 * @see iam.RolePropsBuilder_iam#getDescription_java_lang_String_()
	 * @see #getRolePropsBuilder_iam()
	 * @generated
	 */
	EAttribute getRolePropsBuilder_iam_Description_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.RolePropsBuilder_iam#getExternalId_java_lang_String_ <em>External Id java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Id java lang String </em>'.
	 * @see iam.RolePropsBuilder_iam#getExternalId_java_lang_String_()
	 * @see #getRolePropsBuilder_iam()
	 * @generated
	 */
	EAttribute getRolePropsBuilder_iam_ExternalId_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.RolePropsBuilder_iam#getExternalIds_java_lang_String_AsList <em>External Ids java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Ids java lang String As List</em>'.
	 * @see iam.RolePropsBuilder_iam#getExternalIds_java_lang_String_AsList()
	 * @see #getRolePropsBuilder_iam()
	 * @generated
	 */
	EAttribute getRolePropsBuilder_iam_ExternalIds_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.RolePropsBuilder_iam#getInlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap <em>Inline Policies java lang String software amazon awscdk services iam Policy Document As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inline Policies java lang String software amazon awscdk services iam Policy Document As Map</em>'.
	 * @see iam.RolePropsBuilder_iam#getInlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap()
	 * @see #getRolePropsBuilder_iam()
	 * @generated
	 */
	EAttribute getRolePropsBuilder_iam_InlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap();

	/**
	 * Returns the meta object for the attribute '{@link iam.RolePropsBuilder_iam#getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList <em>Managed Policies software amazon awscdk services iam IManaged Policy As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Managed Policies software amazon awscdk services iam IManaged Policy As List</em>'.
	 * @see iam.RolePropsBuilder_iam#getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList()
	 * @see #getRolePropsBuilder_iam()
	 * @generated
	 */
	EAttribute getRolePropsBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.RolePropsBuilder_iam#getMaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Max Session Duration With Duration software amazon awscdk core Duration As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Session Duration With Duration software amazon awscdk core Duration As Reference</em>'.
	 * @see iam.RolePropsBuilder_iam#getMaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @see #getRolePropsBuilder_iam()
	 * @generated
	 */
	EAttribute getRolePropsBuilder_iam_MaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link iam.RolePropsBuilder_iam#getPath_java_lang_String_ <em>Path java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path java lang String </em>'.
	 * @see iam.RolePropsBuilder_iam#getPath_java_lang_String_()
	 * @see #getRolePropsBuilder_iam()
	 * @generated
	 */
	EAttribute getRolePropsBuilder_iam_Path_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.RolePropsBuilder_iam#getPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference <em>Permissions Boundary With IManaged Policy software amazon awscdk services iam IManaged Policy As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permissions Boundary With IManaged Policy software amazon awscdk services iam IManaged Policy As Reference</em>'.
	 * @see iam.RolePropsBuilder_iam#getPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference()
	 * @see #getRolePropsBuilder_iam()
	 * @generated
	 */
	EAttribute getRolePropsBuilder_iam_PermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link iam.RolePropsBuilder_iam#getRoleName_java_lang_String_ <em>Role Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Name java lang String </em>'.
	 * @see iam.RolePropsBuilder_iam#getRoleName_java_lang_String_()
	 * @see #getRolePropsBuilder_iam()
	 * @generated
	 */
	EAttribute getRolePropsBuilder_iam_RoleName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.RolePropsBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see iam.RolePropsBuilder_iam#getGeneratedClassName()
	 * @see #getRolePropsBuilder_iam()
	 * @generated
	 */
	EAttribute getRolePropsBuilder_iam_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link iam.RolePropsBuilder_iam#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see iam.RolePropsBuilder_iam#getVarName()
	 * @see #getRolePropsBuilder_iam()
	 * @generated
	 */
	EAttribute getRolePropsBuilder_iam_VarName();

	/**
	 * Returns the meta object for the attribute '{@link iam.RolePropsBuilder_iam#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see iam.RolePropsBuilder_iam#getIdentifier()
	 * @see #getRolePropsBuilder_iam()
	 * @generated
	 */
	EAttribute getRolePropsBuilder_iam_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link iam.RolePropsBuilder_iam#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see iam.RolePropsBuilder_iam#getAdditionalCode()
	 * @see #getRolePropsBuilder_iam()
	 * @generated
	 */
	EAttribute getRolePropsBuilder_iam_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link iam.UnknownPrincipalPropsBuilder_iam <em>Unknown Principal Props Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknown Principal Props Builder iam</em>'.
	 * @see iam.UnknownPrincipalPropsBuilder_iam
	 * @generated
	 */
	EClass getUnknownPrincipalPropsBuilder_iam();

	/**
	 * Returns the meta object for the attribute '{@link iam.UnknownPrincipalPropsBuilder_iam#getResourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference <em>Resource With IConstruct software amazon awscdk core IConstruct As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource With IConstruct software amazon awscdk core IConstruct As Reference</em>'.
	 * @see iam.UnknownPrincipalPropsBuilder_iam#getResourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference()
	 * @see #getUnknownPrincipalPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getUnknownPrincipalPropsBuilder_iam_ResourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link iam.UnknownPrincipalPropsBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see iam.UnknownPrincipalPropsBuilder_iam#getGeneratedClassName()
	 * @see #getUnknownPrincipalPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getUnknownPrincipalPropsBuilder_iam_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link iam.UnknownPrincipalPropsBuilder_iam#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see iam.UnknownPrincipalPropsBuilder_iam#getVarName()
	 * @see #getUnknownPrincipalPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getUnknownPrincipalPropsBuilder_iam_VarName();

	/**
	 * Returns the meta object for the attribute '{@link iam.UnknownPrincipalPropsBuilder_iam#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see iam.UnknownPrincipalPropsBuilder_iam#getIdentifier()
	 * @see #getUnknownPrincipalPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getUnknownPrincipalPropsBuilder_iam_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link iam.UnknownPrincipalPropsBuilder_iam#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see iam.UnknownPrincipalPropsBuilder_iam#getAdditionalCode()
	 * @see #getUnknownPrincipalPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getUnknownPrincipalPropsBuilder_iam_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link iam.OpenIdConnectProviderPropsBuilder_iam <em>Open Id Connect Provider Props Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Id Connect Provider Props Builder iam</em>'.
	 * @see iam.OpenIdConnectProviderPropsBuilder_iam
	 * @generated
	 */
	EClass getOpenIdConnectProviderPropsBuilder_iam();

	/**
	 * Returns the meta object for the attribute '{@link iam.OpenIdConnectProviderPropsBuilder_iam#getUrl_java_lang_String_ <em>Url java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url java lang String </em>'.
	 * @see iam.OpenIdConnectProviderPropsBuilder_iam#getUrl_java_lang_String_()
	 * @see #getOpenIdConnectProviderPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getOpenIdConnectProviderPropsBuilder_iam_Url_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.OpenIdConnectProviderPropsBuilder_iam#getClientIds_java_lang_String_AsList <em>Client Ids java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Ids java lang String As List</em>'.
	 * @see iam.OpenIdConnectProviderPropsBuilder_iam#getClientIds_java_lang_String_AsList()
	 * @see #getOpenIdConnectProviderPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getOpenIdConnectProviderPropsBuilder_iam_ClientIds_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.OpenIdConnectProviderPropsBuilder_iam#getThumbprints_java_lang_String_AsList <em>Thumbprints java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thumbprints java lang String As List</em>'.
	 * @see iam.OpenIdConnectProviderPropsBuilder_iam#getThumbprints_java_lang_String_AsList()
	 * @see #getOpenIdConnectProviderPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getOpenIdConnectProviderPropsBuilder_iam_Thumbprints_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.OpenIdConnectProviderPropsBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see iam.OpenIdConnectProviderPropsBuilder_iam#getGeneratedClassName()
	 * @see #getOpenIdConnectProviderPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getOpenIdConnectProviderPropsBuilder_iam_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link iam.OpenIdConnectProviderPropsBuilder_iam#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see iam.OpenIdConnectProviderPropsBuilder_iam#getVarName()
	 * @see #getOpenIdConnectProviderPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getOpenIdConnectProviderPropsBuilder_iam_VarName();

	/**
	 * Returns the meta object for the attribute '{@link iam.OpenIdConnectProviderPropsBuilder_iam#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see iam.OpenIdConnectProviderPropsBuilder_iam#getIdentifier()
	 * @see #getOpenIdConnectProviderPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getOpenIdConnectProviderPropsBuilder_iam_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link iam.OpenIdConnectProviderPropsBuilder_iam#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see iam.OpenIdConnectProviderPropsBuilder_iam#getAdditionalCode()
	 * @see #getOpenIdConnectProviderPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getOpenIdConnectProviderPropsBuilder_iam_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link iam.GroupPropsBuilder_iam <em>Group Props Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Props Builder iam</em>'.
	 * @see iam.GroupPropsBuilder_iam
	 * @generated
	 */
	EClass getGroupPropsBuilder_iam();

	/**
	 * Returns the meta object for the attribute '{@link iam.GroupPropsBuilder_iam#getGroupName_java_lang_String_ <em>Group Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Name java lang String </em>'.
	 * @see iam.GroupPropsBuilder_iam#getGroupName_java_lang_String_()
	 * @see #getGroupPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getGroupPropsBuilder_iam_GroupName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.GroupPropsBuilder_iam#getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList <em>Managed Policies software amazon awscdk services iam IManaged Policy As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Managed Policies software amazon awscdk services iam IManaged Policy As List</em>'.
	 * @see iam.GroupPropsBuilder_iam#getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList()
	 * @see #getGroupPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getGroupPropsBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.GroupPropsBuilder_iam#getPath_java_lang_String_ <em>Path java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path java lang String </em>'.
	 * @see iam.GroupPropsBuilder_iam#getPath_java_lang_String_()
	 * @see #getGroupPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getGroupPropsBuilder_iam_Path_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.GroupPropsBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see iam.GroupPropsBuilder_iam#getGeneratedClassName()
	 * @see #getGroupPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getGroupPropsBuilder_iam_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link iam.GroupPropsBuilder_iam#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see iam.GroupPropsBuilder_iam#getVarName()
	 * @see #getGroupPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getGroupPropsBuilder_iam_VarName();

	/**
	 * Returns the meta object for the attribute '{@link iam.GroupPropsBuilder_iam#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see iam.GroupPropsBuilder_iam#getIdentifier()
	 * @see #getGroupPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getGroupPropsBuilder_iam_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link iam.GroupPropsBuilder_iam#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see iam.GroupPropsBuilder_iam#getAdditionalCode()
	 * @see #getGroupPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getGroupPropsBuilder_iam_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link iam.RoleBuilder_iam <em>Role Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Builder iam</em>'.
	 * @see iam.RoleBuilder_iam
	 * @generated
	 */
	EClass getRoleBuilder_iam();

	/**
	 * Returns the meta object for the attribute '{@link iam.RoleBuilder_iam#getAssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference <em>Assumed By With IPrincipal software amazon awscdk services iam IPrincipal As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assumed By With IPrincipal software amazon awscdk services iam IPrincipal As Reference</em>'.
	 * @see iam.RoleBuilder_iam#getAssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference()
	 * @see #getRoleBuilder_iam()
	 * @generated
	 */
	EAttribute getRoleBuilder_iam_AssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link iam.RoleBuilder_iam#getDescription_java_lang_String_ <em>Description java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description java lang String </em>'.
	 * @see iam.RoleBuilder_iam#getDescription_java_lang_String_()
	 * @see #getRoleBuilder_iam()
	 * @generated
	 */
	EAttribute getRoleBuilder_iam_Description_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.RoleBuilder_iam#getExternalId_java_lang_String_ <em>External Id java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Id java lang String </em>'.
	 * @see iam.RoleBuilder_iam#getExternalId_java_lang_String_()
	 * @see #getRoleBuilder_iam()
	 * @generated
	 */
	EAttribute getRoleBuilder_iam_ExternalId_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.RoleBuilder_iam#getExternalIds_java_lang_String_AsList <em>External Ids java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Ids java lang String As List</em>'.
	 * @see iam.RoleBuilder_iam#getExternalIds_java_lang_String_AsList()
	 * @see #getRoleBuilder_iam()
	 * @generated
	 */
	EAttribute getRoleBuilder_iam_ExternalIds_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.RoleBuilder_iam#getInlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap <em>Inline Policies java lang String software amazon awscdk services iam Policy Document As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inline Policies java lang String software amazon awscdk services iam Policy Document As Map</em>'.
	 * @see iam.RoleBuilder_iam#getInlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap()
	 * @see #getRoleBuilder_iam()
	 * @generated
	 */
	EAttribute getRoleBuilder_iam_InlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap();

	/**
	 * Returns the meta object for the attribute '{@link iam.RoleBuilder_iam#getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList <em>Managed Policies software amazon awscdk services iam IManaged Policy As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Managed Policies software amazon awscdk services iam IManaged Policy As List</em>'.
	 * @see iam.RoleBuilder_iam#getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList()
	 * @see #getRoleBuilder_iam()
	 * @generated
	 */
	EAttribute getRoleBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.RoleBuilder_iam#getMaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Max Session Duration With Duration software amazon awscdk core Duration As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Session Duration With Duration software amazon awscdk core Duration As Reference</em>'.
	 * @see iam.RoleBuilder_iam#getMaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @see #getRoleBuilder_iam()
	 * @generated
	 */
	EAttribute getRoleBuilder_iam_MaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link iam.RoleBuilder_iam#getPath_java_lang_String_ <em>Path java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path java lang String </em>'.
	 * @see iam.RoleBuilder_iam#getPath_java_lang_String_()
	 * @see #getRoleBuilder_iam()
	 * @generated
	 */
	EAttribute getRoleBuilder_iam_Path_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.RoleBuilder_iam#getPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference <em>Permissions Boundary With IManaged Policy software amazon awscdk services iam IManaged Policy As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permissions Boundary With IManaged Policy software amazon awscdk services iam IManaged Policy As Reference</em>'.
	 * @see iam.RoleBuilder_iam#getPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference()
	 * @see #getRoleBuilder_iam()
	 * @generated
	 */
	EAttribute getRoleBuilder_iam_PermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link iam.RoleBuilder_iam#getRoleName_java_lang_String_ <em>Role Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Name java lang String </em>'.
	 * @see iam.RoleBuilder_iam#getRoleName_java_lang_String_()
	 * @see #getRoleBuilder_iam()
	 * @generated
	 */
	EAttribute getRoleBuilder_iam_RoleName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.RoleBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see iam.RoleBuilder_iam#getGeneratedClassName()
	 * @see #getRoleBuilder_iam()
	 * @generated
	 */
	EAttribute getRoleBuilder_iam_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link iam.RoleBuilder_iam#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see iam.RoleBuilder_iam#getVarName()
	 * @see #getRoleBuilder_iam()
	 * @generated
	 */
	EAttribute getRoleBuilder_iam_VarName();

	/**
	 * Returns the meta object for the attribute '{@link iam.RoleBuilder_iam#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see iam.RoleBuilder_iam#getIdentifier()
	 * @see #getRoleBuilder_iam()
	 * @generated
	 */
	EAttribute getRoleBuilder_iam_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link iam.RoleBuilder_iam#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see iam.RoleBuilder_iam#getAdditionalCode()
	 * @see #getRoleBuilder_iam()
	 * @generated
	 */
	EAttribute getRoleBuilder_iam_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link iam.ServicePrincipalBuilder_iam <em>Service Principal Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Principal Builder iam</em>'.
	 * @see iam.ServicePrincipalBuilder_iam
	 * @generated
	 */
	EClass getServicePrincipalBuilder_iam();

	/**
	 * Returns the meta object for the attribute '{@link iam.ServicePrincipalBuilder_iam#getConditions_java_lang_String__java_lang_Object_AsMap <em>Conditions java lang String java lang Object As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conditions java lang String java lang Object As Map</em>'.
	 * @see iam.ServicePrincipalBuilder_iam#getConditions_java_lang_String__java_lang_Object_AsMap()
	 * @see #getServicePrincipalBuilder_iam()
	 * @generated
	 */
	EAttribute getServicePrincipalBuilder_iam_Conditions_java_lang_String__java_lang_Object_AsMap();

	/**
	 * Returns the meta object for the attribute '{@link iam.ServicePrincipalBuilder_iam#getRegion_java_lang_String_ <em>Region java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region java lang String </em>'.
	 * @see iam.ServicePrincipalBuilder_iam#getRegion_java_lang_String_()
	 * @see #getServicePrincipalBuilder_iam()
	 * @generated
	 */
	EAttribute getServicePrincipalBuilder_iam_Region_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.ServicePrincipalBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see iam.ServicePrincipalBuilder_iam#getGeneratedClassName()
	 * @see #getServicePrincipalBuilder_iam()
	 * @generated
	 */
	EAttribute getServicePrincipalBuilder_iam_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link iam.ServicePrincipalBuilder_iam#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see iam.ServicePrincipalBuilder_iam#getVarName()
	 * @see #getServicePrincipalBuilder_iam()
	 * @generated
	 */
	EAttribute getServicePrincipalBuilder_iam_VarName();

	/**
	 * Returns the meta object for the attribute '{@link iam.ServicePrincipalBuilder_iam#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see iam.ServicePrincipalBuilder_iam#getIdentifier()
	 * @see #getServicePrincipalBuilder_iam()
	 * @generated
	 */
	EAttribute getServicePrincipalBuilder_iam_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link iam.ServicePrincipalBuilder_iam#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see iam.ServicePrincipalBuilder_iam#getAdditionalCode()
	 * @see #getServicePrincipalBuilder_iam()
	 * @generated
	 */
	EAttribute getServicePrincipalBuilder_iam_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link iam.GrantOnPrincipalOptionsBuilder_iam <em>Grant On Principal Options Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grant On Principal Options Builder iam</em>'.
	 * @see iam.GrantOnPrincipalOptionsBuilder_iam
	 * @generated
	 */
	EClass getGrantOnPrincipalOptionsBuilder_iam();

	/**
	 * Returns the meta object for the attribute '{@link iam.GrantOnPrincipalOptionsBuilder_iam#getScopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference <em>Scope With IConstruct software amazon awscdk core IConstruct As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope With IConstruct software amazon awscdk core IConstruct As Reference</em>'.
	 * @see iam.GrantOnPrincipalOptionsBuilder_iam#getScopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference()
	 * @see #getGrantOnPrincipalOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getGrantOnPrincipalOptionsBuilder_iam_ScopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link iam.GrantOnPrincipalOptionsBuilder_iam#getActions_java_lang_String_AsList <em>Actions java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actions java lang String As List</em>'.
	 * @see iam.GrantOnPrincipalOptionsBuilder_iam#getActions_java_lang_String_AsList()
	 * @see #getGrantOnPrincipalOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getGrantOnPrincipalOptionsBuilder_iam_Actions_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.GrantOnPrincipalOptionsBuilder_iam#getGranteeWithIGrantable_software_amazon_awscdk_services_iam_IGrantable_AsReference <em>Grantee With IGrantable software amazon awscdk services iam IGrantable As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grantee With IGrantable software amazon awscdk services iam IGrantable As Reference</em>'.
	 * @see iam.GrantOnPrincipalOptionsBuilder_iam#getGranteeWithIGrantable_software_amazon_awscdk_services_iam_IGrantable_AsReference()
	 * @see #getGrantOnPrincipalOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getGrantOnPrincipalOptionsBuilder_iam_GranteeWithIGrantable_software_amazon_awscdk_services_iam_IGrantable_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link iam.GrantOnPrincipalOptionsBuilder_iam#getResourceArns_java_lang_String_AsList <em>Resource Arns java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Arns java lang String As List</em>'.
	 * @see iam.GrantOnPrincipalOptionsBuilder_iam#getResourceArns_java_lang_String_AsList()
	 * @see #getGrantOnPrincipalOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getGrantOnPrincipalOptionsBuilder_iam_ResourceArns_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.GrantOnPrincipalOptionsBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see iam.GrantOnPrincipalOptionsBuilder_iam#getGeneratedClassName()
	 * @see #getGrantOnPrincipalOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getGrantOnPrincipalOptionsBuilder_iam_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link iam.GrantOnPrincipalOptionsBuilder_iam#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see iam.GrantOnPrincipalOptionsBuilder_iam#getVarName()
	 * @see #getGrantOnPrincipalOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getGrantOnPrincipalOptionsBuilder_iam_VarName();

	/**
	 * Returns the meta object for the attribute '{@link iam.GrantOnPrincipalOptionsBuilder_iam#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see iam.GrantOnPrincipalOptionsBuilder_iam#getIdentifier()
	 * @see #getGrantOnPrincipalOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getGrantOnPrincipalOptionsBuilder_iam_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link iam.GrantOnPrincipalOptionsBuilder_iam#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see iam.GrantOnPrincipalOptionsBuilder_iam#getAdditionalCode()
	 * @see #getGrantOnPrincipalOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getGrantOnPrincipalOptionsBuilder_iam_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link iam.UserBuilder_iam <em>User Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Builder iam</em>'.
	 * @see iam.UserBuilder_iam
	 * @generated
	 */
	EClass getUserBuilder_iam();

	/**
	 * Returns the meta object for the attribute '{@link iam.UserBuilder_iam#getGroups_software_amazon_awscdk_services_iam_IGroup_AsList <em>Groups software amazon awscdk services iam IGroup As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Groups software amazon awscdk services iam IGroup As List</em>'.
	 * @see iam.UserBuilder_iam#getGroups_software_amazon_awscdk_services_iam_IGroup_AsList()
	 * @see #getUserBuilder_iam()
	 * @generated
	 */
	EAttribute getUserBuilder_iam_Groups_software_amazon_awscdk_services_iam_IGroup_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.UserBuilder_iam#getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList <em>Managed Policies software amazon awscdk services iam IManaged Policy As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Managed Policies software amazon awscdk services iam IManaged Policy As List</em>'.
	 * @see iam.UserBuilder_iam#getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList()
	 * @see #getUserBuilder_iam()
	 * @generated
	 */
	EAttribute getUserBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.UserBuilder_iam#getPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference <em>Password With Secret Value software amazon awscdk core Secret Value As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password With Secret Value software amazon awscdk core Secret Value As Reference</em>'.
	 * @see iam.UserBuilder_iam#getPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference()
	 * @see #getUserBuilder_iam()
	 * @generated
	 */
	EAttribute getUserBuilder_iam_PasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link iam.UserBuilder_iam#getPasswordResetRequired_java_lang_Boolean_ <em>Password Reset Required java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password Reset Required java lang Boolean </em>'.
	 * @see iam.UserBuilder_iam#getPasswordResetRequired_java_lang_Boolean_()
	 * @see #getUserBuilder_iam()
	 * @generated
	 */
	EAttribute getUserBuilder_iam_PasswordResetRequired_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link iam.UserBuilder_iam#getPath_java_lang_String_ <em>Path java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path java lang String </em>'.
	 * @see iam.UserBuilder_iam#getPath_java_lang_String_()
	 * @see #getUserBuilder_iam()
	 * @generated
	 */
	EAttribute getUserBuilder_iam_Path_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.UserBuilder_iam#getPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference <em>Permissions Boundary With IManaged Policy software amazon awscdk services iam IManaged Policy As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permissions Boundary With IManaged Policy software amazon awscdk services iam IManaged Policy As Reference</em>'.
	 * @see iam.UserBuilder_iam#getPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference()
	 * @see #getUserBuilder_iam()
	 * @generated
	 */
	EAttribute getUserBuilder_iam_PermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link iam.UserBuilder_iam#getUserName_java_lang_String_ <em>User Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name java lang String </em>'.
	 * @see iam.UserBuilder_iam#getUserName_java_lang_String_()
	 * @see #getUserBuilder_iam()
	 * @generated
	 */
	EAttribute getUserBuilder_iam_UserName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.UserBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see iam.UserBuilder_iam#getGeneratedClassName()
	 * @see #getUserBuilder_iam()
	 * @generated
	 */
	EAttribute getUserBuilder_iam_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link iam.UserBuilder_iam#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see iam.UserBuilder_iam#getVarName()
	 * @see #getUserBuilder_iam()
	 * @generated
	 */
	EAttribute getUserBuilder_iam_VarName();

	/**
	 * Returns the meta object for the attribute '{@link iam.UserBuilder_iam#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see iam.UserBuilder_iam#getIdentifier()
	 * @see #getUserBuilder_iam()
	 * @generated
	 */
	EAttribute getUserBuilder_iam_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link iam.UserBuilder_iam#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see iam.UserBuilder_iam#getAdditionalCode()
	 * @see #getUserBuilder_iam()
	 * @generated
	 */
	EAttribute getUserBuilder_iam_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link iam.GrantOnPrincipalAndResourceOptionsBuilder_iam <em>Grant On Principal And Resource Options Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grant On Principal And Resource Options Builder iam</em>'.
	 * @see iam.GrantOnPrincipalAndResourceOptionsBuilder_iam
	 * @generated
	 */
	EClass getGrantOnPrincipalAndResourceOptionsBuilder_iam();

	/**
	 * Returns the meta object for the attribute '{@link iam.GrantOnPrincipalAndResourceOptionsBuilder_iam#getResourceWithIResourceWithPolicy_software_amazon_awscdk_services_iam_IResourceWithPolicy_AsReference <em>Resource With IResource With Policy software amazon awscdk services iam IResource With Policy As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource With IResource With Policy software amazon awscdk services iam IResource With Policy As Reference</em>'.
	 * @see iam.GrantOnPrincipalAndResourceOptionsBuilder_iam#getResourceWithIResourceWithPolicy_software_amazon_awscdk_services_iam_IResourceWithPolicy_AsReference()
	 * @see #getGrantOnPrincipalAndResourceOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getGrantOnPrincipalAndResourceOptionsBuilder_iam_ResourceWithIResourceWithPolicy_software_amazon_awscdk_services_iam_IResourceWithPolicy_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link iam.GrantOnPrincipalAndResourceOptionsBuilder_iam#getResourcePolicyPrincipalWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference <em>Resource Policy Principal With IPrincipal software amazon awscdk services iam IPrincipal As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Policy Principal With IPrincipal software amazon awscdk services iam IPrincipal As Reference</em>'.
	 * @see iam.GrantOnPrincipalAndResourceOptionsBuilder_iam#getResourcePolicyPrincipalWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference()
	 * @see #getGrantOnPrincipalAndResourceOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getGrantOnPrincipalAndResourceOptionsBuilder_iam_ResourcePolicyPrincipalWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link iam.GrantOnPrincipalAndResourceOptionsBuilder_iam#getResourceSelfArns_java_lang_String_AsList <em>Resource Self Arns java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Self Arns java lang String As List</em>'.
	 * @see iam.GrantOnPrincipalAndResourceOptionsBuilder_iam#getResourceSelfArns_java_lang_String_AsList()
	 * @see #getGrantOnPrincipalAndResourceOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getGrantOnPrincipalAndResourceOptionsBuilder_iam_ResourceSelfArns_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.GrantOnPrincipalAndResourceOptionsBuilder_iam#getActions_java_lang_String_AsList <em>Actions java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actions java lang String As List</em>'.
	 * @see iam.GrantOnPrincipalAndResourceOptionsBuilder_iam#getActions_java_lang_String_AsList()
	 * @see #getGrantOnPrincipalAndResourceOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getGrantOnPrincipalAndResourceOptionsBuilder_iam_Actions_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.GrantOnPrincipalAndResourceOptionsBuilder_iam#getGranteeWithIGrantable_software_amazon_awscdk_services_iam_IGrantable_AsReference <em>Grantee With IGrantable software amazon awscdk services iam IGrantable As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grantee With IGrantable software amazon awscdk services iam IGrantable As Reference</em>'.
	 * @see iam.GrantOnPrincipalAndResourceOptionsBuilder_iam#getGranteeWithIGrantable_software_amazon_awscdk_services_iam_IGrantable_AsReference()
	 * @see #getGrantOnPrincipalAndResourceOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getGrantOnPrincipalAndResourceOptionsBuilder_iam_GranteeWithIGrantable_software_amazon_awscdk_services_iam_IGrantable_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link iam.GrantOnPrincipalAndResourceOptionsBuilder_iam#getResourceArns_java_lang_String_AsList <em>Resource Arns java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Arns java lang String As List</em>'.
	 * @see iam.GrantOnPrincipalAndResourceOptionsBuilder_iam#getResourceArns_java_lang_String_AsList()
	 * @see #getGrantOnPrincipalAndResourceOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getGrantOnPrincipalAndResourceOptionsBuilder_iam_ResourceArns_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.GrantOnPrincipalAndResourceOptionsBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see iam.GrantOnPrincipalAndResourceOptionsBuilder_iam#getGeneratedClassName()
	 * @see #getGrantOnPrincipalAndResourceOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getGrantOnPrincipalAndResourceOptionsBuilder_iam_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link iam.GrantOnPrincipalAndResourceOptionsBuilder_iam#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see iam.GrantOnPrincipalAndResourceOptionsBuilder_iam#getVarName()
	 * @see #getGrantOnPrincipalAndResourceOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getGrantOnPrincipalAndResourceOptionsBuilder_iam_VarName();

	/**
	 * Returns the meta object for the attribute '{@link iam.GrantOnPrincipalAndResourceOptionsBuilder_iam#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see iam.GrantOnPrincipalAndResourceOptionsBuilder_iam#getIdentifier()
	 * @see #getGrantOnPrincipalAndResourceOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getGrantOnPrincipalAndResourceOptionsBuilder_iam_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link iam.GrantOnPrincipalAndResourceOptionsBuilder_iam#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see iam.GrantOnPrincipalAndResourceOptionsBuilder_iam#getAdditionalCode()
	 * @see #getGrantOnPrincipalAndResourceOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getGrantOnPrincipalAndResourceOptionsBuilder_iam_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link iam.ManagedPolicyBuilder_iam <em>Managed Policy Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Managed Policy Builder iam</em>'.
	 * @see iam.ManagedPolicyBuilder_iam
	 * @generated
	 */
	EClass getManagedPolicyBuilder_iam();

	/**
	 * Returns the meta object for the attribute '{@link iam.ManagedPolicyBuilder_iam#getDescription_java_lang_String_ <em>Description java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description java lang String </em>'.
	 * @see iam.ManagedPolicyBuilder_iam#getDescription_java_lang_String_()
	 * @see #getManagedPolicyBuilder_iam()
	 * @generated
	 */
	EAttribute getManagedPolicyBuilder_iam_Description_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.ManagedPolicyBuilder_iam#getDocumentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference <em>Document With Policy Document software amazon awscdk services iam Policy Document As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document With Policy Document software amazon awscdk services iam Policy Document As Reference</em>'.
	 * @see iam.ManagedPolicyBuilder_iam#getDocumentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference()
	 * @see #getManagedPolicyBuilder_iam()
	 * @generated
	 */
	EAttribute getManagedPolicyBuilder_iam_DocumentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link iam.ManagedPolicyBuilder_iam#getGroups_software_amazon_awscdk_services_iam_IGroup_AsList <em>Groups software amazon awscdk services iam IGroup As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Groups software amazon awscdk services iam IGroup As List</em>'.
	 * @see iam.ManagedPolicyBuilder_iam#getGroups_software_amazon_awscdk_services_iam_IGroup_AsList()
	 * @see #getManagedPolicyBuilder_iam()
	 * @generated
	 */
	EAttribute getManagedPolicyBuilder_iam_Groups_software_amazon_awscdk_services_iam_IGroup_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.ManagedPolicyBuilder_iam#getManagedPolicyName_java_lang_String_ <em>Managed Policy Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Managed Policy Name java lang String </em>'.
	 * @see iam.ManagedPolicyBuilder_iam#getManagedPolicyName_java_lang_String_()
	 * @see #getManagedPolicyBuilder_iam()
	 * @generated
	 */
	EAttribute getManagedPolicyBuilder_iam_ManagedPolicyName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.ManagedPolicyBuilder_iam#getPath_java_lang_String_ <em>Path java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path java lang String </em>'.
	 * @see iam.ManagedPolicyBuilder_iam#getPath_java_lang_String_()
	 * @see #getManagedPolicyBuilder_iam()
	 * @generated
	 */
	EAttribute getManagedPolicyBuilder_iam_Path_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.ManagedPolicyBuilder_iam#getRoles_software_amazon_awscdk_services_iam_IRole_AsList <em>Roles software amazon awscdk services iam IRole As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roles software amazon awscdk services iam IRole As List</em>'.
	 * @see iam.ManagedPolicyBuilder_iam#getRoles_software_amazon_awscdk_services_iam_IRole_AsList()
	 * @see #getManagedPolicyBuilder_iam()
	 * @generated
	 */
	EAttribute getManagedPolicyBuilder_iam_Roles_software_amazon_awscdk_services_iam_IRole_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.ManagedPolicyBuilder_iam#getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList <em>Statements software amazon awscdk services iam Policy Statement As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statements software amazon awscdk services iam Policy Statement As List</em>'.
	 * @see iam.ManagedPolicyBuilder_iam#getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList()
	 * @see #getManagedPolicyBuilder_iam()
	 * @generated
	 */
	EAttribute getManagedPolicyBuilder_iam_Statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.ManagedPolicyBuilder_iam#getUsers_software_amazon_awscdk_services_iam_IUser_AsList <em>Users software amazon awscdk services iam IUser As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Users software amazon awscdk services iam IUser As List</em>'.
	 * @see iam.ManagedPolicyBuilder_iam#getUsers_software_amazon_awscdk_services_iam_IUser_AsList()
	 * @see #getManagedPolicyBuilder_iam()
	 * @generated
	 */
	EAttribute getManagedPolicyBuilder_iam_Users_software_amazon_awscdk_services_iam_IUser_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.ManagedPolicyBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see iam.ManagedPolicyBuilder_iam#getGeneratedClassName()
	 * @see #getManagedPolicyBuilder_iam()
	 * @generated
	 */
	EAttribute getManagedPolicyBuilder_iam_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link iam.ManagedPolicyBuilder_iam#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see iam.ManagedPolicyBuilder_iam#getVarName()
	 * @see #getManagedPolicyBuilder_iam()
	 * @generated
	 */
	EAttribute getManagedPolicyBuilder_iam_VarName();

	/**
	 * Returns the meta object for the attribute '{@link iam.ManagedPolicyBuilder_iam#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see iam.ManagedPolicyBuilder_iam#getIdentifier()
	 * @see #getManagedPolicyBuilder_iam()
	 * @generated
	 */
	EAttribute getManagedPolicyBuilder_iam_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link iam.ManagedPolicyBuilder_iam#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see iam.ManagedPolicyBuilder_iam#getAdditionalCode()
	 * @see #getManagedPolicyBuilder_iam()
	 * @generated
	 */
	EAttribute getManagedPolicyBuilder_iam_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link iam.FromRoleArnOptionsBuilder_iam <em>From Role Arn Options Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From Role Arn Options Builder iam</em>'.
	 * @see iam.FromRoleArnOptionsBuilder_iam
	 * @generated
	 */
	EClass getFromRoleArnOptionsBuilder_iam();

	/**
	 * Returns the meta object for the attribute '{@link iam.FromRoleArnOptionsBuilder_iam#getMutable_java_lang_Boolean_ <em>Mutable java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutable java lang Boolean </em>'.
	 * @see iam.FromRoleArnOptionsBuilder_iam#getMutable_java_lang_Boolean_()
	 * @see #getFromRoleArnOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getFromRoleArnOptionsBuilder_iam_Mutable_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link iam.FromRoleArnOptionsBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see iam.FromRoleArnOptionsBuilder_iam#getGeneratedClassName()
	 * @see #getFromRoleArnOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getFromRoleArnOptionsBuilder_iam_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link iam.FromRoleArnOptionsBuilder_iam#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see iam.FromRoleArnOptionsBuilder_iam#getVarName()
	 * @see #getFromRoleArnOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getFromRoleArnOptionsBuilder_iam_VarName();

	/**
	 * Returns the meta object for the attribute '{@link iam.FromRoleArnOptionsBuilder_iam#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see iam.FromRoleArnOptionsBuilder_iam#getIdentifier()
	 * @see #getFromRoleArnOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getFromRoleArnOptionsBuilder_iam_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link iam.FromRoleArnOptionsBuilder_iam#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see iam.FromRoleArnOptionsBuilder_iam#getAdditionalCode()
	 * @see #getFromRoleArnOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getFromRoleArnOptionsBuilder_iam_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link iam.PolicyDocumentBuilder_iam <em>Policy Document Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Document Builder iam</em>'.
	 * @see iam.PolicyDocumentBuilder_iam
	 * @generated
	 */
	EClass getPolicyDocumentBuilder_iam();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyDocumentBuilder_iam#getAssignSids_java_lang_Boolean_ <em>Assign Sids java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assign Sids java lang Boolean </em>'.
	 * @see iam.PolicyDocumentBuilder_iam#getAssignSids_java_lang_Boolean_()
	 * @see #getPolicyDocumentBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyDocumentBuilder_iam_AssignSids_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyDocumentBuilder_iam#getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList <em>Statements software amazon awscdk services iam Policy Statement As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statements software amazon awscdk services iam Policy Statement As List</em>'.
	 * @see iam.PolicyDocumentBuilder_iam#getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList()
	 * @see #getPolicyDocumentBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyDocumentBuilder_iam_Statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyDocumentBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see iam.PolicyDocumentBuilder_iam#getGeneratedClassName()
	 * @see #getPolicyDocumentBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyDocumentBuilder_iam_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyDocumentBuilder_iam#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see iam.PolicyDocumentBuilder_iam#getVarName()
	 * @see #getPolicyDocumentBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyDocumentBuilder_iam_VarName();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyDocumentBuilder_iam#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see iam.PolicyDocumentBuilder_iam#getIdentifier()
	 * @see #getPolicyDocumentBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyDocumentBuilder_iam_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyDocumentBuilder_iam#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see iam.PolicyDocumentBuilder_iam#getAdditionalCode()
	 * @see #getPolicyDocumentBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyDocumentBuilder_iam_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link iam.PolicyBuilder_iam <em>Policy Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Builder iam</em>'.
	 * @see iam.PolicyBuilder_iam
	 * @generated
	 */
	EClass getPolicyBuilder_iam();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyBuilder_iam#getForce_java_lang_Boolean_ <em>Force java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Force java lang Boolean </em>'.
	 * @see iam.PolicyBuilder_iam#getForce_java_lang_Boolean_()
	 * @see #getPolicyBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyBuilder_iam_Force_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyBuilder_iam#getGroups_software_amazon_awscdk_services_iam_IGroup_AsList <em>Groups software amazon awscdk services iam IGroup As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Groups software amazon awscdk services iam IGroup As List</em>'.
	 * @see iam.PolicyBuilder_iam#getGroups_software_amazon_awscdk_services_iam_IGroup_AsList()
	 * @see #getPolicyBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyBuilder_iam_Groups_software_amazon_awscdk_services_iam_IGroup_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyBuilder_iam#getPolicyName_java_lang_String_ <em>Policy Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Name java lang String </em>'.
	 * @see iam.PolicyBuilder_iam#getPolicyName_java_lang_String_()
	 * @see #getPolicyBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyBuilder_iam_PolicyName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyBuilder_iam#getRoles_software_amazon_awscdk_services_iam_IRole_AsList <em>Roles software amazon awscdk services iam IRole As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roles software amazon awscdk services iam IRole As List</em>'.
	 * @see iam.PolicyBuilder_iam#getRoles_software_amazon_awscdk_services_iam_IRole_AsList()
	 * @see #getPolicyBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyBuilder_iam_Roles_software_amazon_awscdk_services_iam_IRole_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyBuilder_iam#getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList <em>Statements software amazon awscdk services iam Policy Statement As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statements software amazon awscdk services iam Policy Statement As List</em>'.
	 * @see iam.PolicyBuilder_iam#getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList()
	 * @see #getPolicyBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyBuilder_iam_Statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyBuilder_iam#getUsers_software_amazon_awscdk_services_iam_IUser_AsList <em>Users software amazon awscdk services iam IUser As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Users software amazon awscdk services iam IUser As List</em>'.
	 * @see iam.PolicyBuilder_iam#getUsers_software_amazon_awscdk_services_iam_IUser_AsList()
	 * @see #getPolicyBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyBuilder_iam_Users_software_amazon_awscdk_services_iam_IUser_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see iam.PolicyBuilder_iam#getGeneratedClassName()
	 * @see #getPolicyBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyBuilder_iam_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyBuilder_iam#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see iam.PolicyBuilder_iam#getVarName()
	 * @see #getPolicyBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyBuilder_iam_VarName();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyBuilder_iam#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see iam.PolicyBuilder_iam#getIdentifier()
	 * @see #getPolicyBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyBuilder_iam_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyBuilder_iam#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see iam.PolicyBuilder_iam#getAdditionalCode()
	 * @see #getPolicyBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyBuilder_iam_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link iam.PolicyDocumentPropsBuilder_iam <em>Policy Document Props Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Document Props Builder iam</em>'.
	 * @see iam.PolicyDocumentPropsBuilder_iam
	 * @generated
	 */
	EClass getPolicyDocumentPropsBuilder_iam();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyDocumentPropsBuilder_iam#getAssignSids_java_lang_Boolean_ <em>Assign Sids java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assign Sids java lang Boolean </em>'.
	 * @see iam.PolicyDocumentPropsBuilder_iam#getAssignSids_java_lang_Boolean_()
	 * @see #getPolicyDocumentPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyDocumentPropsBuilder_iam_AssignSids_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyDocumentPropsBuilder_iam#getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList <em>Statements software amazon awscdk services iam Policy Statement As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statements software amazon awscdk services iam Policy Statement As List</em>'.
	 * @see iam.PolicyDocumentPropsBuilder_iam#getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList()
	 * @see #getPolicyDocumentPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyDocumentPropsBuilder_iam_Statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyDocumentPropsBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see iam.PolicyDocumentPropsBuilder_iam#getGeneratedClassName()
	 * @see #getPolicyDocumentPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyDocumentPropsBuilder_iam_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyDocumentPropsBuilder_iam#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see iam.PolicyDocumentPropsBuilder_iam#getVarName()
	 * @see #getPolicyDocumentPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyDocumentPropsBuilder_iam_VarName();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyDocumentPropsBuilder_iam#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see iam.PolicyDocumentPropsBuilder_iam#getIdentifier()
	 * @see #getPolicyDocumentPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyDocumentPropsBuilder_iam_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyDocumentPropsBuilder_iam#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see iam.PolicyDocumentPropsBuilder_iam#getAdditionalCode()
	 * @see #getPolicyDocumentPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyDocumentPropsBuilder_iam_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link iam.UserPropsBuilder_iam <em>User Props Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Props Builder iam</em>'.
	 * @see iam.UserPropsBuilder_iam
	 * @generated
	 */
	EClass getUserPropsBuilder_iam();

	/**
	 * Returns the meta object for the attribute '{@link iam.UserPropsBuilder_iam#getGroups_software_amazon_awscdk_services_iam_IGroup_AsList <em>Groups software amazon awscdk services iam IGroup As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Groups software amazon awscdk services iam IGroup As List</em>'.
	 * @see iam.UserPropsBuilder_iam#getGroups_software_amazon_awscdk_services_iam_IGroup_AsList()
	 * @see #getUserPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getUserPropsBuilder_iam_Groups_software_amazon_awscdk_services_iam_IGroup_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.UserPropsBuilder_iam#getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList <em>Managed Policies software amazon awscdk services iam IManaged Policy As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Managed Policies software amazon awscdk services iam IManaged Policy As List</em>'.
	 * @see iam.UserPropsBuilder_iam#getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList()
	 * @see #getUserPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getUserPropsBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.UserPropsBuilder_iam#getPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference <em>Password With Secret Value software amazon awscdk core Secret Value As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password With Secret Value software amazon awscdk core Secret Value As Reference</em>'.
	 * @see iam.UserPropsBuilder_iam#getPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference()
	 * @see #getUserPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getUserPropsBuilder_iam_PasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link iam.UserPropsBuilder_iam#getPasswordResetRequired_java_lang_Boolean_ <em>Password Reset Required java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password Reset Required java lang Boolean </em>'.
	 * @see iam.UserPropsBuilder_iam#getPasswordResetRequired_java_lang_Boolean_()
	 * @see #getUserPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getUserPropsBuilder_iam_PasswordResetRequired_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link iam.UserPropsBuilder_iam#getPath_java_lang_String_ <em>Path java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path java lang String </em>'.
	 * @see iam.UserPropsBuilder_iam#getPath_java_lang_String_()
	 * @see #getUserPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getUserPropsBuilder_iam_Path_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.UserPropsBuilder_iam#getPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference <em>Permissions Boundary With IManaged Policy software amazon awscdk services iam IManaged Policy As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permissions Boundary With IManaged Policy software amazon awscdk services iam IManaged Policy As Reference</em>'.
	 * @see iam.UserPropsBuilder_iam#getPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference()
	 * @see #getUserPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getUserPropsBuilder_iam_PermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link iam.UserPropsBuilder_iam#getUserName_java_lang_String_ <em>User Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name java lang String </em>'.
	 * @see iam.UserPropsBuilder_iam#getUserName_java_lang_String_()
	 * @see #getUserPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getUserPropsBuilder_iam_UserName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.UserPropsBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see iam.UserPropsBuilder_iam#getGeneratedClassName()
	 * @see #getUserPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getUserPropsBuilder_iam_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link iam.UserPropsBuilder_iam#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see iam.UserPropsBuilder_iam#getVarName()
	 * @see #getUserPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getUserPropsBuilder_iam_VarName();

	/**
	 * Returns the meta object for the attribute '{@link iam.UserPropsBuilder_iam#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see iam.UserPropsBuilder_iam#getIdentifier()
	 * @see #getUserPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getUserPropsBuilder_iam_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link iam.UserPropsBuilder_iam#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see iam.UserPropsBuilder_iam#getAdditionalCode()
	 * @see #getUserPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getUserPropsBuilder_iam_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link iam.AddToResourcePolicyResultBuilder_iam <em>Add To Resource Policy Result Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add To Resource Policy Result Builder iam</em>'.
	 * @see iam.AddToResourcePolicyResultBuilder_iam
	 * @generated
	 */
	EClass getAddToResourcePolicyResultBuilder_iam();

	/**
	 * Returns the meta object for the attribute '{@link iam.AddToResourcePolicyResultBuilder_iam#getStatementAdded_java_lang_Boolean_ <em>Statement Added java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement Added java lang Boolean </em>'.
	 * @see iam.AddToResourcePolicyResultBuilder_iam#getStatementAdded_java_lang_Boolean_()
	 * @see #getAddToResourcePolicyResultBuilder_iam()
	 * @generated
	 */
	EAttribute getAddToResourcePolicyResultBuilder_iam_StatementAdded_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link iam.AddToResourcePolicyResultBuilder_iam#getPolicyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference <em>Policy Dependable With IDependable software amazon awscdk core IDependable As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Dependable With IDependable software amazon awscdk core IDependable As Reference</em>'.
	 * @see iam.AddToResourcePolicyResultBuilder_iam#getPolicyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference()
	 * @see #getAddToResourcePolicyResultBuilder_iam()
	 * @generated
	 */
	EAttribute getAddToResourcePolicyResultBuilder_iam_PolicyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link iam.AddToResourcePolicyResultBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see iam.AddToResourcePolicyResultBuilder_iam#getGeneratedClassName()
	 * @see #getAddToResourcePolicyResultBuilder_iam()
	 * @generated
	 */
	EAttribute getAddToResourcePolicyResultBuilder_iam_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link iam.AddToResourcePolicyResultBuilder_iam#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see iam.AddToResourcePolicyResultBuilder_iam#getVarName()
	 * @see #getAddToResourcePolicyResultBuilder_iam()
	 * @generated
	 */
	EAttribute getAddToResourcePolicyResultBuilder_iam_VarName();

	/**
	 * Returns the meta object for the attribute '{@link iam.AddToResourcePolicyResultBuilder_iam#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see iam.AddToResourcePolicyResultBuilder_iam#getIdentifier()
	 * @see #getAddToResourcePolicyResultBuilder_iam()
	 * @generated
	 */
	EAttribute getAddToResourcePolicyResultBuilder_iam_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link iam.AddToResourcePolicyResultBuilder_iam#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see iam.AddToResourcePolicyResultBuilder_iam#getAdditionalCode()
	 * @see #getAddToResourcePolicyResultBuilder_iam()
	 * @generated
	 */
	EAttribute getAddToResourcePolicyResultBuilder_iam_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link iam.PolicyStatementPropsBuilder_iam <em>Policy Statement Props Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Statement Props Builder iam</em>'.
	 * @see iam.PolicyStatementPropsBuilder_iam
	 * @generated
	 */
	EClass getPolicyStatementPropsBuilder_iam();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyStatementPropsBuilder_iam#getActions_java_lang_String_AsList <em>Actions java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actions java lang String As List</em>'.
	 * @see iam.PolicyStatementPropsBuilder_iam#getActions_java_lang_String_AsList()
	 * @see #getPolicyStatementPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyStatementPropsBuilder_iam_Actions_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyStatementPropsBuilder_iam#getConditions_java_lang_String__java_lang_Object_AsMap <em>Conditions java lang String java lang Object As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conditions java lang String java lang Object As Map</em>'.
	 * @see iam.PolicyStatementPropsBuilder_iam#getConditions_java_lang_String__java_lang_Object_AsMap()
	 * @see #getPolicyStatementPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyStatementPropsBuilder_iam_Conditions_java_lang_String__java_lang_Object_AsMap();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyStatementPropsBuilder_iam#getEffect_software_amazon_awscdk_services_iam_Effect_ <em>Effect software amazon awscdk services iam Effect </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect software amazon awscdk services iam Effect </em>'.
	 * @see iam.PolicyStatementPropsBuilder_iam#getEffect_software_amazon_awscdk_services_iam_Effect_()
	 * @see #getPolicyStatementPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyStatementPropsBuilder_iam_Effect_software_amazon_awscdk_services_iam_Effect_();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyStatementPropsBuilder_iam#getNotActions_java_lang_String_AsList <em>Not Actions java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Actions java lang String As List</em>'.
	 * @see iam.PolicyStatementPropsBuilder_iam#getNotActions_java_lang_String_AsList()
	 * @see #getPolicyStatementPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyStatementPropsBuilder_iam_NotActions_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyStatementPropsBuilder_iam#getNotPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList <em>Not Principals software amazon awscdk services iam IPrincipal As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Principals software amazon awscdk services iam IPrincipal As List</em>'.
	 * @see iam.PolicyStatementPropsBuilder_iam#getNotPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList()
	 * @see #getPolicyStatementPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyStatementPropsBuilder_iam_NotPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyStatementPropsBuilder_iam#getNotResources_java_lang_String_AsList <em>Not Resources java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Resources java lang String As List</em>'.
	 * @see iam.PolicyStatementPropsBuilder_iam#getNotResources_java_lang_String_AsList()
	 * @see #getPolicyStatementPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyStatementPropsBuilder_iam_NotResources_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyStatementPropsBuilder_iam#getPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList <em>Principals software amazon awscdk services iam IPrincipal As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Principals software amazon awscdk services iam IPrincipal As List</em>'.
	 * @see iam.PolicyStatementPropsBuilder_iam#getPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList()
	 * @see #getPolicyStatementPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyStatementPropsBuilder_iam_Principals_software_amazon_awscdk_services_iam_IPrincipal_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyStatementPropsBuilder_iam#getResources_java_lang_String_AsList <em>Resources java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resources java lang String As List</em>'.
	 * @see iam.PolicyStatementPropsBuilder_iam#getResources_java_lang_String_AsList()
	 * @see #getPolicyStatementPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyStatementPropsBuilder_iam_Resources_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyStatementPropsBuilder_iam#getSid_java_lang_String_ <em>Sid java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sid java lang String </em>'.
	 * @see iam.PolicyStatementPropsBuilder_iam#getSid_java_lang_String_()
	 * @see #getPolicyStatementPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyStatementPropsBuilder_iam_Sid_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyStatementPropsBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see iam.PolicyStatementPropsBuilder_iam#getGeneratedClassName()
	 * @see #getPolicyStatementPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyStatementPropsBuilder_iam_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyStatementPropsBuilder_iam#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see iam.PolicyStatementPropsBuilder_iam#getVarName()
	 * @see #getPolicyStatementPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyStatementPropsBuilder_iam_VarName();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyStatementPropsBuilder_iam#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see iam.PolicyStatementPropsBuilder_iam#getIdentifier()
	 * @see #getPolicyStatementPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyStatementPropsBuilder_iam_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyStatementPropsBuilder_iam#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see iam.PolicyStatementPropsBuilder_iam#getAdditionalCode()
	 * @see #getPolicyStatementPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyStatementPropsBuilder_iam_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link iam.AddToPrincipalPolicyResultBuilder_iam <em>Add To Principal Policy Result Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add To Principal Policy Result Builder iam</em>'.
	 * @see iam.AddToPrincipalPolicyResultBuilder_iam
	 * @generated
	 */
	EClass getAddToPrincipalPolicyResultBuilder_iam();

	/**
	 * Returns the meta object for the attribute '{@link iam.AddToPrincipalPolicyResultBuilder_iam#getStatementAdded_java_lang_Boolean_ <em>Statement Added java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement Added java lang Boolean </em>'.
	 * @see iam.AddToPrincipalPolicyResultBuilder_iam#getStatementAdded_java_lang_Boolean_()
	 * @see #getAddToPrincipalPolicyResultBuilder_iam()
	 * @generated
	 */
	EAttribute getAddToPrincipalPolicyResultBuilder_iam_StatementAdded_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link iam.AddToPrincipalPolicyResultBuilder_iam#getPolicyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference <em>Policy Dependable With IDependable software amazon awscdk core IDependable As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Dependable With IDependable software amazon awscdk core IDependable As Reference</em>'.
	 * @see iam.AddToPrincipalPolicyResultBuilder_iam#getPolicyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference()
	 * @see #getAddToPrincipalPolicyResultBuilder_iam()
	 * @generated
	 */
	EAttribute getAddToPrincipalPolicyResultBuilder_iam_PolicyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link iam.AddToPrincipalPolicyResultBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see iam.AddToPrincipalPolicyResultBuilder_iam#getGeneratedClassName()
	 * @see #getAddToPrincipalPolicyResultBuilder_iam()
	 * @generated
	 */
	EAttribute getAddToPrincipalPolicyResultBuilder_iam_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link iam.AddToPrincipalPolicyResultBuilder_iam#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see iam.AddToPrincipalPolicyResultBuilder_iam#getVarName()
	 * @see #getAddToPrincipalPolicyResultBuilder_iam()
	 * @generated
	 */
	EAttribute getAddToPrincipalPolicyResultBuilder_iam_VarName();

	/**
	 * Returns the meta object for the attribute '{@link iam.AddToPrincipalPolicyResultBuilder_iam#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see iam.AddToPrincipalPolicyResultBuilder_iam#getIdentifier()
	 * @see #getAddToPrincipalPolicyResultBuilder_iam()
	 * @generated
	 */
	EAttribute getAddToPrincipalPolicyResultBuilder_iam_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link iam.AddToPrincipalPolicyResultBuilder_iam#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see iam.AddToPrincipalPolicyResultBuilder_iam#getAdditionalCode()
	 * @see #getAddToPrincipalPolicyResultBuilder_iam()
	 * @generated
	 */
	EAttribute getAddToPrincipalPolicyResultBuilder_iam_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link iam.PolicyStatementBuilder_iam <em>Policy Statement Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Statement Builder iam</em>'.
	 * @see iam.PolicyStatementBuilder_iam
	 * @generated
	 */
	EClass getPolicyStatementBuilder_iam();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyStatementBuilder_iam#getActions_java_lang_String_AsList <em>Actions java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actions java lang String As List</em>'.
	 * @see iam.PolicyStatementBuilder_iam#getActions_java_lang_String_AsList()
	 * @see #getPolicyStatementBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyStatementBuilder_iam_Actions_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyStatementBuilder_iam#getConditions_java_lang_String__java_lang_Object_AsMap <em>Conditions java lang String java lang Object As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conditions java lang String java lang Object As Map</em>'.
	 * @see iam.PolicyStatementBuilder_iam#getConditions_java_lang_String__java_lang_Object_AsMap()
	 * @see #getPolicyStatementBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyStatementBuilder_iam_Conditions_java_lang_String__java_lang_Object_AsMap();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyStatementBuilder_iam#getEffect_software_amazon_awscdk_services_iam_Effect_ <em>Effect software amazon awscdk services iam Effect </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect software amazon awscdk services iam Effect </em>'.
	 * @see iam.PolicyStatementBuilder_iam#getEffect_software_amazon_awscdk_services_iam_Effect_()
	 * @see #getPolicyStatementBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyStatementBuilder_iam_Effect_software_amazon_awscdk_services_iam_Effect_();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyStatementBuilder_iam#getNotActions_java_lang_String_AsList <em>Not Actions java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Actions java lang String As List</em>'.
	 * @see iam.PolicyStatementBuilder_iam#getNotActions_java_lang_String_AsList()
	 * @see #getPolicyStatementBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyStatementBuilder_iam_NotActions_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyStatementBuilder_iam#getNotPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList <em>Not Principals software amazon awscdk services iam IPrincipal As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Principals software amazon awscdk services iam IPrincipal As List</em>'.
	 * @see iam.PolicyStatementBuilder_iam#getNotPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList()
	 * @see #getPolicyStatementBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyStatementBuilder_iam_NotPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyStatementBuilder_iam#getNotResources_java_lang_String_AsList <em>Not Resources java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Resources java lang String As List</em>'.
	 * @see iam.PolicyStatementBuilder_iam#getNotResources_java_lang_String_AsList()
	 * @see #getPolicyStatementBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyStatementBuilder_iam_NotResources_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyStatementBuilder_iam#getPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList <em>Principals software amazon awscdk services iam IPrincipal As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Principals software amazon awscdk services iam IPrincipal As List</em>'.
	 * @see iam.PolicyStatementBuilder_iam#getPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList()
	 * @see #getPolicyStatementBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyStatementBuilder_iam_Principals_software_amazon_awscdk_services_iam_IPrincipal_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyStatementBuilder_iam#getResources_java_lang_String_AsList <em>Resources java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resources java lang String As List</em>'.
	 * @see iam.PolicyStatementBuilder_iam#getResources_java_lang_String_AsList()
	 * @see #getPolicyStatementBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyStatementBuilder_iam_Resources_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyStatementBuilder_iam#getSid_java_lang_String_ <em>Sid java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sid java lang String </em>'.
	 * @see iam.PolicyStatementBuilder_iam#getSid_java_lang_String_()
	 * @see #getPolicyStatementBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyStatementBuilder_iam_Sid_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyStatementBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see iam.PolicyStatementBuilder_iam#getGeneratedClassName()
	 * @see #getPolicyStatementBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyStatementBuilder_iam_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyStatementBuilder_iam#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see iam.PolicyStatementBuilder_iam#getVarName()
	 * @see #getPolicyStatementBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyStatementBuilder_iam_VarName();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyStatementBuilder_iam#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see iam.PolicyStatementBuilder_iam#getIdentifier()
	 * @see #getPolicyStatementBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyStatementBuilder_iam_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyStatementBuilder_iam#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see iam.PolicyStatementBuilder_iam#getAdditionalCode()
	 * @see #getPolicyStatementBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyStatementBuilder_iam_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link iam.ServicePrincipalOptsBuilder_iam <em>Service Principal Opts Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Principal Opts Builder iam</em>'.
	 * @see iam.ServicePrincipalOptsBuilder_iam
	 * @generated
	 */
	EClass getServicePrincipalOptsBuilder_iam();

	/**
	 * Returns the meta object for the attribute '{@link iam.ServicePrincipalOptsBuilder_iam#getConditions_java_lang_String__java_lang_Object_AsMap <em>Conditions java lang String java lang Object As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conditions java lang String java lang Object As Map</em>'.
	 * @see iam.ServicePrincipalOptsBuilder_iam#getConditions_java_lang_String__java_lang_Object_AsMap()
	 * @see #getServicePrincipalOptsBuilder_iam()
	 * @generated
	 */
	EAttribute getServicePrincipalOptsBuilder_iam_Conditions_java_lang_String__java_lang_Object_AsMap();

	/**
	 * Returns the meta object for the attribute '{@link iam.ServicePrincipalOptsBuilder_iam#getRegion_java_lang_String_ <em>Region java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region java lang String </em>'.
	 * @see iam.ServicePrincipalOptsBuilder_iam#getRegion_java_lang_String_()
	 * @see #getServicePrincipalOptsBuilder_iam()
	 * @generated
	 */
	EAttribute getServicePrincipalOptsBuilder_iam_Region_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.ServicePrincipalOptsBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see iam.ServicePrincipalOptsBuilder_iam#getGeneratedClassName()
	 * @see #getServicePrincipalOptsBuilder_iam()
	 * @generated
	 */
	EAttribute getServicePrincipalOptsBuilder_iam_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link iam.ServicePrincipalOptsBuilder_iam#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see iam.ServicePrincipalOptsBuilder_iam#getVarName()
	 * @see #getServicePrincipalOptsBuilder_iam()
	 * @generated
	 */
	EAttribute getServicePrincipalOptsBuilder_iam_VarName();

	/**
	 * Returns the meta object for the attribute '{@link iam.ServicePrincipalOptsBuilder_iam#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see iam.ServicePrincipalOptsBuilder_iam#getIdentifier()
	 * @see #getServicePrincipalOptsBuilder_iam()
	 * @generated
	 */
	EAttribute getServicePrincipalOptsBuilder_iam_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link iam.ServicePrincipalOptsBuilder_iam#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see iam.ServicePrincipalOptsBuilder_iam#getAdditionalCode()
	 * @see #getServicePrincipalOptsBuilder_iam()
	 * @generated
	 */
	EAttribute getServicePrincipalOptsBuilder_iam_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link iam.UnknownPrincipalBuilder_iam <em>Unknown Principal Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknown Principal Builder iam</em>'.
	 * @see iam.UnknownPrincipalBuilder_iam
	 * @generated
	 */
	EClass getUnknownPrincipalBuilder_iam();

	/**
	 * Returns the meta object for the attribute '{@link iam.UnknownPrincipalBuilder_iam#getResourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference <em>Resource With IConstruct software amazon awscdk core IConstruct As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource With IConstruct software amazon awscdk core IConstruct As Reference</em>'.
	 * @see iam.UnknownPrincipalBuilder_iam#getResourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference()
	 * @see #getUnknownPrincipalBuilder_iam()
	 * @generated
	 */
	EAttribute getUnknownPrincipalBuilder_iam_ResourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link iam.UnknownPrincipalBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see iam.UnknownPrincipalBuilder_iam#getGeneratedClassName()
	 * @see #getUnknownPrincipalBuilder_iam()
	 * @generated
	 */
	EAttribute getUnknownPrincipalBuilder_iam_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link iam.UnknownPrincipalBuilder_iam#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see iam.UnknownPrincipalBuilder_iam#getVarName()
	 * @see #getUnknownPrincipalBuilder_iam()
	 * @generated
	 */
	EAttribute getUnknownPrincipalBuilder_iam_VarName();

	/**
	 * Returns the meta object for the attribute '{@link iam.UnknownPrincipalBuilder_iam#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see iam.UnknownPrincipalBuilder_iam#getIdentifier()
	 * @see #getUnknownPrincipalBuilder_iam()
	 * @generated
	 */
	EAttribute getUnknownPrincipalBuilder_iam_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link iam.UnknownPrincipalBuilder_iam#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see iam.UnknownPrincipalBuilder_iam#getAdditionalCode()
	 * @see #getUnknownPrincipalBuilder_iam()
	 * @generated
	 */
	EAttribute getUnknownPrincipalBuilder_iam_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link iam.ManagedPolicyPropsBuilder_iam <em>Managed Policy Props Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Managed Policy Props Builder iam</em>'.
	 * @see iam.ManagedPolicyPropsBuilder_iam
	 * @generated
	 */
	EClass getManagedPolicyPropsBuilder_iam();

	/**
	 * Returns the meta object for the attribute '{@link iam.ManagedPolicyPropsBuilder_iam#getDescription_java_lang_String_ <em>Description java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description java lang String </em>'.
	 * @see iam.ManagedPolicyPropsBuilder_iam#getDescription_java_lang_String_()
	 * @see #getManagedPolicyPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getManagedPolicyPropsBuilder_iam_Description_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.ManagedPolicyPropsBuilder_iam#getDocumentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference <em>Document With Policy Document software amazon awscdk services iam Policy Document As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document With Policy Document software amazon awscdk services iam Policy Document As Reference</em>'.
	 * @see iam.ManagedPolicyPropsBuilder_iam#getDocumentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference()
	 * @see #getManagedPolicyPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getManagedPolicyPropsBuilder_iam_DocumentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link iam.ManagedPolicyPropsBuilder_iam#getGroups_software_amazon_awscdk_services_iam_IGroup_AsList <em>Groups software amazon awscdk services iam IGroup As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Groups software amazon awscdk services iam IGroup As List</em>'.
	 * @see iam.ManagedPolicyPropsBuilder_iam#getGroups_software_amazon_awscdk_services_iam_IGroup_AsList()
	 * @see #getManagedPolicyPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getManagedPolicyPropsBuilder_iam_Groups_software_amazon_awscdk_services_iam_IGroup_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.ManagedPolicyPropsBuilder_iam#getManagedPolicyName_java_lang_String_ <em>Managed Policy Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Managed Policy Name java lang String </em>'.
	 * @see iam.ManagedPolicyPropsBuilder_iam#getManagedPolicyName_java_lang_String_()
	 * @see #getManagedPolicyPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getManagedPolicyPropsBuilder_iam_ManagedPolicyName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.ManagedPolicyPropsBuilder_iam#getPath_java_lang_String_ <em>Path java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path java lang String </em>'.
	 * @see iam.ManagedPolicyPropsBuilder_iam#getPath_java_lang_String_()
	 * @see #getManagedPolicyPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getManagedPolicyPropsBuilder_iam_Path_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.ManagedPolicyPropsBuilder_iam#getRoles_software_amazon_awscdk_services_iam_IRole_AsList <em>Roles software amazon awscdk services iam IRole As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roles software amazon awscdk services iam IRole As List</em>'.
	 * @see iam.ManagedPolicyPropsBuilder_iam#getRoles_software_amazon_awscdk_services_iam_IRole_AsList()
	 * @see #getManagedPolicyPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getManagedPolicyPropsBuilder_iam_Roles_software_amazon_awscdk_services_iam_IRole_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.ManagedPolicyPropsBuilder_iam#getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList <em>Statements software amazon awscdk services iam Policy Statement As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statements software amazon awscdk services iam Policy Statement As List</em>'.
	 * @see iam.ManagedPolicyPropsBuilder_iam#getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList()
	 * @see #getManagedPolicyPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getManagedPolicyPropsBuilder_iam_Statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.ManagedPolicyPropsBuilder_iam#getUsers_software_amazon_awscdk_services_iam_IUser_AsList <em>Users software amazon awscdk services iam IUser As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Users software amazon awscdk services iam IUser As List</em>'.
	 * @see iam.ManagedPolicyPropsBuilder_iam#getUsers_software_amazon_awscdk_services_iam_IUser_AsList()
	 * @see #getManagedPolicyPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getManagedPolicyPropsBuilder_iam_Users_software_amazon_awscdk_services_iam_IUser_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.ManagedPolicyPropsBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see iam.ManagedPolicyPropsBuilder_iam#getGeneratedClassName()
	 * @see #getManagedPolicyPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getManagedPolicyPropsBuilder_iam_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link iam.ManagedPolicyPropsBuilder_iam#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see iam.ManagedPolicyPropsBuilder_iam#getVarName()
	 * @see #getManagedPolicyPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getManagedPolicyPropsBuilder_iam_VarName();

	/**
	 * Returns the meta object for the attribute '{@link iam.ManagedPolicyPropsBuilder_iam#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see iam.ManagedPolicyPropsBuilder_iam#getIdentifier()
	 * @see #getManagedPolicyPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getManagedPolicyPropsBuilder_iam_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link iam.ManagedPolicyPropsBuilder_iam#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see iam.ManagedPolicyPropsBuilder_iam#getAdditionalCode()
	 * @see #getManagedPolicyPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getManagedPolicyPropsBuilder_iam_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link iam.OpenIdConnectProviderBuilder_iam <em>Open Id Connect Provider Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Id Connect Provider Builder iam</em>'.
	 * @see iam.OpenIdConnectProviderBuilder_iam
	 * @generated
	 */
	EClass getOpenIdConnectProviderBuilder_iam();

	/**
	 * Returns the meta object for the attribute '{@link iam.OpenIdConnectProviderBuilder_iam#getUrl_java_lang_String_ <em>Url java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url java lang String </em>'.
	 * @see iam.OpenIdConnectProviderBuilder_iam#getUrl_java_lang_String_()
	 * @see #getOpenIdConnectProviderBuilder_iam()
	 * @generated
	 */
	EAttribute getOpenIdConnectProviderBuilder_iam_Url_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.OpenIdConnectProviderBuilder_iam#getClientIds_java_lang_String_AsList <em>Client Ids java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Ids java lang String As List</em>'.
	 * @see iam.OpenIdConnectProviderBuilder_iam#getClientIds_java_lang_String_AsList()
	 * @see #getOpenIdConnectProviderBuilder_iam()
	 * @generated
	 */
	EAttribute getOpenIdConnectProviderBuilder_iam_ClientIds_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.OpenIdConnectProviderBuilder_iam#getThumbprints_java_lang_String_AsList <em>Thumbprints java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thumbprints java lang String As List</em>'.
	 * @see iam.OpenIdConnectProviderBuilder_iam#getThumbprints_java_lang_String_AsList()
	 * @see #getOpenIdConnectProviderBuilder_iam()
	 * @generated
	 */
	EAttribute getOpenIdConnectProviderBuilder_iam_Thumbprints_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.OpenIdConnectProviderBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see iam.OpenIdConnectProviderBuilder_iam#getGeneratedClassName()
	 * @see #getOpenIdConnectProviderBuilder_iam()
	 * @generated
	 */
	EAttribute getOpenIdConnectProviderBuilder_iam_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link iam.OpenIdConnectProviderBuilder_iam#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see iam.OpenIdConnectProviderBuilder_iam#getVarName()
	 * @see #getOpenIdConnectProviderBuilder_iam()
	 * @generated
	 */
	EAttribute getOpenIdConnectProviderBuilder_iam_VarName();

	/**
	 * Returns the meta object for the attribute '{@link iam.OpenIdConnectProviderBuilder_iam#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see iam.OpenIdConnectProviderBuilder_iam#getIdentifier()
	 * @see #getOpenIdConnectProviderBuilder_iam()
	 * @generated
	 */
	EAttribute getOpenIdConnectProviderBuilder_iam_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link iam.OpenIdConnectProviderBuilder_iam#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see iam.OpenIdConnectProviderBuilder_iam#getAdditionalCode()
	 * @see #getOpenIdConnectProviderBuilder_iam()
	 * @generated
	 */
	EAttribute getOpenIdConnectProviderBuilder_iam_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link iam.LazyRoleBuilder_iam <em>Lazy Role Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lazy Role Builder iam</em>'.
	 * @see iam.LazyRoleBuilder_iam
	 * @generated
	 */
	EClass getLazyRoleBuilder_iam();

	/**
	 * Returns the meta object for the attribute '{@link iam.LazyRoleBuilder_iam#getAssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference <em>Assumed By With IPrincipal software amazon awscdk services iam IPrincipal As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assumed By With IPrincipal software amazon awscdk services iam IPrincipal As Reference</em>'.
	 * @see iam.LazyRoleBuilder_iam#getAssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference()
	 * @see #getLazyRoleBuilder_iam()
	 * @generated
	 */
	EAttribute getLazyRoleBuilder_iam_AssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link iam.LazyRoleBuilder_iam#getDescription_java_lang_String_ <em>Description java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description java lang String </em>'.
	 * @see iam.LazyRoleBuilder_iam#getDescription_java_lang_String_()
	 * @see #getLazyRoleBuilder_iam()
	 * @generated
	 */
	EAttribute getLazyRoleBuilder_iam_Description_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.LazyRoleBuilder_iam#getExternalId_java_lang_String_ <em>External Id java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Id java lang String </em>'.
	 * @see iam.LazyRoleBuilder_iam#getExternalId_java_lang_String_()
	 * @see #getLazyRoleBuilder_iam()
	 * @generated
	 */
	EAttribute getLazyRoleBuilder_iam_ExternalId_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.LazyRoleBuilder_iam#getExternalIds_java_lang_String_AsList <em>External Ids java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Ids java lang String As List</em>'.
	 * @see iam.LazyRoleBuilder_iam#getExternalIds_java_lang_String_AsList()
	 * @see #getLazyRoleBuilder_iam()
	 * @generated
	 */
	EAttribute getLazyRoleBuilder_iam_ExternalIds_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.LazyRoleBuilder_iam#getInlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap <em>Inline Policies java lang String software amazon awscdk services iam Policy Document As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inline Policies java lang String software amazon awscdk services iam Policy Document As Map</em>'.
	 * @see iam.LazyRoleBuilder_iam#getInlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap()
	 * @see #getLazyRoleBuilder_iam()
	 * @generated
	 */
	EAttribute getLazyRoleBuilder_iam_InlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap();

	/**
	 * Returns the meta object for the attribute '{@link iam.LazyRoleBuilder_iam#getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList <em>Managed Policies software amazon awscdk services iam IManaged Policy As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Managed Policies software amazon awscdk services iam IManaged Policy As List</em>'.
	 * @see iam.LazyRoleBuilder_iam#getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList()
	 * @see #getLazyRoleBuilder_iam()
	 * @generated
	 */
	EAttribute getLazyRoleBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.LazyRoleBuilder_iam#getMaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Max Session Duration With Duration software amazon awscdk core Duration As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Session Duration With Duration software amazon awscdk core Duration As Reference</em>'.
	 * @see iam.LazyRoleBuilder_iam#getMaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @see #getLazyRoleBuilder_iam()
	 * @generated
	 */
	EAttribute getLazyRoleBuilder_iam_MaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link iam.LazyRoleBuilder_iam#getPath_java_lang_String_ <em>Path java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path java lang String </em>'.
	 * @see iam.LazyRoleBuilder_iam#getPath_java_lang_String_()
	 * @see #getLazyRoleBuilder_iam()
	 * @generated
	 */
	EAttribute getLazyRoleBuilder_iam_Path_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.LazyRoleBuilder_iam#getPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference <em>Permissions Boundary With IManaged Policy software amazon awscdk services iam IManaged Policy As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permissions Boundary With IManaged Policy software amazon awscdk services iam IManaged Policy As Reference</em>'.
	 * @see iam.LazyRoleBuilder_iam#getPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference()
	 * @see #getLazyRoleBuilder_iam()
	 * @generated
	 */
	EAttribute getLazyRoleBuilder_iam_PermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link iam.LazyRoleBuilder_iam#getRoleName_java_lang_String_ <em>Role Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Name java lang String </em>'.
	 * @see iam.LazyRoleBuilder_iam#getRoleName_java_lang_String_()
	 * @see #getLazyRoleBuilder_iam()
	 * @generated
	 */
	EAttribute getLazyRoleBuilder_iam_RoleName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.LazyRoleBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see iam.LazyRoleBuilder_iam#getGeneratedClassName()
	 * @see #getLazyRoleBuilder_iam()
	 * @generated
	 */
	EAttribute getLazyRoleBuilder_iam_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link iam.LazyRoleBuilder_iam#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see iam.LazyRoleBuilder_iam#getVarName()
	 * @see #getLazyRoleBuilder_iam()
	 * @generated
	 */
	EAttribute getLazyRoleBuilder_iam_VarName();

	/**
	 * Returns the meta object for the attribute '{@link iam.LazyRoleBuilder_iam#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see iam.LazyRoleBuilder_iam#getIdentifier()
	 * @see #getLazyRoleBuilder_iam()
	 * @generated
	 */
	EAttribute getLazyRoleBuilder_iam_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link iam.LazyRoleBuilder_iam#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see iam.LazyRoleBuilder_iam#getAdditionalCode()
	 * @see #getLazyRoleBuilder_iam()
	 * @generated
	 */
	EAttribute getLazyRoleBuilder_iam_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link iam.CommonGrantOptionsBuilder_iam <em>Common Grant Options Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Common Grant Options Builder iam</em>'.
	 * @see iam.CommonGrantOptionsBuilder_iam
	 * @generated
	 */
	EClass getCommonGrantOptionsBuilder_iam();

	/**
	 * Returns the meta object for the attribute '{@link iam.CommonGrantOptionsBuilder_iam#getActions_java_lang_String_AsList <em>Actions java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actions java lang String As List</em>'.
	 * @see iam.CommonGrantOptionsBuilder_iam#getActions_java_lang_String_AsList()
	 * @see #getCommonGrantOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getCommonGrantOptionsBuilder_iam_Actions_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.CommonGrantOptionsBuilder_iam#getGranteeWithIGrantable_software_amazon_awscdk_services_iam_IGrantable_AsReference <em>Grantee With IGrantable software amazon awscdk services iam IGrantable As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grantee With IGrantable software amazon awscdk services iam IGrantable As Reference</em>'.
	 * @see iam.CommonGrantOptionsBuilder_iam#getGranteeWithIGrantable_software_amazon_awscdk_services_iam_IGrantable_AsReference()
	 * @see #getCommonGrantOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getCommonGrantOptionsBuilder_iam_GranteeWithIGrantable_software_amazon_awscdk_services_iam_IGrantable_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link iam.CommonGrantOptionsBuilder_iam#getResourceArns_java_lang_String_AsList <em>Resource Arns java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Arns java lang String As List</em>'.
	 * @see iam.CommonGrantOptionsBuilder_iam#getResourceArns_java_lang_String_AsList()
	 * @see #getCommonGrantOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getCommonGrantOptionsBuilder_iam_ResourceArns_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.CommonGrantOptionsBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see iam.CommonGrantOptionsBuilder_iam#getGeneratedClassName()
	 * @see #getCommonGrantOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getCommonGrantOptionsBuilder_iam_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link iam.CommonGrantOptionsBuilder_iam#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see iam.CommonGrantOptionsBuilder_iam#getVarName()
	 * @see #getCommonGrantOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getCommonGrantOptionsBuilder_iam_VarName();

	/**
	 * Returns the meta object for the attribute '{@link iam.CommonGrantOptionsBuilder_iam#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see iam.CommonGrantOptionsBuilder_iam#getIdentifier()
	 * @see #getCommonGrantOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getCommonGrantOptionsBuilder_iam_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link iam.CommonGrantOptionsBuilder_iam#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see iam.CommonGrantOptionsBuilder_iam#getAdditionalCode()
	 * @see #getCommonGrantOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getCommonGrantOptionsBuilder_iam_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link iam.GrantWithResourceOptionsBuilder_iam <em>Grant With Resource Options Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grant With Resource Options Builder iam</em>'.
	 * @see iam.GrantWithResourceOptionsBuilder_iam
	 * @generated
	 */
	EClass getGrantWithResourceOptionsBuilder_iam();

	/**
	 * Returns the meta object for the attribute '{@link iam.GrantWithResourceOptionsBuilder_iam#getResourceWithIResourceWithPolicy_software_amazon_awscdk_services_iam_IResourceWithPolicy_AsReference <em>Resource With IResource With Policy software amazon awscdk services iam IResource With Policy As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource With IResource With Policy software amazon awscdk services iam IResource With Policy As Reference</em>'.
	 * @see iam.GrantWithResourceOptionsBuilder_iam#getResourceWithIResourceWithPolicy_software_amazon_awscdk_services_iam_IResourceWithPolicy_AsReference()
	 * @see #getGrantWithResourceOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getGrantWithResourceOptionsBuilder_iam_ResourceWithIResourceWithPolicy_software_amazon_awscdk_services_iam_IResourceWithPolicy_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link iam.GrantWithResourceOptionsBuilder_iam#getResourceSelfArns_java_lang_String_AsList <em>Resource Self Arns java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Self Arns java lang String As List</em>'.
	 * @see iam.GrantWithResourceOptionsBuilder_iam#getResourceSelfArns_java_lang_String_AsList()
	 * @see #getGrantWithResourceOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getGrantWithResourceOptionsBuilder_iam_ResourceSelfArns_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.GrantWithResourceOptionsBuilder_iam#getActions_java_lang_String_AsList <em>Actions java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actions java lang String As List</em>'.
	 * @see iam.GrantWithResourceOptionsBuilder_iam#getActions_java_lang_String_AsList()
	 * @see #getGrantWithResourceOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getGrantWithResourceOptionsBuilder_iam_Actions_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.GrantWithResourceOptionsBuilder_iam#getGranteeWithIGrantable_software_amazon_awscdk_services_iam_IGrantable_AsReference <em>Grantee With IGrantable software amazon awscdk services iam IGrantable As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grantee With IGrantable software amazon awscdk services iam IGrantable As Reference</em>'.
	 * @see iam.GrantWithResourceOptionsBuilder_iam#getGranteeWithIGrantable_software_amazon_awscdk_services_iam_IGrantable_AsReference()
	 * @see #getGrantWithResourceOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getGrantWithResourceOptionsBuilder_iam_GranteeWithIGrantable_software_amazon_awscdk_services_iam_IGrantable_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link iam.GrantWithResourceOptionsBuilder_iam#getResourceArns_java_lang_String_AsList <em>Resource Arns java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Arns java lang String As List</em>'.
	 * @see iam.GrantWithResourceOptionsBuilder_iam#getResourceArns_java_lang_String_AsList()
	 * @see #getGrantWithResourceOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getGrantWithResourceOptionsBuilder_iam_ResourceArns_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.GrantWithResourceOptionsBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see iam.GrantWithResourceOptionsBuilder_iam#getGeneratedClassName()
	 * @see #getGrantWithResourceOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getGrantWithResourceOptionsBuilder_iam_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link iam.GrantWithResourceOptionsBuilder_iam#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see iam.GrantWithResourceOptionsBuilder_iam#getVarName()
	 * @see #getGrantWithResourceOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getGrantWithResourceOptionsBuilder_iam_VarName();

	/**
	 * Returns the meta object for the attribute '{@link iam.GrantWithResourceOptionsBuilder_iam#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see iam.GrantWithResourceOptionsBuilder_iam#getIdentifier()
	 * @see #getGrantWithResourceOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getGrantWithResourceOptionsBuilder_iam_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link iam.GrantWithResourceOptionsBuilder_iam#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see iam.GrantWithResourceOptionsBuilder_iam#getAdditionalCode()
	 * @see #getGrantWithResourceOptionsBuilder_iam()
	 * @generated
	 */
	EAttribute getGrantWithResourceOptionsBuilder_iam_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link iam.LazyRolePropsBuilder_iam <em>Lazy Role Props Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lazy Role Props Builder iam</em>'.
	 * @see iam.LazyRolePropsBuilder_iam
	 * @generated
	 */
	EClass getLazyRolePropsBuilder_iam();

	/**
	 * Returns the meta object for the attribute '{@link iam.LazyRolePropsBuilder_iam#getAssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference <em>Assumed By With IPrincipal software amazon awscdk services iam IPrincipal As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assumed By With IPrincipal software amazon awscdk services iam IPrincipal As Reference</em>'.
	 * @see iam.LazyRolePropsBuilder_iam#getAssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference()
	 * @see #getLazyRolePropsBuilder_iam()
	 * @generated
	 */
	EAttribute getLazyRolePropsBuilder_iam_AssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link iam.LazyRolePropsBuilder_iam#getDescription_java_lang_String_ <em>Description java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description java lang String </em>'.
	 * @see iam.LazyRolePropsBuilder_iam#getDescription_java_lang_String_()
	 * @see #getLazyRolePropsBuilder_iam()
	 * @generated
	 */
	EAttribute getLazyRolePropsBuilder_iam_Description_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.LazyRolePropsBuilder_iam#getExternalId_java_lang_String_ <em>External Id java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Id java lang String </em>'.
	 * @see iam.LazyRolePropsBuilder_iam#getExternalId_java_lang_String_()
	 * @see #getLazyRolePropsBuilder_iam()
	 * @generated
	 */
	EAttribute getLazyRolePropsBuilder_iam_ExternalId_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.LazyRolePropsBuilder_iam#getExternalIds_java_lang_String_AsList <em>External Ids java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Ids java lang String As List</em>'.
	 * @see iam.LazyRolePropsBuilder_iam#getExternalIds_java_lang_String_AsList()
	 * @see #getLazyRolePropsBuilder_iam()
	 * @generated
	 */
	EAttribute getLazyRolePropsBuilder_iam_ExternalIds_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.LazyRolePropsBuilder_iam#getInlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap <em>Inline Policies java lang String software amazon awscdk services iam Policy Document As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inline Policies java lang String software amazon awscdk services iam Policy Document As Map</em>'.
	 * @see iam.LazyRolePropsBuilder_iam#getInlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap()
	 * @see #getLazyRolePropsBuilder_iam()
	 * @generated
	 */
	EAttribute getLazyRolePropsBuilder_iam_InlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap();

	/**
	 * Returns the meta object for the attribute '{@link iam.LazyRolePropsBuilder_iam#getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList <em>Managed Policies software amazon awscdk services iam IManaged Policy As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Managed Policies software amazon awscdk services iam IManaged Policy As List</em>'.
	 * @see iam.LazyRolePropsBuilder_iam#getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList()
	 * @see #getLazyRolePropsBuilder_iam()
	 * @generated
	 */
	EAttribute getLazyRolePropsBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.LazyRolePropsBuilder_iam#getMaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Max Session Duration With Duration software amazon awscdk core Duration As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Session Duration With Duration software amazon awscdk core Duration As Reference</em>'.
	 * @see iam.LazyRolePropsBuilder_iam#getMaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @see #getLazyRolePropsBuilder_iam()
	 * @generated
	 */
	EAttribute getLazyRolePropsBuilder_iam_MaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link iam.LazyRolePropsBuilder_iam#getPath_java_lang_String_ <em>Path java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path java lang String </em>'.
	 * @see iam.LazyRolePropsBuilder_iam#getPath_java_lang_String_()
	 * @see #getLazyRolePropsBuilder_iam()
	 * @generated
	 */
	EAttribute getLazyRolePropsBuilder_iam_Path_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.LazyRolePropsBuilder_iam#getPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference <em>Permissions Boundary With IManaged Policy software amazon awscdk services iam IManaged Policy As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permissions Boundary With IManaged Policy software amazon awscdk services iam IManaged Policy As Reference</em>'.
	 * @see iam.LazyRolePropsBuilder_iam#getPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference()
	 * @see #getLazyRolePropsBuilder_iam()
	 * @generated
	 */
	EAttribute getLazyRolePropsBuilder_iam_PermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link iam.LazyRolePropsBuilder_iam#getRoleName_java_lang_String_ <em>Role Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Name java lang String </em>'.
	 * @see iam.LazyRolePropsBuilder_iam#getRoleName_java_lang_String_()
	 * @see #getLazyRolePropsBuilder_iam()
	 * @generated
	 */
	EAttribute getLazyRolePropsBuilder_iam_RoleName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.LazyRolePropsBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see iam.LazyRolePropsBuilder_iam#getGeneratedClassName()
	 * @see #getLazyRolePropsBuilder_iam()
	 * @generated
	 */
	EAttribute getLazyRolePropsBuilder_iam_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link iam.LazyRolePropsBuilder_iam#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see iam.LazyRolePropsBuilder_iam#getVarName()
	 * @see #getLazyRolePropsBuilder_iam()
	 * @generated
	 */
	EAttribute getLazyRolePropsBuilder_iam_VarName();

	/**
	 * Returns the meta object for the attribute '{@link iam.LazyRolePropsBuilder_iam#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see iam.LazyRolePropsBuilder_iam#getIdentifier()
	 * @see #getLazyRolePropsBuilder_iam()
	 * @generated
	 */
	EAttribute getLazyRolePropsBuilder_iam_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link iam.LazyRolePropsBuilder_iam#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see iam.LazyRolePropsBuilder_iam#getAdditionalCode()
	 * @see #getLazyRolePropsBuilder_iam()
	 * @generated
	 */
	EAttribute getLazyRolePropsBuilder_iam_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link iam.PolicyPropsBuilder_iam <em>Policy Props Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Props Builder iam</em>'.
	 * @see iam.PolicyPropsBuilder_iam
	 * @generated
	 */
	EClass getPolicyPropsBuilder_iam();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyPropsBuilder_iam#getForce_java_lang_Boolean_ <em>Force java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Force java lang Boolean </em>'.
	 * @see iam.PolicyPropsBuilder_iam#getForce_java_lang_Boolean_()
	 * @see #getPolicyPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyPropsBuilder_iam_Force_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyPropsBuilder_iam#getGroups_software_amazon_awscdk_services_iam_IGroup_AsList <em>Groups software amazon awscdk services iam IGroup As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Groups software amazon awscdk services iam IGroup As List</em>'.
	 * @see iam.PolicyPropsBuilder_iam#getGroups_software_amazon_awscdk_services_iam_IGroup_AsList()
	 * @see #getPolicyPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyPropsBuilder_iam_Groups_software_amazon_awscdk_services_iam_IGroup_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyPropsBuilder_iam#getPolicyName_java_lang_String_ <em>Policy Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Name java lang String </em>'.
	 * @see iam.PolicyPropsBuilder_iam#getPolicyName_java_lang_String_()
	 * @see #getPolicyPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyPropsBuilder_iam_PolicyName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyPropsBuilder_iam#getRoles_software_amazon_awscdk_services_iam_IRole_AsList <em>Roles software amazon awscdk services iam IRole As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roles software amazon awscdk services iam IRole As List</em>'.
	 * @see iam.PolicyPropsBuilder_iam#getRoles_software_amazon_awscdk_services_iam_IRole_AsList()
	 * @see #getPolicyPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyPropsBuilder_iam_Roles_software_amazon_awscdk_services_iam_IRole_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyPropsBuilder_iam#getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList <em>Statements software amazon awscdk services iam Policy Statement As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statements software amazon awscdk services iam Policy Statement As List</em>'.
	 * @see iam.PolicyPropsBuilder_iam#getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList()
	 * @see #getPolicyPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyPropsBuilder_iam_Statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyPropsBuilder_iam#getUsers_software_amazon_awscdk_services_iam_IUser_AsList <em>Users software amazon awscdk services iam IUser As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Users software amazon awscdk services iam IUser As List</em>'.
	 * @see iam.PolicyPropsBuilder_iam#getUsers_software_amazon_awscdk_services_iam_IUser_AsList()
	 * @see #getPolicyPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyPropsBuilder_iam_Users_software_amazon_awscdk_services_iam_IUser_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyPropsBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see iam.PolicyPropsBuilder_iam#getGeneratedClassName()
	 * @see #getPolicyPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyPropsBuilder_iam_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyPropsBuilder_iam#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see iam.PolicyPropsBuilder_iam#getVarName()
	 * @see #getPolicyPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyPropsBuilder_iam_VarName();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyPropsBuilder_iam#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see iam.PolicyPropsBuilder_iam#getIdentifier()
	 * @see #getPolicyPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyPropsBuilder_iam_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link iam.PolicyPropsBuilder_iam#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see iam.PolicyPropsBuilder_iam#getAdditionalCode()
	 * @see #getPolicyPropsBuilder_iam()
	 * @generated
	 */
	EAttribute getPolicyPropsBuilder_iam_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link iam.GroupBuilder_iam <em>Group Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Builder iam</em>'.
	 * @see iam.GroupBuilder_iam
	 * @generated
	 */
	EClass getGroupBuilder_iam();

	/**
	 * Returns the meta object for the attribute '{@link iam.GroupBuilder_iam#getGroupName_java_lang_String_ <em>Group Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Name java lang String </em>'.
	 * @see iam.GroupBuilder_iam#getGroupName_java_lang_String_()
	 * @see #getGroupBuilder_iam()
	 * @generated
	 */
	EAttribute getGroupBuilder_iam_GroupName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.GroupBuilder_iam#getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList <em>Managed Policies software amazon awscdk services iam IManaged Policy As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Managed Policies software amazon awscdk services iam IManaged Policy As List</em>'.
	 * @see iam.GroupBuilder_iam#getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList()
	 * @see #getGroupBuilder_iam()
	 * @generated
	 */
	EAttribute getGroupBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList();

	/**
	 * Returns the meta object for the attribute '{@link iam.GroupBuilder_iam#getPath_java_lang_String_ <em>Path java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path java lang String </em>'.
	 * @see iam.GroupBuilder_iam#getPath_java_lang_String_()
	 * @see #getGroupBuilder_iam()
	 * @generated
	 */
	EAttribute getGroupBuilder_iam_Path_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link iam.GroupBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see iam.GroupBuilder_iam#getGeneratedClassName()
	 * @see #getGroupBuilder_iam()
	 * @generated
	 */
	EAttribute getGroupBuilder_iam_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link iam.GroupBuilder_iam#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see iam.GroupBuilder_iam#getVarName()
	 * @see #getGroupBuilder_iam()
	 * @generated
	 */
	EAttribute getGroupBuilder_iam_VarName();

	/**
	 * Returns the meta object for the attribute '{@link iam.GroupBuilder_iam#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see iam.GroupBuilder_iam#getIdentifier()
	 * @see #getGroupBuilder_iam()
	 * @generated
	 */
	EAttribute getGroupBuilder_iam_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link iam.GroupBuilder_iam#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see iam.GroupBuilder_iam#getAdditionalCode()
	 * @see #getGroupBuilder_iam()
	 * @generated
	 */
	EAttribute getGroupBuilder_iam_AdditionalCode();

	/**
	 * Returns the meta object for enum '{@link iam.Effect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Effect</em>'.
	 * @see iam.Effect
	 * @generated
	 */
	EEnum getEffect();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IamFactory getIamFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link iam.impl.RolePropsBuilder_iamImpl <em>Role Props Builder iam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iam.impl.RolePropsBuilder_iamImpl
		 * @see iam.impl.IamPackageImpl#getRolePropsBuilder_iam()
		 * @generated
		 */
		EClass ROLE_PROPS_BUILDER_IAM = eINSTANCE.getRolePropsBuilder_iam();

		/**
		 * The meta object literal for the '<em><b>Assumed By With IPrincipal software amazon awscdk services iam IPrincipal As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_PROPS_BUILDER_IAM__ASSUMED_BY_WITH_IPRINCIPAL_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_REFERENCE = eINSTANCE
				.getRolePropsBuilder_iam_AssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference();

		/**
		 * The meta object literal for the '<em><b>Description java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_PROPS_BUILDER_IAM__DESCRIPTION_JAVA_LANG_STRING_ = eINSTANCE
				.getRolePropsBuilder_iam_Description_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>External Id java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_PROPS_BUILDER_IAM__EXTERNAL_ID_JAVA_LANG_STRING_ = eINSTANCE
				.getRolePropsBuilder_iam_ExternalId_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>External Ids java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_PROPS_BUILDER_IAM__EXTERNAL_IDS_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getRolePropsBuilder_iam_ExternalIds_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Inline Policies java lang String software amazon awscdk services iam Policy Document As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_PROPS_BUILDER_IAM__INLINE_POLICIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_MAP = eINSTANCE
				.getRolePropsBuilder_iam_InlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap();

		/**
		 * The meta object literal for the '<em><b>Managed Policies software amazon awscdk services iam IManaged Policy As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_PROPS_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST = eINSTANCE
				.getRolePropsBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList();

		/**
		 * The meta object literal for the '<em><b>Max Session Duration With Duration software amazon awscdk core Duration As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_PROPS_BUILDER_IAM__MAX_SESSION_DURATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE = eINSTANCE
				.getRolePropsBuilder_iam_MaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference();

		/**
		 * The meta object literal for the '<em><b>Path java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_PROPS_BUILDER_IAM__PATH_JAVA_LANG_STRING_ = eINSTANCE
				.getRolePropsBuilder_iam_Path_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Permissions Boundary With IManaged Policy software amazon awscdk services iam IManaged Policy As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_PROPS_BUILDER_IAM__PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE = eINSTANCE
				.getRolePropsBuilder_iam_PermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference();

		/**
		 * The meta object literal for the '<em><b>Role Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_PROPS_BUILDER_IAM__ROLE_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getRolePropsBuilder_iam_RoleName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_PROPS_BUILDER_IAM__GENERATED_CLASS_NAME = eINSTANCE
				.getRolePropsBuilder_iam_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_PROPS_BUILDER_IAM__VAR_NAME = eINSTANCE.getRolePropsBuilder_iam_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_PROPS_BUILDER_IAM__IDENTIFIER = eINSTANCE.getRolePropsBuilder_iam_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_PROPS_BUILDER_IAM__ADDITIONAL_CODE = eINSTANCE.getRolePropsBuilder_iam_AdditionalCode();

		/**
		 * The meta object literal for the '{@link iam.impl.UnknownPrincipalPropsBuilder_iamImpl <em>Unknown Principal Props Builder iam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iam.impl.UnknownPrincipalPropsBuilder_iamImpl
		 * @see iam.impl.IamPackageImpl#getUnknownPrincipalPropsBuilder_iam()
		 * @generated
		 */
		EClass UNKNOWN_PRINCIPAL_PROPS_BUILDER_IAM = eINSTANCE.getUnknownPrincipalPropsBuilder_iam();

		/**
		 * The meta object literal for the '<em><b>Resource With IConstruct software amazon awscdk core IConstruct As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNKNOWN_PRINCIPAL_PROPS_BUILDER_IAM__RESOURCE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE = eINSTANCE
				.getUnknownPrincipalPropsBuilder_iam_ResourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNKNOWN_PRINCIPAL_PROPS_BUILDER_IAM__GENERATED_CLASS_NAME = eINSTANCE
				.getUnknownPrincipalPropsBuilder_iam_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNKNOWN_PRINCIPAL_PROPS_BUILDER_IAM__VAR_NAME = eINSTANCE
				.getUnknownPrincipalPropsBuilder_iam_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNKNOWN_PRINCIPAL_PROPS_BUILDER_IAM__IDENTIFIER = eINSTANCE
				.getUnknownPrincipalPropsBuilder_iam_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNKNOWN_PRINCIPAL_PROPS_BUILDER_IAM__ADDITIONAL_CODE = eINSTANCE
				.getUnknownPrincipalPropsBuilder_iam_AdditionalCode();

		/**
		 * The meta object literal for the '{@link iam.impl.OpenIdConnectProviderPropsBuilder_iamImpl <em>Open Id Connect Provider Props Builder iam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iam.impl.OpenIdConnectProviderPropsBuilder_iamImpl
		 * @see iam.impl.IamPackageImpl#getOpenIdConnectProviderPropsBuilder_iam()
		 * @generated
		 */
		EClass OPEN_ID_CONNECT_PROVIDER_PROPS_BUILDER_IAM = eINSTANCE.getOpenIdConnectProviderPropsBuilder_iam();

		/**
		 * The meta object literal for the '<em><b>Url java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_ID_CONNECT_PROVIDER_PROPS_BUILDER_IAM__URL_JAVA_LANG_STRING_ = eINSTANCE
				.getOpenIdConnectProviderPropsBuilder_iam_Url_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Client Ids java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_ID_CONNECT_PROVIDER_PROPS_BUILDER_IAM__CLIENT_IDS_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getOpenIdConnectProviderPropsBuilder_iam_ClientIds_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Thumbprints java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_ID_CONNECT_PROVIDER_PROPS_BUILDER_IAM__THUMBPRINTS_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getOpenIdConnectProviderPropsBuilder_iam_Thumbprints_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_ID_CONNECT_PROVIDER_PROPS_BUILDER_IAM__GENERATED_CLASS_NAME = eINSTANCE
				.getOpenIdConnectProviderPropsBuilder_iam_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_ID_CONNECT_PROVIDER_PROPS_BUILDER_IAM__VAR_NAME = eINSTANCE
				.getOpenIdConnectProviderPropsBuilder_iam_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_ID_CONNECT_PROVIDER_PROPS_BUILDER_IAM__IDENTIFIER = eINSTANCE
				.getOpenIdConnectProviderPropsBuilder_iam_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_ID_CONNECT_PROVIDER_PROPS_BUILDER_IAM__ADDITIONAL_CODE = eINSTANCE
				.getOpenIdConnectProviderPropsBuilder_iam_AdditionalCode();

		/**
		 * The meta object literal for the '{@link iam.impl.GroupPropsBuilder_iamImpl <em>Group Props Builder iam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iam.impl.GroupPropsBuilder_iamImpl
		 * @see iam.impl.IamPackageImpl#getGroupPropsBuilder_iam()
		 * @generated
		 */
		EClass GROUP_PROPS_BUILDER_IAM = eINSTANCE.getGroupPropsBuilder_iam();

		/**
		 * The meta object literal for the '<em><b>Group Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_PROPS_BUILDER_IAM__GROUP_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getGroupPropsBuilder_iam_GroupName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Managed Policies software amazon awscdk services iam IManaged Policy As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_PROPS_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST = eINSTANCE
				.getGroupPropsBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList();

		/**
		 * The meta object literal for the '<em><b>Path java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_PROPS_BUILDER_IAM__PATH_JAVA_LANG_STRING_ = eINSTANCE
				.getGroupPropsBuilder_iam_Path_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_PROPS_BUILDER_IAM__GENERATED_CLASS_NAME = eINSTANCE
				.getGroupPropsBuilder_iam_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_PROPS_BUILDER_IAM__VAR_NAME = eINSTANCE.getGroupPropsBuilder_iam_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_PROPS_BUILDER_IAM__IDENTIFIER = eINSTANCE.getGroupPropsBuilder_iam_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_PROPS_BUILDER_IAM__ADDITIONAL_CODE = eINSTANCE.getGroupPropsBuilder_iam_AdditionalCode();

		/**
		 * The meta object literal for the '{@link iam.impl.RoleBuilder_iamImpl <em>Role Builder iam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iam.impl.RoleBuilder_iamImpl
		 * @see iam.impl.IamPackageImpl#getRoleBuilder_iam()
		 * @generated
		 */
		EClass ROLE_BUILDER_IAM = eINSTANCE.getRoleBuilder_iam();

		/**
		 * The meta object literal for the '<em><b>Assumed By With IPrincipal software amazon awscdk services iam IPrincipal As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_BUILDER_IAM__ASSUMED_BY_WITH_IPRINCIPAL_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_REFERENCE = eINSTANCE
				.getRoleBuilder_iam_AssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference();

		/**
		 * The meta object literal for the '<em><b>Description java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_BUILDER_IAM__DESCRIPTION_JAVA_LANG_STRING_ = eINSTANCE
				.getRoleBuilder_iam_Description_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>External Id java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_BUILDER_IAM__EXTERNAL_ID_JAVA_LANG_STRING_ = eINSTANCE
				.getRoleBuilder_iam_ExternalId_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>External Ids java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_BUILDER_IAM__EXTERNAL_IDS_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getRoleBuilder_iam_ExternalIds_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Inline Policies java lang String software amazon awscdk services iam Policy Document As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_BUILDER_IAM__INLINE_POLICIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_MAP = eINSTANCE
				.getRoleBuilder_iam_InlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap();

		/**
		 * The meta object literal for the '<em><b>Managed Policies software amazon awscdk services iam IManaged Policy As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST = eINSTANCE
				.getRoleBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList();

		/**
		 * The meta object literal for the '<em><b>Max Session Duration With Duration software amazon awscdk core Duration As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_BUILDER_IAM__MAX_SESSION_DURATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE = eINSTANCE
				.getRoleBuilder_iam_MaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference();

		/**
		 * The meta object literal for the '<em><b>Path java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_BUILDER_IAM__PATH_JAVA_LANG_STRING_ = eINSTANCE.getRoleBuilder_iam_Path_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Permissions Boundary With IManaged Policy software amazon awscdk services iam IManaged Policy As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_BUILDER_IAM__PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE = eINSTANCE
				.getRoleBuilder_iam_PermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference();

		/**
		 * The meta object literal for the '<em><b>Role Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_BUILDER_IAM__ROLE_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getRoleBuilder_iam_RoleName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_BUILDER_IAM__GENERATED_CLASS_NAME = eINSTANCE.getRoleBuilder_iam_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_BUILDER_IAM__VAR_NAME = eINSTANCE.getRoleBuilder_iam_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_BUILDER_IAM__IDENTIFIER = eINSTANCE.getRoleBuilder_iam_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_BUILDER_IAM__ADDITIONAL_CODE = eINSTANCE.getRoleBuilder_iam_AdditionalCode();

		/**
		 * The meta object literal for the '{@link iam.impl.ServicePrincipalBuilder_iamImpl <em>Service Principal Builder iam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iam.impl.ServicePrincipalBuilder_iamImpl
		 * @see iam.impl.IamPackageImpl#getServicePrincipalBuilder_iam()
		 * @generated
		 */
		EClass SERVICE_PRINCIPAL_BUILDER_IAM = eINSTANCE.getServicePrincipalBuilder_iam();

		/**
		 * The meta object literal for the '<em><b>Conditions java lang String java lang Object As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PRINCIPAL_BUILDER_IAM__CONDITIONS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP = eINSTANCE
				.getServicePrincipalBuilder_iam_Conditions_java_lang_String__java_lang_Object_AsMap();

		/**
		 * The meta object literal for the '<em><b>Region java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PRINCIPAL_BUILDER_IAM__REGION_JAVA_LANG_STRING_ = eINSTANCE
				.getServicePrincipalBuilder_iam_Region_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PRINCIPAL_BUILDER_IAM__GENERATED_CLASS_NAME = eINSTANCE
				.getServicePrincipalBuilder_iam_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PRINCIPAL_BUILDER_IAM__VAR_NAME = eINSTANCE.getServicePrincipalBuilder_iam_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PRINCIPAL_BUILDER_IAM__IDENTIFIER = eINSTANCE.getServicePrincipalBuilder_iam_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PRINCIPAL_BUILDER_IAM__ADDITIONAL_CODE = eINSTANCE
				.getServicePrincipalBuilder_iam_AdditionalCode();

		/**
		 * The meta object literal for the '{@link iam.impl.GrantOnPrincipalOptionsBuilder_iamImpl <em>Grant On Principal Options Builder iam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iam.impl.GrantOnPrincipalOptionsBuilder_iamImpl
		 * @see iam.impl.IamPackageImpl#getGrantOnPrincipalOptionsBuilder_iam()
		 * @generated
		 */
		EClass GRANT_ON_PRINCIPAL_OPTIONS_BUILDER_IAM = eINSTANCE.getGrantOnPrincipalOptionsBuilder_iam();

		/**
		 * The meta object literal for the '<em><b>Scope With IConstruct software amazon awscdk core IConstruct As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRANT_ON_PRINCIPAL_OPTIONS_BUILDER_IAM__SCOPE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE = eINSTANCE
				.getGrantOnPrincipalOptionsBuilder_iam_ScopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference();

		/**
		 * The meta object literal for the '<em><b>Actions java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRANT_ON_PRINCIPAL_OPTIONS_BUILDER_IAM__ACTIONS_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getGrantOnPrincipalOptionsBuilder_iam_Actions_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Grantee With IGrantable software amazon awscdk services iam IGrantable As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRANT_ON_PRINCIPAL_OPTIONS_BUILDER_IAM__GRANTEE_WITH_IGRANTABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGRANTABLE_AS_REFERENCE = eINSTANCE
				.getGrantOnPrincipalOptionsBuilder_iam_GranteeWithIGrantable_software_amazon_awscdk_services_iam_IGrantable_AsReference();

		/**
		 * The meta object literal for the '<em><b>Resource Arns java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRANT_ON_PRINCIPAL_OPTIONS_BUILDER_IAM__RESOURCE_ARNS_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getGrantOnPrincipalOptionsBuilder_iam_ResourceArns_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRANT_ON_PRINCIPAL_OPTIONS_BUILDER_IAM__GENERATED_CLASS_NAME = eINSTANCE
				.getGrantOnPrincipalOptionsBuilder_iam_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRANT_ON_PRINCIPAL_OPTIONS_BUILDER_IAM__VAR_NAME = eINSTANCE
				.getGrantOnPrincipalOptionsBuilder_iam_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRANT_ON_PRINCIPAL_OPTIONS_BUILDER_IAM__IDENTIFIER = eINSTANCE
				.getGrantOnPrincipalOptionsBuilder_iam_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRANT_ON_PRINCIPAL_OPTIONS_BUILDER_IAM__ADDITIONAL_CODE = eINSTANCE
				.getGrantOnPrincipalOptionsBuilder_iam_AdditionalCode();

		/**
		 * The meta object literal for the '{@link iam.impl.UserBuilder_iamImpl <em>User Builder iam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iam.impl.UserBuilder_iamImpl
		 * @see iam.impl.IamPackageImpl#getUserBuilder_iam()
		 * @generated
		 */
		EClass USER_BUILDER_IAM = eINSTANCE.getUserBuilder_iam();

		/**
		 * The meta object literal for the '<em><b>Groups software amazon awscdk services iam IGroup As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST = eINSTANCE
				.getUserBuilder_iam_Groups_software_amazon_awscdk_services_iam_IGroup_AsList();

		/**
		 * The meta object literal for the '<em><b>Managed Policies software amazon awscdk services iam IManaged Policy As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST = eINSTANCE
				.getUserBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList();

		/**
		 * The meta object literal for the '<em><b>Password With Secret Value software amazon awscdk core Secret Value As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_BUILDER_IAM__PASSWORD_WITH_SECRET_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_SECRET_VALUE_AS_REFERENCE = eINSTANCE
				.getUserBuilder_iam_PasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference();

		/**
		 * The meta object literal for the '<em><b>Password Reset Required java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_BUILDER_IAM__PASSWORD_RESET_REQUIRED_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getUserBuilder_iam_PasswordResetRequired_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Path java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_BUILDER_IAM__PATH_JAVA_LANG_STRING_ = eINSTANCE.getUserBuilder_iam_Path_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Permissions Boundary With IManaged Policy software amazon awscdk services iam IManaged Policy As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_BUILDER_IAM__PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE = eINSTANCE
				.getUserBuilder_iam_PermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference();

		/**
		 * The meta object literal for the '<em><b>User Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_BUILDER_IAM__USER_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getUserBuilder_iam_UserName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_BUILDER_IAM__GENERATED_CLASS_NAME = eINSTANCE.getUserBuilder_iam_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_BUILDER_IAM__VAR_NAME = eINSTANCE.getUserBuilder_iam_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_BUILDER_IAM__IDENTIFIER = eINSTANCE.getUserBuilder_iam_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_BUILDER_IAM__ADDITIONAL_CODE = eINSTANCE.getUserBuilder_iam_AdditionalCode();

		/**
		 * The meta object literal for the '{@link iam.impl.GrantOnPrincipalAndResourceOptionsBuilder_iamImpl <em>Grant On Principal And Resource Options Builder iam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iam.impl.GrantOnPrincipalAndResourceOptionsBuilder_iamImpl
		 * @see iam.impl.IamPackageImpl#getGrantOnPrincipalAndResourceOptionsBuilder_iam()
		 * @generated
		 */
		EClass GRANT_ON_PRINCIPAL_AND_RESOURCE_OPTIONS_BUILDER_IAM = eINSTANCE
				.getGrantOnPrincipalAndResourceOptionsBuilder_iam();

		/**
		 * The meta object literal for the '<em><b>Resource With IResource With Policy software amazon awscdk services iam IResource With Policy As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRANT_ON_PRINCIPAL_AND_RESOURCE_OPTIONS_BUILDER_IAM__RESOURCE_WITH_IRESOURCE_WITH_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IRESOURCE_WITH_POLICY_AS_REFERENCE = eINSTANCE
				.getGrantOnPrincipalAndResourceOptionsBuilder_iam_ResourceWithIResourceWithPolicy_software_amazon_awscdk_services_iam_IResourceWithPolicy_AsReference();

		/**
		 * The meta object literal for the '<em><b>Resource Policy Principal With IPrincipal software amazon awscdk services iam IPrincipal As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRANT_ON_PRINCIPAL_AND_RESOURCE_OPTIONS_BUILDER_IAM__RESOURCE_POLICY_PRINCIPAL_WITH_IPRINCIPAL_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_REFERENCE = eINSTANCE
				.getGrantOnPrincipalAndResourceOptionsBuilder_iam_ResourcePolicyPrincipalWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference();

		/**
		 * The meta object literal for the '<em><b>Resource Self Arns java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRANT_ON_PRINCIPAL_AND_RESOURCE_OPTIONS_BUILDER_IAM__RESOURCE_SELF_ARNS_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getGrantOnPrincipalAndResourceOptionsBuilder_iam_ResourceSelfArns_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Actions java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRANT_ON_PRINCIPAL_AND_RESOURCE_OPTIONS_BUILDER_IAM__ACTIONS_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getGrantOnPrincipalAndResourceOptionsBuilder_iam_Actions_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Grantee With IGrantable software amazon awscdk services iam IGrantable As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRANT_ON_PRINCIPAL_AND_RESOURCE_OPTIONS_BUILDER_IAM__GRANTEE_WITH_IGRANTABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGRANTABLE_AS_REFERENCE = eINSTANCE
				.getGrantOnPrincipalAndResourceOptionsBuilder_iam_GranteeWithIGrantable_software_amazon_awscdk_services_iam_IGrantable_AsReference();

		/**
		 * The meta object literal for the '<em><b>Resource Arns java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRANT_ON_PRINCIPAL_AND_RESOURCE_OPTIONS_BUILDER_IAM__RESOURCE_ARNS_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getGrantOnPrincipalAndResourceOptionsBuilder_iam_ResourceArns_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRANT_ON_PRINCIPAL_AND_RESOURCE_OPTIONS_BUILDER_IAM__GENERATED_CLASS_NAME = eINSTANCE
				.getGrantOnPrincipalAndResourceOptionsBuilder_iam_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRANT_ON_PRINCIPAL_AND_RESOURCE_OPTIONS_BUILDER_IAM__VAR_NAME = eINSTANCE
				.getGrantOnPrincipalAndResourceOptionsBuilder_iam_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRANT_ON_PRINCIPAL_AND_RESOURCE_OPTIONS_BUILDER_IAM__IDENTIFIER = eINSTANCE
				.getGrantOnPrincipalAndResourceOptionsBuilder_iam_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRANT_ON_PRINCIPAL_AND_RESOURCE_OPTIONS_BUILDER_IAM__ADDITIONAL_CODE = eINSTANCE
				.getGrantOnPrincipalAndResourceOptionsBuilder_iam_AdditionalCode();

		/**
		 * The meta object literal for the '{@link iam.impl.ManagedPolicyBuilder_iamImpl <em>Managed Policy Builder iam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iam.impl.ManagedPolicyBuilder_iamImpl
		 * @see iam.impl.IamPackageImpl#getManagedPolicyBuilder_iam()
		 * @generated
		 */
		EClass MANAGED_POLICY_BUILDER_IAM = eINSTANCE.getManagedPolicyBuilder_iam();

		/**
		 * The meta object literal for the '<em><b>Description java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGED_POLICY_BUILDER_IAM__DESCRIPTION_JAVA_LANG_STRING_ = eINSTANCE
				.getManagedPolicyBuilder_iam_Description_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Document With Policy Document software amazon awscdk services iam Policy Document As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGED_POLICY_BUILDER_IAM__DOCUMENT_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE = eINSTANCE
				.getManagedPolicyBuilder_iam_DocumentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference();

		/**
		 * The meta object literal for the '<em><b>Groups software amazon awscdk services iam IGroup As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGED_POLICY_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST = eINSTANCE
				.getManagedPolicyBuilder_iam_Groups_software_amazon_awscdk_services_iam_IGroup_AsList();

		/**
		 * The meta object literal for the '<em><b>Managed Policy Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGED_POLICY_BUILDER_IAM__MANAGED_POLICY_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getManagedPolicyBuilder_iam_ManagedPolicyName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Path java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGED_POLICY_BUILDER_IAM__PATH_JAVA_LANG_STRING_ = eINSTANCE
				.getManagedPolicyBuilder_iam_Path_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Roles software amazon awscdk services iam IRole As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGED_POLICY_BUILDER_IAM__ROLES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_LIST = eINSTANCE
				.getManagedPolicyBuilder_iam_Roles_software_amazon_awscdk_services_iam_IRole_AsList();

		/**
		 * The meta object literal for the '<em><b>Statements software amazon awscdk services iam Policy Statement As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGED_POLICY_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST = eINSTANCE
				.getManagedPolicyBuilder_iam_Statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList();

		/**
		 * The meta object literal for the '<em><b>Users software amazon awscdk services iam IUser As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGED_POLICY_BUILDER_IAM__USERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IUSER_AS_LIST = eINSTANCE
				.getManagedPolicyBuilder_iam_Users_software_amazon_awscdk_services_iam_IUser_AsList();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGED_POLICY_BUILDER_IAM__GENERATED_CLASS_NAME = eINSTANCE
				.getManagedPolicyBuilder_iam_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGED_POLICY_BUILDER_IAM__VAR_NAME = eINSTANCE.getManagedPolicyBuilder_iam_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGED_POLICY_BUILDER_IAM__IDENTIFIER = eINSTANCE.getManagedPolicyBuilder_iam_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGED_POLICY_BUILDER_IAM__ADDITIONAL_CODE = eINSTANCE.getManagedPolicyBuilder_iam_AdditionalCode();

		/**
		 * The meta object literal for the '{@link iam.impl.FromRoleArnOptionsBuilder_iamImpl <em>From Role Arn Options Builder iam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iam.impl.FromRoleArnOptionsBuilder_iamImpl
		 * @see iam.impl.IamPackageImpl#getFromRoleArnOptionsBuilder_iam()
		 * @generated
		 */
		EClass FROM_ROLE_ARN_OPTIONS_BUILDER_IAM = eINSTANCE.getFromRoleArnOptionsBuilder_iam();

		/**
		 * The meta object literal for the '<em><b>Mutable java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM_ROLE_ARN_OPTIONS_BUILDER_IAM__MUTABLE_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getFromRoleArnOptionsBuilder_iam_Mutable_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM_ROLE_ARN_OPTIONS_BUILDER_IAM__GENERATED_CLASS_NAME = eINSTANCE
				.getFromRoleArnOptionsBuilder_iam_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM_ROLE_ARN_OPTIONS_BUILDER_IAM__VAR_NAME = eINSTANCE.getFromRoleArnOptionsBuilder_iam_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM_ROLE_ARN_OPTIONS_BUILDER_IAM__IDENTIFIER = eINSTANCE
				.getFromRoleArnOptionsBuilder_iam_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM_ROLE_ARN_OPTIONS_BUILDER_IAM__ADDITIONAL_CODE = eINSTANCE
				.getFromRoleArnOptionsBuilder_iam_AdditionalCode();

		/**
		 * The meta object literal for the '{@link iam.impl.PolicyDocumentBuilder_iamImpl <em>Policy Document Builder iam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iam.impl.PolicyDocumentBuilder_iamImpl
		 * @see iam.impl.IamPackageImpl#getPolicyDocumentBuilder_iam()
		 * @generated
		 */
		EClass POLICY_DOCUMENT_BUILDER_IAM = eINSTANCE.getPolicyDocumentBuilder_iam();

		/**
		 * The meta object literal for the '<em><b>Assign Sids java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_DOCUMENT_BUILDER_IAM__ASSIGN_SIDS_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getPolicyDocumentBuilder_iam_AssignSids_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Statements software amazon awscdk services iam Policy Statement As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_DOCUMENT_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST = eINSTANCE
				.getPolicyDocumentBuilder_iam_Statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_DOCUMENT_BUILDER_IAM__GENERATED_CLASS_NAME = eINSTANCE
				.getPolicyDocumentBuilder_iam_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_DOCUMENT_BUILDER_IAM__VAR_NAME = eINSTANCE.getPolicyDocumentBuilder_iam_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_DOCUMENT_BUILDER_IAM__IDENTIFIER = eINSTANCE.getPolicyDocumentBuilder_iam_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_DOCUMENT_BUILDER_IAM__ADDITIONAL_CODE = eINSTANCE
				.getPolicyDocumentBuilder_iam_AdditionalCode();

		/**
		 * The meta object literal for the '{@link iam.impl.PolicyBuilder_iamImpl <em>Policy Builder iam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iam.impl.PolicyBuilder_iamImpl
		 * @see iam.impl.IamPackageImpl#getPolicyBuilder_iam()
		 * @generated
		 */
		EClass POLICY_BUILDER_IAM = eINSTANCE.getPolicyBuilder_iam();

		/**
		 * The meta object literal for the '<em><b>Force java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_BUILDER_IAM__FORCE_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getPolicyBuilder_iam_Force_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Groups software amazon awscdk services iam IGroup As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST = eINSTANCE
				.getPolicyBuilder_iam_Groups_software_amazon_awscdk_services_iam_IGroup_AsList();

		/**
		 * The meta object literal for the '<em><b>Policy Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_BUILDER_IAM__POLICY_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getPolicyBuilder_iam_PolicyName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Roles software amazon awscdk services iam IRole As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_BUILDER_IAM__ROLES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_LIST = eINSTANCE
				.getPolicyBuilder_iam_Roles_software_amazon_awscdk_services_iam_IRole_AsList();

		/**
		 * The meta object literal for the '<em><b>Statements software amazon awscdk services iam Policy Statement As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST = eINSTANCE
				.getPolicyBuilder_iam_Statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList();

		/**
		 * The meta object literal for the '<em><b>Users software amazon awscdk services iam IUser As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_BUILDER_IAM__USERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IUSER_AS_LIST = eINSTANCE
				.getPolicyBuilder_iam_Users_software_amazon_awscdk_services_iam_IUser_AsList();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_BUILDER_IAM__GENERATED_CLASS_NAME = eINSTANCE.getPolicyBuilder_iam_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_BUILDER_IAM__VAR_NAME = eINSTANCE.getPolicyBuilder_iam_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_BUILDER_IAM__IDENTIFIER = eINSTANCE.getPolicyBuilder_iam_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_BUILDER_IAM__ADDITIONAL_CODE = eINSTANCE.getPolicyBuilder_iam_AdditionalCode();

		/**
		 * The meta object literal for the '{@link iam.impl.PolicyDocumentPropsBuilder_iamImpl <em>Policy Document Props Builder iam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iam.impl.PolicyDocumentPropsBuilder_iamImpl
		 * @see iam.impl.IamPackageImpl#getPolicyDocumentPropsBuilder_iam()
		 * @generated
		 */
		EClass POLICY_DOCUMENT_PROPS_BUILDER_IAM = eINSTANCE.getPolicyDocumentPropsBuilder_iam();

		/**
		 * The meta object literal for the '<em><b>Assign Sids java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_DOCUMENT_PROPS_BUILDER_IAM__ASSIGN_SIDS_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getPolicyDocumentPropsBuilder_iam_AssignSids_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Statements software amazon awscdk services iam Policy Statement As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_DOCUMENT_PROPS_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST = eINSTANCE
				.getPolicyDocumentPropsBuilder_iam_Statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_DOCUMENT_PROPS_BUILDER_IAM__GENERATED_CLASS_NAME = eINSTANCE
				.getPolicyDocumentPropsBuilder_iam_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_DOCUMENT_PROPS_BUILDER_IAM__VAR_NAME = eINSTANCE.getPolicyDocumentPropsBuilder_iam_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_DOCUMENT_PROPS_BUILDER_IAM__IDENTIFIER = eINSTANCE
				.getPolicyDocumentPropsBuilder_iam_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_DOCUMENT_PROPS_BUILDER_IAM__ADDITIONAL_CODE = eINSTANCE
				.getPolicyDocumentPropsBuilder_iam_AdditionalCode();

		/**
		 * The meta object literal for the '{@link iam.impl.UserPropsBuilder_iamImpl <em>User Props Builder iam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iam.impl.UserPropsBuilder_iamImpl
		 * @see iam.impl.IamPackageImpl#getUserPropsBuilder_iam()
		 * @generated
		 */
		EClass USER_PROPS_BUILDER_IAM = eINSTANCE.getUserPropsBuilder_iam();

		/**
		 * The meta object literal for the '<em><b>Groups software amazon awscdk services iam IGroup As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PROPS_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST = eINSTANCE
				.getUserPropsBuilder_iam_Groups_software_amazon_awscdk_services_iam_IGroup_AsList();

		/**
		 * The meta object literal for the '<em><b>Managed Policies software amazon awscdk services iam IManaged Policy As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PROPS_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST = eINSTANCE
				.getUserPropsBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList();

		/**
		 * The meta object literal for the '<em><b>Password With Secret Value software amazon awscdk core Secret Value As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PROPS_BUILDER_IAM__PASSWORD_WITH_SECRET_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_SECRET_VALUE_AS_REFERENCE = eINSTANCE
				.getUserPropsBuilder_iam_PasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference();

		/**
		 * The meta object literal for the '<em><b>Password Reset Required java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PROPS_BUILDER_IAM__PASSWORD_RESET_REQUIRED_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getUserPropsBuilder_iam_PasswordResetRequired_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Path java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PROPS_BUILDER_IAM__PATH_JAVA_LANG_STRING_ = eINSTANCE
				.getUserPropsBuilder_iam_Path_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Permissions Boundary With IManaged Policy software amazon awscdk services iam IManaged Policy As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PROPS_BUILDER_IAM__PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE = eINSTANCE
				.getUserPropsBuilder_iam_PermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference();

		/**
		 * The meta object literal for the '<em><b>User Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PROPS_BUILDER_IAM__USER_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getUserPropsBuilder_iam_UserName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PROPS_BUILDER_IAM__GENERATED_CLASS_NAME = eINSTANCE
				.getUserPropsBuilder_iam_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PROPS_BUILDER_IAM__VAR_NAME = eINSTANCE.getUserPropsBuilder_iam_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PROPS_BUILDER_IAM__IDENTIFIER = eINSTANCE.getUserPropsBuilder_iam_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PROPS_BUILDER_IAM__ADDITIONAL_CODE = eINSTANCE.getUserPropsBuilder_iam_AdditionalCode();

		/**
		 * The meta object literal for the '{@link iam.impl.AddToResourcePolicyResultBuilder_iamImpl <em>Add To Resource Policy Result Builder iam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iam.impl.AddToResourcePolicyResultBuilder_iamImpl
		 * @see iam.impl.IamPackageImpl#getAddToResourcePolicyResultBuilder_iam()
		 * @generated
		 */
		EClass ADD_TO_RESOURCE_POLICY_RESULT_BUILDER_IAM = eINSTANCE.getAddToResourcePolicyResultBuilder_iam();

		/**
		 * The meta object literal for the '<em><b>Statement Added java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_TO_RESOURCE_POLICY_RESULT_BUILDER_IAM__STATEMENT_ADDED_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getAddToResourcePolicyResultBuilder_iam_StatementAdded_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Policy Dependable With IDependable software amazon awscdk core IDependable As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_TO_RESOURCE_POLICY_RESULT_BUILDER_IAM__POLICY_DEPENDABLE_WITH_IDEPENDABLE_SOFTWARE_AMAZON_AWSCDK_CORE_IDEPENDABLE_AS_REFERENCE = eINSTANCE
				.getAddToResourcePolicyResultBuilder_iam_PolicyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_TO_RESOURCE_POLICY_RESULT_BUILDER_IAM__GENERATED_CLASS_NAME = eINSTANCE
				.getAddToResourcePolicyResultBuilder_iam_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_TO_RESOURCE_POLICY_RESULT_BUILDER_IAM__VAR_NAME = eINSTANCE
				.getAddToResourcePolicyResultBuilder_iam_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_TO_RESOURCE_POLICY_RESULT_BUILDER_IAM__IDENTIFIER = eINSTANCE
				.getAddToResourcePolicyResultBuilder_iam_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_TO_RESOURCE_POLICY_RESULT_BUILDER_IAM__ADDITIONAL_CODE = eINSTANCE
				.getAddToResourcePolicyResultBuilder_iam_AdditionalCode();

		/**
		 * The meta object literal for the '{@link iam.impl.PolicyStatementPropsBuilder_iamImpl <em>Policy Statement Props Builder iam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iam.impl.PolicyStatementPropsBuilder_iamImpl
		 * @see iam.impl.IamPackageImpl#getPolicyStatementPropsBuilder_iam()
		 * @generated
		 */
		EClass POLICY_STATEMENT_PROPS_BUILDER_IAM = eINSTANCE.getPolicyStatementPropsBuilder_iam();

		/**
		 * The meta object literal for the '<em><b>Actions java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_STATEMENT_PROPS_BUILDER_IAM__ACTIONS_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getPolicyStatementPropsBuilder_iam_Actions_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Conditions java lang String java lang Object As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_STATEMENT_PROPS_BUILDER_IAM__CONDITIONS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP = eINSTANCE
				.getPolicyStatementPropsBuilder_iam_Conditions_java_lang_String__java_lang_Object_AsMap();

		/**
		 * The meta object literal for the '<em><b>Effect software amazon awscdk services iam Effect </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_STATEMENT_PROPS_BUILDER_IAM__EFFECT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_EFFECT_ = eINSTANCE
				.getPolicyStatementPropsBuilder_iam_Effect_software_amazon_awscdk_services_iam_Effect_();

		/**
		 * The meta object literal for the '<em><b>Not Actions java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_STATEMENT_PROPS_BUILDER_IAM__NOT_ACTIONS_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getPolicyStatementPropsBuilder_iam_NotActions_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Not Principals software amazon awscdk services iam IPrincipal As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_STATEMENT_PROPS_BUILDER_IAM__NOT_PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST = eINSTANCE
				.getPolicyStatementPropsBuilder_iam_NotPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList();

		/**
		 * The meta object literal for the '<em><b>Not Resources java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_STATEMENT_PROPS_BUILDER_IAM__NOT_RESOURCES_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getPolicyStatementPropsBuilder_iam_NotResources_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Principals software amazon awscdk services iam IPrincipal As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_STATEMENT_PROPS_BUILDER_IAM__PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST = eINSTANCE
				.getPolicyStatementPropsBuilder_iam_Principals_software_amazon_awscdk_services_iam_IPrincipal_AsList();

		/**
		 * The meta object literal for the '<em><b>Resources java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_STATEMENT_PROPS_BUILDER_IAM__RESOURCES_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getPolicyStatementPropsBuilder_iam_Resources_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Sid java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_STATEMENT_PROPS_BUILDER_IAM__SID_JAVA_LANG_STRING_ = eINSTANCE
				.getPolicyStatementPropsBuilder_iam_Sid_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_STATEMENT_PROPS_BUILDER_IAM__GENERATED_CLASS_NAME = eINSTANCE
				.getPolicyStatementPropsBuilder_iam_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_STATEMENT_PROPS_BUILDER_IAM__VAR_NAME = eINSTANCE
				.getPolicyStatementPropsBuilder_iam_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_STATEMENT_PROPS_BUILDER_IAM__IDENTIFIER = eINSTANCE
				.getPolicyStatementPropsBuilder_iam_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_STATEMENT_PROPS_BUILDER_IAM__ADDITIONAL_CODE = eINSTANCE
				.getPolicyStatementPropsBuilder_iam_AdditionalCode();

		/**
		 * The meta object literal for the '{@link iam.impl.AddToPrincipalPolicyResultBuilder_iamImpl <em>Add To Principal Policy Result Builder iam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iam.impl.AddToPrincipalPolicyResultBuilder_iamImpl
		 * @see iam.impl.IamPackageImpl#getAddToPrincipalPolicyResultBuilder_iam()
		 * @generated
		 */
		EClass ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM = eINSTANCE.getAddToPrincipalPolicyResultBuilder_iam();

		/**
		 * The meta object literal for the '<em><b>Statement Added java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__STATEMENT_ADDED_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getAddToPrincipalPolicyResultBuilder_iam_StatementAdded_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Policy Dependable With IDependable software amazon awscdk core IDependable As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__POLICY_DEPENDABLE_WITH_IDEPENDABLE_SOFTWARE_AMAZON_AWSCDK_CORE_IDEPENDABLE_AS_REFERENCE = eINSTANCE
				.getAddToPrincipalPolicyResultBuilder_iam_PolicyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__GENERATED_CLASS_NAME = eINSTANCE
				.getAddToPrincipalPolicyResultBuilder_iam_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__VAR_NAME = eINSTANCE
				.getAddToPrincipalPolicyResultBuilder_iam_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__IDENTIFIER = eINSTANCE
				.getAddToPrincipalPolicyResultBuilder_iam_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__ADDITIONAL_CODE = eINSTANCE
				.getAddToPrincipalPolicyResultBuilder_iam_AdditionalCode();

		/**
		 * The meta object literal for the '{@link iam.impl.PolicyStatementBuilder_iamImpl <em>Policy Statement Builder iam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iam.impl.PolicyStatementBuilder_iamImpl
		 * @see iam.impl.IamPackageImpl#getPolicyStatementBuilder_iam()
		 * @generated
		 */
		EClass POLICY_STATEMENT_BUILDER_IAM = eINSTANCE.getPolicyStatementBuilder_iam();

		/**
		 * The meta object literal for the '<em><b>Actions java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_STATEMENT_BUILDER_IAM__ACTIONS_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getPolicyStatementBuilder_iam_Actions_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Conditions java lang String java lang Object As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_STATEMENT_BUILDER_IAM__CONDITIONS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP = eINSTANCE
				.getPolicyStatementBuilder_iam_Conditions_java_lang_String__java_lang_Object_AsMap();

		/**
		 * The meta object literal for the '<em><b>Effect software amazon awscdk services iam Effect </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_STATEMENT_BUILDER_IAM__EFFECT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_EFFECT_ = eINSTANCE
				.getPolicyStatementBuilder_iam_Effect_software_amazon_awscdk_services_iam_Effect_();

		/**
		 * The meta object literal for the '<em><b>Not Actions java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_STATEMENT_BUILDER_IAM__NOT_ACTIONS_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getPolicyStatementBuilder_iam_NotActions_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Not Principals software amazon awscdk services iam IPrincipal As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_STATEMENT_BUILDER_IAM__NOT_PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST = eINSTANCE
				.getPolicyStatementBuilder_iam_NotPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList();

		/**
		 * The meta object literal for the '<em><b>Not Resources java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_STATEMENT_BUILDER_IAM__NOT_RESOURCES_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getPolicyStatementBuilder_iam_NotResources_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Principals software amazon awscdk services iam IPrincipal As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_STATEMENT_BUILDER_IAM__PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST = eINSTANCE
				.getPolicyStatementBuilder_iam_Principals_software_amazon_awscdk_services_iam_IPrincipal_AsList();

		/**
		 * The meta object literal for the '<em><b>Resources java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_STATEMENT_BUILDER_IAM__RESOURCES_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getPolicyStatementBuilder_iam_Resources_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Sid java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_STATEMENT_BUILDER_IAM__SID_JAVA_LANG_STRING_ = eINSTANCE
				.getPolicyStatementBuilder_iam_Sid_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_STATEMENT_BUILDER_IAM__GENERATED_CLASS_NAME = eINSTANCE
				.getPolicyStatementBuilder_iam_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_STATEMENT_BUILDER_IAM__VAR_NAME = eINSTANCE.getPolicyStatementBuilder_iam_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_STATEMENT_BUILDER_IAM__IDENTIFIER = eINSTANCE.getPolicyStatementBuilder_iam_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_STATEMENT_BUILDER_IAM__ADDITIONAL_CODE = eINSTANCE
				.getPolicyStatementBuilder_iam_AdditionalCode();

		/**
		 * The meta object literal for the '{@link iam.impl.ServicePrincipalOptsBuilder_iamImpl <em>Service Principal Opts Builder iam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iam.impl.ServicePrincipalOptsBuilder_iamImpl
		 * @see iam.impl.IamPackageImpl#getServicePrincipalOptsBuilder_iam()
		 * @generated
		 */
		EClass SERVICE_PRINCIPAL_OPTS_BUILDER_IAM = eINSTANCE.getServicePrincipalOptsBuilder_iam();

		/**
		 * The meta object literal for the '<em><b>Conditions java lang String java lang Object As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PRINCIPAL_OPTS_BUILDER_IAM__CONDITIONS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP = eINSTANCE
				.getServicePrincipalOptsBuilder_iam_Conditions_java_lang_String__java_lang_Object_AsMap();

		/**
		 * The meta object literal for the '<em><b>Region java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PRINCIPAL_OPTS_BUILDER_IAM__REGION_JAVA_LANG_STRING_ = eINSTANCE
				.getServicePrincipalOptsBuilder_iam_Region_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PRINCIPAL_OPTS_BUILDER_IAM__GENERATED_CLASS_NAME = eINSTANCE
				.getServicePrincipalOptsBuilder_iam_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PRINCIPAL_OPTS_BUILDER_IAM__VAR_NAME = eINSTANCE
				.getServicePrincipalOptsBuilder_iam_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PRINCIPAL_OPTS_BUILDER_IAM__IDENTIFIER = eINSTANCE
				.getServicePrincipalOptsBuilder_iam_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PRINCIPAL_OPTS_BUILDER_IAM__ADDITIONAL_CODE = eINSTANCE
				.getServicePrincipalOptsBuilder_iam_AdditionalCode();

		/**
		 * The meta object literal for the '{@link iam.impl.UnknownPrincipalBuilder_iamImpl <em>Unknown Principal Builder iam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iam.impl.UnknownPrincipalBuilder_iamImpl
		 * @see iam.impl.IamPackageImpl#getUnknownPrincipalBuilder_iam()
		 * @generated
		 */
		EClass UNKNOWN_PRINCIPAL_BUILDER_IAM = eINSTANCE.getUnknownPrincipalBuilder_iam();

		/**
		 * The meta object literal for the '<em><b>Resource With IConstruct software amazon awscdk core IConstruct As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNKNOWN_PRINCIPAL_BUILDER_IAM__RESOURCE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE = eINSTANCE
				.getUnknownPrincipalBuilder_iam_ResourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNKNOWN_PRINCIPAL_BUILDER_IAM__GENERATED_CLASS_NAME = eINSTANCE
				.getUnknownPrincipalBuilder_iam_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNKNOWN_PRINCIPAL_BUILDER_IAM__VAR_NAME = eINSTANCE.getUnknownPrincipalBuilder_iam_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNKNOWN_PRINCIPAL_BUILDER_IAM__IDENTIFIER = eINSTANCE.getUnknownPrincipalBuilder_iam_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNKNOWN_PRINCIPAL_BUILDER_IAM__ADDITIONAL_CODE = eINSTANCE
				.getUnknownPrincipalBuilder_iam_AdditionalCode();

		/**
		 * The meta object literal for the '{@link iam.impl.ManagedPolicyPropsBuilder_iamImpl <em>Managed Policy Props Builder iam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iam.impl.ManagedPolicyPropsBuilder_iamImpl
		 * @see iam.impl.IamPackageImpl#getManagedPolicyPropsBuilder_iam()
		 * @generated
		 */
		EClass MANAGED_POLICY_PROPS_BUILDER_IAM = eINSTANCE.getManagedPolicyPropsBuilder_iam();

		/**
		 * The meta object literal for the '<em><b>Description java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGED_POLICY_PROPS_BUILDER_IAM__DESCRIPTION_JAVA_LANG_STRING_ = eINSTANCE
				.getManagedPolicyPropsBuilder_iam_Description_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Document With Policy Document software amazon awscdk services iam Policy Document As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGED_POLICY_PROPS_BUILDER_IAM__DOCUMENT_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE = eINSTANCE
				.getManagedPolicyPropsBuilder_iam_DocumentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference();

		/**
		 * The meta object literal for the '<em><b>Groups software amazon awscdk services iam IGroup As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGED_POLICY_PROPS_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST = eINSTANCE
				.getManagedPolicyPropsBuilder_iam_Groups_software_amazon_awscdk_services_iam_IGroup_AsList();

		/**
		 * The meta object literal for the '<em><b>Managed Policy Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGED_POLICY_PROPS_BUILDER_IAM__MANAGED_POLICY_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getManagedPolicyPropsBuilder_iam_ManagedPolicyName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Path java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGED_POLICY_PROPS_BUILDER_IAM__PATH_JAVA_LANG_STRING_ = eINSTANCE
				.getManagedPolicyPropsBuilder_iam_Path_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Roles software amazon awscdk services iam IRole As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGED_POLICY_PROPS_BUILDER_IAM__ROLES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_LIST = eINSTANCE
				.getManagedPolicyPropsBuilder_iam_Roles_software_amazon_awscdk_services_iam_IRole_AsList();

		/**
		 * The meta object literal for the '<em><b>Statements software amazon awscdk services iam Policy Statement As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGED_POLICY_PROPS_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST = eINSTANCE
				.getManagedPolicyPropsBuilder_iam_Statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList();

		/**
		 * The meta object literal for the '<em><b>Users software amazon awscdk services iam IUser As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGED_POLICY_PROPS_BUILDER_IAM__USERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IUSER_AS_LIST = eINSTANCE
				.getManagedPolicyPropsBuilder_iam_Users_software_amazon_awscdk_services_iam_IUser_AsList();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGED_POLICY_PROPS_BUILDER_IAM__GENERATED_CLASS_NAME = eINSTANCE
				.getManagedPolicyPropsBuilder_iam_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGED_POLICY_PROPS_BUILDER_IAM__VAR_NAME = eINSTANCE.getManagedPolicyPropsBuilder_iam_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGED_POLICY_PROPS_BUILDER_IAM__IDENTIFIER = eINSTANCE
				.getManagedPolicyPropsBuilder_iam_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGED_POLICY_PROPS_BUILDER_IAM__ADDITIONAL_CODE = eINSTANCE
				.getManagedPolicyPropsBuilder_iam_AdditionalCode();

		/**
		 * The meta object literal for the '{@link iam.impl.OpenIdConnectProviderBuilder_iamImpl <em>Open Id Connect Provider Builder iam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iam.impl.OpenIdConnectProviderBuilder_iamImpl
		 * @see iam.impl.IamPackageImpl#getOpenIdConnectProviderBuilder_iam()
		 * @generated
		 */
		EClass OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM = eINSTANCE.getOpenIdConnectProviderBuilder_iam();

		/**
		 * The meta object literal for the '<em><b>Url java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__URL_JAVA_LANG_STRING_ = eINSTANCE
				.getOpenIdConnectProviderBuilder_iam_Url_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Client Ids java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__CLIENT_IDS_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getOpenIdConnectProviderBuilder_iam_ClientIds_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Thumbprints java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__THUMBPRINTS_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getOpenIdConnectProviderBuilder_iam_Thumbprints_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__GENERATED_CLASS_NAME = eINSTANCE
				.getOpenIdConnectProviderBuilder_iam_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__VAR_NAME = eINSTANCE
				.getOpenIdConnectProviderBuilder_iam_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__IDENTIFIER = eINSTANCE
				.getOpenIdConnectProviderBuilder_iam_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__ADDITIONAL_CODE = eINSTANCE
				.getOpenIdConnectProviderBuilder_iam_AdditionalCode();

		/**
		 * The meta object literal for the '{@link iam.impl.LazyRoleBuilder_iamImpl <em>Lazy Role Builder iam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iam.impl.LazyRoleBuilder_iamImpl
		 * @see iam.impl.IamPackageImpl#getLazyRoleBuilder_iam()
		 * @generated
		 */
		EClass LAZY_ROLE_BUILDER_IAM = eINSTANCE.getLazyRoleBuilder_iam();

		/**
		 * The meta object literal for the '<em><b>Assumed By With IPrincipal software amazon awscdk services iam IPrincipal As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_ROLE_BUILDER_IAM__ASSUMED_BY_WITH_IPRINCIPAL_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_REFERENCE = eINSTANCE
				.getLazyRoleBuilder_iam_AssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference();

		/**
		 * The meta object literal for the '<em><b>Description java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_ROLE_BUILDER_IAM__DESCRIPTION_JAVA_LANG_STRING_ = eINSTANCE
				.getLazyRoleBuilder_iam_Description_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>External Id java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_ROLE_BUILDER_IAM__EXTERNAL_ID_JAVA_LANG_STRING_ = eINSTANCE
				.getLazyRoleBuilder_iam_ExternalId_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>External Ids java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_ROLE_BUILDER_IAM__EXTERNAL_IDS_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getLazyRoleBuilder_iam_ExternalIds_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Inline Policies java lang String software amazon awscdk services iam Policy Document As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_ROLE_BUILDER_IAM__INLINE_POLICIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_MAP = eINSTANCE
				.getLazyRoleBuilder_iam_InlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap();

		/**
		 * The meta object literal for the '<em><b>Managed Policies software amazon awscdk services iam IManaged Policy As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_ROLE_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST = eINSTANCE
				.getLazyRoleBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList();

		/**
		 * The meta object literal for the '<em><b>Max Session Duration With Duration software amazon awscdk core Duration As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_ROLE_BUILDER_IAM__MAX_SESSION_DURATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE = eINSTANCE
				.getLazyRoleBuilder_iam_MaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference();

		/**
		 * The meta object literal for the '<em><b>Path java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_ROLE_BUILDER_IAM__PATH_JAVA_LANG_STRING_ = eINSTANCE
				.getLazyRoleBuilder_iam_Path_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Permissions Boundary With IManaged Policy software amazon awscdk services iam IManaged Policy As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_ROLE_BUILDER_IAM__PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE = eINSTANCE
				.getLazyRoleBuilder_iam_PermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference();

		/**
		 * The meta object literal for the '<em><b>Role Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_ROLE_BUILDER_IAM__ROLE_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getLazyRoleBuilder_iam_RoleName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_ROLE_BUILDER_IAM__GENERATED_CLASS_NAME = eINSTANCE.getLazyRoleBuilder_iam_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_ROLE_BUILDER_IAM__VAR_NAME = eINSTANCE.getLazyRoleBuilder_iam_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_ROLE_BUILDER_IAM__IDENTIFIER = eINSTANCE.getLazyRoleBuilder_iam_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_ROLE_BUILDER_IAM__ADDITIONAL_CODE = eINSTANCE.getLazyRoleBuilder_iam_AdditionalCode();

		/**
		 * The meta object literal for the '{@link iam.impl.CommonGrantOptionsBuilder_iamImpl <em>Common Grant Options Builder iam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iam.impl.CommonGrantOptionsBuilder_iamImpl
		 * @see iam.impl.IamPackageImpl#getCommonGrantOptionsBuilder_iam()
		 * @generated
		 */
		EClass COMMON_GRANT_OPTIONS_BUILDER_IAM = eINSTANCE.getCommonGrantOptionsBuilder_iam();

		/**
		 * The meta object literal for the '<em><b>Actions java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_GRANT_OPTIONS_BUILDER_IAM__ACTIONS_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getCommonGrantOptionsBuilder_iam_Actions_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Grantee With IGrantable software amazon awscdk services iam IGrantable As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_GRANT_OPTIONS_BUILDER_IAM__GRANTEE_WITH_IGRANTABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGRANTABLE_AS_REFERENCE = eINSTANCE
				.getCommonGrantOptionsBuilder_iam_GranteeWithIGrantable_software_amazon_awscdk_services_iam_IGrantable_AsReference();

		/**
		 * The meta object literal for the '<em><b>Resource Arns java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_GRANT_OPTIONS_BUILDER_IAM__RESOURCE_ARNS_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getCommonGrantOptionsBuilder_iam_ResourceArns_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_GRANT_OPTIONS_BUILDER_IAM__GENERATED_CLASS_NAME = eINSTANCE
				.getCommonGrantOptionsBuilder_iam_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_GRANT_OPTIONS_BUILDER_IAM__VAR_NAME = eINSTANCE.getCommonGrantOptionsBuilder_iam_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_GRANT_OPTIONS_BUILDER_IAM__IDENTIFIER = eINSTANCE
				.getCommonGrantOptionsBuilder_iam_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_GRANT_OPTIONS_BUILDER_IAM__ADDITIONAL_CODE = eINSTANCE
				.getCommonGrantOptionsBuilder_iam_AdditionalCode();

		/**
		 * The meta object literal for the '{@link iam.impl.GrantWithResourceOptionsBuilder_iamImpl <em>Grant With Resource Options Builder iam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iam.impl.GrantWithResourceOptionsBuilder_iamImpl
		 * @see iam.impl.IamPackageImpl#getGrantWithResourceOptionsBuilder_iam()
		 * @generated
		 */
		EClass GRANT_WITH_RESOURCE_OPTIONS_BUILDER_IAM = eINSTANCE.getGrantWithResourceOptionsBuilder_iam();

		/**
		 * The meta object literal for the '<em><b>Resource With IResource With Policy software amazon awscdk services iam IResource With Policy As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRANT_WITH_RESOURCE_OPTIONS_BUILDER_IAM__RESOURCE_WITH_IRESOURCE_WITH_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IRESOURCE_WITH_POLICY_AS_REFERENCE = eINSTANCE
				.getGrantWithResourceOptionsBuilder_iam_ResourceWithIResourceWithPolicy_software_amazon_awscdk_services_iam_IResourceWithPolicy_AsReference();

		/**
		 * The meta object literal for the '<em><b>Resource Self Arns java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRANT_WITH_RESOURCE_OPTIONS_BUILDER_IAM__RESOURCE_SELF_ARNS_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getGrantWithResourceOptionsBuilder_iam_ResourceSelfArns_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Actions java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRANT_WITH_RESOURCE_OPTIONS_BUILDER_IAM__ACTIONS_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getGrantWithResourceOptionsBuilder_iam_Actions_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Grantee With IGrantable software amazon awscdk services iam IGrantable As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRANT_WITH_RESOURCE_OPTIONS_BUILDER_IAM__GRANTEE_WITH_IGRANTABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGRANTABLE_AS_REFERENCE = eINSTANCE
				.getGrantWithResourceOptionsBuilder_iam_GranteeWithIGrantable_software_amazon_awscdk_services_iam_IGrantable_AsReference();

		/**
		 * The meta object literal for the '<em><b>Resource Arns java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRANT_WITH_RESOURCE_OPTIONS_BUILDER_IAM__RESOURCE_ARNS_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getGrantWithResourceOptionsBuilder_iam_ResourceArns_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRANT_WITH_RESOURCE_OPTIONS_BUILDER_IAM__GENERATED_CLASS_NAME = eINSTANCE
				.getGrantWithResourceOptionsBuilder_iam_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRANT_WITH_RESOURCE_OPTIONS_BUILDER_IAM__VAR_NAME = eINSTANCE
				.getGrantWithResourceOptionsBuilder_iam_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRANT_WITH_RESOURCE_OPTIONS_BUILDER_IAM__IDENTIFIER = eINSTANCE
				.getGrantWithResourceOptionsBuilder_iam_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRANT_WITH_RESOURCE_OPTIONS_BUILDER_IAM__ADDITIONAL_CODE = eINSTANCE
				.getGrantWithResourceOptionsBuilder_iam_AdditionalCode();

		/**
		 * The meta object literal for the '{@link iam.impl.LazyRolePropsBuilder_iamImpl <em>Lazy Role Props Builder iam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iam.impl.LazyRolePropsBuilder_iamImpl
		 * @see iam.impl.IamPackageImpl#getLazyRolePropsBuilder_iam()
		 * @generated
		 */
		EClass LAZY_ROLE_PROPS_BUILDER_IAM = eINSTANCE.getLazyRolePropsBuilder_iam();

		/**
		 * The meta object literal for the '<em><b>Assumed By With IPrincipal software amazon awscdk services iam IPrincipal As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_ROLE_PROPS_BUILDER_IAM__ASSUMED_BY_WITH_IPRINCIPAL_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_REFERENCE = eINSTANCE
				.getLazyRolePropsBuilder_iam_AssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference();

		/**
		 * The meta object literal for the '<em><b>Description java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_ROLE_PROPS_BUILDER_IAM__DESCRIPTION_JAVA_LANG_STRING_ = eINSTANCE
				.getLazyRolePropsBuilder_iam_Description_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>External Id java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_ROLE_PROPS_BUILDER_IAM__EXTERNAL_ID_JAVA_LANG_STRING_ = eINSTANCE
				.getLazyRolePropsBuilder_iam_ExternalId_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>External Ids java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_ROLE_PROPS_BUILDER_IAM__EXTERNAL_IDS_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getLazyRolePropsBuilder_iam_ExternalIds_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Inline Policies java lang String software amazon awscdk services iam Policy Document As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_ROLE_PROPS_BUILDER_IAM__INLINE_POLICIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_MAP = eINSTANCE
				.getLazyRolePropsBuilder_iam_InlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap();

		/**
		 * The meta object literal for the '<em><b>Managed Policies software amazon awscdk services iam IManaged Policy As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_ROLE_PROPS_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST = eINSTANCE
				.getLazyRolePropsBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList();

		/**
		 * The meta object literal for the '<em><b>Max Session Duration With Duration software amazon awscdk core Duration As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_ROLE_PROPS_BUILDER_IAM__MAX_SESSION_DURATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE = eINSTANCE
				.getLazyRolePropsBuilder_iam_MaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference();

		/**
		 * The meta object literal for the '<em><b>Path java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_ROLE_PROPS_BUILDER_IAM__PATH_JAVA_LANG_STRING_ = eINSTANCE
				.getLazyRolePropsBuilder_iam_Path_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Permissions Boundary With IManaged Policy software amazon awscdk services iam IManaged Policy As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_ROLE_PROPS_BUILDER_IAM__PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE = eINSTANCE
				.getLazyRolePropsBuilder_iam_PermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference();

		/**
		 * The meta object literal for the '<em><b>Role Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_ROLE_PROPS_BUILDER_IAM__ROLE_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getLazyRolePropsBuilder_iam_RoleName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_ROLE_PROPS_BUILDER_IAM__GENERATED_CLASS_NAME = eINSTANCE
				.getLazyRolePropsBuilder_iam_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_ROLE_PROPS_BUILDER_IAM__VAR_NAME = eINSTANCE.getLazyRolePropsBuilder_iam_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_ROLE_PROPS_BUILDER_IAM__IDENTIFIER = eINSTANCE.getLazyRolePropsBuilder_iam_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_ROLE_PROPS_BUILDER_IAM__ADDITIONAL_CODE = eINSTANCE
				.getLazyRolePropsBuilder_iam_AdditionalCode();

		/**
		 * The meta object literal for the '{@link iam.impl.PolicyPropsBuilder_iamImpl <em>Policy Props Builder iam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iam.impl.PolicyPropsBuilder_iamImpl
		 * @see iam.impl.IamPackageImpl#getPolicyPropsBuilder_iam()
		 * @generated
		 */
		EClass POLICY_PROPS_BUILDER_IAM = eINSTANCE.getPolicyPropsBuilder_iam();

		/**
		 * The meta object literal for the '<em><b>Force java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_PROPS_BUILDER_IAM__FORCE_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getPolicyPropsBuilder_iam_Force_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Groups software amazon awscdk services iam IGroup As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_PROPS_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST = eINSTANCE
				.getPolicyPropsBuilder_iam_Groups_software_amazon_awscdk_services_iam_IGroup_AsList();

		/**
		 * The meta object literal for the '<em><b>Policy Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_PROPS_BUILDER_IAM__POLICY_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getPolicyPropsBuilder_iam_PolicyName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Roles software amazon awscdk services iam IRole As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_PROPS_BUILDER_IAM__ROLES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_LIST = eINSTANCE
				.getPolicyPropsBuilder_iam_Roles_software_amazon_awscdk_services_iam_IRole_AsList();

		/**
		 * The meta object literal for the '<em><b>Statements software amazon awscdk services iam Policy Statement As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_PROPS_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST = eINSTANCE
				.getPolicyPropsBuilder_iam_Statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList();

		/**
		 * The meta object literal for the '<em><b>Users software amazon awscdk services iam IUser As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_PROPS_BUILDER_IAM__USERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IUSER_AS_LIST = eINSTANCE
				.getPolicyPropsBuilder_iam_Users_software_amazon_awscdk_services_iam_IUser_AsList();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_PROPS_BUILDER_IAM__GENERATED_CLASS_NAME = eINSTANCE
				.getPolicyPropsBuilder_iam_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_PROPS_BUILDER_IAM__VAR_NAME = eINSTANCE.getPolicyPropsBuilder_iam_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_PROPS_BUILDER_IAM__IDENTIFIER = eINSTANCE.getPolicyPropsBuilder_iam_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_PROPS_BUILDER_IAM__ADDITIONAL_CODE = eINSTANCE.getPolicyPropsBuilder_iam_AdditionalCode();

		/**
		 * The meta object literal for the '{@link iam.impl.GroupBuilder_iamImpl <em>Group Builder iam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iam.impl.GroupBuilder_iamImpl
		 * @see iam.impl.IamPackageImpl#getGroupBuilder_iam()
		 * @generated
		 */
		EClass GROUP_BUILDER_IAM = eINSTANCE.getGroupBuilder_iam();

		/**
		 * The meta object literal for the '<em><b>Group Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_BUILDER_IAM__GROUP_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getGroupBuilder_iam_GroupName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Managed Policies software amazon awscdk services iam IManaged Policy As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST = eINSTANCE
				.getGroupBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList();

		/**
		 * The meta object literal for the '<em><b>Path java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_BUILDER_IAM__PATH_JAVA_LANG_STRING_ = eINSTANCE.getGroupBuilder_iam_Path_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_BUILDER_IAM__GENERATED_CLASS_NAME = eINSTANCE.getGroupBuilder_iam_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_BUILDER_IAM__VAR_NAME = eINSTANCE.getGroupBuilder_iam_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_BUILDER_IAM__IDENTIFIER = eINSTANCE.getGroupBuilder_iam_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_BUILDER_IAM__ADDITIONAL_CODE = eINSTANCE.getGroupBuilder_iam_AdditionalCode();

		/**
		 * The meta object literal for the '{@link iam.Effect <em>Effect</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iam.Effect
		 * @see iam.impl.IamPackageImpl#getEffect()
		 * @generated
		 */
		EEnum EFFECT = eINSTANCE.getEffect();

	}

} //IamPackage
