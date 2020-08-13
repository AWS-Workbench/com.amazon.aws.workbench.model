/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subnet Selection Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getAvailabilityZones_java_lang_String_AsList <em>Availability Zones java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getOnePerAz_java_lang_Boolean_ <em>One Per Az java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getSubnetGroupName_java_lang_String_ <em>Subnet Group Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getSubnetName_java_lang_String_ <em>Subnet Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getSubnets_software_amazon_awscdk_services_ec2_ISubnet_AsList <em>Subnets software amazon awscdk services ec2 ISubnet As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getSubnetType_software_amazon_awscdk_services_ec2_SubnetType_ <em>Subnet Type software amazon awscdk services ec2 Subnet Type </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSubnetSelectionBuilder_ec2()
 * @model
 * @generated
 */
public interface SubnetSelectionBuilder_ec2 extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Availability Zones java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availability Zones java lang String As List</em>' attribute.
	 * @see #setAvailabilityZones_java_lang_String_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSubnetSelectionBuilder_ec2_AvailabilityZones_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getAvailabilityZones_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getAvailabilityZones_java_lang_String_AsList <em>Availability Zones java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability Zones java lang String As List</em>' attribute.
	 * @see #getAvailabilityZones_java_lang_String_AsList()
	 * @generated
	 */
	void setAvailabilityZones_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>One Per Az java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>One Per Az java lang Boolean </em>' attribute.
	 * @see #setOnePerAz_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSubnetSelectionBuilder_ec2_OnePerAz_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getOnePerAz_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getOnePerAz_java_lang_Boolean_ <em>One Per Az java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>One Per Az java lang Boolean </em>' attribute.
	 * @see #getOnePerAz_java_lang_Boolean_()
	 * @generated
	 */
	void setOnePerAz_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Subnet Group Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnet Group Name java lang String </em>' attribute.
	 * @see #setSubnetGroupName_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSubnetSelectionBuilder_ec2_SubnetGroupName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getSubnetGroupName_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getSubnetGroupName_java_lang_String_ <em>Subnet Group Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnet Group Name java lang String </em>' attribute.
	 * @see #getSubnetGroupName_java_lang_String_()
	 * @generated
	 */
	void setSubnetGroupName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Subnet Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnet Name java lang String </em>' attribute.
	 * @see #setSubnetName_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSubnetSelectionBuilder_ec2_SubnetName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getSubnetName_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getSubnetName_java_lang_String_ <em>Subnet Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnet Name java lang String </em>' attribute.
	 * @see #getSubnetName_java_lang_String_()
	 * @generated
	 */
	void setSubnetName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Subnets software amazon awscdk services ec2 ISubnet As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnets software amazon awscdk services ec2 ISubnet As List</em>' attribute.
	 * @see #setSubnets_software_amazon_awscdk_services_ec2_ISubnet_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSubnetSelectionBuilder_ec2_Subnets_software_amazon_awscdk_services_ec2_ISubnet_AsList()
	 * @model
	 * @generated
	 */
	String getSubnets_software_amazon_awscdk_services_ec2_ISubnet_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getSubnets_software_amazon_awscdk_services_ec2_ISubnet_AsList <em>Subnets software amazon awscdk services ec2 ISubnet As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnets software amazon awscdk services ec2 ISubnet As List</em>' attribute.
	 * @see #getSubnets_software_amazon_awscdk_services_ec2_ISubnet_AsList()
	 * @generated
	 */
	void setSubnets_software_amazon_awscdk_services_ec2_ISubnet_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Subnet Type software amazon awscdk services ec2 Subnet Type </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.SubnetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnet Type software amazon awscdk services ec2 Subnet Type </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetType
	 * @see #setSubnetType_software_amazon_awscdk_services_ec2_SubnetType_(SubnetType)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSubnetSelectionBuilder_ec2_SubnetType_software_amazon_awscdk_services_ec2_SubnetType_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.SubnetType"
	 * @generated
	 */
	SubnetType getSubnetType_software_amazon_awscdk_services_ec2_SubnetType_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getSubnetType_software_amazon_awscdk_services_ec2_SubnetType_ <em>Subnet Type software amazon awscdk services ec2 Subnet Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnet Type software amazon awscdk services ec2 Subnet Type </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetType
	 * @see #getSubnetType_software_amazon_awscdk_services_ec2_SubnetType_()
	 * @generated
	 */
	void setSubnetType_software_amazon_awscdk_services_ec2_SubnetType_(SubnetType value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ec2.SubnetSelection"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSubnetSelectionBuilder_ec2_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ec2.SubnetSelection" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSubnetSelectionBuilder_ec2_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSubnetSelectionBuilder_ec2_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSubnetSelectionBuilder_ec2_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // SubnetSelectionBuilder_ec2
