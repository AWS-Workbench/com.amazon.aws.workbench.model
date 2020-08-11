/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Redirect Target Builder s3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.RedirectTargetBuilder_s3#getHostName_java_lang_String_ <em>Host Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.RedirectTargetBuilder_s3#getProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_ <em>Protocol software amazon awscdk services s3 Redirect Protocol </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.RedirectTargetBuilder_s3#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.RedirectTargetBuilder_s3#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.RedirectTargetBuilder_s3#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.RedirectTargetBuilder_s3#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getRedirectTargetBuilder_s3()
 * @model
 * @generated
 */
public interface RedirectTargetBuilder_s3 extends EObject {
	/**
	 * Returns the value of the '<em><b>Host Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Name java lang String </em>' attribute.
	 * @see #setHostName_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getRedirectTargetBuilder_s3_HostName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getHostName_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.RedirectTargetBuilder_s3#getHostName_java_lang_String_ <em>Host Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Name java lang String </em>' attribute.
	 * @see #getHostName_java_lang_String_()
	 * @generated
	 */
	void setHostName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Protocol software amazon awscdk services s3 Redirect Protocol </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.RedirectProtocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol software amazon awscdk services s3 Redirect Protocol </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.RedirectProtocol
	 * @see #setProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_(RedirectProtocol)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getRedirectTargetBuilder_s3_Protocol_software_amazon_awscdk_services_s3_RedirectProtocol_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.RedirectProtocol"
	 * @generated
	 */
	RedirectProtocol getProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.RedirectTargetBuilder_s3#getProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_ <em>Protocol software amazon awscdk services s3 Redirect Protocol </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol software amazon awscdk services s3 Redirect Protocol </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.RedirectProtocol
	 * @see #getProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_()
	 * @generated
	 */
	void setProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_(RedirectProtocol value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.s3.RedirectTarget"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getRedirectTargetBuilder_s3_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.s3.RedirectTarget" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getRedirectTargetBuilder_s3_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.RedirectTargetBuilder_s3#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getRedirectTargetBuilder_s3_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.RedirectTargetBuilder_s3#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getRedirectTargetBuilder_s3_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.RedirectTargetBuilder_s3#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // RedirectTargetBuilder_s3
