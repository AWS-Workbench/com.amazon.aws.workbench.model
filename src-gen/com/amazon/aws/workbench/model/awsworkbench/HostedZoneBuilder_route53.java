/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hosted Zone Builder route53</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.HostedZoneBuilder_route53#getZoneName_java_lang_String_ <em>Zone Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.HostedZoneBuilder_route53#getComment_java_lang_String_ <em>Comment java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.HostedZoneBuilder_route53#getQueryLogsLogGroupArn_java_lang_String_ <em>Query Logs Log Group Arn java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.HostedZoneBuilder_route53#getVpcs_software_amazon_awscdk_services_ec2_IVpc_AsList <em>Vpcs software amazon awscdk services ec2 IVpc As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.HostedZoneBuilder_route53#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.HostedZoneBuilder_route53#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.HostedZoneBuilder_route53#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.HostedZoneBuilder_route53#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getHostedZoneBuilder_route53()
 * @model
 * @generated
 */
public interface HostedZoneBuilder_route53 extends EObject {
	/**
	 * Returns the value of the '<em><b>Zone Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone Name java lang String </em>' attribute.
	 * @see #setZoneName_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getHostedZoneBuilder_route53_ZoneName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getZoneName_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.HostedZoneBuilder_route53#getZoneName_java_lang_String_ <em>Zone Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone Name java lang String </em>' attribute.
	 * @see #getZoneName_java_lang_String_()
	 * @generated
	 */
	void setZoneName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Comment java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment java lang String </em>' attribute.
	 * @see #setComment_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getHostedZoneBuilder_route53_Comment_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getComment_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.HostedZoneBuilder_route53#getComment_java_lang_String_ <em>Comment java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment java lang String </em>' attribute.
	 * @see #getComment_java_lang_String_()
	 * @generated
	 */
	void setComment_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Query Logs Log Group Arn java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Logs Log Group Arn java lang String </em>' attribute.
	 * @see #setQueryLogsLogGroupArn_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getHostedZoneBuilder_route53_QueryLogsLogGroupArn_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getQueryLogsLogGroupArn_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.HostedZoneBuilder_route53#getQueryLogsLogGroupArn_java_lang_String_ <em>Query Logs Log Group Arn java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Logs Log Group Arn java lang String </em>' attribute.
	 * @see #getQueryLogsLogGroupArn_java_lang_String_()
	 * @generated
	 */
	void setQueryLogsLogGroupArn_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Vpcs software amazon awscdk services ec2 IVpc As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpcs software amazon awscdk services ec2 IVpc As List</em>' attribute.
	 * @see #setVpcs_software_amazon_awscdk_services_ec2_IVpc_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getHostedZoneBuilder_route53_Vpcs_software_amazon_awscdk_services_ec2_IVpc_AsList()
	 * @model
	 * @generated
	 */
	String getVpcs_software_amazon_awscdk_services_ec2_IVpc_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.HostedZoneBuilder_route53#getVpcs_software_amazon_awscdk_services_ec2_IVpc_AsList <em>Vpcs software amazon awscdk services ec2 IVpc As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpcs software amazon awscdk services ec2 IVpc As List</em>' attribute.
	 * @see #getVpcs_software_amazon_awscdk_services_ec2_IVpc_AsList()
	 * @generated
	 */
	void setVpcs_software_amazon_awscdk_services_ec2_IVpc_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.route53.HostedZone"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getHostedZoneBuilder_route53_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.route53.HostedZone" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getHostedZoneBuilder_route53_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.HostedZoneBuilder_route53#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getHostedZoneBuilder_route53_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.HostedZoneBuilder_route53#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getHostedZoneBuilder_route53_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.HostedZoneBuilder_route53#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // HostedZoneBuilder_route53
