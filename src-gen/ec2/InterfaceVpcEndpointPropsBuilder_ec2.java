/**
 */
package ec2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Vpc Endpoint Props Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ec2.InterfaceVpcEndpointPropsBuilder_ec2#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}</li>
 *   <li>{@link ec2.InterfaceVpcEndpointPropsBuilder_ec2#getServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference <em>Service With IInterface Vpc Endpoint Service software amazon awscdk services ec2 IInterface Vpc Endpoint Service As Reference</em>}</li>
 *   <li>{@link ec2.InterfaceVpcEndpointPropsBuilder_ec2#getLookupSupportedAzs_java_lang_Boolean_ <em>Lookup Supported Azs java lang Boolean </em>}</li>
 *   <li>{@link ec2.InterfaceVpcEndpointPropsBuilder_ec2#getOpen_java_lang_Boolean_ <em>Open java lang Boolean </em>}</li>
 *   <li>{@link ec2.InterfaceVpcEndpointPropsBuilder_ec2#getPrivateDnsEnabled_java_lang_Boolean_ <em>Private Dns Enabled java lang Boolean </em>}</li>
 *   <li>{@link ec2.InterfaceVpcEndpointPropsBuilder_ec2#getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList <em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>}</li>
 *   <li>{@link ec2.InterfaceVpcEndpointPropsBuilder_ec2#getSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference <em>Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}</li>
 *   <li>{@link ec2.InterfaceVpcEndpointPropsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.InterfaceVpcEndpointPropsBuilder_ec2#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.InterfaceVpcEndpointPropsBuilder_ec2#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.InterfaceVpcEndpointPropsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see ec2.Ec2Package#getInterfaceVpcEndpointPropsBuilder_ec2()
 * @model
 * @generated
 */
public interface InterfaceVpcEndpointPropsBuilder_ec2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>' attribute.
	 * @see #setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(String)
	 * @see ec2.Ec2Package#getInterfaceVpcEndpointPropsBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @model
	 * @generated
	 */
	String getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();

	/**
	 * Sets the value of the '{@link ec2.InterfaceVpcEndpointPropsBuilder_ec2#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>' attribute.
	 * @see #getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @generated
	 */
	void setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Service With IInterface Vpc Endpoint Service software amazon awscdk services ec2 IInterface Vpc Endpoint Service As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service With IInterface Vpc Endpoint Service software amazon awscdk services ec2 IInterface Vpc Endpoint Service As Reference</em>' attribute.
	 * @see #setServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference(String)
	 * @see ec2.Ec2Package#getInterfaceVpcEndpointPropsBuilder_ec2_ServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference()
	 * @model
	 * @generated
	 */
	String getServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference();

	/**
	 * Sets the value of the '{@link ec2.InterfaceVpcEndpointPropsBuilder_ec2#getServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference <em>Service With IInterface Vpc Endpoint Service software amazon awscdk services ec2 IInterface Vpc Endpoint Service As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service With IInterface Vpc Endpoint Service software amazon awscdk services ec2 IInterface Vpc Endpoint Service As Reference</em>' attribute.
	 * @see #getServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference()
	 * @generated
	 */
	void setServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Lookup Supported Azs java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lookup Supported Azs java lang Boolean </em>' attribute.
	 * @see #setLookupSupportedAzs_java_lang_Boolean_(Boolean)
	 * @see ec2.Ec2Package#getInterfaceVpcEndpointPropsBuilder_ec2_LookupSupportedAzs_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getLookupSupportedAzs_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link ec2.InterfaceVpcEndpointPropsBuilder_ec2#getLookupSupportedAzs_java_lang_Boolean_ <em>Lookup Supported Azs java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lookup Supported Azs java lang Boolean </em>' attribute.
	 * @see #getLookupSupportedAzs_java_lang_Boolean_()
	 * @generated
	 */
	void setLookupSupportedAzs_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Open java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open java lang Boolean </em>' attribute.
	 * @see #setOpen_java_lang_Boolean_(Boolean)
	 * @see ec2.Ec2Package#getInterfaceVpcEndpointPropsBuilder_ec2_Open_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getOpen_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link ec2.InterfaceVpcEndpointPropsBuilder_ec2#getOpen_java_lang_Boolean_ <em>Open java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open java lang Boolean </em>' attribute.
	 * @see #getOpen_java_lang_Boolean_()
	 * @generated
	 */
	void setOpen_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Private Dns Enabled java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private Dns Enabled java lang Boolean </em>' attribute.
	 * @see #setPrivateDnsEnabled_java_lang_Boolean_(Boolean)
	 * @see ec2.Ec2Package#getInterfaceVpcEndpointPropsBuilder_ec2_PrivateDnsEnabled_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getPrivateDnsEnabled_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link ec2.InterfaceVpcEndpointPropsBuilder_ec2#getPrivateDnsEnabled_java_lang_Boolean_ <em>Private Dns Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Dns Enabled java lang Boolean </em>' attribute.
	 * @see #getPrivateDnsEnabled_java_lang_Boolean_()
	 * @generated
	 */
	void setPrivateDnsEnabled_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Security Groups software amazon awscdk services ec2 ISecurity Group As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>' attribute.
	 * @see #setSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList(String)
	 * @see ec2.Ec2Package#getInterfaceVpcEndpointPropsBuilder_ec2_SecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList()
	 * @model
	 * @generated
	 */
	String getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList();

	/**
	 * Sets the value of the '{@link ec2.InterfaceVpcEndpointPropsBuilder_ec2#getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList <em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>' attribute.
	 * @see #getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList()
	 * @generated
	 */
	void setSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>' attribute.
	 * @see #setSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(String)
	 * @see ec2.Ec2Package#getInterfaceVpcEndpointPropsBuilder_ec2_SubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @model
	 * @generated
	 */
	String getSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();

	/**
	 * Sets the value of the '{@link ec2.InterfaceVpcEndpointPropsBuilder_ec2#getSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference <em>Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>' attribute.
	 * @see #getSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @generated
	 */
	void setSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ec2.InterfaceVpcEndpointProps"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see ec2.Ec2Package#getInterfaceVpcEndpointPropsBuilder_ec2_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ec2.InterfaceVpcEndpointProps" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see ec2.Ec2Package#getInterfaceVpcEndpointPropsBuilder_ec2_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link ec2.InterfaceVpcEndpointPropsBuilder_ec2#getVarName <em>Var Name</em>}' attribute.
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
	 * @see ec2.Ec2Package#getInterfaceVpcEndpointPropsBuilder_ec2_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link ec2.InterfaceVpcEndpointPropsBuilder_ec2#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see ec2.Ec2Package#getInterfaceVpcEndpointPropsBuilder_ec2_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link ec2.InterfaceVpcEndpointPropsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // InterfaceVpcEndpointPropsBuilder_ec2
