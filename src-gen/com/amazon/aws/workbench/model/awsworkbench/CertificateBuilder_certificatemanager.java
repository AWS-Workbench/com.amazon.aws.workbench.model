/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Certificate Builder certificatemanager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CertificateBuilder_certificatemanager#getDomainName_java_lang_String_ <em>Domain Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CertificateBuilder_certificatemanager#getSubjectAlternativeNames_java_lang_String_AsList <em>Subject Alternative Names java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CertificateBuilder_certificatemanager#getValidationDomains_java_lang_String__java_lang_String_AsMap <em>Validation Domains java lang String java lang String As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CertificateBuilder_certificatemanager#getValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_ <em>Validation Method software amazon awscdk services certificatemanager Validation Method </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CertificateBuilder_certificatemanager#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CertificateBuilder_certificatemanager#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CertificateBuilder_certificatemanager#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CertificateBuilder_certificatemanager#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCertificateBuilder_certificatemanager()
 * @model
 * @generated
 */
public interface CertificateBuilder_certificatemanager extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Domain Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Name java lang String </em>' attribute.
	 * @see #setDomainName_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCertificateBuilder_certificatemanager_DomainName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDomainName_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CertificateBuilder_certificatemanager#getDomainName_java_lang_String_ <em>Domain Name java lang String </em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCertificateBuilder_certificatemanager_SubjectAlternativeNames_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getSubjectAlternativeNames_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CertificateBuilder_certificatemanager#getSubjectAlternativeNames_java_lang_String_AsList <em>Subject Alternative Names java lang String As List</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCertificateBuilder_certificatemanager_ValidationDomains_java_lang_String__java_lang_String_AsMap()
	 * @model
	 * @generated
	 */
	String getValidationDomains_java_lang_String__java_lang_String_AsMap();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CertificateBuilder_certificatemanager#getValidationDomains_java_lang_String__java_lang_String_AsMap <em>Validation Domains java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Domains java lang String java lang String As Map</em>' attribute.
	 * @see #getValidationDomains_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 */
	void setValidationDomains_java_lang_String__java_lang_String_AsMap(String value);

	/**
	 * Returns the value of the '<em><b>Validation Method software amazon awscdk services certificatemanager Validation Method </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.ValidationMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Method software amazon awscdk services certificatemanager Validation Method </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ValidationMethod
	 * @see #setValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_(ValidationMethod)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCertificateBuilder_certificatemanager_ValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.ValidationMethod"
	 * @generated
	 */
	ValidationMethod getValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CertificateBuilder_certificatemanager#getValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_ <em>Validation Method software amazon awscdk services certificatemanager Validation Method </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Method software amazon awscdk services certificatemanager Validation Method </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ValidationMethod
	 * @see #getValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_()
	 * @generated
	 */
	void setValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_(
			ValidationMethod value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.certificatemanager.Certificate"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCertificateBuilder_certificatemanager_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.certificatemanager.Certificate" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCertificateBuilder_certificatemanager_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CertificateBuilder_certificatemanager#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCertificateBuilder_certificatemanager_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CertificateBuilder_certificatemanager#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCertificateBuilder_certificatemanager_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CertificateBuilder_certificatemanager#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // CertificateBuilder_certificatemanager
