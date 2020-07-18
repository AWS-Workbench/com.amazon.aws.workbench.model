/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vpn Connection Options Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2#getIp_java_lang_String_ <em>Ip java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2#getAsn_java_lang_Number_ <em>Asn java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2#getStaticRoutes_java_lang_String_AsList <em>Static Routes java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2#getTunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList <em>Tunnel Options software amazon awscdk services ec2 Vpn Tunnel Option As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpnConnectionOptionsBuilder_ec2()
 * @model
 * @generated
 */
public interface VpnConnectionOptionsBuilder_ec2 extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Ip java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip java lang String </em>' attribute.
	 * @see #setIp_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpnConnectionOptionsBuilder_ec2_Ip_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getIp_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2#getIp_java_lang_String_ <em>Ip java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip java lang String </em>' attribute.
	 * @see #getIp_java_lang_String_()
	 * @generated
	 */
	void setIp_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Asn java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asn java lang Number </em>' attribute.
	 * @see #setAsn_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpnConnectionOptionsBuilder_ec2_Asn_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getAsn_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2#getAsn_java_lang_Number_ <em>Asn java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asn java lang Number </em>' attribute.
	 * @see #getAsn_java_lang_Number_()
	 * @generated
	 */
	void setAsn_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Static Routes java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Routes java lang String As List</em>' attribute.
	 * @see #setStaticRoutes_java_lang_String_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpnConnectionOptionsBuilder_ec2_StaticRoutes_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getStaticRoutes_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2#getStaticRoutes_java_lang_String_AsList <em>Static Routes java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Routes java lang String As List</em>' attribute.
	 * @see #getStaticRoutes_java_lang_String_AsList()
	 * @generated
	 */
	void setStaticRoutes_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Tunnel Options software amazon awscdk services ec2 Vpn Tunnel Option As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tunnel Options software amazon awscdk services ec2 Vpn Tunnel Option As List</em>' attribute.
	 * @see #setTunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpnConnectionOptionsBuilder_ec2_TunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList()
	 * @model
	 * @generated
	 */
	String getTunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2#getTunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList <em>Tunnel Options software amazon awscdk services ec2 Vpn Tunnel Option As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tunnel Options software amazon awscdk services ec2 Vpn Tunnel Option As List</em>' attribute.
	 * @see #getTunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList()
	 * @generated
	 */
	void setTunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ec2.VpnConnectionOptions"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpnConnectionOptionsBuilder_ec2_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ec2.VpnConnectionOptions" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpnConnectionOptionsBuilder_ec2_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpnConnectionOptionsBuilder_ec2_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpnConnectionOptionsBuilder_ec2_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // VpnConnectionOptionsBuilder_ec2
