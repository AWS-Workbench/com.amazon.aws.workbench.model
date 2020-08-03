/**
 */
package certificatemanager;

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
 * @see certificatemanager.CertificatemanagerFactory
 * @model kind="package"
 * @generated
 */
public interface CertificatemanagerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "certificatemanager";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "AWSWorkbenchSources/default.software.amazon.awscdk.services.certificatemanager";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "certificatemanager";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CertificatemanagerPackage eINSTANCE = certificatemanager.impl.CertificatemanagerPackageImpl.init();

	/**
	 * The meta object id for the '{@link certificatemanager.impl.CertificateBuilder_certificatemanagerImpl <em>Certificate Builder certificatemanager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see certificatemanager.impl.CertificateBuilder_certificatemanagerImpl
	 * @see certificatemanager.impl.CertificatemanagerPackageImpl#getCertificateBuilder_certificatemanager()
	 * @generated
	 */
	int CERTIFICATE_BUILDER_CERTIFICATEMANAGER = 0;

	/**
	 * The feature id for the '<em><b>Domain Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_BUILDER_CERTIFICATEMANAGER__DOMAIN_NAME_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Subject Alternative Names java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_BUILDER_CERTIFICATEMANAGER__SUBJECT_ALTERNATIVE_NAMES_JAVA_LANG_STRING_AS_LIST = 1;

	/**
	 * The feature id for the '<em><b>Validation Domains java lang String java lang String As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_BUILDER_CERTIFICATEMANAGER__VALIDATION_DOMAINS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP = 2;

	/**
	 * The feature id for the '<em><b>Validation Method software amazon awscdk services certificatemanager Validation Method </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_BUILDER_CERTIFICATEMANAGER__VALIDATION_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_VALIDATION_METHOD_ = 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_BUILDER_CERTIFICATEMANAGER__GENERATED_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_BUILDER_CERTIFICATEMANAGER__VAR_NAME = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_BUILDER_CERTIFICATEMANAGER__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_BUILDER_CERTIFICATEMANAGER__ADDITIONAL_CODE = 7;

	/**
	 * The number of structural features of the '<em>Certificate Builder certificatemanager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_BUILDER_CERTIFICATEMANAGER_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Certificate Builder certificatemanager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_BUILDER_CERTIFICATEMANAGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link certificatemanager.impl.DnsValidatedCertificatePropsBuilder_certificatemanagerImpl <em>Dns Validated Certificate Props Builder certificatemanager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see certificatemanager.impl.DnsValidatedCertificatePropsBuilder_certificatemanagerImpl
	 * @see certificatemanager.impl.CertificatemanagerPackageImpl#getDnsValidatedCertificatePropsBuilder_certificatemanager()
	 * @generated
	 */
	int DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER = 1;

	/**
	 * The feature id for the '<em><b>Hosted Zone With IHosted Zone software amazon awscdk services route53 IHosted Zone As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__HOSTED_ZONE_WITH_IHOSTED_ZONE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ROUTE53_IHOSTED_ZONE_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Custom Resource Role With IRole software amazon awscdk services iam IRole As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__CUSTOM_RESOURCE_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Region java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__REGION_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Route53 Endpoint java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__ROUTE53_ENDPOINT_JAVA_LANG_STRING_ = 3;

	/**
	 * The feature id for the '<em><b>Domain Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__DOMAIN_NAME_JAVA_LANG_STRING_ = 4;

	/**
	 * The feature id for the '<em><b>Subject Alternative Names java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__SUBJECT_ALTERNATIVE_NAMES_JAVA_LANG_STRING_AS_LIST = 5;

	/**
	 * The feature id for the '<em><b>Validation Domains java lang String java lang String As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__VALIDATION_DOMAINS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP = 6;

	/**
	 * The feature id for the '<em><b>Validation Method software amazon awscdk services certificatemanager Validation Method </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__VALIDATION_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_VALIDATION_METHOD_ = 7;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__GENERATED_CLASS_NAME = 8;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__VAR_NAME = 9;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__IDENTIFIER = 10;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__ADDITIONAL_CODE = 11;

	/**
	 * The number of structural features of the '<em>Dns Validated Certificate Props Builder certificatemanager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Dns Validated Certificate Props Builder certificatemanager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link certificatemanager.impl.CertificatePropsBuilder_certificatemanagerImpl <em>Certificate Props Builder certificatemanager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see certificatemanager.impl.CertificatePropsBuilder_certificatemanagerImpl
	 * @see certificatemanager.impl.CertificatemanagerPackageImpl#getCertificatePropsBuilder_certificatemanager()
	 * @generated
	 */
	int CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER = 2;

	/**
	 * The feature id for the '<em><b>Domain Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__DOMAIN_NAME_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Subject Alternative Names java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__SUBJECT_ALTERNATIVE_NAMES_JAVA_LANG_STRING_AS_LIST = 1;

	/**
	 * The feature id for the '<em><b>Validation Domains java lang String java lang String As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__VALIDATION_DOMAINS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP = 2;

	/**
	 * The feature id for the '<em><b>Validation Method software amazon awscdk services certificatemanager Validation Method </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__VALIDATION_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_VALIDATION_METHOD_ = 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__GENERATED_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__VAR_NAME = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__ADDITIONAL_CODE = 7;

	/**
	 * The number of structural features of the '<em>Certificate Props Builder certificatemanager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Certificate Props Builder certificatemanager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link certificatemanager.impl.DnsValidatedCertificateBuilder_certificatemanagerImpl <em>Dns Validated Certificate Builder certificatemanager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see certificatemanager.impl.DnsValidatedCertificateBuilder_certificatemanagerImpl
	 * @see certificatemanager.impl.CertificatemanagerPackageImpl#getDnsValidatedCertificateBuilder_certificatemanager()
	 * @generated
	 */
	int DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER = 3;

	/**
	 * The feature id for the '<em><b>Domain Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__DOMAIN_NAME_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Subject Alternative Names java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__SUBJECT_ALTERNATIVE_NAMES_JAVA_LANG_STRING_AS_LIST = 1;

	/**
	 * The feature id for the '<em><b>Validation Domains java lang String java lang String As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__VALIDATION_DOMAINS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP = 2;

	/**
	 * The feature id for the '<em><b>Validation Method software amazon awscdk services certificatemanager Validation Method </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__VALIDATION_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_VALIDATION_METHOD_ = 3;

	/**
	 * The feature id for the '<em><b>Hosted Zone With IHosted Zone software amazon awscdk services route53 IHosted Zone As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__HOSTED_ZONE_WITH_IHOSTED_ZONE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ROUTE53_IHOSTED_ZONE_AS_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Custom Resource Role With IRole software amazon awscdk services iam IRole As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__CUSTOM_RESOURCE_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Region java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__REGION_JAVA_LANG_STRING_ = 6;

	/**
	 * The feature id for the '<em><b>Route53 Endpoint java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__ROUTE53_ENDPOINT_JAVA_LANG_STRING_ = 7;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__GENERATED_CLASS_NAME = 8;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__VAR_NAME = 9;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__IDENTIFIER = 10;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__ADDITIONAL_CODE = 11;

	/**
	 * The number of structural features of the '<em>Dns Validated Certificate Builder certificatemanager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Dns Validated Certificate Builder certificatemanager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link certificatemanager.ValidationMethod <em>Validation Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see certificatemanager.ValidationMethod
	 * @see certificatemanager.impl.CertificatemanagerPackageImpl#getValidationMethod()
	 * @generated
	 */
	int VALIDATION_METHOD = 4;

	/**
	 * Returns the meta object for class '{@link certificatemanager.CertificateBuilder_certificatemanager <em>Certificate Builder certificatemanager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Certificate Builder certificatemanager</em>'.
	 * @see certificatemanager.CertificateBuilder_certificatemanager
	 * @generated
	 */
	EClass getCertificateBuilder_certificatemanager();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.CertificateBuilder_certificatemanager#getDomainName_java_lang_String_ <em>Domain Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name java lang String </em>'.
	 * @see certificatemanager.CertificateBuilder_certificatemanager#getDomainName_java_lang_String_()
	 * @see #getCertificateBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getCertificateBuilder_certificatemanager_DomainName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.CertificateBuilder_certificatemanager#getSubjectAlternativeNames_java_lang_String_AsList <em>Subject Alternative Names java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject Alternative Names java lang String As List</em>'.
	 * @see certificatemanager.CertificateBuilder_certificatemanager#getSubjectAlternativeNames_java_lang_String_AsList()
	 * @see #getCertificateBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getCertificateBuilder_certificatemanager_SubjectAlternativeNames_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.CertificateBuilder_certificatemanager#getValidationDomains_java_lang_String__java_lang_String_AsMap <em>Validation Domains java lang String java lang String As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Domains java lang String java lang String As Map</em>'.
	 * @see certificatemanager.CertificateBuilder_certificatemanager#getValidationDomains_java_lang_String__java_lang_String_AsMap()
	 * @see #getCertificateBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getCertificateBuilder_certificatemanager_ValidationDomains_java_lang_String__java_lang_String_AsMap();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.CertificateBuilder_certificatemanager#getValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_ <em>Validation Method software amazon awscdk services certificatemanager Validation Method </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Method software amazon awscdk services certificatemanager Validation Method </em>'.
	 * @see certificatemanager.CertificateBuilder_certificatemanager#getValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_()
	 * @see #getCertificateBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getCertificateBuilder_certificatemanager_ValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.CertificateBuilder_certificatemanager#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see certificatemanager.CertificateBuilder_certificatemanager#getGeneratedClassName()
	 * @see #getCertificateBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getCertificateBuilder_certificatemanager_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.CertificateBuilder_certificatemanager#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see certificatemanager.CertificateBuilder_certificatemanager#getVarName()
	 * @see #getCertificateBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getCertificateBuilder_certificatemanager_VarName();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.CertificateBuilder_certificatemanager#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see certificatemanager.CertificateBuilder_certificatemanager#getIdentifier()
	 * @see #getCertificateBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getCertificateBuilder_certificatemanager_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.CertificateBuilder_certificatemanager#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see certificatemanager.CertificateBuilder_certificatemanager#getAdditionalCode()
	 * @see #getCertificateBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getCertificateBuilder_certificatemanager_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager <em>Dns Validated Certificate Props Builder certificatemanager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dns Validated Certificate Props Builder certificatemanager</em>'.
	 * @see certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager
	 * @generated
	 */
	EClass getDnsValidatedCertificatePropsBuilder_certificatemanager();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getHostedZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference <em>Hosted Zone With IHosted Zone software amazon awscdk services route53 IHosted Zone As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hosted Zone With IHosted Zone software amazon awscdk services route53 IHosted Zone As Reference</em>'.
	 * @see certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getHostedZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference()
	 * @see #getDnsValidatedCertificatePropsBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getDnsValidatedCertificatePropsBuilder_certificatemanager_HostedZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getCustomResourceRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Custom Resource Role With IRole software amazon awscdk services iam IRole As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Resource Role With IRole software amazon awscdk services iam IRole As Reference</em>'.
	 * @see certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getCustomResourceRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @see #getDnsValidatedCertificatePropsBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getDnsValidatedCertificatePropsBuilder_certificatemanager_CustomResourceRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getRegion_java_lang_String_ <em>Region java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region java lang String </em>'.
	 * @see certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getRegion_java_lang_String_()
	 * @see #getDnsValidatedCertificatePropsBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getDnsValidatedCertificatePropsBuilder_certificatemanager_Region_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getRoute53Endpoint_java_lang_String_ <em>Route53 Endpoint java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route53 Endpoint java lang String </em>'.
	 * @see certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getRoute53Endpoint_java_lang_String_()
	 * @see #getDnsValidatedCertificatePropsBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getDnsValidatedCertificatePropsBuilder_certificatemanager_Route53Endpoint_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getDomainName_java_lang_String_ <em>Domain Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name java lang String </em>'.
	 * @see certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getDomainName_java_lang_String_()
	 * @see #getDnsValidatedCertificatePropsBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getDnsValidatedCertificatePropsBuilder_certificatemanager_DomainName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getSubjectAlternativeNames_java_lang_String_AsList <em>Subject Alternative Names java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject Alternative Names java lang String As List</em>'.
	 * @see certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getSubjectAlternativeNames_java_lang_String_AsList()
	 * @see #getDnsValidatedCertificatePropsBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getDnsValidatedCertificatePropsBuilder_certificatemanager_SubjectAlternativeNames_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getValidationDomains_java_lang_String__java_lang_String_AsMap <em>Validation Domains java lang String java lang String As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Domains java lang String java lang String As Map</em>'.
	 * @see certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getValidationDomains_java_lang_String__java_lang_String_AsMap()
	 * @see #getDnsValidatedCertificatePropsBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getDnsValidatedCertificatePropsBuilder_certificatemanager_ValidationDomains_java_lang_String__java_lang_String_AsMap();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_ <em>Validation Method software amazon awscdk services certificatemanager Validation Method </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Method software amazon awscdk services certificatemanager Validation Method </em>'.
	 * @see certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_()
	 * @see #getDnsValidatedCertificatePropsBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getDnsValidatedCertificatePropsBuilder_certificatemanager_ValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getGeneratedClassName()
	 * @see #getDnsValidatedCertificatePropsBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getDnsValidatedCertificatePropsBuilder_certificatemanager_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getVarName()
	 * @see #getDnsValidatedCertificatePropsBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getDnsValidatedCertificatePropsBuilder_certificatemanager_VarName();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getIdentifier()
	 * @see #getDnsValidatedCertificatePropsBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getDnsValidatedCertificatePropsBuilder_certificatemanager_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getAdditionalCode()
	 * @see #getDnsValidatedCertificatePropsBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getDnsValidatedCertificatePropsBuilder_certificatemanager_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link certificatemanager.CertificatePropsBuilder_certificatemanager <em>Certificate Props Builder certificatemanager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Certificate Props Builder certificatemanager</em>'.
	 * @see certificatemanager.CertificatePropsBuilder_certificatemanager
	 * @generated
	 */
	EClass getCertificatePropsBuilder_certificatemanager();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.CertificatePropsBuilder_certificatemanager#getDomainName_java_lang_String_ <em>Domain Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name java lang String </em>'.
	 * @see certificatemanager.CertificatePropsBuilder_certificatemanager#getDomainName_java_lang_String_()
	 * @see #getCertificatePropsBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getCertificatePropsBuilder_certificatemanager_DomainName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.CertificatePropsBuilder_certificatemanager#getSubjectAlternativeNames_java_lang_String_AsList <em>Subject Alternative Names java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject Alternative Names java lang String As List</em>'.
	 * @see certificatemanager.CertificatePropsBuilder_certificatemanager#getSubjectAlternativeNames_java_lang_String_AsList()
	 * @see #getCertificatePropsBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getCertificatePropsBuilder_certificatemanager_SubjectAlternativeNames_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.CertificatePropsBuilder_certificatemanager#getValidationDomains_java_lang_String__java_lang_String_AsMap <em>Validation Domains java lang String java lang String As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Domains java lang String java lang String As Map</em>'.
	 * @see certificatemanager.CertificatePropsBuilder_certificatemanager#getValidationDomains_java_lang_String__java_lang_String_AsMap()
	 * @see #getCertificatePropsBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getCertificatePropsBuilder_certificatemanager_ValidationDomains_java_lang_String__java_lang_String_AsMap();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.CertificatePropsBuilder_certificatemanager#getValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_ <em>Validation Method software amazon awscdk services certificatemanager Validation Method </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Method software amazon awscdk services certificatemanager Validation Method </em>'.
	 * @see certificatemanager.CertificatePropsBuilder_certificatemanager#getValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_()
	 * @see #getCertificatePropsBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getCertificatePropsBuilder_certificatemanager_ValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.CertificatePropsBuilder_certificatemanager#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see certificatemanager.CertificatePropsBuilder_certificatemanager#getGeneratedClassName()
	 * @see #getCertificatePropsBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getCertificatePropsBuilder_certificatemanager_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.CertificatePropsBuilder_certificatemanager#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see certificatemanager.CertificatePropsBuilder_certificatemanager#getVarName()
	 * @see #getCertificatePropsBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getCertificatePropsBuilder_certificatemanager_VarName();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.CertificatePropsBuilder_certificatemanager#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see certificatemanager.CertificatePropsBuilder_certificatemanager#getIdentifier()
	 * @see #getCertificatePropsBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getCertificatePropsBuilder_certificatemanager_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.CertificatePropsBuilder_certificatemanager#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see certificatemanager.CertificatePropsBuilder_certificatemanager#getAdditionalCode()
	 * @see #getCertificatePropsBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getCertificatePropsBuilder_certificatemanager_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link certificatemanager.DnsValidatedCertificateBuilder_certificatemanager <em>Dns Validated Certificate Builder certificatemanager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dns Validated Certificate Builder certificatemanager</em>'.
	 * @see certificatemanager.DnsValidatedCertificateBuilder_certificatemanager
	 * @generated
	 */
	EClass getDnsValidatedCertificateBuilder_certificatemanager();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.DnsValidatedCertificateBuilder_certificatemanager#getDomainName_java_lang_String_ <em>Domain Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name java lang String </em>'.
	 * @see certificatemanager.DnsValidatedCertificateBuilder_certificatemanager#getDomainName_java_lang_String_()
	 * @see #getDnsValidatedCertificateBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getDnsValidatedCertificateBuilder_certificatemanager_DomainName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.DnsValidatedCertificateBuilder_certificatemanager#getSubjectAlternativeNames_java_lang_String_AsList <em>Subject Alternative Names java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject Alternative Names java lang String As List</em>'.
	 * @see certificatemanager.DnsValidatedCertificateBuilder_certificatemanager#getSubjectAlternativeNames_java_lang_String_AsList()
	 * @see #getDnsValidatedCertificateBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getDnsValidatedCertificateBuilder_certificatemanager_SubjectAlternativeNames_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.DnsValidatedCertificateBuilder_certificatemanager#getValidationDomains_java_lang_String__java_lang_String_AsMap <em>Validation Domains java lang String java lang String As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Domains java lang String java lang String As Map</em>'.
	 * @see certificatemanager.DnsValidatedCertificateBuilder_certificatemanager#getValidationDomains_java_lang_String__java_lang_String_AsMap()
	 * @see #getDnsValidatedCertificateBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getDnsValidatedCertificateBuilder_certificatemanager_ValidationDomains_java_lang_String__java_lang_String_AsMap();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.DnsValidatedCertificateBuilder_certificatemanager#getValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_ <em>Validation Method software amazon awscdk services certificatemanager Validation Method </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Method software amazon awscdk services certificatemanager Validation Method </em>'.
	 * @see certificatemanager.DnsValidatedCertificateBuilder_certificatemanager#getValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_()
	 * @see #getDnsValidatedCertificateBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getDnsValidatedCertificateBuilder_certificatemanager_ValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.DnsValidatedCertificateBuilder_certificatemanager#getHostedZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference <em>Hosted Zone With IHosted Zone software amazon awscdk services route53 IHosted Zone As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hosted Zone With IHosted Zone software amazon awscdk services route53 IHosted Zone As Reference</em>'.
	 * @see certificatemanager.DnsValidatedCertificateBuilder_certificatemanager#getHostedZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference()
	 * @see #getDnsValidatedCertificateBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getDnsValidatedCertificateBuilder_certificatemanager_HostedZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.DnsValidatedCertificateBuilder_certificatemanager#getCustomResourceRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Custom Resource Role With IRole software amazon awscdk services iam IRole As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Resource Role With IRole software amazon awscdk services iam IRole As Reference</em>'.
	 * @see certificatemanager.DnsValidatedCertificateBuilder_certificatemanager#getCustomResourceRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @see #getDnsValidatedCertificateBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getDnsValidatedCertificateBuilder_certificatemanager_CustomResourceRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.DnsValidatedCertificateBuilder_certificatemanager#getRegion_java_lang_String_ <em>Region java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region java lang String </em>'.
	 * @see certificatemanager.DnsValidatedCertificateBuilder_certificatemanager#getRegion_java_lang_String_()
	 * @see #getDnsValidatedCertificateBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getDnsValidatedCertificateBuilder_certificatemanager_Region_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.DnsValidatedCertificateBuilder_certificatemanager#getRoute53Endpoint_java_lang_String_ <em>Route53 Endpoint java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route53 Endpoint java lang String </em>'.
	 * @see certificatemanager.DnsValidatedCertificateBuilder_certificatemanager#getRoute53Endpoint_java_lang_String_()
	 * @see #getDnsValidatedCertificateBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getDnsValidatedCertificateBuilder_certificatemanager_Route53Endpoint_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.DnsValidatedCertificateBuilder_certificatemanager#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see certificatemanager.DnsValidatedCertificateBuilder_certificatemanager#getGeneratedClassName()
	 * @see #getDnsValidatedCertificateBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getDnsValidatedCertificateBuilder_certificatemanager_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.DnsValidatedCertificateBuilder_certificatemanager#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see certificatemanager.DnsValidatedCertificateBuilder_certificatemanager#getVarName()
	 * @see #getDnsValidatedCertificateBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getDnsValidatedCertificateBuilder_certificatemanager_VarName();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.DnsValidatedCertificateBuilder_certificatemanager#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see certificatemanager.DnsValidatedCertificateBuilder_certificatemanager#getIdentifier()
	 * @see #getDnsValidatedCertificateBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getDnsValidatedCertificateBuilder_certificatemanager_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link certificatemanager.DnsValidatedCertificateBuilder_certificatemanager#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see certificatemanager.DnsValidatedCertificateBuilder_certificatemanager#getAdditionalCode()
	 * @see #getDnsValidatedCertificateBuilder_certificatemanager()
	 * @generated
	 */
	EAttribute getDnsValidatedCertificateBuilder_certificatemanager_AdditionalCode();

	/**
	 * Returns the meta object for enum '{@link certificatemanager.ValidationMethod <em>Validation Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Validation Method</em>'.
	 * @see certificatemanager.ValidationMethod
	 * @generated
	 */
	EEnum getValidationMethod();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CertificatemanagerFactory getCertificatemanagerFactory();

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
		 * The meta object literal for the '{@link certificatemanager.impl.CertificateBuilder_certificatemanagerImpl <em>Certificate Builder certificatemanager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see certificatemanager.impl.CertificateBuilder_certificatemanagerImpl
		 * @see certificatemanager.impl.CertificatemanagerPackageImpl#getCertificateBuilder_certificatemanager()
		 * @generated
		 */
		EClass CERTIFICATE_BUILDER_CERTIFICATEMANAGER = eINSTANCE.getCertificateBuilder_certificatemanager();

		/**
		 * The meta object literal for the '<em><b>Domain Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE_BUILDER_CERTIFICATEMANAGER__DOMAIN_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getCertificateBuilder_certificatemanager_DomainName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Subject Alternative Names java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE_BUILDER_CERTIFICATEMANAGER__SUBJECT_ALTERNATIVE_NAMES_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getCertificateBuilder_certificatemanager_SubjectAlternativeNames_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Validation Domains java lang String java lang String As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE_BUILDER_CERTIFICATEMANAGER__VALIDATION_DOMAINS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP = eINSTANCE
				.getCertificateBuilder_certificatemanager_ValidationDomains_java_lang_String__java_lang_String_AsMap();

		/**
		 * The meta object literal for the '<em><b>Validation Method software amazon awscdk services certificatemanager Validation Method </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE_BUILDER_CERTIFICATEMANAGER__VALIDATION_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_VALIDATION_METHOD_ = eINSTANCE
				.getCertificateBuilder_certificatemanager_ValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE_BUILDER_CERTIFICATEMANAGER__GENERATED_CLASS_NAME = eINSTANCE
				.getCertificateBuilder_certificatemanager_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE_BUILDER_CERTIFICATEMANAGER__VAR_NAME = eINSTANCE
				.getCertificateBuilder_certificatemanager_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE_BUILDER_CERTIFICATEMANAGER__IDENTIFIER = eINSTANCE
				.getCertificateBuilder_certificatemanager_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE_BUILDER_CERTIFICATEMANAGER__ADDITIONAL_CODE = eINSTANCE
				.getCertificateBuilder_certificatemanager_AdditionalCode();

		/**
		 * The meta object literal for the '{@link certificatemanager.impl.DnsValidatedCertificatePropsBuilder_certificatemanagerImpl <em>Dns Validated Certificate Props Builder certificatemanager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see certificatemanager.impl.DnsValidatedCertificatePropsBuilder_certificatemanagerImpl
		 * @see certificatemanager.impl.CertificatemanagerPackageImpl#getDnsValidatedCertificatePropsBuilder_certificatemanager()
		 * @generated
		 */
		EClass DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER = eINSTANCE
				.getDnsValidatedCertificatePropsBuilder_certificatemanager();

		/**
		 * The meta object literal for the '<em><b>Hosted Zone With IHosted Zone software amazon awscdk services route53 IHosted Zone As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__HOSTED_ZONE_WITH_IHOSTED_ZONE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ROUTE53_IHOSTED_ZONE_AS_REFERENCE = eINSTANCE
				.getDnsValidatedCertificatePropsBuilder_certificatemanager_HostedZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference();

		/**
		 * The meta object literal for the '<em><b>Custom Resource Role With IRole software amazon awscdk services iam IRole As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__CUSTOM_RESOURCE_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE = eINSTANCE
				.getDnsValidatedCertificatePropsBuilder_certificatemanager_CustomResourceRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();

		/**
		 * The meta object literal for the '<em><b>Region java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__REGION_JAVA_LANG_STRING_ = eINSTANCE
				.getDnsValidatedCertificatePropsBuilder_certificatemanager_Region_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Route53 Endpoint java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__ROUTE53_ENDPOINT_JAVA_LANG_STRING_ = eINSTANCE
				.getDnsValidatedCertificatePropsBuilder_certificatemanager_Route53Endpoint_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Domain Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__DOMAIN_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getDnsValidatedCertificatePropsBuilder_certificatemanager_DomainName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Subject Alternative Names java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__SUBJECT_ALTERNATIVE_NAMES_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getDnsValidatedCertificatePropsBuilder_certificatemanager_SubjectAlternativeNames_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Validation Domains java lang String java lang String As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__VALIDATION_DOMAINS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP = eINSTANCE
				.getDnsValidatedCertificatePropsBuilder_certificatemanager_ValidationDomains_java_lang_String__java_lang_String_AsMap();

		/**
		 * The meta object literal for the '<em><b>Validation Method software amazon awscdk services certificatemanager Validation Method </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__VALIDATION_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_VALIDATION_METHOD_ = eINSTANCE
				.getDnsValidatedCertificatePropsBuilder_certificatemanager_ValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__GENERATED_CLASS_NAME = eINSTANCE
				.getDnsValidatedCertificatePropsBuilder_certificatemanager_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__VAR_NAME = eINSTANCE
				.getDnsValidatedCertificatePropsBuilder_certificatemanager_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__IDENTIFIER = eINSTANCE
				.getDnsValidatedCertificatePropsBuilder_certificatemanager_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__ADDITIONAL_CODE = eINSTANCE
				.getDnsValidatedCertificatePropsBuilder_certificatemanager_AdditionalCode();

		/**
		 * The meta object literal for the '{@link certificatemanager.impl.CertificatePropsBuilder_certificatemanagerImpl <em>Certificate Props Builder certificatemanager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see certificatemanager.impl.CertificatePropsBuilder_certificatemanagerImpl
		 * @see certificatemanager.impl.CertificatemanagerPackageImpl#getCertificatePropsBuilder_certificatemanager()
		 * @generated
		 */
		EClass CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER = eINSTANCE.getCertificatePropsBuilder_certificatemanager();

		/**
		 * The meta object literal for the '<em><b>Domain Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__DOMAIN_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getCertificatePropsBuilder_certificatemanager_DomainName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Subject Alternative Names java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__SUBJECT_ALTERNATIVE_NAMES_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getCertificatePropsBuilder_certificatemanager_SubjectAlternativeNames_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Validation Domains java lang String java lang String As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__VALIDATION_DOMAINS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP = eINSTANCE
				.getCertificatePropsBuilder_certificatemanager_ValidationDomains_java_lang_String__java_lang_String_AsMap();

		/**
		 * The meta object literal for the '<em><b>Validation Method software amazon awscdk services certificatemanager Validation Method </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__VALIDATION_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_VALIDATION_METHOD_ = eINSTANCE
				.getCertificatePropsBuilder_certificatemanager_ValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__GENERATED_CLASS_NAME = eINSTANCE
				.getCertificatePropsBuilder_certificatemanager_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__VAR_NAME = eINSTANCE
				.getCertificatePropsBuilder_certificatemanager_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__IDENTIFIER = eINSTANCE
				.getCertificatePropsBuilder_certificatemanager_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__ADDITIONAL_CODE = eINSTANCE
				.getCertificatePropsBuilder_certificatemanager_AdditionalCode();

		/**
		 * The meta object literal for the '{@link certificatemanager.impl.DnsValidatedCertificateBuilder_certificatemanagerImpl <em>Dns Validated Certificate Builder certificatemanager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see certificatemanager.impl.DnsValidatedCertificateBuilder_certificatemanagerImpl
		 * @see certificatemanager.impl.CertificatemanagerPackageImpl#getDnsValidatedCertificateBuilder_certificatemanager()
		 * @generated
		 */
		EClass DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER = eINSTANCE
				.getDnsValidatedCertificateBuilder_certificatemanager();

		/**
		 * The meta object literal for the '<em><b>Domain Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__DOMAIN_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getDnsValidatedCertificateBuilder_certificatemanager_DomainName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Subject Alternative Names java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__SUBJECT_ALTERNATIVE_NAMES_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getDnsValidatedCertificateBuilder_certificatemanager_SubjectAlternativeNames_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Validation Domains java lang String java lang String As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__VALIDATION_DOMAINS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP = eINSTANCE
				.getDnsValidatedCertificateBuilder_certificatemanager_ValidationDomains_java_lang_String__java_lang_String_AsMap();

		/**
		 * The meta object literal for the '<em><b>Validation Method software amazon awscdk services certificatemanager Validation Method </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__VALIDATION_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_VALIDATION_METHOD_ = eINSTANCE
				.getDnsValidatedCertificateBuilder_certificatemanager_ValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_();

		/**
		 * The meta object literal for the '<em><b>Hosted Zone With IHosted Zone software amazon awscdk services route53 IHosted Zone As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__HOSTED_ZONE_WITH_IHOSTED_ZONE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ROUTE53_IHOSTED_ZONE_AS_REFERENCE = eINSTANCE
				.getDnsValidatedCertificateBuilder_certificatemanager_HostedZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference();

		/**
		 * The meta object literal for the '<em><b>Custom Resource Role With IRole software amazon awscdk services iam IRole As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__CUSTOM_RESOURCE_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE = eINSTANCE
				.getDnsValidatedCertificateBuilder_certificatemanager_CustomResourceRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();

		/**
		 * The meta object literal for the '<em><b>Region java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__REGION_JAVA_LANG_STRING_ = eINSTANCE
				.getDnsValidatedCertificateBuilder_certificatemanager_Region_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Route53 Endpoint java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__ROUTE53_ENDPOINT_JAVA_LANG_STRING_ = eINSTANCE
				.getDnsValidatedCertificateBuilder_certificatemanager_Route53Endpoint_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__GENERATED_CLASS_NAME = eINSTANCE
				.getDnsValidatedCertificateBuilder_certificatemanager_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__VAR_NAME = eINSTANCE
				.getDnsValidatedCertificateBuilder_certificatemanager_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__IDENTIFIER = eINSTANCE
				.getDnsValidatedCertificateBuilder_certificatemanager_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__ADDITIONAL_CODE = eINSTANCE
				.getDnsValidatedCertificateBuilder_certificatemanager_AdditionalCode();

		/**
		 * The meta object literal for the '{@link certificatemanager.ValidationMethod <em>Validation Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see certificatemanager.ValidationMethod
		 * @see certificatemanager.impl.CertificatemanagerPackageImpl#getValidationMethod()
		 * @generated
		 */
		EEnum VALIDATION_METHOD = eINSTANCE.getValidationMethod();

	}

} //CertificatemanagerPackage
