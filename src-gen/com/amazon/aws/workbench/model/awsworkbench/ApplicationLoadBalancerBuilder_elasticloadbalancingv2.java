/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Load Balancer Builder elasticloadbalancingv2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancerBuilder_elasticloadbalancingv2#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancerBuilder_elasticloadbalancingv2#getDeletionProtection_java_lang_Boolean_ <em>Deletion Protection java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancerBuilder_elasticloadbalancingv2#getInternetFacing_java_lang_Boolean_ <em>Internet Facing java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancerBuilder_elasticloadbalancingv2#getLoadBalancerName_java_lang_String_ <em>Load Balancer Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancerBuilder_elasticloadbalancingv2#getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference <em>Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancerBuilder_elasticloadbalancingv2#getHttp2Enabled_java_lang_Boolean_ <em>Http2 Enabled java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancerBuilder_elasticloadbalancingv2#getIdleTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Idle Timeout With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancerBuilder_elasticloadbalancingv2#getIpAddressType_software_amazon_awscdk_services_elasticloadbalancingv2_IpAddressType_ <em>Ip Address Type software amazon awscdk services elasticloadbalancingv2 Ip Address Type </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancerBuilder_elasticloadbalancingv2#getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference <em>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancerBuilder_elasticloadbalancingv2#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancerBuilder_elasticloadbalancingv2#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancerBuilder_elasticloadbalancingv2#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancerBuilder_elasticloadbalancingv2#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApplicationLoadBalancerBuilder_elasticloadbalancingv2()
 * @model
 * @generated
 */
public interface ApplicationLoadBalancerBuilder_elasticloadbalancingv2 extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>' attribute.
	 * @see #setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApplicationLoadBalancerBuilder_elasticloadbalancingv2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @model
	 * @generated
	 */
	String getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancerBuilder_elasticloadbalancingv2#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>' attribute.
	 * @see #getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @generated
	 */
	void setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Deletion Protection java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deletion Protection java lang Boolean </em>' attribute.
	 * @see #setDeletionProtection_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApplicationLoadBalancerBuilder_elasticloadbalancingv2_DeletionProtection_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getDeletionProtection_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancerBuilder_elasticloadbalancingv2#getDeletionProtection_java_lang_Boolean_ <em>Deletion Protection java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deletion Protection java lang Boolean </em>' attribute.
	 * @see #getDeletionProtection_java_lang_Boolean_()
	 * @generated
	 */
	void setDeletionProtection_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Internet Facing java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internet Facing java lang Boolean </em>' attribute.
	 * @see #setInternetFacing_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApplicationLoadBalancerBuilder_elasticloadbalancingv2_InternetFacing_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getInternetFacing_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancerBuilder_elasticloadbalancingv2#getInternetFacing_java_lang_Boolean_ <em>Internet Facing java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internet Facing java lang Boolean </em>' attribute.
	 * @see #getInternetFacing_java_lang_Boolean_()
	 * @generated
	 */
	void setInternetFacing_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Load Balancer Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Balancer Name java lang String </em>' attribute.
	 * @see #setLoadBalancerName_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApplicationLoadBalancerBuilder_elasticloadbalancingv2_LoadBalancerName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getLoadBalancerName_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancerBuilder_elasticloadbalancingv2#getLoadBalancerName_java_lang_String_ <em>Load Balancer Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Balancer Name java lang String </em>' attribute.
	 * @see #getLoadBalancerName_java_lang_String_()
	 * @generated
	 */
	void setLoadBalancerName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>' attribute.
	 * @see #setVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApplicationLoadBalancerBuilder_elasticloadbalancingv2_VpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @model
	 * @generated
	 */
	String getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancerBuilder_elasticloadbalancingv2#getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference <em>Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>' attribute.
	 * @see #getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @generated
	 */
	void setVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Http2 Enabled java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http2 Enabled java lang Boolean </em>' attribute.
	 * @see #setHttp2Enabled_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApplicationLoadBalancerBuilder_elasticloadbalancingv2_Http2Enabled_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getHttp2Enabled_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancerBuilder_elasticloadbalancingv2#getHttp2Enabled_java_lang_Boolean_ <em>Http2 Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http2 Enabled java lang Boolean </em>' attribute.
	 * @see #getHttp2Enabled_java_lang_Boolean_()
	 * @generated
	 */
	void setHttp2Enabled_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Idle Timeout With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idle Timeout With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setIdleTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApplicationLoadBalancerBuilder_elasticloadbalancingv2_IdleTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getIdleTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancerBuilder_elasticloadbalancingv2#getIdleTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Idle Timeout With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idle Timeout With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getIdleTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setIdleTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Ip Address Type software amazon awscdk services elasticloadbalancingv2 Ip Address Type </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.IpAddressType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip Address Type software amazon awscdk services elasticloadbalancingv2 Ip Address Type </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.IpAddressType
	 * @see #setIpAddressType_software_amazon_awscdk_services_elasticloadbalancingv2_IpAddressType_(IpAddressType)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApplicationLoadBalancerBuilder_elasticloadbalancingv2_IpAddressType_software_amazon_awscdk_services_elasticloadbalancingv2_IpAddressType_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.IpAddressType"
	 * @generated
	 */
	IpAddressType getIpAddressType_software_amazon_awscdk_services_elasticloadbalancingv2_IpAddressType_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancerBuilder_elasticloadbalancingv2#getIpAddressType_software_amazon_awscdk_services_elasticloadbalancingv2_IpAddressType_ <em>Ip Address Type software amazon awscdk services elasticloadbalancingv2 Ip Address Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip Address Type software amazon awscdk services elasticloadbalancingv2 Ip Address Type </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.IpAddressType
	 * @see #getIpAddressType_software_amazon_awscdk_services_elasticloadbalancingv2_IpAddressType_()
	 * @generated
	 */
	void setIpAddressType_software_amazon_awscdk_services_elasticloadbalancingv2_IpAddressType_(IpAddressType value);

	/**
	 * Returns the value of the '<em><b>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</em>' attribute.
	 * @see #setSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApplicationLoadBalancerBuilder_elasticloadbalancingv2_SecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference()
	 * @model
	 * @generated
	 */
	String getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancerBuilder_elasticloadbalancingv2#getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference <em>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</em>' attribute.
	 * @see #getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference()
	 * @generated
	 */
	void setSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancer"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApplicationLoadBalancerBuilder_elasticloadbalancingv2_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancer" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApplicationLoadBalancerBuilder_elasticloadbalancingv2_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancerBuilder_elasticloadbalancingv2#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApplicationLoadBalancerBuilder_elasticloadbalancingv2_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancerBuilder_elasticloadbalancingv2#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApplicationLoadBalancerBuilder_elasticloadbalancingv2_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancerBuilder_elasticloadbalancingv2#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // ApplicationLoadBalancerBuilder_elasticloadbalancingv2
