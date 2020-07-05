/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vpc Builder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getCidr <em>Cidr</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getEnableDnsHostnames <em>Enable Dns Hostnames</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getEnableDnsSupport <em>Enable Dns Support</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getMaxAzs <em>Max Azs</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getNatGateways <em>Nat Gateways</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getVpnGateway <em>Vpn Gateway</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getVpnGatewayAsn <em>Vpn Gateway Asn</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getAdditionalCode <em>Additional Code</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getDefaultInstanceTenancy <em>Default Instance Tenancy</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getMyMaps <em>My Maps</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder()
 * @model
 * @generated
 */
public interface VpcBuilder extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Cidr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cidr</em>' attribute.
	 * @see #setCidr(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder_Cidr()
	 * @model
	 * @generated
	 */
	String getCidr();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getCidr <em>Cidr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cidr</em>' attribute.
	 * @see #getCidr()
	 * @generated
	 */
	void setCidr(String value);

	/**
	 * Returns the value of the '<em><b>Enable Dns Hostnames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Dns Hostnames</em>' attribute.
	 * @see #setEnableDnsHostnames(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder_EnableDnsHostnames()
	 * @model
	 * @generated
	 */
	Boolean getEnableDnsHostnames();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getEnableDnsHostnames <em>Enable Dns Hostnames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Dns Hostnames</em>' attribute.
	 * @see #getEnableDnsHostnames()
	 * @generated
	 */
	void setEnableDnsHostnames(Boolean value);

	/**
	 * Returns the value of the '<em><b>Enable Dns Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Dns Support</em>' attribute.
	 * @see #setEnableDnsSupport(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder_EnableDnsSupport()
	 * @model
	 * @generated
	 */
	Boolean getEnableDnsSupport();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getEnableDnsSupport <em>Enable Dns Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Dns Support</em>' attribute.
	 * @see #getEnableDnsSupport()
	 * @generated
	 */
	void setEnableDnsSupport(Boolean value);

	/**
	 * Returns the value of the '<em><b>Max Azs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Azs</em>' attribute.
	 * @see #setMaxAzs(Integer)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder_MaxAzs()
	 * @model
	 * @generated
	 */
	Integer getMaxAzs();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getMaxAzs <em>Max Azs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Azs</em>' attribute.
	 * @see #getMaxAzs()
	 * @generated
	 */
	void setMaxAzs(Integer value);

	/**
	 * Returns the value of the '<em><b>Nat Gateways</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nat Gateways</em>' attribute.
	 * @see #setNatGateways(Integer)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder_NatGateways()
	 * @model
	 * @generated
	 */
	Integer getNatGateways();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getNatGateways <em>Nat Gateways</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nat Gateways</em>' attribute.
	 * @see #getNatGateways()
	 * @generated
	 */
	void setNatGateways(Integer value);

	/**
	 * Returns the value of the '<em><b>Vpn Gateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpn Gateway</em>' attribute.
	 * @see #setVpnGateway(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder_VpnGateway()
	 * @model
	 * @generated
	 */
	Boolean getVpnGateway();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getVpnGateway <em>Vpn Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpn Gateway</em>' attribute.
	 * @see #getVpnGateway()
	 * @generated
	 */
	void setVpnGateway(Boolean value);

	/**
	 * Returns the value of the '<em><b>Vpn Gateway Asn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpn Gateway Asn</em>' attribute.
	 * @see #setVpnGatewayAsn(Integer)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder_VpnGatewayAsn()
	 * @model
	 * @generated
	 */
	Integer getVpnGatewayAsn();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getVpnGatewayAsn <em>Vpn Gateway Asn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpn Gateway Asn</em>' attribute.
	 * @see #getVpnGatewayAsn()
	 * @generated
	 */
	void setVpnGatewayAsn(Integer value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ec2.Vpc"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see #setGeneratedClassName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ec2.Vpc"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getGeneratedClassName <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generated Class Name</em>' attribute.
	 * @see #getGeneratedClassName()
	 * @generated
	 */
	void setGeneratedClassName(String value);

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

	/**
	 * Returns the value of the '<em><b>Default Instance Tenancy</b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.DefaultInstanceTenancy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Instance Tenancy</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.DefaultInstanceTenancy
	 * @see #setDefaultInstanceTenancy(DefaultInstanceTenancy)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder_DefaultInstanceTenancy()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.DefaultInstanceTenancy"
	 * @generated
	 */
	DefaultInstanceTenancy getDefaultInstanceTenancy();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getDefaultInstanceTenancy <em>Default Instance Tenancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Instance Tenancy</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.DefaultInstanceTenancy
	 * @see #getDefaultInstanceTenancy()
	 * @generated
	 */
	void setDefaultInstanceTenancy(DefaultInstanceTenancy value);

	/**
	 * Returns the value of the '<em><b>My Maps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Maps</em>' attribute.
	 * @see #setMyMaps(Map)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder_MyMaps()
	 * @model
	 * @generated
	 */
	Map<String, String> getMyMaps();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getMyMaps <em>My Maps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My Maps</em>' attribute.
	 * @see #getMyMaps()
	 * @generated
	 */
	void setMyMaps(Map<String, String> value);

} // VpcBuilder
