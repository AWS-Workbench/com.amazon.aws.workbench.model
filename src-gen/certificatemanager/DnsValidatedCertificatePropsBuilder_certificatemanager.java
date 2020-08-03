/**
 */
package certificatemanager;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dns Validated Certificate Props Builder certificatemanager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getHostedZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference <em>Hosted Zone With IHosted Zone software amazon awscdk services route53 IHosted Zone As Reference</em>}</li>
 *   <li>{@link certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getCustomResourceRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Custom Resource Role With IRole software amazon awscdk services iam IRole As Reference</em>}</li>
 *   <li>{@link certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getRegion_java_lang_String_ <em>Region java lang String </em>}</li>
 *   <li>{@link certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getRoute53Endpoint_java_lang_String_ <em>Route53 Endpoint java lang String </em>}</li>
 *   <li>{@link certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getDomainName_java_lang_String_ <em>Domain Name java lang String </em>}</li>
 *   <li>{@link certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getSubjectAlternativeNames_java_lang_String_AsList <em>Subject Alternative Names java lang String As List</em>}</li>
 *   <li>{@link certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getValidationDomains_java_lang_String__java_lang_String_AsMap <em>Validation Domains java lang String java lang String As Map</em>}</li>
 *   <li>{@link certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_ <em>Validation Method software amazon awscdk services certificatemanager Validation Method </em>}</li>
 *   <li>{@link certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getVarName <em>Var Name</em>}</li>
 *   <li>{@link certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see certificatemanager.CertificatemanagerPackage#getDnsValidatedCertificatePropsBuilder_certificatemanager()
 * @model
 * @generated
 */
public interface DnsValidatedCertificatePropsBuilder_certificatemanager extends EObject {
	/**
	 * Returns the value of the '<em><b>Hosted Zone With IHosted Zone software amazon awscdk services route53 IHosted Zone As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hosted Zone With IHosted Zone software amazon awscdk services route53 IHosted Zone As Reference</em>' attribute.
	 * @see #setHostedZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference(String)
	 * @see certificatemanager.CertificatemanagerPackage#getDnsValidatedCertificatePropsBuilder_certificatemanager_HostedZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference()
	 * @model
	 * @generated
	 */
	String getHostedZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference();

	/**
	 * Sets the value of the '{@link certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getHostedZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference <em>Hosted Zone With IHosted Zone software amazon awscdk services route53 IHosted Zone As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hosted Zone With IHosted Zone software amazon awscdk services route53 IHosted Zone As Reference</em>' attribute.
	 * @see #getHostedZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference()
	 * @generated
	 */
	void setHostedZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Custom Resource Role With IRole software amazon awscdk services iam IRole As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Resource Role With IRole software amazon awscdk services iam IRole As Reference</em>' attribute.
	 * @see #setCustomResourceRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(String)
	 * @see certificatemanager.CertificatemanagerPackage#getDnsValidatedCertificatePropsBuilder_certificatemanager_CustomResourceRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @model
	 * @generated
	 */
	String getCustomResourceRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();

	/**
	 * Sets the value of the '{@link certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getCustomResourceRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Custom Resource Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Resource Role With IRole software amazon awscdk services iam IRole As Reference</em>' attribute.
	 * @see #getCustomResourceRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @generated
	 */
	void setCustomResourceRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Region java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region java lang String </em>' attribute.
	 * @see #setRegion_java_lang_String_(String)
	 * @see certificatemanager.CertificatemanagerPackage#getDnsValidatedCertificatePropsBuilder_certificatemanager_Region_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getRegion_java_lang_String_();

	/**
	 * Sets the value of the '{@link certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getRegion_java_lang_String_ <em>Region java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region java lang String </em>' attribute.
	 * @see #getRegion_java_lang_String_()
	 * @generated
	 */
	void setRegion_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Route53 Endpoint java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route53 Endpoint java lang String </em>' attribute.
	 * @see #setRoute53Endpoint_java_lang_String_(String)
	 * @see certificatemanager.CertificatemanagerPackage#getDnsValidatedCertificatePropsBuilder_certificatemanager_Route53Endpoint_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getRoute53Endpoint_java_lang_String_();

	/**
	 * Sets the value of the '{@link certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getRoute53Endpoint_java_lang_String_ <em>Route53 Endpoint java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route53 Endpoint java lang String </em>' attribute.
	 * @see #getRoute53Endpoint_java_lang_String_()
	 * @generated
	 */
	void setRoute53Endpoint_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Domain Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Name java lang String </em>' attribute.
	 * @see #setDomainName_java_lang_String_(String)
	 * @see certificatemanager.CertificatemanagerPackage#getDnsValidatedCertificatePropsBuilder_certificatemanager_DomainName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDomainName_java_lang_String_();

	/**
	 * Sets the value of the '{@link certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getDomainName_java_lang_String_ <em>Domain Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Name java lang String </em>' attribute.
	 * @see #getDomainName_java_lang_String_()
	 * @generated
	 */
	void setDomainName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Subject Alternative Names java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject Alternative Names java lang String As List</em>' attribute.
	 * @see #setSubjectAlternativeNames_java_lang_String_AsList(String)
	 * @see certificatemanager.CertificatemanagerPackage#getDnsValidatedCertificatePropsBuilder_certificatemanager_SubjectAlternativeNames_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getSubjectAlternativeNames_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getSubjectAlternativeNames_java_lang_String_AsList <em>Subject Alternative Names java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Alternative Names java lang String As List</em>' attribute.
	 * @see #getSubjectAlternativeNames_java_lang_String_AsList()
	 * @generated
	 */
	void setSubjectAlternativeNames_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Validation Domains java lang String java lang String As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Domains java lang String java lang String As Map</em>' attribute.
	 * @see #setValidationDomains_java_lang_String__java_lang_String_AsMap(String)
	 * @see certificatemanager.CertificatemanagerPackage#getDnsValidatedCertificatePropsBuilder_certificatemanager_ValidationDomains_java_lang_String__java_lang_String_AsMap()
	 * @model
	 * @generated
	 */
	String getValidationDomains_java_lang_String__java_lang_String_AsMap();

	/**
	 * Sets the value of the '{@link certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getValidationDomains_java_lang_String__java_lang_String_AsMap <em>Validation Domains java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Domains java lang String java lang String As Map</em>' attribute.
	 * @see #getValidationDomains_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 */
	void setValidationDomains_java_lang_String__java_lang_String_AsMap(String value);

	/**
	 * Returns the value of the '<em><b>Validation Method software amazon awscdk services certificatemanager Validation Method </b></em>' attribute.
	 * The literals are from the enumeration {@link certificatemanager.ValidationMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Method software amazon awscdk services certificatemanager Validation Method </em>' attribute.
	 * @see certificatemanager.ValidationMethod
	 * @see #setValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_(ValidationMethod)
	 * @see certificatemanager.CertificatemanagerPackage#getDnsValidatedCertificatePropsBuilder_certificatemanager_ValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_()
	 * @model dataType="certificatemanager.ValidationMethod"
	 * @generated
	 */
	ValidationMethod getValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_();

	/**
	 * Sets the value of the '{@link certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_ <em>Validation Method software amazon awscdk services certificatemanager Validation Method </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Method software amazon awscdk services certificatemanager Validation Method </em>' attribute.
	 * @see certificatemanager.ValidationMethod
	 * @see #getValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_()
	 * @generated
	 */
	void setValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_(
			ValidationMethod value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see certificatemanager.CertificatemanagerPackage#getDnsValidatedCertificatePropsBuilder_certificatemanager_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see certificatemanager.CertificatemanagerPackage#getDnsValidatedCertificatePropsBuilder_certificatemanager_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getVarName <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Name</em>' attribute.
	 * @see #getVarName()
	 * @generated
	 */
	void setVarName(String value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see certificatemanager.CertificatemanagerPackage#getDnsValidatedCertificatePropsBuilder_certificatemanager_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Code</em>' attribute.
	 * @see #setAdditionalCode(String)
	 * @see certificatemanager.CertificatemanagerPackage#getDnsValidatedCertificatePropsBuilder_certificatemanager_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link certificatemanager.DnsValidatedCertificatePropsBuilder_certificatemanager#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // DnsValidatedCertificatePropsBuilder_certificatemanager
