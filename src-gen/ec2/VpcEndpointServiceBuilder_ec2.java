/**
 */
package ec2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vpc Endpoint Service Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ec2.VpcEndpointServiceBuilder_ec2#getVpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList <em>Vpc Endpoint Service Load Balancers software amazon awscdk services ec2 IVpc Endpoint Service Load Balancer As List</em>}</li>
 *   <li>{@link ec2.VpcEndpointServiceBuilder_ec2#getAcceptanceRequired_java_lang_Boolean_ <em>Acceptance Required java lang Boolean </em>}</li>
 *   <li>{@link ec2.VpcEndpointServiceBuilder_ec2#getVpcEndpointServiceName_java_lang_String_ <em>Vpc Endpoint Service Name java lang String </em>}</li>
 *   <li>{@link ec2.VpcEndpointServiceBuilder_ec2#getWhitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList <em>Whitelisted Principals software amazon awscdk services iam Arn Principal As List</em>}</li>
 *   <li>{@link ec2.VpcEndpointServiceBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.VpcEndpointServiceBuilder_ec2#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.VpcEndpointServiceBuilder_ec2#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.VpcEndpointServiceBuilder_ec2#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see ec2.Ec2Package#getVpcEndpointServiceBuilder_ec2()
 * @model
 * @generated
 */
public interface VpcEndpointServiceBuilder_ec2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Vpc Endpoint Service Load Balancers software amazon awscdk services ec2 IVpc Endpoint Service Load Balancer As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc Endpoint Service Load Balancers software amazon awscdk services ec2 IVpc Endpoint Service Load Balancer As List</em>' attribute.
	 * @see #setVpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList(String)
	 * @see ec2.Ec2Package#getVpcEndpointServiceBuilder_ec2_VpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList()
	 * @model
	 * @generated
	 */
	String getVpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList();

	/**
	 * Sets the value of the '{@link ec2.VpcEndpointServiceBuilder_ec2#getVpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList <em>Vpc Endpoint Service Load Balancers software amazon awscdk services ec2 IVpc Endpoint Service Load Balancer As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc Endpoint Service Load Balancers software amazon awscdk services ec2 IVpc Endpoint Service Load Balancer As List</em>' attribute.
	 * @see #getVpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList()
	 * @generated
	 */
	void setVpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList(
			String value);

	/**
	 * Returns the value of the '<em><b>Acceptance Required java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acceptance Required java lang Boolean </em>' attribute.
	 * @see #setAcceptanceRequired_java_lang_Boolean_(Boolean)
	 * @see ec2.Ec2Package#getVpcEndpointServiceBuilder_ec2_AcceptanceRequired_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getAcceptanceRequired_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link ec2.VpcEndpointServiceBuilder_ec2#getAcceptanceRequired_java_lang_Boolean_ <em>Acceptance Required java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acceptance Required java lang Boolean </em>' attribute.
	 * @see #getAcceptanceRequired_java_lang_Boolean_()
	 * @generated
	 */
	void setAcceptanceRequired_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Vpc Endpoint Service Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc Endpoint Service Name java lang String </em>' attribute.
	 * @see #setVpcEndpointServiceName_java_lang_String_(String)
	 * @see ec2.Ec2Package#getVpcEndpointServiceBuilder_ec2_VpcEndpointServiceName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getVpcEndpointServiceName_java_lang_String_();

	/**
	 * Sets the value of the '{@link ec2.VpcEndpointServiceBuilder_ec2#getVpcEndpointServiceName_java_lang_String_ <em>Vpc Endpoint Service Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc Endpoint Service Name java lang String </em>' attribute.
	 * @see #getVpcEndpointServiceName_java_lang_String_()
	 * @generated
	 */
	void setVpcEndpointServiceName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Whitelisted Principals software amazon awscdk services iam Arn Principal As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whitelisted Principals software amazon awscdk services iam Arn Principal As List</em>' attribute.
	 * @see #setWhitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList(String)
	 * @see ec2.Ec2Package#getVpcEndpointServiceBuilder_ec2_WhitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList()
	 * @model
	 * @generated
	 */
	String getWhitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList();

	/**
	 * Sets the value of the '{@link ec2.VpcEndpointServiceBuilder_ec2#getWhitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList <em>Whitelisted Principals software amazon awscdk services iam Arn Principal As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whitelisted Principals software amazon awscdk services iam Arn Principal As List</em>' attribute.
	 * @see #getWhitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList()
	 * @generated
	 */
	void setWhitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ec2.VpcEndpointService"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see ec2.Ec2Package#getVpcEndpointServiceBuilder_ec2_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ec2.VpcEndpointService" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see ec2.Ec2Package#getVpcEndpointServiceBuilder_ec2_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link ec2.VpcEndpointServiceBuilder_ec2#getVarName <em>Var Name</em>}' attribute.
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
	 * @see ec2.Ec2Package#getVpcEndpointServiceBuilder_ec2_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link ec2.VpcEndpointServiceBuilder_ec2#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see ec2.Ec2Package#getVpcEndpointServiceBuilder_ec2_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link ec2.VpcEndpointServiceBuilder_ec2#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // VpcEndpointServiceBuilder_ec2
