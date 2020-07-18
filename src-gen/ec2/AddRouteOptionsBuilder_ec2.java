/**
 */
package ec2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Route Options Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ec2.AddRouteOptionsBuilder_ec2#getRouterId_java_lang_String_ <em>Router Id java lang String </em>}</li>
 *   <li>{@link ec2.AddRouteOptionsBuilder_ec2#getRouterType_software_amazon_awscdk_services_ec2_RouterType_ <em>Router Type software amazon awscdk services ec2 Router Type </em>}</li>
 *   <li>{@link ec2.AddRouteOptionsBuilder_ec2#getDestinationCidrBlock_java_lang_String_ <em>Destination Cidr Block java lang String </em>}</li>
 *   <li>{@link ec2.AddRouteOptionsBuilder_ec2#getDestinationIpv6CidrBlock_java_lang_String_ <em>Destination Ipv6 Cidr Block java lang String </em>}</li>
 *   <li>{@link ec2.AddRouteOptionsBuilder_ec2#getEnablesInternetConnectivity_java_lang_Boolean_ <em>Enables Internet Connectivity java lang Boolean </em>}</li>
 *   <li>{@link ec2.AddRouteOptionsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.AddRouteOptionsBuilder_ec2#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.AddRouteOptionsBuilder_ec2#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.AddRouteOptionsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see ec2.Ec2Package#getAddRouteOptionsBuilder_ec2()
 * @model
 * @generated
 */
public interface AddRouteOptionsBuilder_ec2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Router Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Router Id java lang String </em>' attribute.
	 * @see #setRouterId_java_lang_String_(String)
	 * @see ec2.Ec2Package#getAddRouteOptionsBuilder_ec2_RouterId_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getRouterId_java_lang_String_();

	/**
	 * Sets the value of the '{@link ec2.AddRouteOptionsBuilder_ec2#getRouterId_java_lang_String_ <em>Router Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Router Id java lang String </em>' attribute.
	 * @see #getRouterId_java_lang_String_()
	 * @generated
	 */
	void setRouterId_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Router Type software amazon awscdk services ec2 Router Type </b></em>' attribute.
	 * The literals are from the enumeration {@link ec2.RouterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Router Type software amazon awscdk services ec2 Router Type </em>' attribute.
	 * @see ec2.RouterType
	 * @see #setRouterType_software_amazon_awscdk_services_ec2_RouterType_(RouterType)
	 * @see ec2.Ec2Package#getAddRouteOptionsBuilder_ec2_RouterType_software_amazon_awscdk_services_ec2_RouterType_()
	 * @model dataType="ec2.RouterType"
	 * @generated
	 */
	RouterType getRouterType_software_amazon_awscdk_services_ec2_RouterType_();

	/**
	 * Sets the value of the '{@link ec2.AddRouteOptionsBuilder_ec2#getRouterType_software_amazon_awscdk_services_ec2_RouterType_ <em>Router Type software amazon awscdk services ec2 Router Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Router Type software amazon awscdk services ec2 Router Type </em>' attribute.
	 * @see ec2.RouterType
	 * @see #getRouterType_software_amazon_awscdk_services_ec2_RouterType_()
	 * @generated
	 */
	void setRouterType_software_amazon_awscdk_services_ec2_RouterType_(RouterType value);

	/**
	 * Returns the value of the '<em><b>Destination Cidr Block java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Cidr Block java lang String </em>' attribute.
	 * @see #setDestinationCidrBlock_java_lang_String_(String)
	 * @see ec2.Ec2Package#getAddRouteOptionsBuilder_ec2_DestinationCidrBlock_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDestinationCidrBlock_java_lang_String_();

	/**
	 * Sets the value of the '{@link ec2.AddRouteOptionsBuilder_ec2#getDestinationCidrBlock_java_lang_String_ <em>Destination Cidr Block java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Cidr Block java lang String </em>' attribute.
	 * @see #getDestinationCidrBlock_java_lang_String_()
	 * @generated
	 */
	void setDestinationCidrBlock_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Destination Ipv6 Cidr Block java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Ipv6 Cidr Block java lang String </em>' attribute.
	 * @see #setDestinationIpv6CidrBlock_java_lang_String_(String)
	 * @see ec2.Ec2Package#getAddRouteOptionsBuilder_ec2_DestinationIpv6CidrBlock_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDestinationIpv6CidrBlock_java_lang_String_();

	/**
	 * Sets the value of the '{@link ec2.AddRouteOptionsBuilder_ec2#getDestinationIpv6CidrBlock_java_lang_String_ <em>Destination Ipv6 Cidr Block java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Ipv6 Cidr Block java lang String </em>' attribute.
	 * @see #getDestinationIpv6CidrBlock_java_lang_String_()
	 * @generated
	 */
	void setDestinationIpv6CidrBlock_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Enables Internet Connectivity java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enables Internet Connectivity java lang Boolean </em>' attribute.
	 * @see #setEnablesInternetConnectivity_java_lang_Boolean_(Boolean)
	 * @see ec2.Ec2Package#getAddRouteOptionsBuilder_ec2_EnablesInternetConnectivity_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getEnablesInternetConnectivity_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link ec2.AddRouteOptionsBuilder_ec2#getEnablesInternetConnectivity_java_lang_Boolean_ <em>Enables Internet Connectivity java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enables Internet Connectivity java lang Boolean </em>' attribute.
	 * @see #getEnablesInternetConnectivity_java_lang_Boolean_()
	 * @generated
	 */
	void setEnablesInternetConnectivity_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ec2.AddRouteOptions"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see ec2.Ec2Package#getAddRouteOptionsBuilder_ec2_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ec2.AddRouteOptions" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see ec2.Ec2Package#getAddRouteOptionsBuilder_ec2_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link ec2.AddRouteOptionsBuilder_ec2#getVarName <em>Var Name</em>}' attribute.
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
	 * @see ec2.Ec2Package#getAddRouteOptionsBuilder_ec2_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link ec2.AddRouteOptionsBuilder_ec2#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see ec2.Ec2Package#getAddRouteOptionsBuilder_ec2_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link ec2.AddRouteOptionsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // AddRouteOptionsBuilder_ec2
