/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Name Options Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DomainNameOptionsBuilder_apigateway#getCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference <em>Certificate With ICertificate software amazon awscdk services certificatemanager ICertificate As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DomainNameOptionsBuilder_apigateway#getDomainName_java_lang_String_ <em>Domain Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DomainNameOptionsBuilder_apigateway#getEndpointType_software_amazon_awscdk_services_apigateway_EndpointType_ <em>Endpoint Type software amazon awscdk services apigateway Endpoint Type </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DomainNameOptionsBuilder_apigateway#getSecurityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_ <em>Security Policy software amazon awscdk services apigateway Security Policy </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DomainNameOptionsBuilder_apigateway#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DomainNameOptionsBuilder_apigateway#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DomainNameOptionsBuilder_apigateway#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DomainNameOptionsBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDomainNameOptionsBuilder_apigateway()
 * @model
 * @generated
 */
public interface DomainNameOptionsBuilder_apigateway extends EObject {
	/**
	 * Returns the value of the '<em><b>Certificate With ICertificate software amazon awscdk services certificatemanager ICertificate As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certificate With ICertificate software amazon awscdk services certificatemanager ICertificate As Reference</em>' attribute.
	 * @see #setCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDomainNameOptionsBuilder_apigateway_CertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference()
	 * @model
	 * @generated
	 */
	String getCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DomainNameOptionsBuilder_apigateway#getCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference <em>Certificate With ICertificate software amazon awscdk services certificatemanager ICertificate As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate With ICertificate software amazon awscdk services certificatemanager ICertificate As Reference</em>' attribute.
	 * @see #getCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference()
	 * @generated
	 */
	void setCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Domain Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Name java lang String </em>' attribute.
	 * @see #setDomainName_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDomainNameOptionsBuilder_apigateway_DomainName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDomainName_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DomainNameOptionsBuilder_apigateway#getDomainName_java_lang_String_ <em>Domain Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Name java lang String </em>' attribute.
	 * @see #getDomainName_java_lang_String_()
	 * @generated
	 */
	void setDomainName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Endpoint Type software amazon awscdk services apigateway Endpoint Type </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.EndpointType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Type software amazon awscdk services apigateway Endpoint Type </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.EndpointType
	 * @see #setEndpointType_software_amazon_awscdk_services_apigateway_EndpointType_(EndpointType)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDomainNameOptionsBuilder_apigateway_EndpointType_software_amazon_awscdk_services_apigateway_EndpointType_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.EndpointType"
	 * @generated
	 */
	EndpointType getEndpointType_software_amazon_awscdk_services_apigateway_EndpointType_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DomainNameOptionsBuilder_apigateway#getEndpointType_software_amazon_awscdk_services_apigateway_EndpointType_ <em>Endpoint Type software amazon awscdk services apigateway Endpoint Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Type software amazon awscdk services apigateway Endpoint Type </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.EndpointType
	 * @see #getEndpointType_software_amazon_awscdk_services_apigateway_EndpointType_()
	 * @generated
	 */
	void setEndpointType_software_amazon_awscdk_services_apigateway_EndpointType_(EndpointType value);

	/**
	 * Returns the value of the '<em><b>Security Policy software amazon awscdk services apigateway Security Policy </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.SecurityPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Policy software amazon awscdk services apigateway Security Policy </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SecurityPolicy
	 * @see #setSecurityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_(SecurityPolicy)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDomainNameOptionsBuilder_apigateway_SecurityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.SecurityPolicy"
	 * @generated
	 */
	SecurityPolicy getSecurityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DomainNameOptionsBuilder_apigateway#getSecurityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_ <em>Security Policy software amazon awscdk services apigateway Security Policy </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Policy software amazon awscdk services apigateway Security Policy </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SecurityPolicy
	 * @see #getSecurityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_()
	 * @generated
	 */
	void setSecurityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_(SecurityPolicy value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.apigateway.DomainNameOptions"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDomainNameOptionsBuilder_apigateway_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.apigateway.DomainNameOptions" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDomainNameOptionsBuilder_apigateway_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DomainNameOptionsBuilder_apigateway#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDomainNameOptionsBuilder_apigateway_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DomainNameOptionsBuilder_apigateway#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDomainNameOptionsBuilder_apigateway_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DomainNameOptionsBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // DomainNameOptionsBuilder_apigateway
