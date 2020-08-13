/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Listener Props Builder patterns</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationListenerPropsBuilder_patterns#getName_java_lang_String_ <em>Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationListenerPropsBuilder_patterns#getCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference <em>Certificate With ICertificate software amazon awscdk services certificatemanager ICertificate As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationListenerPropsBuilder_patterns#getPort_java_lang_Number_ <em>Port java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationListenerPropsBuilder_patterns#getProtocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_ <em>Protocol software amazon awscdk services elasticloadbalancingv2 Application Protocol </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationListenerPropsBuilder_patterns#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationListenerPropsBuilder_patterns#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationListenerPropsBuilder_patterns#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationListenerPropsBuilder_patterns#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApplicationListenerPropsBuilder_patterns()
 * @model
 * @generated
 */
public interface ApplicationListenerPropsBuilder_patterns extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name java lang String </em>' attribute.
	 * @see #setName_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApplicationListenerPropsBuilder_patterns_Name_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getName_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationListenerPropsBuilder_patterns#getName_java_lang_String_ <em>Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name java lang String </em>' attribute.
	 * @see #getName_java_lang_String_()
	 * @generated
	 */
	void setName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Certificate With ICertificate software amazon awscdk services certificatemanager ICertificate As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certificate With ICertificate software amazon awscdk services certificatemanager ICertificate As Reference</em>' attribute.
	 * @see #setCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApplicationListenerPropsBuilder_patterns_CertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference()
	 * @model
	 * @generated
	 */
	String getCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationListenerPropsBuilder_patterns#getCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference <em>Certificate With ICertificate software amazon awscdk services certificatemanager ICertificate As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate With ICertificate software amazon awscdk services certificatemanager ICertificate As Reference</em>' attribute.
	 * @see #getCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference()
	 * @generated
	 */
	void setCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Port java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port java lang Number </em>' attribute.
	 * @see #setPort_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApplicationListenerPropsBuilder_patterns_Port_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getPort_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationListenerPropsBuilder_patterns#getPort_java_lang_Number_ <em>Port java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port java lang Number </em>' attribute.
	 * @see #getPort_java_lang_Number_()
	 * @generated
	 */
	void setPort_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Protocol software amazon awscdk services elasticloadbalancingv2 Application Protocol </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.ApplicationProtocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol software amazon awscdk services elasticloadbalancingv2 Application Protocol </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ApplicationProtocol
	 * @see #setProtocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_(ApplicationProtocol)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApplicationListenerPropsBuilder_patterns_Protocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.ApplicationProtocol"
	 * @generated
	 */
	ApplicationProtocol getProtocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationListenerPropsBuilder_patterns#getProtocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_ <em>Protocol software amazon awscdk services elasticloadbalancingv2 Application Protocol </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol software amazon awscdk services elasticloadbalancingv2 Application Protocol </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ApplicationProtocol
	 * @see #getProtocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_()
	 * @generated
	 */
	void setProtocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_(
			ApplicationProtocol value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ecs.patterns.ApplicationListenerProps"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApplicationListenerPropsBuilder_patterns_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ecs.patterns.ApplicationListenerProps" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApplicationListenerPropsBuilder_patterns_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationListenerPropsBuilder_patterns#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApplicationListenerPropsBuilder_patterns_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationListenerPropsBuilder_patterns#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApplicationListenerPropsBuilder_patterns_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationListenerPropsBuilder_patterns#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // ApplicationListenerPropsBuilder_patterns
