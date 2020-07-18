/**
 */
package ec2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configure Nat Options Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ec2.ConfigureNatOptionsBuilder_ec2#getNatSubnets_software_amazon_awscdk_services_ec2_PublicSubnet_AsList <em>Nat Subnets software amazon awscdk services ec2 Public Subnet As List</em>}</li>
 *   <li>{@link ec2.ConfigureNatOptionsBuilder_ec2#getPrivateSubnets_software_amazon_awscdk_services_ec2_PrivateSubnet_AsList <em>Private Subnets software amazon awscdk services ec2 Private Subnet As List</em>}</li>
 *   <li>{@link ec2.ConfigureNatOptionsBuilder_ec2#getVpcWithVpc_software_amazon_awscdk_services_ec2_Vpc_AsReference <em>Vpc With Vpc software amazon awscdk services ec2 Vpc As Reference</em>}</li>
 *   <li>{@link ec2.ConfigureNatOptionsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.ConfigureNatOptionsBuilder_ec2#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.ConfigureNatOptionsBuilder_ec2#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.ConfigureNatOptionsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see ec2.Ec2Package#getConfigureNatOptionsBuilder_ec2()
 * @model
 * @generated
 */
public interface ConfigureNatOptionsBuilder_ec2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Nat Subnets software amazon awscdk services ec2 Public Subnet As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nat Subnets software amazon awscdk services ec2 Public Subnet As List</em>' attribute.
	 * @see #setNatSubnets_software_amazon_awscdk_services_ec2_PublicSubnet_AsList(String)
	 * @see ec2.Ec2Package#getConfigureNatOptionsBuilder_ec2_NatSubnets_software_amazon_awscdk_services_ec2_PublicSubnet_AsList()
	 * @model
	 * @generated
	 */
	String getNatSubnets_software_amazon_awscdk_services_ec2_PublicSubnet_AsList();

	/**
	 * Sets the value of the '{@link ec2.ConfigureNatOptionsBuilder_ec2#getNatSubnets_software_amazon_awscdk_services_ec2_PublicSubnet_AsList <em>Nat Subnets software amazon awscdk services ec2 Public Subnet As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nat Subnets software amazon awscdk services ec2 Public Subnet As List</em>' attribute.
	 * @see #getNatSubnets_software_amazon_awscdk_services_ec2_PublicSubnet_AsList()
	 * @generated
	 */
	void setNatSubnets_software_amazon_awscdk_services_ec2_PublicSubnet_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Private Subnets software amazon awscdk services ec2 Private Subnet As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private Subnets software amazon awscdk services ec2 Private Subnet As List</em>' attribute.
	 * @see #setPrivateSubnets_software_amazon_awscdk_services_ec2_PrivateSubnet_AsList(String)
	 * @see ec2.Ec2Package#getConfigureNatOptionsBuilder_ec2_PrivateSubnets_software_amazon_awscdk_services_ec2_PrivateSubnet_AsList()
	 * @model
	 * @generated
	 */
	String getPrivateSubnets_software_amazon_awscdk_services_ec2_PrivateSubnet_AsList();

	/**
	 * Sets the value of the '{@link ec2.ConfigureNatOptionsBuilder_ec2#getPrivateSubnets_software_amazon_awscdk_services_ec2_PrivateSubnet_AsList <em>Private Subnets software amazon awscdk services ec2 Private Subnet As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Subnets software amazon awscdk services ec2 Private Subnet As List</em>' attribute.
	 * @see #getPrivateSubnets_software_amazon_awscdk_services_ec2_PrivateSubnet_AsList()
	 * @generated
	 */
	void setPrivateSubnets_software_amazon_awscdk_services_ec2_PrivateSubnet_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Vpc With Vpc software amazon awscdk services ec2 Vpc As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc With Vpc software amazon awscdk services ec2 Vpc As Reference</em>' attribute.
	 * @see #setVpcWithVpc_software_amazon_awscdk_services_ec2_Vpc_AsReference(String)
	 * @see ec2.Ec2Package#getConfigureNatOptionsBuilder_ec2_VpcWithVpc_software_amazon_awscdk_services_ec2_Vpc_AsReference()
	 * @model
	 * @generated
	 */
	String getVpcWithVpc_software_amazon_awscdk_services_ec2_Vpc_AsReference();

	/**
	 * Sets the value of the '{@link ec2.ConfigureNatOptionsBuilder_ec2#getVpcWithVpc_software_amazon_awscdk_services_ec2_Vpc_AsReference <em>Vpc With Vpc software amazon awscdk services ec2 Vpc As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc With Vpc software amazon awscdk services ec2 Vpc As Reference</em>' attribute.
	 * @see #getVpcWithVpc_software_amazon_awscdk_services_ec2_Vpc_AsReference()
	 * @generated
	 */
	void setVpcWithVpc_software_amazon_awscdk_services_ec2_Vpc_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ec2.ConfigureNatOptions"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see ec2.Ec2Package#getConfigureNatOptionsBuilder_ec2_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ec2.ConfigureNatOptions" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see ec2.Ec2Package#getConfigureNatOptionsBuilder_ec2_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link ec2.ConfigureNatOptionsBuilder_ec2#getVarName <em>Var Name</em>}' attribute.
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
	 * @see ec2.Ec2Package#getConfigureNatOptionsBuilder_ec2_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link ec2.ConfigureNatOptionsBuilder_ec2#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see ec2.Ec2Package#getConfigureNatOptionsBuilder_ec2_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link ec2.ConfigureNatOptionsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // ConfigureNatOptionsBuilder_ec2
