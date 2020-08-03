/**
 */
package apigateway;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vpc Link Props Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apigateway.VpcLinkPropsBuilder_apigateway#getDescription_java_lang_String_ <em>Description java lang String </em>}</li>
 *   <li>{@link apigateway.VpcLinkPropsBuilder_apigateway#getTargets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList <em>Targets software amazon awscdk services elasticloadbalancingv2 INetwork Load Balancer As List</em>}</li>
 *   <li>{@link apigateway.VpcLinkPropsBuilder_apigateway#getVpcLinkName_java_lang_String_ <em>Vpc Link Name java lang String </em>}</li>
 *   <li>{@link apigateway.VpcLinkPropsBuilder_apigateway#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link apigateway.VpcLinkPropsBuilder_apigateway#getVarName <em>Var Name</em>}</li>
 *   <li>{@link apigateway.VpcLinkPropsBuilder_apigateway#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link apigateway.VpcLinkPropsBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see apigateway.ApigatewayPackage#getVpcLinkPropsBuilder_apigateway()
 * @model
 * @generated
 */
public interface VpcLinkPropsBuilder_apigateway extends EObject {
	/**
	 * Returns the value of the '<em><b>Description java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description java lang String </em>' attribute.
	 * @see #setDescription_java_lang_String_(String)
	 * @see apigateway.ApigatewayPackage#getVpcLinkPropsBuilder_apigateway_Description_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDescription_java_lang_String_();

	/**
	 * Sets the value of the '{@link apigateway.VpcLinkPropsBuilder_apigateway#getDescription_java_lang_String_ <em>Description java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description java lang String </em>' attribute.
	 * @see #getDescription_java_lang_String_()
	 * @generated
	 */
	void setDescription_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Targets software amazon awscdk services elasticloadbalancingv2 INetwork Load Balancer As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets software amazon awscdk services elasticloadbalancingv2 INetwork Load Balancer As List</em>' attribute.
	 * @see #setTargets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList(String)
	 * @see apigateway.ApigatewayPackage#getVpcLinkPropsBuilder_apigateway_Targets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList()
	 * @model
	 * @generated
	 */
	String getTargets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList();

	/**
	 * Sets the value of the '{@link apigateway.VpcLinkPropsBuilder_apigateway#getTargets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList <em>Targets software amazon awscdk services elasticloadbalancingv2 INetwork Load Balancer As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Targets software amazon awscdk services elasticloadbalancingv2 INetwork Load Balancer As List</em>' attribute.
	 * @see #getTargets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList()
	 * @generated
	 */
	void setTargets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Vpc Link Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc Link Name java lang String </em>' attribute.
	 * @see #setVpcLinkName_java_lang_String_(String)
	 * @see apigateway.ApigatewayPackage#getVpcLinkPropsBuilder_apigateway_VpcLinkName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getVpcLinkName_java_lang_String_();

	/**
	 * Sets the value of the '{@link apigateway.VpcLinkPropsBuilder_apigateway#getVpcLinkName_java_lang_String_ <em>Vpc Link Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc Link Name java lang String </em>' attribute.
	 * @see #getVpcLinkName_java_lang_String_()
	 * @generated
	 */
	void setVpcLinkName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.apigateway.VpcLinkProps"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see apigateway.ApigatewayPackage#getVpcLinkPropsBuilder_apigateway_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.apigateway.VpcLinkProps" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see apigateway.ApigatewayPackage#getVpcLinkPropsBuilder_apigateway_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link apigateway.VpcLinkPropsBuilder_apigateway#getVarName <em>Var Name</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getVpcLinkPropsBuilder_apigateway_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link apigateway.VpcLinkPropsBuilder_apigateway#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getVpcLinkPropsBuilder_apigateway_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link apigateway.VpcLinkPropsBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // VpcLinkPropsBuilder_apigateway
