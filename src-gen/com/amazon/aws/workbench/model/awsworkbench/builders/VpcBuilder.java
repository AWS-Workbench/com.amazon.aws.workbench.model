/**
 */
package com.amazon.aws.workbench.model.awsworkbench.builders;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vpc Builder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getCidr <em>Cidr</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getEnableDnsHostnames <em>Enable Dns Hostnames</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getEnableDnsSupport <em>Enable Dns Support</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getMaxAzs <em>Max Azs</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getNatGateways <em>Nat Gateways</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getVpnGateway <em>Vpn Gateway</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getVpnGatewayAsn <em>Vpn Gateway Asn</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.builders.BuildersPackage#getVpcBuilder()
 * @model
 * @generated
 */
public interface VpcBuilder extends EObject {
	/**
	 * Returns the value of the '<em><b>Cidr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cidr</em>' attribute.
	 * @see #setCidr(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.BuildersPackage#getVpcBuilder_Cidr()
	 * @model
	 * @generated
	 */
	String getCidr();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getCidr <em>Cidr</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.BuildersPackage#getVpcBuilder_EnableDnsHostnames()
	 * @model
	 * @generated
	 */
	Boolean getEnableDnsHostnames();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getEnableDnsHostnames <em>Enable Dns Hostnames</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.BuildersPackage#getVpcBuilder_EnableDnsSupport()
	 * @model
	 * @generated
	 */
	Boolean getEnableDnsSupport();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getEnableDnsSupport <em>Enable Dns Support</em>}' attribute.
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
	 * @see #setMaxAzs(Number)
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.BuildersPackage#getVpcBuilder_MaxAzs()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.datatypes.java.lang.Number"
	 * @generated
	 */
	Number getMaxAzs();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getMaxAzs <em>Max Azs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Azs</em>' attribute.
	 * @see #getMaxAzs()
	 * @generated
	 */
	void setMaxAzs(Number value);

	/**
	 * Returns the value of the '<em><b>Nat Gateways</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nat Gateways</em>' attribute.
	 * @see #setNatGateways(Number)
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.BuildersPackage#getVpcBuilder_NatGateways()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.datatypes.java.lang.Number"
	 * @generated
	 */
	Number getNatGateways();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getNatGateways <em>Nat Gateways</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nat Gateways</em>' attribute.
	 * @see #getNatGateways()
	 * @generated
	 */
	void setNatGateways(Number value);

	/**
	 * Returns the value of the '<em><b>Vpn Gateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpn Gateway</em>' attribute.
	 * @see #setVpnGateway(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.BuildersPackage#getVpcBuilder_VpnGateway()
	 * @model
	 * @generated
	 */
	Boolean getVpnGateway();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getVpnGateway <em>Vpn Gateway</em>}' attribute.
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
	 * @see #setVpnGatewayAsn(Number)
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.BuildersPackage#getVpcBuilder_VpnGatewayAsn()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.datatypes.java.lang.Number"
	 * @generated
	 */
	Number getVpnGatewayAsn();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getVpnGatewayAsn <em>Vpn Gateway Asn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpn Gateway Asn</em>' attribute.
	 * @see #getVpnGatewayAsn()
	 * @generated
	 */
	void setVpnGatewayAsn(Number value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ec2.Vpc"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see #setGeneratedClassName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.BuildersPackage#getVpcBuilder_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ec2.Vpc"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getGeneratedClassName <em>Generated Class Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.BuildersPackage#getVpcBuilder_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.BuildersPackage#getVpcBuilder_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.BuildersPackage#getVpcBuilder_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // VpcBuilder
